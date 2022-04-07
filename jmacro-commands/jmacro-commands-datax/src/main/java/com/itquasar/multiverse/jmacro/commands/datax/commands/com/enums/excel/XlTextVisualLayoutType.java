package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltextvisuallayouttype">https://docs.microsoft.com/en-us/office/vba/api/excel.xltextvisuallayouttype</a>}
*/
public enum XlTextVisualLayoutType implements COMEnum {
    
    /**@ Left-to-right */
    xlTextVisualLTR(1),    
    /**@ Right-to-left */
    xlTextVisualRTL(2);

    private final long value;

    XlTextVisualLayoutType(long value) {
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
