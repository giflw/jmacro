package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcustomizemailaction">https://docs.microsoft.com/en-us/office/vba/api/project.pjcustomizemailaction</a>}
*/
public enum PjCustomizeMailAction implements COMEnum {
    
    /**@ Field definitions. */
    pjMailDefineField(2),    
    /**@ Number of fields. */
    pjMailEndFields(0),    
    /**@ End of field definitions. */
    pjMailStartFields(1);

    private final long value;

    PjCustomizeMailAction(long value) {
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
