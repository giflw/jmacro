package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlayoutmode">https://docs.microsoft.com/en-us/office/vba/api/word.wdlayoutmode</a>}
*/
public enum WdLayoutMode implements COMEnum {
    
    /**@ No grid is used to lay out text. */
    wdLayoutModeDefault(0),    
    /**@ Text is laid out on a grid; the user specifies the number of lines and the number of characters per line. As the user types, Microsoft Word automatically aligns characters with gridlines. */
    wdLayoutModeGenko(3),    
    /**@ Text is laid out on a grid; the user specifies the number of lines and the number of characters per line. As the user types, Microsoft Word doesn't automatically align characters with gridlines. */
    wdLayoutModeGrid(1),    
    /**@ Text is laid out on a grid; the user specifies the number of lines, but not the number of characters per line. */
    wdLayoutModeLineGrid(2);

    private final long value;

    WdLayoutMode(long value) {
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
