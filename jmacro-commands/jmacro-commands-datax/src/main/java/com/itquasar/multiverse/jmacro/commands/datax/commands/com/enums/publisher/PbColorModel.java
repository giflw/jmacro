package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcolormodel">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcolormodel</a>}
*/
public enum PbColorModel implements COMEnum {
    
    /**@ CMYK */
    pbColorModelCMYK(2),    
    /**@ GreyScale */
    pbColorModelGreyScale(3),    
    /**@ RGB */
    pbColorModelRGB(1),    
    /**@ Unknown */
    pbColorModelUnknown(4);

    private final long value;

    PbColorModel(long value) {
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
