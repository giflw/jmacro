package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcatalogmergefieldtype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcatalogmergefieldtype</a>}
*/
public enum PbCatalogMergeFieldType implements COMEnum {
    
    /**@ Text field */
    pbCatalogMergeFieldTypeText(0),    
    /**@ Picture field */
    pbCatalogMergeFieldTypePicture(1);

    private final long value;

    PbCatalogMergeFieldType(long value) {
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
