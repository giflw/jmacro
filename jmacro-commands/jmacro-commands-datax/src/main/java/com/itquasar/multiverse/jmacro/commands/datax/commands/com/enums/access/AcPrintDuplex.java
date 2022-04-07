package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acprintduplex">https://docs.microsoft.com/en-us/office/vba/api/access.acprintduplex</a>}
*/
public enum AcPrintDuplex implements COMEnum {
    
    /**@ Double-sided printing using a horizontal page turn. */
    acPRDPHorizontal(2),    
    /**@ Single-sided printing with the current orientation setting. */
    acPRDPSimplex(1),    
    /**@ Double-sided printing using a vertical page turn. */
    acPRDPVertical(3);

    private final long value;

    AcPrintDuplex(long value) {
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
