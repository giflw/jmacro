package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbfixedformattype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbfixedformattype</a>}
*/
public enum PbFixedFormatType implements COMEnum {
    
    /**@ PDF format */
    pbFixedFormatTypePDF(2),    
    /**@ XPS format */
    pbFixedFormatTypeXPS(1);

    private final long value;

    PbFixedFormatType(long value) {
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
