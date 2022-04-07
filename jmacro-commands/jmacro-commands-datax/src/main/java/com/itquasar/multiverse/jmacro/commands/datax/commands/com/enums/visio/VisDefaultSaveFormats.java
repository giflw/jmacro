package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdefaultsaveformats">https://docs.microsoft.com/en-us/office/vba/api/visio.visdefaultsaveformats</a>}
*/
public enum VisDefaultSaveFormats implements COMEnum {
    
    /**@ File format for current version of Microsoft Visio. */
    visDefaultSaveCurrent(0),    
    /**@ Macro-enabled file format for current version of Visio. */
    visDefaultSaveCurrentMacroEnabled(3),    
    /**@ Binary format for previous version of Visio (11.0). */
    visDefaultSavePreviousBinary(1);

    private final long value;

    VisDefaultSaveFormats(long value) {
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
