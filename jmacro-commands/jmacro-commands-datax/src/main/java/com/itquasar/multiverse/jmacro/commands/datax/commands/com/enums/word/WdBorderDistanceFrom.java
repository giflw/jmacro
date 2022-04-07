package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdborderdistancefrom">https://docs.microsoft.com/en-us/office/vba/api/word.wdborderdistancefrom</a>}
*/
public enum WdBorderDistanceFrom implements COMEnum {
    
    /**@ From the edge of the page. */
    wdBorderDistanceFromPageEdge(1),    
    /**@ From the text it surrounds. */
    wdBorderDistanceFromText(0);

    private final long value;

    WdBorderDistanceFrom(long value) {
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
