package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visvalidationflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visvalidationflags</a>}
*/
public enum VisValidationFlags implements COMEnum {
    
    /**@ Validate document, and if validation issues are found, open the Issues window. */
    visValidationDefault(0),    
    /**@ Validate document, but don't open the Issues window. */
    visValidationNoOpenWindow(1);

    private final long value;

    VisValidationFlags(long value) {
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
