package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdopenformat">https://docs.microsoft.com/en-us/office/vba/api/word.wdopenformat</a>}
*/
public enum WdOpenFormat implements COMEnum {
    
    /**@ A Microsoft Word format that is backward compatible with earlier versions of Word. */
    wdOpenFormatAllWord(6),    
    /**@ The existing format. */
    wdOpenFormatAuto(0),    
    /**@ Word format. */
    wdOpenFormatDocument(1),    
    /**@ Encoded text format. */
    wdOpenFormatEncodedText(5),    
    /**@ Rich text format (RTF). */
    wdOpenFormatRTF(3),    
    /**@ As a Word template. */
    wdOpenFormatTemplate(2),    
    /**@ Unencoded text format. */
    wdOpenFormatText(4),    
    /**@ OpenDocument Text format. */
    wdOpenFormatOpenDocumentText(18),    
    /**@ Unicode text format. */
    wdOpenFormatUnicodeText(5),    
    /**@ HTML format. */
    wdOpenFormatWebPages(7),    
    /**@ XML format. */
    wdOpenFormatXML(8),    
    /**@ Word template format. */
    wdOpenFormatAllWordTemplates(13),    
    /**@ Microsoft Word 97 document format. */
    wdOpenFormatDocument97(1),    
    /**@ Word 97 template format. */
    wdOpenFormatTemplate97(2),    
    /**@ XML document format. */
    wdOpenFormatXMLDocument(9),    
    /**@ Open XML file format saved as a single XML file. */
    wdOpenFormatXMLDocumentSerialized(14),    
    /**@ XML document format with macros enabled. */
    wdOpenFormatXMLDocumentMacroEnabled(10),    
    /**@ Open XML file format with macros enabled saved as a single XML file. */
    wdOpenFormatXMLDocumentMacroEnabledSerialized(15),    
    /**@ XML template format. */
    wdOpenFormatXMLTemplate(11),    
    /**@ Open XML template format saved as a XML single file. */
    wdOpenFormatXMLTemplateSerialized(16),    
    /**@ XML template format with macros enabled. */
    wdOpenFormatXMLTemplateMacroEnabled(12),    
    /**@ Open XML template format with macros enabled saved as a single XML file. */
    wdOpenFormatXMLTemplateMacroEnabledSerialized(17);

    private final long value;

    WdOpenFormat(long value) {
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
