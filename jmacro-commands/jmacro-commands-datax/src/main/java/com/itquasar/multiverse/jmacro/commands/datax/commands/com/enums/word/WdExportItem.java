package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdexportitem">https://docs.microsoft.com/en-us/office/vba/api/word.wdexportitem</a>}
*/
public enum WdExportItem implements COMEnum {
    
    /**@ Exports the document without markup. */
    wdExportDocumentContent(0),    
    /**@ Exports the document with markup. */
    wdExportDocumentWithMarkup(7);

    private final long value;

    WdExportItem(long value) {
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
