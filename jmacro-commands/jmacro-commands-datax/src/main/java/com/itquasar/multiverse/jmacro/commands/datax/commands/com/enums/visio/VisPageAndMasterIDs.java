package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vispageandmasterids">https://docs.microsoft.com/en-us/office/vba/api/visio.vispageandmasterids</a>}
*/
public enum VisPageAndMasterIDs implements COMEnum {
    
    /**@ An ID no master will ever have. */
    visInvalMasterID(-1),    
    /**@ An ID no master will ever have. */
    visInvalPageID(-1);

    private final long value;

    VisPageAndMasterIDs(long value) {
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
