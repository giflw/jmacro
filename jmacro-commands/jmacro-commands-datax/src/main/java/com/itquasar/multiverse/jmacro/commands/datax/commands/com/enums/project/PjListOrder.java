package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlistorder">https://docs.microsoft.com/en-us/office/vba/api/project.pjlistorder</a>}
*/
public enum PjListOrder implements COMEnum {
    
    /**@ Ascending. */
    pjListOrderAscending(1),    
    /**@ Default. */
    pjListOrderDefault(0),    
    /**@ Descending. */
    pjListOrderDescending(2);

    private final long value;

    PjListOrder(long value) {
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
