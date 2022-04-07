package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xloletype">https://docs.microsoft.com/en-us/office/vba/api/excel.xloletype</a>}
*/
public enum XlOLEType implements COMEnum {
    
    /**@ ActiveX control */
    xlOLEControl(2),    
    /**@ Embedded OLE object */
    xlOLEEmbed(1),    
    /**@ Linked OLE object */
    xlOLELink(0);

    private final long value;

    XlOLEType(long value) {
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
