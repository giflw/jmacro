package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllistconflict">https://docs.microsoft.com/en-us/office/vba/api/excel.xllistconflict</a>}
*/
public enum XlListConflict implements COMEnum {
    
    /**@ Display a dialog box that allows the user to choose how to resolve conflicts. */
    xlListConflictDialog(0),    
    /**@ Accept the version of the data stored on the SharePoint site. */
    xlListConflictDiscardAllConflicts(2),    
    /**@ Raise an error if a conflict occurs. */
    xlListConflictError(3),    
    /**@ Overwrite the version of the data stored on the SharePoint site. */
    xlListConflictRetryAllConflicts(1);

    private final long value;

    XlListConflict(long value) {
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
