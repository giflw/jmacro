package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olgridlinestyle">https://docs.microsoft.com/en-us/office/vba/api/outlook.olgridlinestyle</a>}
*/
public enum OlGridLineStyle implements COMEnum {
    
    /**@ Dashed lines are used to draw the grid. */
    olGridLineDashes(3),    
    /**@ Lines using large dots are used to draw the grid. */
    olGridLineLargeDots(2),    
    /**@ No lines are displayed. */
    olGridLineNone(0),    
    /**@ Lines using small dots are used to draw the grid. */
    olGridLineSmallDots(1),    
    /**@ Solid lines are used to draw the grid. */
    olGridLineSolid(4);

    private final long value;

    OlGridLineStyle(long value) {
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
