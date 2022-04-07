package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpreferredwidthtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdpreferredwidthtype</a>}
*/
public enum WdPreferredWidthType implements COMEnum {
    
    /**@ Automatically select the unit of measure to use based on the current selection. */
    wdPreferredWidthAuto(1),    
    /**@ Measure the current item width using a specified percentage. */
    wdPreferredWidthPercent(2),    
    /**@ Measure the current item width using a specified number of points. */
    wdPreferredWidthPoints(3);

    private final long value;

    WdPreferredWidthType(long value) {
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
