package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwindowstate">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwindowstate</a>}
*/
public enum PbWindowState implements COMEnum {
    
    /**@ Window is maximized. */
    pbWindowStateMaximize(0),    
    /**@ Window is minimized. */
    pbWindowStateMinimize(1),    
    /**@ Window is neither maximized nor minimized. */
    pbWindowStateNormal(2);

    private final long value;

    PbWindowState(long value) {
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
