package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdenablecancelkey">https://docs.microsoft.com/en-us/office/vba/api/word.wdenablecancelkey</a>}
*/
public enum WdEnableCancelKey implements COMEnum {
    
    /**@ Prevents CTRL+BREAK from interrupting a macro. */
    wdCancelDisabled(0),    
    /**@ Allows a macro to be interrupted by CTRL+BREAK. */
    wdCancelInterrupt(1);

    private final long value;

    WdEnableCancelKey(long value) {
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
