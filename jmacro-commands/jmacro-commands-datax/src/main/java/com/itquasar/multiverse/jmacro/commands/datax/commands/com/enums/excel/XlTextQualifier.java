package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltextqualifier">https://docs.microsoft.com/en-us/office/vba/api/excel.xltextqualifier</a>}
*/
public enum XlTextQualifier implements COMEnum {
    
    /**@ Double quotation mark ("). */
    xlTextQualifierDoubleQuote(1),    
    /**@ No delimiter. */
    xlTextQualifierNone(-4142),    
    /**@ Single quotation mark ('). */
    xlTextQualifierSingleQuote(2);

    private final long value;

    XlTextQualifier(long value) {
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
