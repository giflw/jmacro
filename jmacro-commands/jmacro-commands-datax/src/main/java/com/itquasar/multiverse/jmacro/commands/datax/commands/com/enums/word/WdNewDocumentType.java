package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdnewdocumenttype">https://docs.microsoft.com/en-us/office/vba/api/word.wdnewdocumenttype</a>}
*/
public enum WdNewDocumentType implements COMEnum {
    
    /**@ Blank document. */
    wdNewBlankDocument(0),    
    /**@ Email message. */
    wdNewEmailMessage(2),    
    /**@ Frameset. */
    wdNewFrameset(3),    
    /**@ Web page. */
    wdNewWebPage(1),    
    /**@ XML document. */
    wdNewXMLDocument(4);

    private final long value;

    WdNewDocumentType(long value) {
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
