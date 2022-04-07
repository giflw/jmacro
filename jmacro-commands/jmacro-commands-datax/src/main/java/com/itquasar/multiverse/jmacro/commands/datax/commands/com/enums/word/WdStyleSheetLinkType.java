package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdstylesheetlinktype">https://docs.microsoft.com/en-us/office/vba/api/word.wdstylesheetlinktype</a>}
*/
public enum WdStyleSheetLinkType implements COMEnum {
    
    /**@ Imported internal style sheet. */
    wdStyleSheetLinkTypeImported(1),    
    /**@ Linked external style sheet. */
    wdStyleSheetLinkTypeLinked(0);

    private final long value;

    WdStyleSheetLinkType(long value) {
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
