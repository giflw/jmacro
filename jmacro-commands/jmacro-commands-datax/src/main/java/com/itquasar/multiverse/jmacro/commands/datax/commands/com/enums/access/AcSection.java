package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acsection">https://docs.microsoft.com/en-us/office/vba/api/access.acsection</a>}
*/
public enum AcSection implements COMEnum {
    
    /**@ (Default) Detail section */
    acDetail(0),    
    /**@ Form or report footer */
    acFooter(2),    
    /**@ Group-level 1 footer (reports only) */
    acGroupLevel1Footer(6),    
    /**@ Group-level 1 header (reports only) */
    acGroupLevel1Header(5),    
    /**@ Group-level 2 footer (reports only) */
    acGroupLevel2Footer(8),    
    /**@ Group-level 2 header (reports only) */
    acGroupLevel2Header(7),    
    /**@ Form or report header */
    acHeader(1),    
    /**@ Page footer */
    acPageFooter(4),    
    /**@ Page header */
    acPageHeader(3);

    private final long value;

    AcSection(long value) {
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
