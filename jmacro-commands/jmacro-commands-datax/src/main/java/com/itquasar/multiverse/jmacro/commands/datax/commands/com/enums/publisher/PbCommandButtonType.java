package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcommandbuttontype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcommandbuttontype</a>}
*/
public enum PbCommandButtonType implements COMEnum {
    
    /**@ Reset or clear the form. */
    pbCommandButtonReset(2),    
    /**@ Submit the form. */
    pbCommandButtonSubmit(1);

    private final long value;

    PbCommandButtonType(long value) {
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
