package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdomathvertaligntype">https://docs.microsoft.com/en-us/office/vba/api/word.wdomathvertaligntype</a>}
*/
public enum WdOMathVertAlignType implements COMEnum {
    
    /**@ Aligns the equation on the bottom of the shape canvas or line. */
    wdOMathVertAlignBottom(2),    
    /**@ Vertically centers the equation in the shape canvas or line. */
    wdOMathVertAlignCenter(0),    
    /**@ Aligns the equation on the top of the shape canvas or line. */
    wdOMathVertAlignTop(1);

    private final long value;

    WdOMathVertAlignType(long value) {
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
