package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslideshowstate">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslideshowstate</a>}
*/
public enum PpSlideShowState implements COMEnum {
    
    /**@ Black screen */
    ppSlideShowBlackScreen(3),    
    /**@ Done */
    ppSlideShowDone(5),    
    /**@ Paused */
    ppSlideShowPaused(2),    
    /**@ Running */
    ppSlideShowRunning(1),    
    /**@ White screen */
    ppSlideShowWhiteScreen(4);

    private final long value;

    PpSlideShowState(long value) {
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
