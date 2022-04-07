package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visroleselectiontypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visroleselectiontypes</a>}
*/
public enum VisRoleSelectionTypes implements COMEnum {
    
    /**@ A selection that contains all connector shapes. */
    visRoleSelConnector(1),    
    /**@ A selection that contains all container shapes. */
    visRoleSelContainer(2),    
    /**@ A selection that contains all callout shapes. */
    visRoleSelCallout(4);

    private final long value;

    VisRoleSelectionTypes(long value) {
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
