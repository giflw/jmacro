package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmergetarget">https://docs.microsoft.com/en-us/office/vba/api/word.wdmergetarget</a>}
*/
public enum WdMergeTarget implements COMEnum {
    
    /**@ Merge into current document. */
    wdMergeTargetCurrent(1),    
    /**@ Merge into new document. */
    wdMergeTargetNew(2),    
    /**@ Merge into selected document. */
    wdMergeTargetSelected(0);

    private final long value;

    WdMergeTarget(long value) {
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
