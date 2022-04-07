package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdatacolumnproperties">https://docs.microsoft.com/en-us/office/vba/api/visio.visdatacolumnproperties</a>}
*/
public enum VisDataColumnProperties implements COMEnum {
    
    /**@ Calendar property of the data column. */
    visDataColumnPropertyCalendar(3),    
    /**@ Currency property of the data column. */
    visDataColumnPropertyCurrency(5),    
    /**@ Display name of the data column in the UI. */
    visDataColumnPropertyDisplayName(6),    
    /**@ Whether the data-column value becomes a hyperlink in the Microsoft Office Visio user interface when it is linked to a shape. */
    visDataColumnPropertyHyperlink(8),    
    /**@ Language ID property of the data column. */
    visDataColumnPropertyLangID(2),    
    /**@ Type property of the data column . */
    visDataColumnPropertyType(1),    
    /**@ Units property of the data column. */
    visDataColumnPropertyUnits(4),    
    /**@ Whether the data-column property is visible in the UI, and therefore if the data column participates in data linking. For shapes linked to data rows in a data recordset, only visible columns populate shape data items in the shape. */
    visDataColumnPropertyVisible(7);

    private final long value;

    VisDataColumnProperties(long value) {
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
