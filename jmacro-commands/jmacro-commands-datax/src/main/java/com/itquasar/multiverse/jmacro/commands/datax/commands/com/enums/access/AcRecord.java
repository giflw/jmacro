package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acrecord">https://docs.microsoft.com/en-us/office/vba/api/access.acrecord</a>}
*/
public enum AcRecord implements COMEnum {
    
    /**@ Make the first record the current record. */
    acFirst(2),    
    /**@ Make the specified record the current record. */
    acGoTo(4),    
    /**@ Make the last record the current record. */
    acLast(3),    
    /**@ Make a new record the current record. */
    acNewRec(5),    
    /**@ Make the next record the current record. */
    acNext(1),    
    /**@ Make the previous record the current record. */
    acPrevious(0);

    private final long value;

    AcRecord(long value) {
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
