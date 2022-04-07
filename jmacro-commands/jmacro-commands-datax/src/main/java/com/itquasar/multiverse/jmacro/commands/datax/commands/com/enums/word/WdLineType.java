package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlinetype">https://docs.microsoft.com/en-us/office/vba/api/word.wdlinetype</a>}
*/
public enum WdLineType implements COMEnum {
    
    /**@ A table row. */
    wdTableRow(1),    
    /**@ A line of text in the body of the document. */
    wdTextLine(0);

    private final long value;

    WdLineType(long value) {
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
