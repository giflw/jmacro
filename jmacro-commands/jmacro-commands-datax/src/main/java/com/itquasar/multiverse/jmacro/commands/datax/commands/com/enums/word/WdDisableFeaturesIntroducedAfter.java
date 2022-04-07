package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddisablefeaturesintroducedafter">https://docs.microsoft.com/en-us/office/vba/api/word.wddisablefeaturesintroducedafter</a>}
*/
public enum WdDisableFeaturesIntroducedAfter implements COMEnum {
    
    /**@ Specifies Word for Windows 95, versions 7.0 and 7.0a. */
    wd70(0),    
    /**@ Specifies Word for Windows 95, versions 7.0 and 7.0a, Asian edition. */
    wd70FE(1),    
    /**@ Specifies Word 97 for Windows. Default. */
    wd80(2);

    private final long value;

    WdDisableFeaturesIntroducedAfter(long value) {
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
