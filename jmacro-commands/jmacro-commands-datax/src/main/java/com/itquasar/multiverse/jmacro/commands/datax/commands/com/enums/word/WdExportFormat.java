package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdexportformat">https://docs.microsoft.com/en-us/office/vba/api/word.wdexportformat</a>}
*/
public enum WdExportFormat implements COMEnum {
    
    /**@ Export document into PDF format. */
    wdExportFormatPDF(17),    
    /**@ Export document into XML Paper Specification (XPS) format. */
    wdExportFormatXPS(18);

    private final long value;

    WdExportFormat(long value) {
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
