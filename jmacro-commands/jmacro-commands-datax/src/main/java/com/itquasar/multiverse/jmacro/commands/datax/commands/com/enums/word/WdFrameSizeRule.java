package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdframesizerule">https://docs.microsoft.com/en-us/office/vba/api/word.wdframesizerule</a>}
*/
public enum WdFrameSizeRule implements COMEnum {
    
    /**@ Sets the height or width to a value equal to or greater than the value specified by the Height property or Width property. */
    wdFrameAtLeast(1),    
    /**@ Sets the height or width according to the height or width of the item in the frame. */
    wdFrameAuto(0),    
    /**@ Sets the height or width to an exact value specified by the Height property or Width property. */
    wdFrameExact(2);

    private final long value;

    WdFrameSizeRule(long value) {
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
