package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acprintitemlayout">https://docs.microsoft.com/en-us/office/vba/api/access.acprintitemlayout</a>}
*/
public enum AcPrintItemLayout implements COMEnum {
    
    /**@ Columns are laid across, then down. */
    acPRHorizontalColumnLayout(1953),    
    /**@ Columns are laid down, then across. */
    acPRVerticalColumnLayout(1954);

    private final long value;

    AcPrintItemLayout(long value) {
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
