package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergedefaultrecord">https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergedefaultrecord</a>}
*/
public enum WdMailMergeDefaultRecord implements COMEnum {
    
    /**@ Use the first record in the result set as the default record. */
    wdDefaultFirstRecord(1),    
    /**@ Use the last record in the result set as the default record. */
    wdDefaultLastRecord(-16);

    private final long value;

    WdMailMergeDefaultRecord(long value) {
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
