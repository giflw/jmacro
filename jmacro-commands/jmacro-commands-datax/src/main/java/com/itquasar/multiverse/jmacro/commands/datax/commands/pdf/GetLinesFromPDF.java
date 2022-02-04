package com.itquasar.multiverse.jmacro.commands.datax.commands.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * Based on GetLinesFromPDF.java from Tutorial Kart.
 *
 * @see <a href="https://www.tutorialkart.com/pdfbox/extract-text-line-by-line-from-pdf/">
 * How to extract text line by line from PDF using PDFBox? - Tutorial Kart
 * </a>
 */
public class GetLinesFromPDF extends PDFTextStripper {

    private final List<String> lines = new ArrayList<>();

    public GetLinesFromPDF() throws IOException {
    }

    /**
     * @throws IOException If there is an error parsing the document.
     */
    public List<String> getLines(PDDocument document) throws IOException {
        try {
            PDFTextStripper stripper = new GetLinesFromPDF();
            stripper.setSortByPosition(true);
            stripper.setStartPage(0);
            stripper.setEndPage(document.getNumberOfPages());

            Writer dummy = new OutputStreamWriter(new ByteArrayOutputStream());
            stripper.writeText(document, dummy);

            // print lines
            for (String line : lines) {
                System.out.println(line);
            }
        } finally {
            if (document != null) {
                document.close();
            }
        }
        return lines;
    }

    /**
     * Override the default functionality of PDFTextStripper.writeString()
     */
    @Override
    protected void writeString(String str, List<TextPosition> textPositions) throws IOException {
        lines.add(str);
        // you may process the line here itself, as and when it is obtained
    }
}
