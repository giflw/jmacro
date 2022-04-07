package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbphoneticguidealignmenttype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbphoneticguidealignmenttype</a>}
*/
public enum PbPhoneticGuideAlignmentType implements COMEnum {
    
    /**@ Center aligned */
    pbPhoneticGuideAlignmentCenter(3),    
    /**@ Default alignment */
    pbPhoneticGuideAlignmentDefault(0),    
    /**@ Left alignment */
    pbPhoneticGuideAlignmentLeft(4),    
    /**@ One Two One alignment */
    pbPhoneticGuideAlignmentOneTwoOne(2),    
    /**@ Right alignment */
    pbPhoneticGuideAlignmentRight(5),    
    /**@ Zero One Zero alignment */
    pbPhoneticGuideAlignmentZeroOneZero(1);

    private final long value;

    PbPhoneticGuideAlignmentType(long value) {
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
