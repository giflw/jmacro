package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdimemode">https://docs.microsoft.com/en-us/office/vba/api/word.wdimemode</a>}
*/
public enum WdIMEMode implements COMEnum {
    
    /**@ Activates the IME in half-width Latin mode. */
    wdIMEModeAlpha(8),    
    /**@ Activates the IME in full-width Latin mode. */
    wdIMEModeAlphaFull(7),    
    /**@ Activates the IME in half-width Hangul mode. */
    wdIMEModeHangul(10),    
    /**@ Activates the IME in full-width Hangul mode. */
    wdIMEModeHangulFull(9),    
    /**@ Activates the IME in full-width hiragana mode. */
    wdIMEModeHiragana(4),    
    /**@ Activates the IME in full-width katakana mode. */
    wdIMEModeKatakana(5),    
    /**@ Activates the IME in half-width katakana mode. */
    wdIMEModeKatakanaHalf(6),    
    /**@ Does not change the IME mode. */
    wdIMEModeNoControl(0),    
    /**@ Disables the IME and activates Latin text entry. */
    wdIMEModeOff(2),    
    /**@ Activates the IME. */
    wdIMEModeOn(1);

    private final long value;

    WdIMEMode(long value) {
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
