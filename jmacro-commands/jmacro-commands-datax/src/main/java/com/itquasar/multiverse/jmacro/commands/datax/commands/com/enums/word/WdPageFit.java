package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpagefit">https://docs.microsoft.com/en-us/office/vba/api/word.wdpagefit</a>}
*/
public enum WdPageFit implements COMEnum {
    
    /**@ Best fit the page to the active window. */
    wdPageFitBestFit(2),    
    /**@ View the full page. */
    wdPageFitFullPage(1),    
    /**@ Do not adjust the view settings for the page. */
    wdPageFitNone(0),    
    /**@ Best fit the text of the page to the active window. */
    wdPageFitTextFit(3);

    private final long value;

    WdPageFit(long value) {
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
