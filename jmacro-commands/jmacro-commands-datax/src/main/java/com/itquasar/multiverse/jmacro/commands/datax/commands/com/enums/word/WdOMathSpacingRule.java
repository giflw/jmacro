package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdomathspacingrule">https://docs.microsoft.com/en-us/office/vba/api/word.wdomathspacingrule</a>}
*/
public enum WdOMathSpacingRule implements COMEnum {
    
    /**@ One and half spaces for each line. */
    wdOMathSpacing1pt5(1),    
    /**@ Double spacing. */
    wdOMathSpacingDouble(2),    
    /**@ Exact spacing measurement. */
    wdOMathSpacingExactly(3),    
    /**@ Custom spacing measurement. */
    wdOMathSpacingMultiple(4),    
    /**@ Single spacing. */
    wdOMathSpacingSingle(0);

    private final long value;

    WdOMathSpacingRule(long value) {
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
