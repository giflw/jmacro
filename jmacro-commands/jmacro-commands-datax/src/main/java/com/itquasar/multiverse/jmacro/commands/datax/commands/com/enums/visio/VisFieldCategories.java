package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visfieldcategories">https://docs.microsoft.com/en-us/office/vba/api/visio.visfieldcategories</a>}
*/
public enum VisFieldCategories implements COMEnum {
    
    /**@ Custom field. */
    visFCatCustom(0),    
    /**@ Date/time field. */
    visFCatDateTime(1),    
    /**@ Document information field. */
    visFCatDocument(2),    
    /**@ Geometery field. */
    visFCatGeometry(3),    
    /**@ Object information. */
    visFCatObject(4),    
    /**@ Page information field. */
    visFCatPage(5);

    private final long value;

    VisFieldCategories(long value) {
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
