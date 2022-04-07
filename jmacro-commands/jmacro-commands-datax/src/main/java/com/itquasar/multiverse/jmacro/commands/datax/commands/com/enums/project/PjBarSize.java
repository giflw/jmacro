package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjbarsize">https://docs.microsoft.com/en-us/office/vba/api/project.pjbarsize</a>}
*/
public enum PjBarSize implements COMEnum {
    
    /**@ Bar size 10 points. */
    pjBarSize10(10),    
    /**@ Bar size 12 points. */
    pjBarSize12(12),    
    /**@ Bar size 14 points. */
    pjBarSize14(14),    
    /**@ Bar size 18 points. */
    pjBarSize18(18),    
    /**@ Bar size 24 points. */
    pjBarSize24(24),    
    /**@ Bar size 6 points. */
    pjBarSize6(6),    
    /**@ Bar size 8 points. */
    pjBarSize8(8);

    private final long value;

    PjBarSize(long value) {
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
