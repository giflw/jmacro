package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtrackingpresettype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtrackingpresettype</a>}
*/
public enum PbTrackingPresetType implements COMEnum {
    
    /**@ Custom */
    pbTrackingCustom(-1),    
    /**@ Loose */
    pbTrackingLoose(1),    
    /**@ Mixed */
    pbTrackingMixed(-2),    
    /**@ Normal */
    pbTrackingNormal(2),    
    /**@ Tight */
    pbTrackingTight(3),    
    /**@ Very Loose */
    pbTrackingVeryLoose(0),    
    /**@ Very Tight */
    pbTrackingVeryTight(4);

    private final long value;

    PbTrackingPresetType(long value) {
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
