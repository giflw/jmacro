package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtabalignmenttype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtabalignmenttype</a>}
*/
public enum PbTabAlignmentType implements COMEnum {
    
    /**@ Central tab alignment */
    pbTabAlignmentCenter(1),    
    /**@ Decimal tab alignment */
    pbTabAlignmentDecimal(3),    
    /**@ Leading tab alignment */
    pbTabAlignmentLeading(0),    
    /**@ Trailing tab alignment */
    pbTabAlignmentTrailing(2);

    private final long value;

    PbTabAlignmentType(long value) {
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
