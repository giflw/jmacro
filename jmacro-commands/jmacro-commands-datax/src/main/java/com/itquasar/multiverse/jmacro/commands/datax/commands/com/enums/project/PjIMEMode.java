package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjimemode">https://docs.microsoft.com/en-us/office/vba/api/project.pjimemode</a>}
*/
public enum PjIMEMode implements COMEnum {
    
    /**@ Alpha mode. */
    pjIMEModeAlpha(8),    
    /**@ Full alpha mode. */
    pjIMEModeAlphaFull(7),    
    /**@ Mode disable. */
    pjIMEModeDisable(3),    
    /**@ Hangul mode. */
    pjIMEModeHangul(10),    
    /**@ Full Hangul mode. */
    pjIMEModeHangulFull(9),    
    /**@ Hiragana mode. */
    pjIMEModeHiragana(4),    
    /**@ Katakana mode. */
    pjIMEModeKatakana(5),    
    /**@ Half Katakana mode. */
    pjIMEModeKatakanaHalf(6),    
    /**@ No control mode. */
    pjIMEModeNoControl(0),    
    /**@ Mode off. */
    pjIMEModeOff(2),    
    /**@ Mode on. */
    pjIMEModeOn(1);

    private final long value;

    PjIMEMode(long value) {
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
