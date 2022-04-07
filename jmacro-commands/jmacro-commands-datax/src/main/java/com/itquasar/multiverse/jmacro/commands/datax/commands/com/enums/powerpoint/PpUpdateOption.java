package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppupdateoption">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppupdateoption</a>}
*/
public enum PpUpdateOption implements COMEnum {
    
    /**@ Link will be updated each time the presentation is opened or the source file changes. */
    ppUpdateOptionAutomatic(2),    
    /**@ Link will be updated only when the user specifically asks to update the presentation. */
    ppUpdateOptionManual(1),    
    /**@ Mixed */
    ppUpdateOptionMixed(-2);

    private final long value;

    PpUpdateOption(long value) {
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
