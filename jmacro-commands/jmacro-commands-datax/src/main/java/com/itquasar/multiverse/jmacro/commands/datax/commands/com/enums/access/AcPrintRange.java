package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acprintrange">https://docs.microsoft.com/en-us/office/vba/api/access.acprintrange</a>}
*/
public enum AcPrintRange implements COMEnum {
    
    /**@ A specific range of pages will be printed. Use the PageFrom and PageTo arguments to specify the range of pages to print. */
    acPages(2),    
    /**@ Prints all of the object. */
    acPrintAll(0),    
    /**@ Prints the selected part of the object. */
    acSelection(1);

    private final long value;

    AcPrintRange(long value) {
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
