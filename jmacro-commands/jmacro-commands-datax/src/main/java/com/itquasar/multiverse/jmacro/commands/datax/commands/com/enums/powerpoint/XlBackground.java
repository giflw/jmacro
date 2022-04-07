package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlbackground">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlbackground</a>}
*/
public enum XlBackground implements COMEnum {
    
    /**@ Word controls the background. */
    xlBackgroundAutomatic(-4105),    
    /**@ An opaque background. */
    xlBackgroundOpaque(3),    
    /**@ A transparent background. */
    xlBackgroundTransparent(2);

    private final long value;

    XlBackground(long value) {
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
