package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acmoduletype">https://docs.microsoft.com/en-us/office/vba/api/access.acmoduletype</a>}
*/
public enum AcModuleType implements COMEnum {
    
    /**@ The specified module is a class module. */
    acClassModule(1),    
    /**@ The specified module is a standard module. */
    acStandardModule(0);

    private final long value;

    AcModuleType(long value) {
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
