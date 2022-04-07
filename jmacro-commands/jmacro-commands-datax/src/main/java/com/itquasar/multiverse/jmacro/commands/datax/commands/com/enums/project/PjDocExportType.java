package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjdocexporttype">https://docs.microsoft.com/en-us/office/vba/api/project.pjdocexporttype</a>}
*/
public enum PjDocExportType implements COMEnum {
    
    /**@ Export to a PDF document. */
    pjPDF(0),    
    /**@ Export to an XPS document. */
    pjXPS(1);

    private final long value;

    PjDocExportType(long value) {
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
