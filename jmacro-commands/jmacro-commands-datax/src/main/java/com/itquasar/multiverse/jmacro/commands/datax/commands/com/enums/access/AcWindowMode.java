package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acwindowmode">https://docs.microsoft.com/en-us/office/vba/api/access.acwindowmode</a>}
*/
public enum AcWindowMode implements COMEnum {
    
    /**@ The form or report's Modal and PopUp properties are set to Yes. */
    acDialog(3),    
    /**@ The form or report is hidden. */
    acHidden(1),    
    /**@ The form or report opens minimized in the Windows taskbar. */
    acIcon(2),    
    /**@ (Default) The form or report opens in the mode set by its properties. */
    acWindowNormal(0);

    private final long value;

    AcWindowMode(long value) {
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
