package com.itquasar.multiverse.jmacro.commands.datax.commands.pdf;

import org.apache.pdfbox.contentstream.PDFStreamEngine;
import org.apache.pdfbox.contentstream.operator.Operator;
import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Based on SaveImagesInPdf.java from Tutorial Kart.
 *
 * @see <a href="https://www.tutorialkart.com/pdfbox/extract-images-from-pdf-using-pdfbox/">
 *     How to extract images from pdf using PDFBox - Tutorial Kart
 * </a>
 */
public class PDFImageExtractor {

    public List<BufferedImage> getImages(PDDocument document) throws IOException {
        return new PDFImageExtractionStreamEngine(document).extractImages();
    }

    public static class PDFImageExtractionStreamEngine extends PDFStreamEngine {

        private final List<BufferedImage> images = new ArrayList<>();

        private final PDDocument document;

        public PDFImageExtractionStreamEngine(PDDocument document) {
            this.document = document;
        }

        public List<BufferedImage> extractImages() throws IOException {
            images.clear();
            for (PDPage page : document.getPages()) {
                processPage(page);
            }
            return images;
        }

        @Override
        protected void processOperator(Operator operator, List<COSBase> operands) throws IOException {
            String operation = operator.getName();
            if ("Do".equals(operation)) {
                COSName objectName = (COSName) operands.get(0);
                PDXObject pdxObject = getResources().getXObject(objectName);
                if (pdxObject instanceof PDImageXObject) {
                    PDImageXObject image = (PDImageXObject) pdxObject;
                    BufferedImage bImage = image.getImage();
                    // File
//                    String randomName = UUID.randomUUID().toString();
//                    File outputFile = new File("path/to/dirname",randomName + ".png");
//
//                    // Write image to file
//                    ImageIO.write(bImage, "PNG", outputFile);
                    images.add(bImage);
//                    System.out.println("================ imagefound: " + images.size());
                } else if (pdxObject instanceof PDFormXObject) {
                    PDFormXObject form = (PDFormXObject) pdxObject;
                    showForm(form);
                }
            } else {
                super.processOperator(operator, operands);
            }
        }
    }
}
