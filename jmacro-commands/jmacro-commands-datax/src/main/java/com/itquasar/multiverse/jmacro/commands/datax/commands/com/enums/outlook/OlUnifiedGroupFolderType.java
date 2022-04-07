package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olunifiedgroupfoldertype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olunifiedgroupfoldertype</a>}
*/
public enum OlUnifiedGroupFolderType implements COMEnum {
    
    /**@ Assigns a calendar folder. */
    olGroupCalendarFolder(1),    
    /**@ Assigns a mail folder. */
    olGroupMailFolder(0);

    private final long value;

    OlUnifiedGroupFolderType(long value) {
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
