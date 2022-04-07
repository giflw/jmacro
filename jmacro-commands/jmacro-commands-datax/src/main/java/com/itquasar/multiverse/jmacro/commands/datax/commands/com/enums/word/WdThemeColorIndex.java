package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdthemecolorindex">https://docs.microsoft.com/en-us/office/vba/api/word.wdthemecolorindex</a>}
*/
public enum WdThemeColorIndex implements COMEnum {
    
    /**@ No color. */
    wdNotThemeColor(-1),    
    /**@ Accent color 1. */
    wdThemeColorAccent1(4),    
    /**@ Accent color 2. */
    wdThemeColorAccent2(5),    
    /**@ Accent color 3. */
    wdThemeColorAccent3(6),    
    /**@ Accent color 4. */
    wdThemeColorAccent4(7),    
    /**@ Accent color 5. */
    wdThemeColorAccent5(8),    
    /**@ Accent color 6. */
    wdThemeColorAccent6(9),    
    /**@ Background color 1. */
    wdThemeColorBackground1(12),    
    /**@ Background color 2. */
    wdThemeColorBackground2(14),    
    /**@ Hyperlink color. */
    wdThemeColorHyperlink(10),    
    /**@ Followed hyperlink color. */
    wdThemeColorHyperlinkFollowed(11),    
    /**@ Dark main color 1. */
    wdThemeColorMainDark1(0),    
    /**@ Dark main color 2. */
    wdThemeColorMainDark2(2),    
    /**@ Light main color 1. */
    wdThemeColorMainLight1(1),    
    /**@ Light main color 2. */
    wdThemeColorMainLight2(3),    
    /**@ Text color 1. */
    wdThemeColorText1(13),    
    /**@ Text color 2. */
    wdThemeColorText2(15);

    private final long value;

    WdThemeColorIndex(long value) {
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
