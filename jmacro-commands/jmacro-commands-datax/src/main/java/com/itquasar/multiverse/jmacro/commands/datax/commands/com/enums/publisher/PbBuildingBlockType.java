package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbbuildingblocktype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbbuildingblocktype</a>}
*/
public enum PbBuildingBlockType implements COMEnum {
    
    /**@ Built-in type */
    pbBBBuiltIn(1),    
    /**@ Downloaded type */
    pbBBDownloaded(2),    
    /**@ No type */
    pbBBNone(0),    
    /**@ User-defined type */
    pbBBUser(3),    
    /**@ Workgroup-defined type */
    pbBBWorkgroup(4);

    private final long value;

    PbBuildingBlockType(long value) {
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
