package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdautofitbehavior">https://docs.microsoft.com/en-us/office/vba/api/word.wdautofitbehavior</a>}
*/
public enum WdAutoFitBehavior implements COMEnum {
    
    /**@ The table is automatically sized to fit the content contained in the table. */
    wdAutoFitContent(1),    
    /**@ The table is set to a fixed size, regardless of the content, and is not automatically sized. */
    wdAutoFitFixed(0),    
    /**@ The table is automatically sized to the width of the active window. */
    wdAutoFitWindow(2);

    private final long value;

    WdAutoFitBehavior(long value) {
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
