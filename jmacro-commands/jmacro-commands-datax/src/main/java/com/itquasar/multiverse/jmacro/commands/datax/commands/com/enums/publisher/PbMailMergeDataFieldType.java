package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbmailmergedatafieldtype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbmailmergedatafieldtype</a>}
*/
public enum PbMailMergeDataFieldType implements COMEnum {
    
    /**@ Contains a picture. */
    pbMailMergeDataFieldPicture(1),    
    /**@ Contains a string. */
    pbMailMergeDataFieldString(0);

    private final long value;

    PbMailMergeDataFieldType(long value) {
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
