package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visfontattributes">https://docs.microsoft.com/en-us/office/vba/api/visio.visfontattributes</a>}
*/
public enum VisFontAttributes implements COMEnum {
    
    /**@ Used instead of font 0 (the default font). The font 0 alias is used in some localized versions of Microsoft Visio and is controlled by means of entries in the registry. */
    visFont0Alias(128);

    private final long value;

    VisFontAttributes(long value) {
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
