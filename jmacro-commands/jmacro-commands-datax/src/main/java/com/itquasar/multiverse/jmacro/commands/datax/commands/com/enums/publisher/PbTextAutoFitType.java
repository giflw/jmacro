package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtextautofittype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtextautofittype</a>}
*/
public enum PbTextAutoFitType implements COMEnum {
    
    /**@ Text frame size adjusts to fit text. */
    pbTextAutoFitBestFit(2),    
    /**@ Allows text to overflow the text frame. */
    pbTextAutoFitNone(0),    
    /**@ Text font reduces so text fits within the text frame. */
    pbTextAutoFitShrinkOnOverflow(1);

    private final long value;

    PbTextAutoFitType(long value) {
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
