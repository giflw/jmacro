package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olstoretype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olstoretype</a>}
*/
public enum OlStoreType implements COMEnum {
    
    /**@ ANSI format personal folders file (.pst) compatible with all previous versions of Microsoft Outlook format. */
    olStoreANSI(3),    
    /**@ Default format compatible with the mailbox mode in which Outlook runs on the Microsoft Exchange Server. */
    olStoreDefault(1),    
    /**@ Unicode format personal folders file (.pst) compatible with Microsoft Office Outlook 2003 and later. */
    olStoreUnicode(2);

    private final long value;

    OlStoreType(long value) {
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
