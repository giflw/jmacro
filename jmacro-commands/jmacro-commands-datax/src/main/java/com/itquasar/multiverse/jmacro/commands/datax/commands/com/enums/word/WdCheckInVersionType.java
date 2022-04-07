package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcheckinversiontype">https://docs.microsoft.com/en-us/office/vba/api/word.wdcheckinversiontype</a>}
*/
public enum WdCheckInVersionType implements COMEnum {
    
    /**@ Major version. */
    wdCheckInMajorVersion(1),    
    /**@ Minor version. */
    wdCheckInMinorVersion(0),    
    /**@ Overwrite current version on the server. */
    wdCheckInOverwriteVersion(2);

    private final long value;

    WdCheckInVersionType(long value) {
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
