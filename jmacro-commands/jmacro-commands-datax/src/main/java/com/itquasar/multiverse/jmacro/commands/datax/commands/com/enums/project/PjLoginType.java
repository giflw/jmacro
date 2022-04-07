package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlogintype">https://docs.microsoft.com/en-us/office/vba/api/project.pjlogintype</a>}
*/
public enum PjLoginType implements COMEnum {
    
    /**@ Project Server. */
    pjProjectServerLogin(2),    
    /**@ Windows. */
    pjWindowsLogin(1);

    private final long value;

    PjLoginType(long value) {
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
