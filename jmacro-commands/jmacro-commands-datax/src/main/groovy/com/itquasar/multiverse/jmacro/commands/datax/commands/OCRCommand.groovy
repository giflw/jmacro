package com.itquasar.multiverse.jmacro.commands.datax.commands

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.CommandUtils
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware
import net.sourceforge.tess4j.ITesseract
import net.sourceforge.tess4j.Tesseract

import javax.script.ScriptEngine
import java.awt.*
import java.awt.image.BufferedImage
import java.nio.file.Path
import java.util.List
import java.util.function.Consumer

class OCRCommand extends AbstractCommand {

    private ITesseract tesseract

    OCRCommand(String name, Core core, ScriptEngineAware scriptEngineAware) {
        super(name, core, scriptEngineAware)
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
        this.init()
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

    void call(Consumer<OCRCommand> consumer) {
        consumer.accept(this)
    }

    def methodMissing(String name, def args) {
        this.init()
        CommandUtils.methodMissingOnOrChainToContext(context, this.tesseract, name, args)
    }

    def propertyMissing(String name) {
        this.init()
        CommandUtils.propertyMissingOnOrChainToContext(this, this.tesseract, name)
    }

    def propertyMissing(String name, def arg) {
        this.init()
        CommandUtils.propertyMissingOnOrChainToContext(this, this.tesseract, name, arg)
    }

    BufferedImage scale(BufferedImage originalImage, float factor) {
        int targetWidth = Float.valueOf(originalImage.width * factor).intValue()
        int targetHeight = Float.valueOf((int) originalImage.height * factor).intValue()
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_REPLICATE)
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB)
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null)
        return outputImage
    }

}
