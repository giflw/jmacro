package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbemailmergepriority">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbemailmergepriority</a>}
*/
public enum PbEmailMergePriority implements COMEnum {
    
    /**@ High priority */
    pbPriorityHigh(1),    
    /**@ Low priority */
    pbPriorityLow(2),    
    /**@ No priority set */
    pbPriorityNone(0);

    private final long value;

    PbEmailMergePriority(long value) {
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
