package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pblinkedfilestatus">https://docs.microsoft.com/en-us/office/vba/api/publisher.pblinkedfilestatus</a>}
*/
public enum PbLinkedFileStatus implements COMEnum {
    
    /**@ The file can no longer be found at the specified path. */
    pbLinkedFileMissing(2),    
    /**@ The linked file has been modified since it was linked to the picture. */
    pbLinkedFileModified(3),    
    /**@ The file resides at the specified path, and has not been modified since it was linked to the picture. */
    pbLinkedFileOK(1);

    private final long value;

    PbLinkedFileStatus(long value) {
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
