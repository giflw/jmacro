package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimeffectafter">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimeffectafter</a>}
*/
public enum MsoAnimEffectAfter implements COMEnum {
    
    /**@ After freeze. */
    msoAnimEffectAfterFreeze(1),    
    /**@ After hold. */
    msoAnimEffectAfterHold(3),    
    /**@ After remove. */
    msoAnimEffectAfterRemove(2),    
    /**@ After transition. */
    msoAnimEffectAfterTransition(4);

    private final long value;

    MsoAnimEffectAfter(long value) {
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
