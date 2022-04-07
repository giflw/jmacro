package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcompatibilitymode">https://docs.microsoft.com/en-us/office/vba/api/word.wdcompatibilitymode</a>}
*/
public enum WdCompatibilityMode implements COMEnum {
    
    /**@ Compatibility mode equivalent to the latest version of Word. */
    wdCurrent(65535),    
    /**@ Word is put into a mode that is most compatible with Word 2003. Features new to Word are disabled in this mode. */
    wdWord2003(11),    
    /**@ Word is put into a mode that is most compatible with Word 2007. Features new to Word are disabled in this mode. */
    wdWord2007(12),    
    /**@ Word is put into a mode that is most compatible with Word 2010. Features new to Word are disabled in this mode. */
    wdWord2010(14),    
    /**@ Default. All Word features are enabled. */
    wdWord2013(15);

    private final long value;

    WdCompatibilityMode(long value) {
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
