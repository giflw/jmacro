package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdenclosestyle">https://docs.microsoft.com/en-us/office/vba/api/word.wdenclosestyle</a>}
*/
public enum WdEncloseStyle implements COMEnum {
    
    /**@ The enclosure is larger. */
    wdEncloseStyleLarge(2),    
    /**@ The enclosure assumes the default size. */
    wdEncloseStyleNone(0),    
    /**@ The enclosure is smaller. */
    wdEncloseStyleSmall(1);

    private final long value;

    WdEncloseStyle(long value) {
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
