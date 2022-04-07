package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdgutterstyleold">https://docs.microsoft.com/en-us/office/vba/api/word.wdgutterstyleold</a>}
*/
public enum WdGutterStyleOld implements COMEnum {
    
    /**@ Bidirectional gutter should be used to conform to right-to-left text flow. */
    wdGutterStyleBidi(2),    
    /**@ Latin gutter should be used to conform to left-to-right text flow. */
    wdGutterStyleLatin(-10);

    private final long value;

    WdGutterStyleOld(long value) {
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
