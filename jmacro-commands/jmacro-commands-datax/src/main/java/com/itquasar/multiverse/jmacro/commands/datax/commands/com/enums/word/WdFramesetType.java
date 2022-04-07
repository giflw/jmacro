package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdframesettype">https://docs.microsoft.com/en-us/office/vba/api/word.wdframesettype</a>}
*/
public enum WdFramesetType implements COMEnum {
    
    /**@ A single frame. */
    wdFramesetTypeFrame(1),    
    /**@ A frameset. */
    wdFramesetTypeFrameset(0);

    private final long value;

    WdFramesetType(long value) {
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
