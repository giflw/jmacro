package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdbrowserlevel">https://docs.microsoft.com/en-us/office/vba/api/word.wdbrowserlevel</a>}
*/
public enum WdBrowserLevel implements COMEnum {
    
    /**@ Microsoft Internet Explorer 5. */
    wdBrowserLevelMicrosoftInternetExplorer5(1),    
    /**@ Microsoft Internet Explorer 6. */
    wdBrowserLevelMicrosoftInternetExplorer6(2),    
    /**@ Microsoft Internet Explorer 4. */
    wdBrowserLevelV4(0);

    private final long value;

    WdBrowserLevel(long value) {
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
