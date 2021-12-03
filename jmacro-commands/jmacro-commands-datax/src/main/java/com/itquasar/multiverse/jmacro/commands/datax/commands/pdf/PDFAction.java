package com.itquasar.multiverse.jmacro.commands.datax.commands.pdf;

import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.text.PDFTextStripper;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PDFAction {

    private File file;
    private PDDocument document;

    public PDFAction() {
        this((File) null);
    }

    public PDFAction(Path path) {
        this(path.toFile());
    }

    public PDFAction(File file) {
        this.file = file;
        this.load();
    }


    private static List<BufferedImage> getImagesFromPDF(PDDocument document) {
        List<BufferedImage> images = new ArrayList<>();
        for (PDPage page : document.getPages()) {
            images.addAll(getImagesFromResources(page.getResources()));
        }
        return images;
    }


    private static List<BufferedImage> getImagesFromResources(PDResources resources) {
        if (resources == null) {
            return List.of();
        }
        List<BufferedImage> images = new ArrayList<>();

        for (COSName xObjectName : resources.getXObjectNames()) {
            try {
                PDXObject xObject = resources.getXObject(xObjectName);
                if (xObject instanceof PDFormXObject) {
                    images.addAll(getImagesFromResources(((PDFormXObject) xObject).getResources()));
                } else if (xObject instanceof PDImageXObject) {
                    images.add(((PDImageXObject) xObject).getImage());
                }
            } catch (IOException ex) {
                throw new JMacroException("Error getting images from pdf", ex);
            }
        }

        return images;
    }


    public PDFAction load(File file) {
        this.file = file;
        return this.load();
    }


    public PDFAction load() {
        if (this.file != null) {
            try {
                this.document = Loader.loadPDF(this.file);
            } catch (IOException e) {
                throw new JMacroException("Error loading pdf " + this.file, e);
            }
        }
        return this;
    }


    public String getText() {
        try {
            return new PDFTextStripper().getText(this.document);
        } catch (IOException e) {
            throw new JMacroException("Error extracting text from pdf", e);
        }
    }


    public List<BufferedImage> getImages() {
        return getImagesFromPDF(this.document);
    }

}
