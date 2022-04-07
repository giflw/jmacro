package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldisplaydrawingobjects">https://docs.microsoft.com/en-us/office/vba/api/excel.xldisplaydrawingobjects</a>}
*/
public enum XlDisplayDrawingObjects implements COMEnum {
    
    /**@ Show all shapes. */
    xlDisplayShapes(-4104),    
    /**@ Hide all shapes. */
    xlHide(3),    
    /**@ Show only placeholders. */
    xlPlaceholders(2);

    private final long value;

    XlDisplayDrawingObjects(long value) {
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
