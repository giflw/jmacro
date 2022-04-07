package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsortmethodold">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsortmethodold</a>}
*/
public enum XlSortMethodOld implements COMEnum {
    
    /**@ Sort by code page. */
    xlCodePage(2),    
    /**@ Sort phonetically. */
    xlSyllabary(1);

    private final long value;

    XlSortMethodOld(long value) {
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
