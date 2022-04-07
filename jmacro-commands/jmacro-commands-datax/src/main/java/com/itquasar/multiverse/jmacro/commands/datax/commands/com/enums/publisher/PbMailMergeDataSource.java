package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbmailmergedatasource">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbmailmergedatasource</a>}
*/
public enum PbMailMergeDataSource implements COMEnum {
    
    /**@ From ODSO */
    pbMergeInfoFromODSO(5),    
    /**@ Sub ODSO */
    pbMergeInfoSubODSO(6);

    private final long value;

    PbMailMergeDataSource(long value) {
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
