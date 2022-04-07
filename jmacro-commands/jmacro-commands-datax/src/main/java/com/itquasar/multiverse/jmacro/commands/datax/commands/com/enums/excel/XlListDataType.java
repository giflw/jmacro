package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllistdatatype">https://docs.microsoft.com/en-us/office/vba/api/excel.xllistdatatype</a>}
*/
public enum XlListDataType implements COMEnum {
    
    /**@ Check box. */
    xlListDataTypeCheckbox(9),    
    /**@ Single-choice field. */
    xlListDataTypeChoice(6),    
    /**@ Multiple-choice field. */
    xlListDataTypeChoiceMulti(7),    
    /**@ Counter. */
    xlListDataTypeCounter(11),    
    /**@ Currency. */
    xlListDataTypeCurrency(4),    
    /**@ Date/time. */
    xlListDataTypeDateTime(5),    
    /**@ Hyperlink. */
    xlListDataTypeHyperLink(10),    
    /**@ Lookup list. */
    xlListDataTypeListLookup(8),    
    /**@ Rich text format with multiple lines. */
    xlListDataTypeMultiLineRichText(12),    
    /**@ Plain text with multiple lines. */
    xlListDataTypeMultiLineText(2),    
    /**@ Type not specified. */
    xlListDataTypeNone(0),    
    /**@ Numerical. */
    xlListDataTypeNumber(3),    
    /**@ Plain text. */
    xlListDataTypeText(1);

    private final long value;

    XlListDataType(long value) {
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
