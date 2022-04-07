package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergecomparison">https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergecomparison</a>}
*/
public enum WdMailMergeComparison implements COMEnum {
    
    /**@ A value is output if the mail merge field is equal to a value. */
    wdMergeIfEqual(0),    
    /**@ A value is output if the mail merge field is greater than a value. */
    wdMergeIfGreaterThan(3),    
    /**@ A value is output if the mail merge field is greater than or equal to a value. */
    wdMergeIfGreaterThanOrEqual(5),    
    /**@ A value is output if the mail merge field is blank. */
    wdMergeIfIsBlank(6),    
    /**@ A value is output if the mail merge field is not blank. */
    wdMergeIfIsNotBlank(7),    
    /**@ A value is output if the mail merge field is less than a value. */
    wdMergeIfLessThan(2),    
    /**@ A value is output if the mail merge field is less than or equal to a value. */
    wdMergeIfLessThanOrEqual(4),    
    /**@ A value is output if the mail merge field is not equal to a value. */
    wdMergeIfNotEqual(1);

    private final long value;

    WdMailMergeComparison(long value) {
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
