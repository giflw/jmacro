package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olbackstyle">https://docs.microsoft.com/en-us/office/vba/api/outlook.olbackstyle</a>}
*/
public enum OlBackStyle implements COMEnum {
    
    /**@ Indicates the background color of the control is rendered. */
    olBackStyleOpaque(1),    
    /**@ Indicates that the background color of the control is the background color of the parent control. It's not a truly transparent display. */
    olBackStyleTransparent(0);

    private final long value;

    OlBackStyle(long value) {
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
