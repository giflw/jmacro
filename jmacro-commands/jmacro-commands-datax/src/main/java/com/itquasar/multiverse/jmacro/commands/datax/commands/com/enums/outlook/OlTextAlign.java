package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oltextalign">https://docs.microsoft.com/en-us/office/vba/api/outlook.oltextalign</a>}
*/
public enum OlTextAlign implements COMEnum {
    
    /**@ Text rendered in the control will be aligned to the center of the control. */
    olTextAlignCenter(2),    
    /**@ Text rendered in the control will be aligned to the left edge of the control. */
    olTextAlignLeft(1),    
    /**@ Text rendered in the control will be aligned to the right edge of the control. */
    olTextAlignRight(3);

    private final long value;

    OlTextAlign(long value) {
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
