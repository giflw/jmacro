package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppadvancemode">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppadvancemode</a>}
*/
public enum PpAdvanceMode implements COMEnum {
    
    /**@ Mixed mode. */
    ppAdvanceModeMixed(-2),    
    /**@ Only when clicked. */
    ppAdvanceOnClick(1),    
    /**@ Automatically after a specified amount of time. */
    ppAdvanceOnTime(2);

    private final long value;

    PpAdvanceMode(long value) {
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
