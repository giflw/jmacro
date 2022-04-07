package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlarrowheadstyle">https://docs.microsoft.com/en-us/office/vba/api/excel.xlarrowheadstyle</a>}
*/
public enum XlArrowHeadStyle implements COMEnum {
    
    /**@ Small arrowhead with curved edge at connection to line. */
    xlArrowHeadStyleClosed(3),    
    /**@ Large diamond-shaped arrowhead. */
    xlArrowHeadStyleDoubleClosed(5),    
    /**@ Large arrowhead with curved edge at connection to line. */
    xlArrowHeadStyleDoubleOpen(4),    
    /**@ No arrowhead. */
    xlArrowHeadStyleNone(-4142),    
    /**@ Large triangular arrowhead. */
    xlArrowHeadStyleOpen(2);

    private final long value;

    XlArrowHeadStyle(long value) {
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
