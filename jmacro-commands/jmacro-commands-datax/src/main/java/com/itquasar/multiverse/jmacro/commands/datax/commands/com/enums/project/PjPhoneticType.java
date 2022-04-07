package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjphonetictype">https://docs.microsoft.com/en-us/office/vba/api/project.pjphonetictype</a>}
*/
public enum PjPhoneticType implements COMEnum {
    
    /**@ Hiragana characters. */
    pjHiragana(2),    
    /**@ Katakana characters. */
    pjKatakana(1),    
    /**@ Half-width Katakana characters. */
    pjKatakanaHalf(0);

    private final long value;

    PjPhoneticType(long value) {
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
