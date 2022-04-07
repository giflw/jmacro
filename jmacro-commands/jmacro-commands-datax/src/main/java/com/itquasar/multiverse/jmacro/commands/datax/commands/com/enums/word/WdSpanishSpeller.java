package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdspanishspeller">https://docs.microsoft.com/en-us/office/vba/api/word.wdspanishspeller</a>}
*/
public enum WdSpanishSpeller implements COMEnum {
    
    /**@ The Spanish spelling checker recognizes both tuteo and voseo verb forms. */
    wdSpanishTuteoAndVoseo(1),    
    /**@ The Spanish spelling checker recognizes only tuteo verb forms. */
    wdSpanishTuteoOnly(0),    
    /**@ The Spanish spelling checker recognizes only voseo verb forms. */
    wdSpanishVoseoOnly(2);

    private final long value;

    WdSpanishSpeller(long value) {
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
