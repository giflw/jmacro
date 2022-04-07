package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdarrangestyle">https://docs.microsoft.com/en-us/office/vba/api/word.wdarrangestyle</a>}
*/
public enum WdArrangeStyle implements COMEnum {
    
    /**@ Windows are displayed as icons in a single window. */
    wdIcons(1),    
    /**@ Windows are tiled into a single window. */
    wdTiled(0);

    private final long value;

    WdArrangeStyle(long value) {
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
