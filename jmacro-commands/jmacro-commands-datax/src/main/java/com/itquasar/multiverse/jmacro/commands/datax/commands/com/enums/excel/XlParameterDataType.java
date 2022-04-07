package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlparameterdatatype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlparameterdatatype</a>}
*/
public enum XlParameterDataType implements COMEnum {
    
    /**@ Big integer. */
    xlParamTypeBigInt(-5),    
    /**@ Binary. */
    xlParamTypeBinary(-2),    
    /**@ Bit. */
    xlParamTypeBit(-7),    
    /**@ String. */
    xlParamTypeChar(1),    
    /**@ Date. */
    xlParamTypeDate(9),    
    /**@ Decimal. */
    xlParamTypeDecimal(3),    
    /**@ Double. */
    xlParamTypeDouble(8),    
    /**@ Float. */
    xlParamTypeFloat(6),    
    /**@ Integer. */
    xlParamTypeInteger(4),    
    /**@ Long binary. */
    xlParamTypeLongVarBinary(-4),    
    /**@ Long string. */
    xlParamTypeLongVarChar(-1),    
    /**@ Numeric. */
    xlParamTypeNumeric(2),    
    /**@ Real. */
    xlParamTypeReal(7),    
    /**@ Small integer. */
    xlParamTypeSmallInt(5),    
    /**@ Time. */
    xlParamTypeTime(10),    
    /**@ Time stamp. */
    xlParamTypeTimestamp(11),    
    /**@ Tiny integer. */
    xlParamTypeTinyInt(-6),    
    /**@ Type unknown. */
    xlParamTypeUnknown(0),    
    /**@ Variable-length binary. */
    xlParamTypeVarBinary(-3),    
    /**@ Variable-length string. */
    xlParamTypeVarChar(12),    
    /**@ Unicode character string. */
    xlParamTypeWChar(-8);

    private final long value;

    XlParameterDataType(long value) {
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
