package com.itquasar.multiverse.jmacro.commands.datax.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import net.sourceforge.tess4j.ITesseract
import net.sourceforge.tess4j.Tesseract
import nu.pattern.OpenCV
import org.opencv.core.CvType
import org.opencv.core.Mat
import org.opencv.core.MatOfByte
import org.opencv.core.Size
import org.opencv.imgcodecs.Imgcodecs
import org.opencv.imgproc.Imgproc

import javax.imageio.ImageIO
import javax.script.ScriptEngine
import java.awt.*
import java.awt.image.BufferedImage
import java.awt.image.DataBufferInt
import java.nio.file.Path
import java.util.List

class OCRCommand extends Command {

    private ITesseract tesseract
    private boolean opencvLoaded = false

    OCRCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    private synchronized void init() {
        if (this.tesseract == null) {
            this.tesseract = new Tesseract()
            def datapath = core.configuration.getFolders().data().resolve("tessdata")
            def files = datapath.toFile().listFiles().findAll { !it.name.contains('-') }
            if (files != null && files.size() == 1) {
                def language = files[0].name
                this.tesseract.setLanguage(language.substring(0, language.indexOf('.')))
            }
            this.tesseract.setDatapath(datapath.toString())
        }
    }

    void datapath(Path path) {
        this.datapath(path.toString())
    }

    void language(String language) {
        this.init();
        this.tesseract.setLanguage(language)
    }

    void datapath(String path) {
        this.init()
        this.tesseract.setDatapath(path)
    }

    String read(BufferedImage image) {
        this.init()
        return this.tesseract.doOCR(image)
    }

    String call(BufferedImage image) {
        return this.read(image)
    }

    String call(List<BufferedImage> images) {
        String txt = images.collect {
            this.read(it)
        }.inject('') { s1, s2 -> s1 + "\n" + s2 }
        return txt
    }

    String read(File file) {
        this.init()
        return this.tesseract.doOCR(file)
    }

    String call(File file) {
        return this.read(file)
    }

    String call(Path path) {
        return this.read(path.toFile())
    }

    Object call(Closure closure) {
        this.init()
        closure.setDelegate(this)
        closure.setResolveStrategy(Closure.DELEGATE_FIRST)
        return closure.call()
    }

    def methodMissing(String name, def args) {
        this.init()
        Command.methodMissingOnOrChainToContext(context, this.tesseract, name, args)
    }

    def propertyMissing(String name) {
        this.init()
        Command.propertyMissingOnOrChainToContext(this, this.tesseract, name)
    }

    def propertyMissing(String name, def arg) {
        this.init()
        Command.propertyMissingOnOrChainToContext(this, this.tesseract, name, arg)
    }

    private void loadOpenCV() {
        if (!this.opencvLoaded) {
            this.opencvLoaded = true
            OpenCV.loadLocally()
        }
    }


    // FIXME move opencv to another command/package
    Mat mat(BufferedImage image) {
        this.loadOpenCV()
        byte[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData()
        int rows = image.getWidth()
        int cols = image.getHeight()
        int type = CvType.CV_8UC3
        Mat mat = new Mat(rows, cols, type)
        mat.put(0, 0, pixels)
        return mat
    }

    Mat mat(def path) {
        this.loadOpenCV()
        Imgcodecs imageCodecs = new Imgcodecs();
        return imageCodecs.imread(path.toString())
    }

    Mat dilate(Mat source, int erosionSize = 5) {
        this.loadOpenCV()
        Mat element = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(2 * erosionSize + 1, 2 * erosionSize + 1))
        Mat destination = new Mat(source.rows(), source.cols(), source.type())
        Imgproc.dilate(source, destination, element)
        return destination
    }

    Mat erode(Mat source, int dilationSize = 5) {
        this.loadOpenCV()
        Mat element = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(2 * dilationSize + 1, 2 * dilationSize + 1))
        Mat destination = new Mat(source.rows(), source.cols(), source.type())
        Imgproc.erode(source, destination, element)
        return destination
    }

    boolean writeMat(Mat mat, def path) {
        this.loadOpenCV()
        return Imgcodecs.imwrite(path.toString(), mat)
    }

    BufferedImage scale(BufferedImage originalImage, float factor) {
        int targetWidth = Float.valueOf(originalImage.width * factor).intValue()
        int targetHeight = Float.valueOf((int) originalImage.height * factor).intValue()
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_REPLICATE)
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB)
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null)
        return outputImage
    }

    Mat bufferedImage2Mat(BufferedImage image) throws IOException {
        this.loadOpenCV()
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()
        ImageIO.write(image, "jpg", byteArrayOutputStream)
        byteArrayOutputStream.flush()
        return Imgcodecs.imdecode(new MatOfByte(byteArrayOutputStream.toByteArray()), Imgcodecs.IMREAD_UNCHANGED)
    }

    Mat gray(Mat source) {
        this.loadOpenCV()
        Mat destination = new Mat(source.height(), source.width(), CvType.CV_8UC1)
        Imgproc.cvtColor(source, destination, Imgproc.COLOR_RGB2GRAY)
        return destination
    }

    Mat bwi(Mat source, double thresh = 177, double maxval = 255) {
        Mat destination = new Mat(source.height(), source.width(), CvType.CV_8UC1)
        Imgproc.threshold(source, destination, thresh, maxval, Imgproc.THRESH_BINARY_INV)
        return destination
    }

    Mat bw(Mat source, double thresh = 177, double maxval = 255) {
        Mat destination = new Mat(source.height(), source.width(), CvType.CV_8UC1)
        Imgproc.threshold(source, destination, thresh, maxval, Imgproc.THRESH_BINARY)
        return destination
    }

    BufferedImage mat2BufferedImage(Mat matrix) throws IOException {
        this.loadOpenCV()
        MatOfByte mob = new MatOfByte()
        Imgcodecs.imencode(".jpg", matrix, mob)
        return ImageIO.read(new ByteArrayInputStream(mob.toArray()))
    }

}
