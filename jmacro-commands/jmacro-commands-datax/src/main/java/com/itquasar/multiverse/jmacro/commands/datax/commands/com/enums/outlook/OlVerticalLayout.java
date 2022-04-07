package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olverticallayout">https://docs.microsoft.com/en-us/office/vba/api/outlook.olverticallayout</a>}
*/
public enum OlVerticalLayout implements COMEnum {
    
    /**@ Align controls vertically by the bottom edge of each control. */
    olVerticalLayoutAlignBottom(2),    
    /**@ Resize control vertically with the form. */
    olVerticalLayoutAlignGrow(3),    
    /**@ Align controls vertically by the center of each control. */
    olVerticalLayoutAlignMiddle(1),    
    /**@ Align controls vertically by the top edge of each control. */
    olVerticalLayoutAlignTop(0);

    private final long value;

    OlVerticalLayout(long value) {
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
