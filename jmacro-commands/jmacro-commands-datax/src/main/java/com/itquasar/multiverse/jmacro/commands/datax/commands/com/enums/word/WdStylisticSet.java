package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdstylisticset">https://docs.microsoft.com/en-us/office/vba/api/word.wdstylisticset</a>}
*/
public enum WdStylisticSet implements COMEnum {
    
    /**@ First stylistic set for the specified font. */
    wdStylisticSet01(1),    
    /**@ Second stylistic set for the specified font. */
    wdStylisticSet02(2),    
    /**@ Third stylistic set for the specified font. */
    wdStylisticSet03(4),    
    /**@ Fourth stylistic set for the specified font. */
    wdStylisticSet04(8),    
    /**@ Fifth stylistic set for the specified font. */
    wdStylisticSet05(16),    
    /**@ Sixth stylistic set for the specified font. */
    wdStylisticSet06(32),    
    /**@ Seventh stylistic set for the specified font. */
    wdStylisticSet07(64),    
    /**@ Eighth stylistic set for the specified font. */
    wdStylisticSet08(128),    
    /**@ Ninth stylistic set for the specified font. */
    wdStylisticSet09(256),    
    /**@ Tenth stylistic set for the specified font. */
    wdStylisticSet10(512),    
    /**@ Eleventh stylistic set for the specified font. */
    wdStylisticSet11(1024),    
    /**@ Twelfth stylistic set for the specified font. */
    wdStylisticSet12(2048),    
    /**@ Thirteenth stylistic set for the specified font. */
    wdStylisticSet13(4096),    
    /**@ Fourtheenth stylistic set for the specified font. */
    wdStylisticSet14(8192),    
    /**@ Fifthteenth stylistic set for the specified font. */
    wdStylisticSet15(16384),    
    /**@ Sixteenth stylistic set for the specified font. */
    wdStylisticSet16(32768),    
    /**@ Seventeenth stylistic set for the specified font. */
    wdStylisticSet17(65536),    
    /**@ Eighteenth stylistic set for the specified font. */
    wdStylisticSet18(131072),    
    /**@ Nineteenth stylistic set for the specified font. */
    wdStylisticSet19(262144),    
    /**@ Twentieth stylistic set for the specified font. */
    wdStylisticSet20(524288),    
    /**@ Default stylistic set for the specified font. */
    wdStylisticSetDefault(0);

    private final long value;

    WdStylisticSet(long value) {
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
