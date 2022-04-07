package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionsview">https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionsview</a>}
*/
public enum WdRevisionsView implements COMEnum {
    
    /**@ Displays the document with formatting and content changes applied. */
    wdRevisionsViewFinal(0),    
    /**@ Displays the document before changes were made. */
    wdRevisionsViewOriginal(1);

    private final long value;

    WdRevisionsView(long value) {
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
