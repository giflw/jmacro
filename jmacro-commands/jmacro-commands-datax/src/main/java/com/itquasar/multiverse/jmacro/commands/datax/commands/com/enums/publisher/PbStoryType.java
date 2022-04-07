package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbstorytype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbstorytype</a>}
*/
public enum PbStoryType implements COMEnum {
    
    /**@ Story continued from which text frame. */
    pbStoryContinuedFrom(2),    
    /**@ Story continued on to which text frame. */
    pbStoryContinuedOn(3),    
    /**@ Story table. */
    pbStoryTable(0),    
    /**@ Story text frame. */
    pbStoryTextFrame(1);

    private final long value;

    PbStoryType(long value) {
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
