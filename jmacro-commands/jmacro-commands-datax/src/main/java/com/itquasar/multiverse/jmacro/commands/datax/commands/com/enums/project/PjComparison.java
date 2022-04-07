package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcomparison">https://docs.microsoft.com/en-us/office/vba/api/project.pjcomparison</a>}
*/
public enum PjComparison implements COMEnum {
    
    /**@ The custom field's value can be anything. */
    pjCompareAnyValue(11),    
    /**@ The custom field's value contains Value. */
    pjCompareContains(7),    
    /**@ The custom field's value contains exactly Value. */
    pjCompareContainsExactly(10),    
    /**@ The custom field's value is equal to Value. */
    pjCompareEquals(5),    
    /**@ The custom field's value is greater than Value. */
    pjCompareGreaterThan(1),    
    /**@ The custom field's value is greater than or equal to Value. */
    pjCompareGreaterThanOrEqual(3),    
    /**@ The custom field's value is less than Value. */
    pjCompareLessThan(2),    
    /**@ The custom field's value is less than or equal to Value. */
    pjCompareLessThanOrEqual(4),    
    /**@ The custom field's value does not contain Value. */
    pjCompareNotContains(9),    
    /**@ The custom field's value is not equal to Value. */
    pjCompareNotEqual(6),    
    /**@ The custom field's value is not within Value. */
    pjCompareNotWithin(8),    
    /**@ The custom field's value is within Value. */
    pjCompareWithin(0);

    private final long value;

    PjComparison(long value) {
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
