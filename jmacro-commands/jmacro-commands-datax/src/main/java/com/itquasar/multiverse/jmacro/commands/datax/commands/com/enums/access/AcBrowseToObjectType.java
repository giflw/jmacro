package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acbrowsetoobjecttype">https://docs.microsoft.com/en-us/office/vba/api/access.acbrowsetoobjecttype</a>}
*/
public enum AcBrowseToObjectType implements COMEnum {
    
    /**@ Open a form. */
    acBrowseToForm(2),    
    /**@ Open a report. */
    acBrowseToReport(3);

    private final long value;

    AcBrowseToObjectType(long value) {
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
