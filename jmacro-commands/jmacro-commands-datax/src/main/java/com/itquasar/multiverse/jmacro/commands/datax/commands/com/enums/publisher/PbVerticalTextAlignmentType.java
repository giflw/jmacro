package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbverticaltextalignmenttype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbverticaltextalignmenttype</a>}
*/
public enum PbVerticalTextAlignmentType implements COMEnum {
    
    /**@ Text is aligned to the bottom. */
    pbVerticalTextAlignmentBottom(2),    
    /**@ Text is aligned to the center. */
    pbVerticalTextAlignmentCenter(1),    
    /**@ Text is aligned to the top. */
    pbVerticalTextAlignmentTop(0);

    private final long value;

    PbVerticalTextAlignmentType(long value) {
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
