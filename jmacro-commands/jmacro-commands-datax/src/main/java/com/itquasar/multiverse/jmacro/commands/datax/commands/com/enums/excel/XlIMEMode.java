package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlimemode">https://docs.microsoft.com/en-us/office/vba/api/excel.xlimemode</a>}
*/
public enum XlIMEMode implements COMEnum {
    
    /**@ Half-width alphanumeric. */
    xlIMEModeAlpha(8),    
    /**@ Full-width alphanumeric. */
    xlIMEModeAlphaFull(7),    
    /**@ Disable. */
    xlIMEModeDisable(3),    
    /**@ Hangul. */
    xlIMEModeHangul(10),    
    /**@ Full-width Hangul. */
    xlIMEModeHangulFull(9),    
    /**@ Hiragana. */
    xlIMEModeHiragana(4),    
    /**@ Katakana. */
    xlIMEModeKatakana(5),    
    /**@ Half-width Katakana. */
    xlIMEModeKatakanaHalf(6),    
    /**@ No control. */
    xlIMEModeNoControl(0),    
    /**@ Off (English mode). */
    xlIMEModeOff(2),    
    /**@ Mode on. */
    xlIMEModeOn(1);

    private final long value;

    XlIMEMode(long value) {
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
