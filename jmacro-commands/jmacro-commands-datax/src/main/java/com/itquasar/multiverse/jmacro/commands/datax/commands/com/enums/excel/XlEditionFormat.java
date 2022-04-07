package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xleditionformat">https://docs.microsoft.com/en-us/office/vba/api/excel.xleditionformat</a>}
*/
public enum XlEditionFormat implements COMEnum {
    
    /**@ Binary Interchange file format. */
    xlBIFF(2),    
    /**@ Metafile picture structure (.wmf). */
    xlPICT(1),    
    /**@ Rich Text Format (.rtf). */
    xlRTF(4),    
    /**@ VALU. */
    xlVALU(8);

    private final long value;

    XlEditionFormat(long value) {
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
