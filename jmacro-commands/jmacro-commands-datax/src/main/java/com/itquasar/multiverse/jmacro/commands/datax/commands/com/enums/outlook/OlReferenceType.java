package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olreferencetype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olreferencetype</a>}
*/
public enum OlReferenceType implements COMEnum {
    
    /**@ Strong reference */
    olStrong(1),    
    /**@ Weak reference */
    olWeak(0);

    private final long value;

    OlReferenceType(long value) {
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
