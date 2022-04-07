package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldvtype">https://docs.microsoft.com/en-us/office/vba/api/excel.xldvtype</a>}
*/
public enum XlDVType implements COMEnum {
    
    /**@ Data is validated using an arbitrary formula. */
    xlValidateCustom(7),    
    /**@ Date values. */
    xlValidateDate(4),    
    /**@ Numeric values. */
    xlValidateDecimal(2),    
    /**@ Validate only when user changes the value. */
    xlValidateInputOnly(0),    
    /**@ Value must be present in a specified list. */
    xlValidateList(3),    
    /**@ Length of text. */
    xlValidateTextLength(6),    
    /**@ Time values. */
    xlValidateTime(5),    
    /**@ Whole numeric values. */
    xlValidateWholeNumber(1);

    private final long value;

    XlDVType(long value) {
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
