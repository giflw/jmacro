package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlgeoprojectiontype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlgeoprojectiontype</a>}
*/
public enum XlGeoProjectionType implements COMEnum {
    
    /**@ Heuristically choose best map projection. */
    xlGeoProjectionTypeAutomatic(0),    
    /**@ Use the Mercator map projection. */
    xlGeoProjectionTypeMercator(1),    
    /**@ Use the Miller map projection. */
    xlGeoProjectionTypeMiller(2),    
    /**@ Use the Albers map projection. */
    xlGeoProjectionTypeAlbers(3),    
    /**@ Use the Robinson map projection. */
    xlGeoProjectionTypeRobinson(4);

    private final long value;

    XlGeoProjectionType(long value) {
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
