package com.itquasar.multiverse.jmacro.commands.datax.commands.pdf;

import org.apache.pdfbox.contentstream.PDFGraphicsStreamEngine;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.graphics.color.PDColor;
import org.apache.pdfbox.pdmodel.graphics.color.PDPattern;
import org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import org.apache.pdfbox.pdmodel.graphics.image.PDImage;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern;
import org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern;
import org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState;
import org.apache.pdfbox.pdmodel.graphics.state.PDSoftMask;
import org.apache.pdfbox.pdmodel.graphics.state.RenderingMode;
import org.apache.pdfbox.util.Matrix;
import org.apache.pdfbox.util.Vector;

import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Based on ExtractImages.java from github.com/apache/pdfbox.
 *
 * @see <a href="https://github.com/apache/pdfbox/blob/trunk/tools/src/main/java/org/apache/pdfbox/tools/ExtractImages.java">ExtractImages.java</a>
 */
public class ImageGraphicsEngine extends PDFGraphicsStreamEngine {

    private final Set<COSStream> seen = new HashSet<>();
    private final List<BufferedImage> images = new ArrayList<>();

    protected ImageGraphicsEngine(PDPage page) {
        super(page);
    }

    static List<BufferedImage> extract(PDDocument document) throws IOException {
        List<BufferedImage> images = new ArrayList<>();
        for (PDPage page : document.getPages()) {
            ImageGraphicsEngine extractor = new ImageGraphicsEngine(page);
            extractor.run();
            images.addAll(extractor.getImages());
        }
        return images;
    }

    public List<BufferedImage> getImages() {
        return images;
    }

    public void run() throws IOException {
        PDPage page = getPage();
        processPage(page);
        PDResources res = page.getResources();
        if (res == null) {
            return;
        }
        for (COSName name : res.getExtGStateNames()) {
            PDExtendedGraphicsState extGState = res.getExtGState(name);
            if (extGState == null) {
                // can happen if key exists but no value
                continue;
            }
            PDSoftMask softMask = extGState.getSoftMask();
            if (softMask != null) {
                PDTransparencyGroup group = softMask.getGroup();
                if (group != null) {
                    // PDFBOX-4327: without this line NPEs will occur
                    res.getExtGState(name).copyIntoGraphicsState(getGraphicsState());
                    processSoftMask(group);
                }
            }
        }
    }

    @Override
    public void drawImage(PDImage pdImage) throws IOException {
        if (pdImage instanceof PDImageXObject xobject) {
            if (pdImage.isStencil()) {
                processColor(getGraphicsState().getNonStrokingColor());
            }
            if (seen.contains(xobject.getCOSObject())) {
                // skip duplicate image
                return;
            }
            seen.add(xobject.getCOSObject());
        }

        BufferedImage rawImage = pdImage.getRawImage();
        images.add(rawImage);

    }

    @Override
    public void appendRectangle(Point2D p0, Point2D p1, Point2D p2, Point2D p3)
        throws IOException {
        // Empty: add special handling if needed
    }

    @Override
    public void clip(int windingRule) throws IOException {
        // Empty: add special handling if needed
    }

    @Override
    public void moveTo(float x, float y) throws IOException {
        // Empty: add special handling if needed
    }

    @Override
    public void lineTo(float x, float y) throws IOException {
        // Empty: add special handling if needed
    }

    @Override
    public void curveTo(float x1, float y1, float x2, float y2, float x3, float y3)
        throws IOException {
        // Empty: add special handling if needed
    }

    @Override
    public Point2D getCurrentPoint() throws IOException {
        return new Point2D.Float(0, 0);
    }

    @Override
    public void closePath() throws IOException {
        // Empty: add special handling if needed
    }

    @Override
    public void endPath() throws IOException {
        // Empty: add special handling if needed
    }

    @Override
    protected void showGlyph(Matrix textRenderingMatrix, PDFont font, int code, Vector displacement) throws IOException {
        PDGraphicsState graphicsState = getGraphicsState();
        RenderingMode renderingMode = graphicsState.getTextState().getRenderingMode();
        if (renderingMode.isFill()) {
            processColor(graphicsState.getNonStrokingColor());
        }
        if (renderingMode.isStroke()) {
            processColor(graphicsState.getStrokingColor());
        }
    }

    @Override
    public void strokePath() throws IOException {
        processColor(getGraphicsState().getStrokingColor());
    }

    @Override
    public void fillPath(int windingRule) throws IOException {
        processColor(getGraphicsState().getNonStrokingColor());
    }

    @Override
    public void fillAndStrokePath(int windingRule) throws IOException {
        processColor(getGraphicsState().getNonStrokingColor());
    }

    @Override
    public void shadingFill(COSName shadingName) throws IOException {
        // Empty: add special handling if needed
    }

    // find out if it is a tiling pattern, then process that one
    private void processColor(PDColor color) throws IOException {
        if (color.getColorSpace() instanceof PDPattern pattern) {
            PDAbstractPattern abstractPattern = pattern.getPattern(color);
            if (abstractPattern instanceof PDTilingPattern) {
                processTilingPattern((PDTilingPattern) abstractPattern, null, null);
            }
        }
    }
}
