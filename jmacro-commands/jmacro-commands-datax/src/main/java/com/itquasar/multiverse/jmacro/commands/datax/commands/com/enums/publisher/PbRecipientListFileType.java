package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbrecipientlistfiletype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbrecipientlistfiletype</a>}
*/
public enum PbRecipientListFileType implements COMEnum {
    
    /**@ Save as comma-delimited CSV file. */
    pbAsCsvFile(1),    
    /**@ Save as Microsoft Office Access MDB file. */
    pbAsMdbFile(0);

    private final long value;

    PbRecipientListFileType(long value) {
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
