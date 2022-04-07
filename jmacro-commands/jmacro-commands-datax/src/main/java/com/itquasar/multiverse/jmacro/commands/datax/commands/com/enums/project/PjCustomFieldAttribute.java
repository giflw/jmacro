package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcustomfieldattribute">https://docs.microsoft.com/en-us/office/vba/api/project.pjcustomfieldattribute</a>}
*/
public enum PjCustomFieldAttribute implements COMEnum {
    
    /**@ Formula. */
    pjFieldAttributeFormula(1),    
    /**@ None. */
    pjFieldAttributeNone(0),    
    /**@ Value list. */
    pjFieldAttributeValueList(2);

    private final long value;

    PjCustomFieldAttribute(long value) {
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
