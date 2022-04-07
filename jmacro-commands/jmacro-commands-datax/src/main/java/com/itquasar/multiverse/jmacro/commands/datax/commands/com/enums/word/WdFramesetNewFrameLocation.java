package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdframesetnewframelocation">https://docs.microsoft.com/en-us/office/vba/api/word.wdframesetnewframelocation</a>}
*/
public enum WdFramesetNewFrameLocation implements COMEnum {
    
    /**@ Above existing frame. */
    wdFramesetNewFrameAbove(0),    
    /**@ Below existing frame. */
    wdFramesetNewFrameBelow(1),    
    /**@ To the left of existing frame. */
    wdFramesetNewFrameLeft(3),    
    /**@ To the right of existing frame. */
    wdFramesetNewFrameRight(2);

    private final long value;

    WdFramesetNewFrameLocation(long value) {
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
