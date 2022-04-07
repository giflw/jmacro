package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acsplitformorientation">https://docs.microsoft.com/en-us/office/vba/api/access.acsplitformorientation</a>}
*/
public enum AcSplitFormOrientation implements COMEnum {
    
    /**@ The datasheet is displayed below the form. */
    acDatasheetOnBottom(1),    
    /**@ The datasheet is displayed to the left of the form. */
    acDatasheetOnLeft(2),    
    /**@ The datasheet is displayed to the right of the form. */
    acDatasheetOnRight(3),    
    /**@ The datasheet is displayed above the form. */
    acDatasheetOnTop(0);

    private final long value;

    AcSplitFormOrientation(long value) {
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
