package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcollapsedirection">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcollapsedirection</a>}
*/
public enum PbCollapseDirection implements COMEnum {
    
    /**@ Collapse at the end. */
    pbCollapseEnd(2),    
    /**@ Collapse at the start. */
    pbCollapseStart(1);

    private final long value;

    PbCollapseDirection(long value) {
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
