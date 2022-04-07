package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.actexttransfertype">https://docs.microsoft.com/en-us/office/vba/api/access.actexttransfertype</a>}
*/
public enum AcTextTransferType implements COMEnum {
    
    /**@ Export Delimited */
    acExportDelim(2),    
    /**@ Export Fixed Width */
    acExportFixed(3),    
    /**@ Export HTML */
    acExportHTML(8),    
    /**@ Export Microsoft Word Merge */
    acExportMerge(4),    
    /**@ Import Delimited */
    acImportDelim(0),    
    /**@ Import Fixed Width */
    acImportFixed(1),    
    /**@ Import HTML */
    acImportHTML(7),    
    /**@ Link Delimited */
    acLinkDelim(5),    
    /**@ Link Fixed Width */
    acLinkFixed(6),    
    /**@ Link HTML */
    acLinkHTML(9);

    private final long value;

    AcTextTransferType(long value) {
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
