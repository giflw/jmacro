package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdautomacros">https://docs.microsoft.com/en-us/office/vba/api/word.wdautomacros</a>}
*/
public enum WdAutoMacros implements COMEnum {
    
    /**@ AutoClose macro. */
    wdAutoClose(3),    
    /**@ AutoExec macro. */
    wdAutoExec(0),    
    /**@ AutoExit macro. */
    wdAutoExit(4),    
    /**@ AutoNew macro. */
    wdAutoNew(1),    
    /**@ AutoOpen macro. */
    wdAutoOpen(2),    
    /**@ AutoSync macro. */
    wdAutoSync(5);

    private final long value;

    WdAutoMacros(long value) {
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
