package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbprintgraphics">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbprintgraphics</a>}
*/
public enum PbPrintGraphics implements COMEnum {
    
    /**@ Default. Print linked graphics using the full-resolution linked version. */
    pbPrintHighResolution(1),    
    /**@ Print linked graphics using the low-resolution placeholder version that is stored in the publication. */
    pbPrintLowResolution(2),    
    /**@ Print a box in place of linked graphics. */
    pbPrintNoGraphics(3);

    private final long value;

    PbPrintGraphics(long value) {
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
