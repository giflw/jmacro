package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpasteoptions">https://docs.microsoft.com/en-us/office/vba/api/word.wdpasteoptions</a>}
*/
public enum WdPasteOptions implements COMEnum {
    
    /**@ Keeps formatting from the source document. */
    wdKeepSourceFormatting(0),    
    /**@ Keeps text only, without formatting. */
    wdKeepTextOnly(2),    
    /**@ Matches formatting to the destination document. */
    wdMatchDestinationFormatting(1),    
    /**@ Matches formatting to the destination document using styles for formatting. */
    wdUseDestinationStyles(3);

    private final long value;

    WdPasteOptions(long value) {
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
