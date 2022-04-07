package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcontinue">https://docs.microsoft.com/en-us/office/vba/api/word.wdcontinue</a>}
*/
public enum WdContinue implements COMEnum {
    
    /**@ Formatting cannot continue from the previous list. */
    wdContinueDisabled(0),    
    /**@ Formatting can continue from the previous list. */
    wdContinueList(2),    
    /**@ Numbering can be restarted. */
    wdResetList(1);

    private final long value;

    WdContinue(long value) {
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
