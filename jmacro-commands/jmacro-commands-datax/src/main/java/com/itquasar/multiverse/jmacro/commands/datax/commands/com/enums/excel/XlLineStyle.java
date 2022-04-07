package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllinestyle">https://docs.microsoft.com/en-us/office/vba/api/excel.xllinestyle</a>}
*/
public enum XlLineStyle implements COMEnum {
    
    /**@ Continuous line. */
    xlContinuous(1),    
    /**@ Dashed line. */
    xlDash(-4115),    
    /**@ Alternating dashes and dots. */
    xlDashDot(4),    
    /**@ Dash followed by two dots. */
    xlDashDotDot(5),    
    /**@ Dotted line. */
    xlDot(-4142),    
    /**@ Double line. */
    xlDouble(-4119),    
    /**@ No line. */
    xlLineStyleNone(-4118),    
    /**@ Slanted dashes. */
    xlSlantDashDot(13);

    private final long value;

    XlLineStyle(long value) {
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
