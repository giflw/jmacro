package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olborderstyle">https://docs.microsoft.com/en-us/office/vba/api/outlook.olborderstyle</a>}
*/
public enum OlBorderStyle implements COMEnum {
    
    /**@ The control is rendered without any border. */
    olBorderStyleNone(0),    
    /**@ The control is rendered with a single-line border. */
    olBorderStyleSingle(1);

    private final long value;

    OlBorderStyle(long value) {
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
