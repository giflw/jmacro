package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visuibarrow">https://docs.microsoft.com/en-us/office/vba/api/visio.visuibarrow</a>}
*/
public enum VisUIBarRow implements COMEnum {
    
    /**@ First row. */
    visBarRowFirst(0),    
    /**@ Last row. */
    visBarRowLast(-1);

    private final long value;

    VisUIBarRow(long value) {
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
