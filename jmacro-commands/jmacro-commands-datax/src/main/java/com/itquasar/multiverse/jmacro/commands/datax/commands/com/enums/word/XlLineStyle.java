package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xllinestyle">https://docs.microsoft.com/en-us/office/vba/api/word.xllinestyle</a>}
*/
public enum XlLineStyle implements COMEnum {
    
    /**@ A continuous line. */
    xlContinuous(1),    
    /**@ A dashed line. */
    xlDash(-4115),    
    /**@ Alternating dashes and dots. */
    xlDashDot(4),    
    /**@ A dash followed by two dots. */
    xlDashDotDot(5),    
    /**@ A dotted line. */
    xlDot(-4118),    
    /**@ A double line. */
    xlDouble(-4119),    
    /**@ No line. */
    xlLineStyleNone(-4142),    
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
