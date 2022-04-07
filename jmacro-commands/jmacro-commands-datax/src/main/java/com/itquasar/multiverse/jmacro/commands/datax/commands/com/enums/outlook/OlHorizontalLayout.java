package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olhorizontallayout">https://docs.microsoft.com/en-us/office/vba/api/outlook.olhorizontallayout</a>}
*/
public enum OlHorizontalLayout implements COMEnum {
    
    /**@ Align controls horizontally by the center of each control. */
    olHorizontalLayoutAlignCenter(1),    
    /**@ Resize control horizontally with the form. */
    olHorizontalLayoutGrow(3),    
    /**@ Align controls horizontally by the left edge of each control. */
    olHorizontalLayoutAlignLeft(0),    
    /**@ Align controls horizontally by the right edge of each control. */
    olHorizontalLayoutAlignRight(2);

    private final long value;

    OlHorizontalLayout(long value) {
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
