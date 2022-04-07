package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlrunautomacro">https://docs.microsoft.com/en-us/office/vba/api/excel.xlrunautomacro</a>}
*/
public enum XlRunAutoMacro implements COMEnum {
    
    /**@ Auto_Activate macros */
    xlAutoActivate(3),    
    /**@ Auto_Close macros */
    xlAutoClose(2),    
    /**@ Auto_Deactivate macros */
    xlAutoDeactivate(4),    
    /**@ Auto_Open macros */
    xlAutoOpen(1);

    private final long value;

    XlRunAutoMacro(long value) {
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
