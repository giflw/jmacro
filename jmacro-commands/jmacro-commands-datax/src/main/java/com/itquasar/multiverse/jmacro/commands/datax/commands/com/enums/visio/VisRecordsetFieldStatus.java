package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrecordsetfieldstatus">https://docs.microsoft.com/en-us/office/vba/api/visio.visrecordsetfieldstatus</a>}
*/
public enum VisRecordsetFieldStatus implements COMEnum {
    
    /**@ No description provided */
    visFieldMappedAllCallouts(3),    
    /**@ No description provided */
    visFieldMappedNoCallouts(1),    
    /**@ No description provided */
    visFieldMappedSomeCallouts(2),    
    /**@ No description provided */
    visFieldNotMapped(0);

    private final long value;

    VisRecordsetFieldStatus(long value) {
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
