package com.itquasar.multiverse.jmacro.commands.datax.commands.pdf;

import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PDFAction {

    private File file;

    public PDFAction() {
        this((File) null);
    }

    public PDFAction(Path path) {
        this(path.toFile());
    }

    public PDFAction(File file) {
        this.file = file;
    }

    public PDDocument load() {
        return this.load(this.file);
    }

    public PDDocument load(File file) {
        try {
            return PDDocument.load(this.file);
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
            PDFParser parser = new PDFParser(new RandomAccessFile(this.file, "r"));
            parser.parse();

            COSDocument cosDoc = parser.getDocument();
            PDFTextStripper pdfStripper = new PDFTextStripper();
            PDDocument pdDoc = new PDDocument(cosDoc);

            String parsedText = pdfStripper.getText(pdDoc);
            cosDoc.close();
            return parsedText;
        } catch (IOException e) {
            throw new JMacroException("Error extracting text from pdf", e);
        }
    }

    public List<BufferedImage> asImages() {
        try {
            PDDocument document = PDDocument.load(this.file);
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
