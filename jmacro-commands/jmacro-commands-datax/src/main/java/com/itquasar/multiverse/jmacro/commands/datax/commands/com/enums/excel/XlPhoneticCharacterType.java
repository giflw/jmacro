package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlphoneticcharactertype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlphoneticcharactertype</a>}
*/
public enum XlPhoneticCharacterType implements COMEnum {
    
    /**@ Hiragana */
    xlHiragana(2),    
    /**@ Katakana */
    xlKatakana(1),    
    /**@ Half-size Katakana */
    xlKatakanaHalf(0),    
    /**@ No conversion */
    xlNoConversion(3);

    private final long value;

    XlPhoneticCharacterType(long value) {
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
