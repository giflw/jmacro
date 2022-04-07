package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcaptionposition">https://docs.microsoft.com/en-us/office/vba/api/word.wdcaptionposition</a>}
*/
public enum WdCaptionPosition implements COMEnum {
    
    /**@ The caption label is added above. */
    wdCaptionPositionAbove(0),    
    /**@ The caption label is added below. */
    wdCaptionPositionBelow(1);

    private final long value;

    WdCaptionPosition(long value) {
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
