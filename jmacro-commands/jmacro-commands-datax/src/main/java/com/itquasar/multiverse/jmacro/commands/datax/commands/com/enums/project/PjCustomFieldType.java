package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcustomfieldtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjcustomfieldtype</a>}
*/
public enum PjCustomFieldType implements COMEnum {
    
    /**@ Cost. */
    pjCostCustomField(0),    
    /**@ Date. */
    pjDateCustomField(1),    
    /**@ Duration. */
    pjDurationCustomField(2),    
    /**@ Finish. */
    pjFinishCustomField(3),    
    /**@ Flag. */
    pjFlagCustomField(4),    
    /**@ Invalid. */
    pjInvalidCustomField(65535),    
    /**@ Number. */
    pjNumberCustomField(5),    
    /**@ Start. */
    pjStartCustomField(6),    
    /**@ Text. */
    pjTextCustomField(7);

    private final long value;

    PjCustomFieldType(long value) {
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
