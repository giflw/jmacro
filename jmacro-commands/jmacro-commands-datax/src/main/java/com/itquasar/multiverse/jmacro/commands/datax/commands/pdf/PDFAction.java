package com.itquasar.multiverse.jmacro.commands.datax.commands.pdf;

import lombok.SneakyThrows;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.text.PDFTextStripper;

import java.awt.image.RenderedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PDFAction {

    private File file;
    private PDDocument document;

    public PDFAction() {
        this(null);
    }

    public PDFAction(File file) {
        this.file = file;
        this.load();
    }

    @SneakyThrows
    public PDFAction load(File file) {
        this.file = file;
        return this.load();
    }

    @SneakyThrows
    public PDFAction load() {
        if (this.file != null) {
            this.document = Loader.loadPDF(this.file);
        }
        return this;
    }

    @SneakyThrows
    public String getText() {
        return new PDFTextStripper().getText(this.document);
    }

    @SneakyThrows
    public List<RenderedImage> getImages(File file) {
        return getImagesFromPDF(this.document);
    }

    @SneakyThrows
    private static List<RenderedImage> getImagesFromPDF(PDDocument document) {
        List<RenderedImage> images = new ArrayList<>();
        for (PDPage page : document.getPages()) {
            images.addAll(getImagesFromResources(page.getResources()));
        }
        return images;
    }

    @SneakyThrows
    private static List<RenderedImage> getImagesFromResources(PDResources resources) {
        List<RenderedImage> images = new ArrayList<>();

        for (COSName xObjectName : resources.getXObjectNames()) {
            PDXObject xObject = resources.getXObject(xObjectName);
            if (xObject instanceof PDFormXObject) {
                images.addAll(getImagesFromResources(((PDFormXObject) xObject).getResources()));
            } else if (xObject instanceof PDImageXObject) {
                images.add(((PDImageXObject) xObject).getImage());
            }
        }

        return images;
    }

}
