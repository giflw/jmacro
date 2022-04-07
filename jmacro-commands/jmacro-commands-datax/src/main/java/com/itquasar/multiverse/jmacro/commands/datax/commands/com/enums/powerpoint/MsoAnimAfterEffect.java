package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimaftereffect">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimaftereffect</a>}
*/
public enum MsoAnimAfterEffect implements COMEnum {
    
    /**@ Dimmed */
    msoAnimAfterEffectDim(1),    
    /**@ Hidden */
    msoAnimAfterEffectHide(2),    
    /**@ Hidden on the next mouse click */
    msoAnimAfterEffectHideOnNextClick(3),    
    /**@ Mixed */
    msoAnimAfterEffectMixed(-1),    
    /**@ Unchanged */
    msoAnimAfterEffectNone(0);

    private final long value;

    MsoAnimAfterEffect(long value) {
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
