package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcerequesttype">https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcerequesttype</a>}
*/
public enum PjResourceRequestType implements COMEnum {
    
    /**@ Demand. */
    pjResourceRequestTypeDemand(2),    
    /**@ None. */
    pjResourceRequestTypeNone(0),    
    /**@ Request. */
    pjResourceRequestTypeRequest(1);

    private final long value;

    PjResourceRequestType(long value) {
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
