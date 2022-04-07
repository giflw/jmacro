package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcolortype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcolortype</a>}
*/
public enum PbColorType implements COMEnum {
    
    /**@ CMS */
    pbColorTypeCMS(4),    
    /**@ CMYK */
    pbColorTypeCMYK(3),    
    /**@ Ink */
    pbColorTypeInk(5),    
    /**@ Mixed */
    pbColorTypeMixed(-2),    
    /**@ RGB */
    pbColorTypeRGB(1),    
    /**@ Scheme */
    pbColorTypeScheme(2);

    private final long value;

    PbColorType(long value) {
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
