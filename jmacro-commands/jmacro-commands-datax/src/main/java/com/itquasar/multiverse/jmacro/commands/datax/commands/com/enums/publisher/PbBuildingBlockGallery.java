package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbbuildingblockgallery">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbbuildingblockgallery</a>}
*/
public enum PbBuildingBlockGallery implements COMEnum {
    
    /**@ Borders & Accents gallery */
    pbBBGalAccents(1),    
    /**@ Advertisements gallery */
    pbBBGalAdvertisements(0),    
    /**@ Business Information gallery */
    pbBBGalBusinessInfo(3),    
    /**@ Calendars gallery */
    pbBBGalCalendars(2),    
    /**@ No gallery */
    pbBBGalNone(-1),    
    /**@ Page Parts gallery */
    pbBBGalPageParts(4);

    private final long value;

    PbBuildingBlockGallery(long value) {
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
