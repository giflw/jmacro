package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsheetvisibility">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsheetvisibility</a>}
*/
public enum XlSheetVisibility implements COMEnum {
    
    /**@ Hides the worksheet which the user can unhide via menu. */
    xlSheetHidden(0),    
    /**@ Hides the object so that the only way for you to make it visible again is by setting this property to True (the user cannot make the object visible). */
    xlSheetVeryHidden(2),    
    /**@ Displays the sheet. */
    xlSheetVisible(-1);

    private final long value;

    XlSheetVisibility(long value) {
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
