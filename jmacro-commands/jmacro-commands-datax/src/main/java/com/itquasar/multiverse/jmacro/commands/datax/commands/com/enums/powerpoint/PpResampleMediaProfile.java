package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppresamplemediaprofile">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppresamplemediaprofile</a>}
*/
public enum PpResampleMediaProfile implements COMEnum {
    
    /**@ Custom profile */
    ppResampleMediaProfileCustom(1),    
    /**@ Small profile */
    ppResampleMediaProfileSmall(2),    
    /**@ Smaller profile */
    ppResampleMediaProfileSmaller(3),    
    /**@ Smallest profile */
    ppResampleMediaProfileSmallest(4);

    private final long value;

    PpResampleMediaProfile(long value) {
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
