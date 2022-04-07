package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlenablecancelkey">https://docs.microsoft.com/en-us/office/vba/api/excel.xlenablecancelkey</a>}
*/
public enum XlEnableCancelKey implements COMEnum {
    
    /**@ Cancel key trapping is completely disabled. */
    xlDisabled(0),    
    /**@ The interrupt is sent to the running procedure as an error, trappable by an error handler set up with an On Error GoTo statement. The trappable error code is 18. */
    xlErrorHandler(2),    
    /**@ The current procedure is interrupted, and the user can debug or end the procedure. */
    xlInterrupt(1);

    private final long value;

    XlEnableCancelKey(long value) {
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
