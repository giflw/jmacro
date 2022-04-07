package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acprojecttype">https://docs.microsoft.com/en-us/office/vba/api/access.acprojecttype</a>}
*/
public enum AcProjectType implements COMEnum {
    
    /**@ The current project is a Microsoft Access project. */
    acADP(1),    
    /**@ The current project is a Microsoft Access database. */
    acMDB(2),    
    /**@ No description provided */
    acNull(0);

    private final long value;

    AcProjectType(long value) {
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
