package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlevelorder">https://docs.microsoft.com/en-us/office/vba/api/project.pjlevelorder</a>}
*/
public enum PjLevelOrder implements COMEnum {
    
    /**@ Level ID. */
    pjLevelID(0),    
    /**@ Level priority. */
    pjLevelPriority(2),    
    /**@ Level standard. */
    pjLevelStandard(1);

    private final long value;

    PjLevelOrder(long value) {
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
