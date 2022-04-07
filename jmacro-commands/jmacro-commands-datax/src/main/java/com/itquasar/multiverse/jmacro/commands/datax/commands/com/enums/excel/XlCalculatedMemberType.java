package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalculatedmembertype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalculatedmembertype</a>}
*/
public enum XlCalculatedMemberType implements COMEnum {
    
    /**@ The member is a Multidimensional Expressions (MDX) expression that defines the measure. */
    xlCalculatedMeasure(2),    
    /**@ The member uses a Multidimensional Expression (MDX) formula. */
    xlCalculatedMember(0),    
    /**@ The member contains an MDX formula for a set in a cube field. */
    xlCalculatedSet(1);

    private final long value;

    XlCalculatedMemberType(long value) {
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
