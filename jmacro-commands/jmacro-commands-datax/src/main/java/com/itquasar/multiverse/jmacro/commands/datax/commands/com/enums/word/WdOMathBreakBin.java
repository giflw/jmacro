package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdomathbreakbin">https://docs.microsoft.com/en-us/office/vba/api/word.wdomathbreakbin</a>}
*/
public enum WdOMathBreakBin implements COMEnum {
    
    /**@ Places the operator before a line break, at the end of the line. */
    wdOMathBreakBinAfter(1),    
    /**@ Places the operator after a line break, at the beginning of the following line. */
    wdOMathBreakBinBefore(0),    
    /**@ Repeats the operator before a line break at the end of the line and after a line break at the beginning of the following line. */
    wdOMathBreakBinRepeat(2);

    private final long value;

    WdOMathBreakBin(long value) {
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
