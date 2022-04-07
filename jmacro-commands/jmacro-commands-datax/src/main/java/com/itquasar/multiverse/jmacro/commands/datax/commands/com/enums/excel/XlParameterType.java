package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlparametertype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlparametertype</a>}
*/
public enum XlParameterType implements COMEnum {
    
    /**@ Uses the value specified by the Value argument. */
    xlConstant(1),    
    /**@ Displays a dialog box that prompts the user for the value. The Value argument specifies the text shown in the dialog box. */
    xlPrompt(0),    
    /**@ Uses the value of the cell in the upper-left corner of the range. The Value argument specifies a Range object. */
    xlRange(2);

    private final long value;

    XlParameterType(long value) {
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
