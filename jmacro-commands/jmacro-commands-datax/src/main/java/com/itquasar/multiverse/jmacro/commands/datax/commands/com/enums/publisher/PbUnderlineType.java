package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbunderlinetype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbunderlinetype</a>}
*/
public enum PbUnderlineType implements COMEnum {
    
    /**@ Dash */
    pbUnderlineDash(6),    
    /**@ Dash Heavy */
    pbUnderlineDashHeavy(12),    
    /**@ Dash Long */
    pbUnderlineDashLong(15),    
    /**@ Dash Long Heavy */
    pbUnderlineDashLongHeavy(16),    
    /**@ Dot Dash */
    pbUnderlineDotDash(7),    
    /**@ Dot Dash Heavy */
    pbUnderlineDotDashHeavy(13),    
    /**@ Dot Dot Dash */
    pbUnderlineDotDotDash(8),    
    /**@ Dot Dot Dash Heavy */
    pbUnderlineDotDotDashHeavy(14),    
    /**@ Dot Heavy */
    pbUnderlineDotHeavy(11),    
    /**@ Dotted */
    pbUnderlineDotted(4),    
    /**@ Double */
    pbUnderlineDouble(3),    
    /**@ Mixed */
    pbUnderlineMixed(-1),    
    /**@ None */
    pbUnderlineNone(0),    
    /**@ Single */
    pbUnderlineSingle(1),    
    /**@ Thick */
    pbUnderlineThick(5),    
    /**@ Wavy */
    pbUnderlineWavy(9),    
    /**@ Wavy Double */
    pbUnderlineWavyDouble(17),    
    /**@ Wavy Heavy */
    pbUnderlineWavyHeavy(10),    
    /**@ Words Only */
    pbUnderlineWordsOnly(2);

    private final long value;

    PbUnderlineType(long value) {
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
