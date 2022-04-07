package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlformulalabel">https://docs.microsoft.com/en-us/office/vba/api/excel.xlformulalabel</a>}
*/
public enum XlFormulaLabel implements COMEnum {
    
    /**@ Column labels only. */
    xlColumnLabels(2),    
    /**@ Row and column labels. */
    xlMixedLabels(3),    
    /**@ No labels. */
    xlNoLabels(-4142),    
    /**@ Row labels only. */
    xlRowLabels(1);

    private final long value;

    XlFormulaLabel(long value) {
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
