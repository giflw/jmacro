package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjvaluelistitem">https://docs.microsoft.com/en-us/office/vba/api/project.pjvaluelistitem</a>}
*/
public enum PjValueListItem implements COMEnum {
    
    /**@ Description. */
    pjValueListDescription(1),    
    /**@ Phonetics. */
    pjValueListPhonetics(2),    
    /**@ Value. */
    pjValueListValue(0);

    private final long value;

    PjValueListItem(long value) {
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
