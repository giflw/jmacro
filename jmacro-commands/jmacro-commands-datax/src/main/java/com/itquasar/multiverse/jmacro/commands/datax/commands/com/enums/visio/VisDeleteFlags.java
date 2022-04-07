package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdeleteflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visdeleteflags</a>}
*/
public enum VisDeleteFlags implements COMEnum {
    
    /**@ Match the deletion behavior in the user interface. */
    visDeleteNormal(0),    
    /**@ Delete connectors attached to deleted shapes. */
    visDeleteHealConnectors(1),    
    /**@ Do not delete connectors attached to deleted shapes. */
    visDeleteNoHealConnectors(2),    
    /**@ Do not delete unselected members of containers or lists. */
    visDeleteNoContainerMembers(4),    
    /**@ Do not delete unselected callouts associated with shapes. */
    visDeleteNoAssociatedCallouts(8);

    private final long value;

    VisDeleteFlags(long value) {
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
