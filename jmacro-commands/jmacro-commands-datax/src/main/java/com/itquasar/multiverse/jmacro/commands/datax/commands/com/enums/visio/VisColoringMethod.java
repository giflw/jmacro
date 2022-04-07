package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscoloringmethod">https://docs.microsoft.com/en-us/office/vba/api/visio.viscoloringmethod</a>}
*/
public enum VisColoringMethod implements COMEnum {
    
    /**@ No description provided */
    visColorDiscrete(0),    
    /**@ No description provided */
    visColorInvalid(2),    
    /**@ No description provided */
    visColorRange(1);

    private final long value;

    VisColoringMethod(long value) {
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
