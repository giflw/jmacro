package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlinktype">https://docs.microsoft.com/en-us/office/vba/api/word.wdlinktype</a>}
*/
public enum WdLinkType implements COMEnum {
    
    /**@ Microsoft Excel chart. */
    wdLinkTypeChart(8),    
    /**@ Dynamic Data Exchange. */
    wdLinkTypeDDE(6),    
    /**@ DDE automatic. */
    wdLinkTypeDDEAuto(7),    
    /**@ Import file. */
    wdLinkTypeImport(5),    
    /**@ Include file. */
    wdLinkTypeInclude(4),    
    /**@ OLE object. */
    wdLinkTypeOLE(0),    
    /**@ Picture. */
    wdLinkTypePicture(1),    
    /**@ Reference library. */
    wdLinkTypeReference(3),    
    /**@ Text. */
    wdLinkTypeText(2);

    private final long value;

    WdLinkType(long value) {
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
