package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldisplayunit">https://docs.microsoft.com/en-us/office/vba/api/excel.xldisplayunit</a>}
*/
public enum XlDisplayUnit implements COMEnum {
    
    /**@ Hundreds of millions. */
    xlHundredMillions(-8),    
    /**@ Hundreds. */
    xlHundreds(-2),    
    /**@ Hundreds of thousands. */
    xlHundredThousands(-5),    
    /**@ Millions of millions. */
    xlMillionMillions(-10),    
    /**@ Millions. */
    xlMillions(-6),    
    /**@ Tens of millions. */
    xlTenMillions(-7),    
    /**@ Tens of thousands. */
    xlTenThousands(-4),    
    /**@ Thousands of millions. */
    xlThousandMillions(-9),    
    /**@ Thousands. */
    xlThousands(-3);

    private final long value;

    XlDisplayUnit(long value) {
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
