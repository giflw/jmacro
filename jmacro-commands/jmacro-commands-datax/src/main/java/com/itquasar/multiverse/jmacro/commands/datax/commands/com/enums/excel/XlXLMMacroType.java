package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlxlmmacrotype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlxlmmacrotype</a>}
*/
public enum XlXLMMacroType implements COMEnum {
    
    /**@ Custom command. */
    xlCommand(2),    
    /**@ Custom function. */
    xlFunction(1),    
    /**@ Not a macro. */
    xlNotXLM(3);

    private final long value;

    XlXLMMacroType(long value) {
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
