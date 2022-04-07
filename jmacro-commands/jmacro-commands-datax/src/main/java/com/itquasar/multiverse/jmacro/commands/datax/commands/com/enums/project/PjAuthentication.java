package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjauthentication">https://docs.microsoft.com/en-us/office/vba/api/project.pjauthentication</a>}
*/
public enum PjAuthentication implements COMEnum {
    
    /**@ Authenticated by user name. */
    pjUserName(0),    
    /**@ Authenticated by user Windows account. */
    pjWindowsUserAccount(1);

    private final long value;

    PjAuthentication(long value) {
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
