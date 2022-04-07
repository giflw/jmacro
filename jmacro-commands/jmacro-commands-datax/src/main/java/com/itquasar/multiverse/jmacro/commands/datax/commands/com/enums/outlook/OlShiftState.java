package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olshiftstate">https://docs.microsoft.com/en-us/office/vba/api/outlook.olshiftstate</a>}
*/
public enum OlShiftState implements COMEnum {
    
    /**@ Indicates that the Shift key is pressed during the event. */
    olShiftStateShiftMask(1),    
    /**@ Indicates that the Ctrl key is pressed during the event. */
    olShiftStateCtrlMask(2),    
    /**@ Indicates that the Alt key is pressed during the event. */
    olShiftStateAltMask(4);

    private final long value;

    OlShiftState(long value) {
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
