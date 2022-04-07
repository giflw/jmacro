package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbhlinktargettype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbhlinktargettype</a>}
*/
public enum PbHlinkTargetType implements COMEnum {
    
    /**@ Email */
    pbHlinkTargetTypeEmail(2),    
    /**@ First Page */
    pbHlinkTargetTypeFirstPage(3),    
    /**@ Last Page */
    pbHlinkTargetTypeLastPage(4),    
    /**@ Next Page */
    pbHlinkTargetTypeNextPage(5),    
    /**@ None */
    pbHlinkTargetTypeNone(0),    
    /**@ Page ID */
    pbHlinkTargetTypePageID(7),    
    /**@ Personalized */
    pbHlinkTargetTypePersonalized(8),    
    /**@ Previous Page */
    pbHlinkTargetTypePreviousPage(6),    
    /**@ URL */
    pbHlinkTargetTypeURL(1);

    private final long value;

    PbHlinkTargetType(long value) {
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
