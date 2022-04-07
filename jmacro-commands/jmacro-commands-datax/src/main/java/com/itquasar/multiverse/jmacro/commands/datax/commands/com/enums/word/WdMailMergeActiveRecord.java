package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergeactiverecord">https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergeactiverecord</a>}
*/
public enum WdMailMergeActiveRecord implements COMEnum {
    
    /**@ The first record in the data source. */
    wdFirstDataSourceRecord(-6),    
    /**@ The first record in the result set. */
    wdFirstRecord(-4),    
    /**@ The last record in the data source. */
    wdLastDataSourceRecord(-7),    
    /**@ The last record in the result set. */
    wdLastRecord(-5),    
    /**@ The next record in the data source. */
    wdNextDataSourceRecord(-8),    
    /**@ The next record in the result set. */
    wdNextRecord(-2),    
    /**@ No active record. */
    wdNoActiveRecord(-1),    
    /**@ The previous record in the data source. */
    wdPreviousDataSourceRecord(-9),    
    /**@ The previous record in the result set. */
    wdPreviousRecord(-3);

    private final long value;

    WdMailMergeActiveRecord(long value) {
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
