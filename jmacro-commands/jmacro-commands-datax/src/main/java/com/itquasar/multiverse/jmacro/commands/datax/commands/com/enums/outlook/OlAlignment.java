package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olalignment">https://docs.microsoft.com/en-us/office/vba/api/outlook.olalignment</a>}
*/
public enum OlAlignment implements COMEnum {
    
    /**@ Places the caption to the left of the control. */
    olAlignmentLeft(0),    
    /**@ Places the caption to the right of the control. */
    olAlignmentRight(1);

    private final long value;

    OlAlignment(long value) {
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
