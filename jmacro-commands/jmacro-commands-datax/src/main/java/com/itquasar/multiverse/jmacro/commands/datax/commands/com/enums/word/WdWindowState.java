package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdwindowstate">https://docs.microsoft.com/en-us/office/vba/api/word.wdwindowstate</a>}
*/
public enum WdWindowState implements COMEnum {
    
    /**@ Maximized. */
    wdWindowStateMaximize(1),    
    /**@ Minimized. */
    wdWindowStateMinimize(2),    
    /**@ Normal. */
    wdWindowStateNormal(0);

    private final long value;

    WdWindowState(long value) {
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
