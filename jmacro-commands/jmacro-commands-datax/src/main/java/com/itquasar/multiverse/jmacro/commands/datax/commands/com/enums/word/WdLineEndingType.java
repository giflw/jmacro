package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlineendingtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdlineendingtype</a>}
*/
public enum WdLineEndingType implements COMEnum {
    
    /**@ Carriage return plus line feed. */
    wdCRLF(0),    
    /**@ Carriage return only. */
    wdCROnly(1),    
    /**@ Line feed plus carriage return. */
    wdLFCR(3),    
    /**@ Line feed only. */
    wdLFOnly(2),    
    /**@ Not supported. */
    wdLSPS(4);

    private final long value;

    WdLineEndingType(long value) {
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
