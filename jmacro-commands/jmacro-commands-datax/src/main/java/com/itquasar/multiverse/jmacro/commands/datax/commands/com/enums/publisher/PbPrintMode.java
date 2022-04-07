package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbprintmode">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbprintmode</a>}
*/
public enum PbPrintMode implements COMEnum {
    
    /**@ Print a composite whose colors are defined by the CMYK color model. */
    pbPrintModeCompositeCMYK(3),    
    /**@ Print a composite whose colors are defined as shades of gray. */
    pbPrintModeCompositeGrayscale(4),    
    /**@ Print a composite whose colors are defined by the RGB color model. */
    pbPrintModeCompositeRGB(1),    
    /**@ Print a separate plate for each ink used in the publication. */
    pbPrintModeSeparations(2);

    private final long value;

    PbPrintMode(long value) {
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
