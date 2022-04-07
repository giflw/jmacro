package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppaftereffect">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppaftereffect</a>}
*/
public enum PpAfterEffect implements COMEnum {
    
    /**@ Appears dimmed */
    ppAfterEffectDim(2),    
    /**@ Hides */
    ppAfterEffectHide(1),    
    /**@ Hidden when clicked */
    ppAfterEffectHideOnClick(3),    
    /**@ Mixed effect */
    ppAfterEffectMixed(-2),    
    /**@ No effect */
    ppAfterEffectNothing(0);

    private final long value;

    PpAfterEffect(long value) {
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
