package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjshape">https://docs.microsoft.com/en-us/office/vba/api/project.pjshape</a>}
*/
public enum PjShape implements COMEnum {
    
    /**@ Arc. */
    pjArc(6),    
    /**@ Arrow. */
    pjArrow(3),    
    /**@ Ellipse. */
    pjEllipse(5),    
    /**@ Line. */
    pjLine(2),    
    /**@ OLE object. */
    pjOLEObject(1),    
    /**@ Polygon. */
    pjPolygon(7),    
    /**@ Rectangle. */
    pjRectangle(4),    
    /**@ Text box. */
    pjTextBox(8);

    private final long value;

    PjShape(long value) {
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
