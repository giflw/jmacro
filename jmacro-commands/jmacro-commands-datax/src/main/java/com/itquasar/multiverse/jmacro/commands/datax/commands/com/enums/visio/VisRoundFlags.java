package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visroundflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visroundflags</a>}
*/
public enum VisRoundFlags implements COMEnum {
    
    /**@ Round the result. */
    visRound(1),    
    /**@ Truncate the result. */
    visTruncate(0);

    private final long value;

    VisRoundFlags(long value) {
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
