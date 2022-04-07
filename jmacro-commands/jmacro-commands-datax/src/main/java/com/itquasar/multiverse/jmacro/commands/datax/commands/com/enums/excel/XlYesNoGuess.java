package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlyesnoguess">https://docs.microsoft.com/en-us/office/vba/api/excel.xlyesnoguess</a>}
*/
public enum XlYesNoGuess implements COMEnum {
    
    /**@ Excel determines whether there is a header, and where it is, if there is one. */
    xlGuess(0),    
    /**@ Default. The entire range should be sorted. */
    xlNo(2),    
    /**@ The entire range should not be sorted. */
    xlYes(1);

    private final long value;

    XlYesNoGuess(long value) {
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
