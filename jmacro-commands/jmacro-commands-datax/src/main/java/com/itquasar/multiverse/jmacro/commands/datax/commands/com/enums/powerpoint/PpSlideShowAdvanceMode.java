package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslideshowadvancemode">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslideshowadvancemode</a>}
*/
public enum PpSlideShowAdvanceMode implements COMEnum {
    
    /**@ Manual Advance */
    ppSlideShowManualAdvance(1),    
    /**@ Rehearsed timings */
    ppSlideShowRehearseNewTimings(3),    
    /**@ Specified timings for each slide */
    ppSlideShowUseSlideTimings(2);

    private final long value;

    PpSlideShowAdvanceMode(long value) {
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
