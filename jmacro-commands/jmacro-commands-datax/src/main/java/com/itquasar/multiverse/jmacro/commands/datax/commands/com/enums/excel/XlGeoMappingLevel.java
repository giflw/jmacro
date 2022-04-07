package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlgeomappinglevel">https://docs.microsoft.com/en-us/office/vba/api/excel.xlgeomappinglevel</a>}
*/
public enum XlGeoMappingLevel implements COMEnum {
    
    /**@ Use highest resolution mapping level. */
    xlGeoMappingLevelAutomatic(0),    
    /**@ Only map regions with data. */
    xlGeoMappingLevelDataOnly(1),    
    /**@ Map by postcode. */
    xlGeoMappingLevelPostalCode(2),    
    /**@ Map by county. */
    xlGeoMappingLevelCounty(3),    
    /**@ Map by state. */
    xlGeoMappingLevelState(4),    
    /**@ Map by country. */
    xlGeoMappingLevelCountryRegion(5),    
    /**@ Map by region (group of countries). */
    xlGeoMappingLevelCountryRegionList(6),    
    /**@ Map the whole world. */
    xlGeoMappingLevelWorld(7);

    private final long value;

    XlGeoMappingLevel(long value) {
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
