package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdfareastlinebreaklevel">https://docs.microsoft.com/en-us/office/vba/api/word.wdfareastlinebreaklevel</a>}
*/
public enum WdFarEastLineBreakLevel implements COMEnum {
    
    /**@ Custom line break control. */
    wdFarEastLineBreakLevelCustom(2),    
    /**@ Normal line break control. */
    wdFarEastLineBreakLevelNormal(0),    
    /**@ Strict line break control. */
    wdFarEastLineBreakLevelStrict(1);

    private final long value;

    WdFarEastLineBreakLevel(long value) {
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
