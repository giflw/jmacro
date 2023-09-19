package com.itquasar.multiverse.jmacro.commands.datax.commands.pdf;

import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import lombok.SneakyThrows;
import net.coobird.thumbnailator.Thumbnails;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class PDFAction {

    // FIXME is there any beter representation like input stream?
    private final File file;

    public PDFAction(File file) {
        this.file = file;
    }

    public PDDocument load() {
        return this.load(this.file);
    }

    public PDDocument load(File file) {
        try {
            PDFParser parser = new PDFParser(new RandomAccessReadBufferedFile(this.file));
            return parser.parse();
        } catch (IOException e) {
            throw new JMacroException("Error loading pdf " + this.file, e);
        }
    }

    public String getText() {
        try {
            PDDocument document = this.load();
            String text = new PDFTextStripper().getText(document);
            document.close();
            return text;
        } catch (IOException e) {
            throw new JMacroException("Error extracting text from pdf", e);
        }
    }

    public String asText() {
        try {
            PDFParser parser = new PDFParser(new RandomAccessReadBufferedFile(this.file));
            PDDocument pdDoc = parser.parse();
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String parsedText = pdfStripper.getText(pdDoc);
            pdDoc.close();
            return parsedText;
        } catch (IOException e) {
            throw new JMacroException("Error extracting text from pdf", e);
        }
    }

    /**
     * @param page Page number, starting from 1
     * @return Given page as image
     */
    public BufferedImage asImage(int page) {
        try {
            PDFParser parser = new PDFParser(new RandomAccessReadBufferedFile(this.file));
            PDDocument document = parser.parse();
            PDFRenderer pdfRenderer = new PDFRenderer(document);
            BufferedImage image = pdfRenderer.renderImageWithDPI(page - 1, 300, ImageType.RGB);
            document.close();
            return image;
        } catch (IOException e) {
            throw new JMacroException("Error converting pdf to image", e);
        }
    }

    /**
     * <pre>
     * pdf ("file.pdf") { p ->
     *     p.thumbnail(file("~/thumb.jpg").toFile())
     * }
     * </pre>
     *
     * @param file File to save the thumbnail
     */
    public void thumbnail(File file) {
        this.thumbnail(1, file);
    }

    @SneakyThrows
    public void thumbnail(int page, File file) {
        Thumbnails.of(this.asImage(page))
            .size(640, 480)
            .outputFormat("jpg")
            .toFile(file);
    }

    public void thumbnail(OutputStream outputStream) {
        this.thumbnail(1, outputStream);
    }

    @SneakyThrows
    public void thumbnail(int page, OutputStream outputStream) {
        Thumbnails.of(this.asImage(page))
            .size(640, 480)
            .outputFormat("jpg")
            .toOutputStream(outputStream);
    }

    public List<BufferedImage> asImages() {
        try {
            PDFParser parser = new PDFParser(new RandomAccessReadBufferedFile(this.file));
            PDDocument document = parser.parse();
            List<BufferedImage> images = new ArrayList<>();
            PDFRenderer pdfRenderer = new PDFRenderer(document);
            for (int page = 0; page < document.getNumberOfPages(); ++page) {
                BufferedImage image = pdfRenderer.renderImageWithDPI(page, 300, ImageType.RGB);
                images.add(image);
            }
            document.close();
            return images;
        } catch (IOException e) {
            throw new JMacroException("Error converting pdf to image", e);
        }
    }

    public List<BufferedImage> getImages() {
        try {
            PDDocument document = this.load();
            List<BufferedImage> images = new PDFImageExtractor().getImages(document);
            document.close();
            return images;
        } catch (IOException e) {
            throw new JMacroException("Error extracting images from pdf", e);
        }
    }

}
