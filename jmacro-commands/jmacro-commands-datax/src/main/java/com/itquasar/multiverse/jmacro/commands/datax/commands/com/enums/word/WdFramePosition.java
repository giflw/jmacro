package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdframeposition">https://docs.microsoft.com/en-us/office/vba/api/word.wdframeposition</a>}
*/
public enum WdFramePosition implements COMEnum {
    
    /**@ Bottom margin. */
    wdFrameBottom(-999997),    
    /**@ Center of document. */
    wdFrameCenter(-999995),    
    /**@ Content inside frame. */
    wdFrameInside(-999994),    
    /**@ Left margin. */
    wdFrameLeft(-999998),    
    /**@ Content outside frame. */
    wdFrameOutside(-999993),    
    /**@ Right margin. */
    wdFrameRight(-999996),    
    /**@ Top margin. */
    wdFrameTop(-999999);

    private final long value;

    WdFramePosition(long value) {
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
