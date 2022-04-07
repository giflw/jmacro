package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdprintoutitem">https://docs.microsoft.com/en-us/office/vba/api/word.wdprintoutitem</a>}
*/
public enum WdPrintOutItem implements COMEnum {
    
    /**@ Autotext entries in the current document. */
    wdPrintAutoTextEntries(4),    
    /**@ Comments in the current document. */
    wdPrintComments(2),    
    /**@ Current document content. */
    wdPrintDocumentContent(0),    
    /**@ Current document content including markup. */
    wdPrintDocumentWithMarkup(7),    
    /**@ An envelope. */
    wdPrintEnvelope(6),    
    /**@ Key assignments in the current document. */
    wdPrintKeyAssignments(5),    
    /**@ Markup in the current document. */
    wdPrintMarkup(2),    
    /**@ Properties in the current document. */
    wdPrintProperties(1),    
    /**@ Styles in the current document. */
    wdPrintStyles(3);

    private final long value;

    WdPrintOutItem(long value) {
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
