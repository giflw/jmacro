package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcredentialsmethod">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcredentialsmethod</a>}
*/
public enum XlCredentialsMethod implements COMEnum {
    
    /**@ Integrated */
    CredentialsMethodIntegrated(0),    
    /**@ No credentials used */
    CredentialsMethodNone(1),    
    /**@ Use stored credentials */
    CredentialsMethodStored(2);

    private final long value;

    XlCredentialsMethod(long value) {
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
