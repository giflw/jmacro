package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acfindmatch">https://docs.microsoft.com/en-us/office/vba/api/access.acfindmatch</a>}
*/
public enum AcFindMatch implements COMEnum {
    
    /**@ Search for data in any part of the field. */
    acAnywhere(0),    
    /**@ Search for data that fills the entire field. */
    acEntire(1),    
    /**@ Search for data located at the beginning of the field. */
    acStart(2);

    private final long value;

    AcFindMatch(long value) {
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
