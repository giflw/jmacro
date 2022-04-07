package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdfieldshading">https://docs.microsoft.com/en-us/office/vba/api/word.wdfieldshading</a>}
*/
public enum WdFieldShading implements COMEnum {
    
    /**@ Always apply. */
    wdFieldShadingAlways(1),    
    /**@ Never apply. */
    wdFieldShadingNever(0),    
    /**@ Apply only when form field is selected. */
    wdFieldShadingWhenSelected(2);

    private final long value;

    WdFieldShading(long value) {
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
