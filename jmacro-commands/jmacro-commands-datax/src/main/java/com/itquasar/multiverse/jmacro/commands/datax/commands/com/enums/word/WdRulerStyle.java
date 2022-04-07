package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrulerstyle">https://docs.microsoft.com/en-us/office/vba/api/word.wdrulerstyle</a>}
*/
public enum WdRulerStyle implements COMEnum {
    
    /**@ Adjusts the left edge of the first column only, preserving the positions of the other columns and the right edge of the table. */
    wdAdjustFirstColumn(2),    
    /**@ Adjusts the left edge of row or rows, preserving the width of all columns by shifting them to the left or right. This is the default value. */
    wdAdjustNone(0),    
    /**@ Adjusts the left edge of the first column, preserving the position of the right edge of the table by proportionally adjusting the widths of all the cells in the specified row or rows. */
    wdAdjustProportional(1),    
    /**@ Adjusts the left edge of the first column, preserving the position of the right edge of the table by setting the widths of all the cells in the specified row or rows to the same value. */
    wdAdjustSameWidth(3);

    private final long value;

    WdRulerStyle(long value) {
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
