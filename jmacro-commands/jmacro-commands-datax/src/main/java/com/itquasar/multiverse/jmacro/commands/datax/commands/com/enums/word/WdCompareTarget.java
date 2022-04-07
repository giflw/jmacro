package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcomparetarget">https://docs.microsoft.com/en-us/office/vba/api/word.wdcomparetarget</a>}
*/
public enum WdCompareTarget implements COMEnum {
    
    /**@ Places comparison differences in the current document. Default. */
    wdCompareTargetCurrent(1),    
    /**@ Places comparison differences in a new document. */
    wdCompareTargetNew(2),    
    /**@ Places comparison differences in the target document. */
    wdCompareTargetSelected(0);

    private final long value;

    WdCompareTarget(long value) {
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
