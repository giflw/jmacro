package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olstorageidentifiertype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olstorageidentifiertype</a>}
*/
public enum OlStorageIdentifierType implements COMEnum {
    
    /**@ Identifies a StorageItem by EntryID. */
    olIdentifyByEntryID(1),    
    /**@ Identifies a StorageItem by message class. */
    olIdentifyByMessageClass(2),    
    /**@ Identifies a StorageItem by Subject. */
    olIdentifyBySubject(0);

    private final long value;

    OlStorageIdentifierType(long value) {
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
