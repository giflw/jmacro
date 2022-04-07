package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdfontbias">https://docs.microsoft.com/en-us/office/vba/api/word.wdfontbias</a>}
*/
public enum WdFontBias implements COMEnum {
    
    /**@ Default font bias. */
    wdFontBiasDefault(0),    
    /**@ No font bias specified. */
    wdFontBiasDontCare(255),    
    /**@ Font bias for Asian languages. */
    wdFontBiasFareast(1);

    private final long value;

    WdFontBias(long value) {
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
