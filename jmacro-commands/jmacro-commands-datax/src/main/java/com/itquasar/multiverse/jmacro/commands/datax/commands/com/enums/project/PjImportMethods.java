package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjimportmethods">https://docs.microsoft.com/en-us/office/vba/api/project.pjimportmethods</a>}
*/
public enum PjImportMethods implements COMEnum {
    
    /**@ Imported data is appended to the end of the active project. */
    pjImportAppend(1),    
    /**@ Imported data is merged into the active project. */
    pjImportMerge(2),    
    /**@ Imported data is placed in a new project. */
    pjImportNew(0);

    private final long value;

    PjImportMethods(long value) {
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
