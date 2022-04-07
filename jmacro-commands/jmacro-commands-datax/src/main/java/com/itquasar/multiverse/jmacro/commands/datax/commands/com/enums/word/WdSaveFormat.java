package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsaveformat">https://docs.microsoft.com/en-us/office/vba/api/word.wdsaveformat</a>}
*/
public enum WdSaveFormat implements COMEnum {
    
    /**@ Microsoft Office Word 97 - 2003 binary file format. */
    wdFormatDocument(0),    
    /**@ Microsoft DOS text format. */
    wdFormatDOSText(4),    
    /**@ Microsoft DOS text with line breaks preserved. */
    wdFormatDOSTextLineBreaks(5),    
    /**@ Encoded text format. */
    wdFormatEncodedText(7),    
    /**@ Filtered HTML format. */
    wdFormatFilteredHTML(10),    
    /**@ Open XML file format saved as a single XML file. */
    wdFormatFlatXML(19),    
    /**@ Open XML file format with macros enabled saved as a single XML file. */
    wdFormatFlatXMLMacroEnabled(20),    
    /**@ Open XML template format saved as a XML single file. */
    wdFormatFlatXMLTemplate(21),    
    /**@ Open XML template format with macros enabled saved as a single XML file. */
    wdFormatFlatXMLTemplateMacroEnabled(22),    
    /**@ OpenDocument Text format. */
    wdFormatOpenDocumentText(23),    
    /**@ Standard HTML format. */
    wdFormatHTML(8),    
    /**@ Rich text format (RTF). */
    wdFormatRTF(6),    
    /**@ Strict Open XML document format. */
    wdFormatStrictOpenXMLDocument(24),    
    /**@ Word template format. */
    wdFormatTemplate(1),    
    /**@ Microsoft Windows text format. */
    wdFormatText(2),    
    /**@ Windows text format with line breaks preserved. */
    wdFormatTextLineBreaks(3),    
    /**@ Unicode text format. */
    wdFormatUnicodeText(7),    
    /**@ Web archive format. */
    wdFormatWebArchive(9),    
    /**@ Extensible Markup Language (XML) format. */
    wdFormatXML(11),    
    /**@ Microsoft Word 97 document format. */
    wdFormatDocument97(0),    
    /**@ Word default document file format. For Word, this is the DOCX format. */
    wdFormatDocumentDefault(16),    
    /**@ PDF format. */
    wdFormatPDF(17),    
    /**@ Word 97 template format. */
    wdFormatTemplate97(1),    
    /**@ XML document format. */
    wdFormatXMLDocument(12),    
    /**@ XML document format with macros enabled. */
    wdFormatXMLDocumentMacroEnabled(13),    
    /**@ XML template format. */
    wdFormatXMLTemplate(14),    
    /**@ XML template format with macros enabled. */
    wdFormatXMLTemplateMacroEnabled(15),    
    /**@ XPS format. */
    wdFormatXPS(18);

    private final long value;

    WdSaveFormat(long value) {
        this.value = value;
    }

    @Override
    public Variant toVariant() {
        return new Variant(this.value);
    }

    @Override
    public long getValue() {
        return this.value;
    }
}
