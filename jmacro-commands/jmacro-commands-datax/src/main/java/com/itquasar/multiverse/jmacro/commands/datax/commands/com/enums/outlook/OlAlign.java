package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olalign">https://docs.microsoft.com/en-us/office/vba/api/outlook.olalign</a>}
*/
public enum OlAlign implements COMEnum {
    
    /**@ Indicates that the label for the specified column should be centered. */
    olAlignCenter(1),    
    /**@ Indicates that the label for the specified column should be left-aligned. */
    olAlignLeft(0),    
    /**@ Indicates that the label for the specified column should be right-aligned. */
    olAlignRight(2);

    private final long value;

    OlAlign(long value) {
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
