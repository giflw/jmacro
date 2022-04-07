package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformregionsize">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformregionsize</a>}
*/
public enum OlFormRegionSize implements COMEnum {
    
    /**@ The form region is an adjoining form region. */
    olFormRegionTypeAdjoining(1),    
    /**@ The form region is a separate form region. This includes a separate form region that is added to a standard form as a custom page, a separate form region that replaces the default page of a standard form, or a separate form region that replaces all pages in a standard form. */
    olFormRegionTypeSeparate(0);

    private final long value;

    OlFormRegionSize(long value) {
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
