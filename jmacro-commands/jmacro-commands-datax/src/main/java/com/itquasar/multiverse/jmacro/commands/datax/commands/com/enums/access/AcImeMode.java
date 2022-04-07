package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acimemode">https://docs.microsoft.com/en-us/office/vba/api/access.acimemode</a>}
*/
public enum AcImeMode implements COMEnum {
    
    /**@ Activates the IME in half-width Latin mode. */
    acImeModeAlpha(8),    
    /**@ Activates the IME in full-width Latin mode. */
    acImeModeAlphaFull(7),    
    /**@ Disables the IME. */
    acImeModeDisable(3),    
    /**@ Activates the IME in half-width Hangul mode. */
    acImeModeHangul(10),    
    /**@ Activates the IME in full-width Hangul mode. */
    acImeModeHangulFull(9),    
    /**@ Activates the IME in full-width hiragana mode. */
    acImeModeHiragana(4),    
    /**@ Activates the IME in full-width katakana mode. */
    acImeModeKatakana(5),    
    /**@ Activates the IME in half-width katakana mode. */
    acImeModeKatakanaHalf(6),    
    /**@ Does not change the IME mode. */
    acImeModeNoControl(0),    
    /**@ Disables the IME and activates Latin text entry. */
    acImeModeOff(2),    
    /**@ Activates the IME. */
    acImeModeOn(1);

    private final long value;

    AcImeMode(long value) {
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
