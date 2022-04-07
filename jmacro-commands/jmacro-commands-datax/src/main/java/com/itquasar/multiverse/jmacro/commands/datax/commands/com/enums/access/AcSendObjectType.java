package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acsendobjecttype">https://docs.microsoft.com/en-us/office/vba/api/access.acsendobjecttype</a>}
*/
public enum AcSendObjectType implements COMEnum {
    
    /**@ Send a Form. */
    acSendForm(2),    
    /**@ Send a Module. */
    acSendModule(5),    
    /**@ (Default) Don't send a database object. */
    acSendNoObject(-1),    
    /**@ Send a Query. */
    acSendQuery(1),    
    /**@ Send a Report. */
    acSendReport(3),    
    /**@ Send a Table. */
    acSendTable(0);

    private final long value;

    AcSendObjectType(long value) {
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
