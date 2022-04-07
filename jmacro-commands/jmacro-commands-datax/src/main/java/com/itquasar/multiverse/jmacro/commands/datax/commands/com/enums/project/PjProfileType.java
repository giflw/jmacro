package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjprofiletype">https://docs.microsoft.com/en-us/office/vba/api/project.pjprofiletype</a>}
*/
public enum PjProfileType implements COMEnum {
    
    /**@ Local profile. */
    pjLocalProfile(0),    
    /**@ Server profile. */
    pjServerProfile(1);

    private final long value;

    PjProfileType(long value) {
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
