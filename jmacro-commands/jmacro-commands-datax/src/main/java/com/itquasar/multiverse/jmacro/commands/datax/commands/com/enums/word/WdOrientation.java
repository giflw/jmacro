package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdorientation">https://docs.microsoft.com/en-us/office/vba/api/word.wdorientation</a>}
*/
public enum WdOrientation implements COMEnum {
    
    /**@ Landscape orientation. */
    wdOrientLandscape(1),    
    /**@ Portrait orientation. */
    wdOrientPortrait(0);

    private final long value;

    WdOrientation(long value) {
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
