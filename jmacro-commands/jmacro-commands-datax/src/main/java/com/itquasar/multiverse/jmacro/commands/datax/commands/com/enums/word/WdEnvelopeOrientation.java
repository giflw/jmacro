package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdenvelopeorientation">https://docs.microsoft.com/en-us/office/vba/api/word.wdenvelopeorientation</a>}
*/
public enum WdEnvelopeOrientation implements COMEnum {
    
    /**@ Center clockwise orientation. */
    wdCenterClockwise(7),    
    /**@ Center landscape orientation. */
    wdCenterLandscape(4),    
    /**@ Center portrait orientation. */
    wdCenterPortrait(1),    
    /**@ Left clockwise orientation. */
    wdLeftClockwise(6),    
    /**@ Left landscape orientation. */
    wdLeftLandscape(3),    
    /**@ Left portrait orientation. */
    wdLeftPortrait(0),    
    /**@ Right clockwise orientation. */
    wdRightClockwise(8),    
    /**@ Right landscape orientation. */
    wdRightLandscape(5),    
    /**@ Right portrait orientation. */
    wdRightPortrait(2);

    private final long value;

    WdEnvelopeOrientation(long value) {
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
