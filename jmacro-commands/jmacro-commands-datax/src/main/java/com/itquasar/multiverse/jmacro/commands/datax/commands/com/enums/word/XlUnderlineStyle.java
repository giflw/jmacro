package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlunderlinestyle">https://docs.microsoft.com/en-us/office/vba/api/word.xlunderlinestyle</a>}
*/
public enum XlUnderlineStyle implements COMEnum {
    
    /**@ Double thick underline. */
    xlUnderlineStyleDouble(-4119),    
    /**@ Two thin underlines placed close together. */
    xlUnderlineStyleDoubleAccounting(5),    
    /**@ No underline. */
    xlUnderlineStyleNone(-4142),    
    /**@ Single underline. */
    xlUnderlineStyleSingle(2),    
    /**@ Not supported. */
    xlUnderlineStyleSingleAccounting(4);

    private final long value;

    XlUnderlineStyle(long value) {
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
