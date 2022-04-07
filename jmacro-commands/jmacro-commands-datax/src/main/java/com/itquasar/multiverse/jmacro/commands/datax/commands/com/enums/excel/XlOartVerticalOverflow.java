package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xloartverticaloverflow">https://docs.microsoft.com/en-us/office/vba/api/excel.xloartverticaloverflow</a>}
*/
public enum XlOartVerticalOverflow implements COMEnum {
    
    /**@ Hide text that does not fit vertically within the text frame. */
    xlOartVerticalOverflowClip(1),    
    /**@ Hide text that does not fit vertically within the text frame, and add an ellipsis (...) at the end of the visible text. */
    xlOartVerticalOverflowEllipsis(2),    
    /**@ Allow text to overflow the text frame vertically (can be from the top, bottom, or both depending on the text alignment). */
    xlOartVerticalOverflowOverflow(0);

    private final long value;

    XlOartVerticalOverflow(long value) {
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
