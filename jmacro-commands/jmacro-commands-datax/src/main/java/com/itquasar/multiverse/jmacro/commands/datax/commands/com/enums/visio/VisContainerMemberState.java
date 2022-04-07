package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainermemberstate">https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainermemberstate</a>}
*/
public enum VisContainerMemberState implements COMEnum {
    
    /**@ The shape is not a member of the container. */
    visContainerMemberNotAMember(0),    
    /**@ The member shape is within the bounds of the container. */
    visContainerMemberInterior(1),    
    /**@ The member shape is on the boundary of the container. */
    visContainerMemberOnBoundary(2),    
    /**@ The member shape is outside the bounds of the container. */
    visContainerMemberOutside(3),    
    /**@ The member shape is a list member. */
    visContainerMemberInList(4);

    private final long value;

    VisContainerMemberState(long value) {
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
