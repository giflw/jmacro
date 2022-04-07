package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pprevisioninfo">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pprevisioninfo</a>}
*/
public enum PpRevisionInfo implements COMEnum {
    
    /**@ Information baseline. */
    ppRevisionInfoBaseline(1),    
    /**@ Information merged. */
    ppRevisionInfoMerged(2),    
    /**@ No information. */
    ppRevisionInfoNone(0);

    private final long value;

    PpRevisionInfo(long value) {
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
