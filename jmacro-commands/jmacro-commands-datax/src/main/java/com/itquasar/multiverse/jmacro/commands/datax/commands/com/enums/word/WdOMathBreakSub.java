package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdomathbreaksub">https://docs.microsoft.com/en-us/office/vba/api/word.wdomathbreaksub</a>}
*/
public enum WdOMathBreakSub implements COMEnum {
    
    /**@ Repeats a minus sign that ends before a line break at the beginning of the next line. Default. */
    wdOMathBreakSubMinusMinus(0),    
    /**@ Inserts a minus sign at the end of the first line, before the line break, and a plus sign at the beginning of the following line, before the number. */
    wdOMathBreakSubMinusPlus(2),    
    /**@ Inserts a plus sign at the end of the first line, before the line break, and a minus sign at the beginning of the following line, before the number. */
    wdOMathBreakSubPlusMinus(1);

    private final long value;

    WdOMathBreakSub(long value) {
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
