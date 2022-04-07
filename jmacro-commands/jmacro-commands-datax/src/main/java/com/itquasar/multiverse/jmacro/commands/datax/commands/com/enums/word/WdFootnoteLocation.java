package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdfootnotelocation">https://docs.microsoft.com/en-us/office/vba/api/word.wdfootnotelocation</a>}
*/
public enum WdFootnoteLocation implements COMEnum {
    
    /**@ Beneath current text. */
    wdBeneathText(1),    
    /**@ At bottom of current page. */
    wdBottomOfPage(0);

    private final long value;

    WdFootnoteLocation(long value) {
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
