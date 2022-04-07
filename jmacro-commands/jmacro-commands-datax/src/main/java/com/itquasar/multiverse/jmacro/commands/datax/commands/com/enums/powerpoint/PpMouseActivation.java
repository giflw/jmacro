package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppmouseactivation">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppmouseactivation</a>}
*/
public enum PpMouseActivation implements COMEnum {
    
    /**@ Mouse click */
    ppMouseClick(1),    
    /**@ Mouse over */
    ppMouseOver(2);

    private final long value;

    PpMouseActivation(long value) {
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
