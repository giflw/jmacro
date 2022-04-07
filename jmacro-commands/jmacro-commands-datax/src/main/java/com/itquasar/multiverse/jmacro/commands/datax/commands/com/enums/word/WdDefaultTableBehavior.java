package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddefaulttablebehavior">https://docs.microsoft.com/en-us/office/vba/api/word.wddefaulttablebehavior</a>}
*/
public enum WdDefaultTableBehavior implements COMEnum {
    
    /**@ Disables AutoFit. Default. */
    wdWord8TableBehavior(0),    
    /**@ Enables AutoFit. */
    wdWord9TableBehavior(1);

    private final long value;

    WdDefaultTableBehavior(long value) {
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
