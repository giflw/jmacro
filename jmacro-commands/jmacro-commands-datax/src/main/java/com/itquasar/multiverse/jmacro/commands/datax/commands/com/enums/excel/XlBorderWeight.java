package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlborderweight">https://docs.microsoft.com/en-us/office/vba/api/excel.xlborderweight</a>}
*/
public enum XlBorderWeight implements COMEnum {
    
    /**@ Hairline (thinnest border). */
    xlHairline(1),    
    /**@ Medium. */
    xlMedium(-4138),    
    /**@ Thick (widest border). */
    xlThick(4),    
    /**@ Thin. */
    xlThin(2);

    private final long value;

    XlBorderWeight(long value) {
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
