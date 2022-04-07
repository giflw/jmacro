package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlarrangestyle">https://docs.microsoft.com/en-us/office/vba/api/excel.xlarrangestyle</a>}
*/
public enum XlArrangeStyle implements COMEnum {
    
    /**@ Windows are cascaded. */
    xlArrangeStyleCascade(7),    
    /**@ Windows are arranged horizontally. */
    xlArrangeStyleHorizontal(-4128),    
    /**@ Default. Windows are tiled. */
    xlArrangeStyleTiled(1),    
    /**@ Windows are arranged vertically. */
    xlArrangeStyleVertical(-4166);

    private final long value;

    XlArrangeStyle(long value) {
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
