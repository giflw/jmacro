package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsaveconflictresolution">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsaveconflictresolution</a>}
*/
public enum XlSaveConflictResolution implements COMEnum {
    
    /**@ The local user's changes are always accepted. */
    xlLocalSessionChanges(2),    
    /**@ The local user's changes are always rejected. */
    xlOtherSessionChanges(3),    
    /**@ A dialog box asks the user to resolve the conflict. */
    xlUserResolution(1);

    private final long value;

    XlSaveConflictResolution(long value) {
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
