package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppcheckinversiontype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppcheckinversiontype</a>}
*/
public enum PpCheckInVersionType implements COMEnum {
    
    /**@ Major version */
    ppCheckInMajorVersion(1),    
    /**@ Minor version */
    ppCheckInMinorVersion(0),    
    /**@ Overwrite current version */
    ppCheckInOverwriteVersion(2);

    private final long value;

    PpCheckInVersionType(long value) {
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
