package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpublicationtype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpublicationtype</a>}
*/
public enum PbPublicationType implements COMEnum {
    
    /**@ Print publication */
    pbTypePrint(1),    
    /**@ Web publication */
    pbTypeWeb(2);

    private final long value;

    PbPublicationType(long value) {
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
