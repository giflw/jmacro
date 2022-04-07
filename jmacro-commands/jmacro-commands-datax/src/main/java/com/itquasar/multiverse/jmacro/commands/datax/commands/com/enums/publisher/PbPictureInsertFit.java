package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpictureinsertfit">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpictureinsertfit</a>}
*/
public enum PbPictureInsertFit implements COMEnum {
    
    /**@ The inserted picture is fit to the frame. */
    pbFit(1),    
    /**@ The inserted picture fills the frame. */
    pbFill(2);

    private final long value;

    PbPictureInsertFit(long value) {
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
