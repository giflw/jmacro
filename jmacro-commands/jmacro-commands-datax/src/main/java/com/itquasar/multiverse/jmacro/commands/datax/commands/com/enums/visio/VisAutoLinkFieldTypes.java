package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visautolinkfieldtypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visautolinkfieldtypes</a>}
*/
public enum VisAutoLinkFieldTypes implements COMEnum {
    
    /**@ Field is label for shape data (custom property); field name is label and is required. */
    visAutoLinkCustPropsLabel(2),    
    /**@ Field is angle in shape geometry. */
    visAutoLinkGeometryAngle(4),    
    /**@ Field is height of shape. */
    visAutoLinkGeometryHeight(6),    
    /**@ Field is width of shape. */
    visAutoLinkGeometryWidth(5),    
    /**@ Field is local name of the master for the shape. */
    visAutoLinkMasterName(8),    
    /**@ Field is universal name of the master for the shape. */
    visAutoLinkMasterNameU(16),    
    /**@ Field is Data1 property of Shape object. */
    visAutoLinkObjectData1(11),    
    /**@ Field is Data2 property of Shape object. */
    visAutoLinkObjectData2(12),    
    /**@ Field is Data3 property of Shape object. */
    visAutoLinkObjectData3(13),    
    /**@ Field is ID of the shape . */
    visAutoLinkObjectID(7),    
    /**@ Field is local name of the shape. */
    visAutoLinkObjectName(9),    
    /**@ Field is universal name of the shape. */
    visAutoLinkObjectNameU(17),    
    /**@ Field is type of shape object. */
    visAutoLinkObjectType(10),    
    /**@ Field is universal property-row name; field name is Cell.RowNameU and is required. */
    visAutoLinkPropRowNameU(14),    
    /**@ Field is shape text. */
    visAutoLinkShapeText(1),    
    /**@ Field is user-defined cell local row name; field name is Cell.RowName and is required. */
    visAutoLinkUserRowName(3),    
    /**@ Field is universal user-defined cell row name; field name is Cell.RowNameU and is required. */
    visAutoLinkUserRowNameU(15);

    private final long value;

    VisAutoLinkFieldTypes(long value) {
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
