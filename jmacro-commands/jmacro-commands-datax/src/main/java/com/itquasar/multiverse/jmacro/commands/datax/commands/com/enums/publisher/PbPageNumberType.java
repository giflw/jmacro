package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpagenumbertype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpagenumbertype</a>}
*/
public enum PbPageNumberType implements COMEnum {
    
    /**@ Default. */
    pbPageNumberCurrent(1),    
    /**@ Inserts the page number of the next linked text box. */
    pbPageNumberNextInStory(2),    
    /**@ Inserts the page number of the previous linked text box. */
    pbPageNumberPreviousInStory(3);

    private final long value;

    PbPageNumberType(long value) {
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
