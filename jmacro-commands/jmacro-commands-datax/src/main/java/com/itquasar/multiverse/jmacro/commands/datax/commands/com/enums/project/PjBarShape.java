package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjbarshape">https://docs.microsoft.com/en-us/office/vba/api/project.pjbarshape</a>}
*/
public enum PjBarShape implements COMEnum {
    
    /**@ Bottom line. */
    pjLineBottom(7),    
    /**@ Middle line. */
    pjLineMiddle(6),    
    /**@ Top line. */
    pjLineTop(5),    
    /**@ None. */
    pjNone(0),    
    /**@ Rectangle. */
    pjRectangleBar(1),    
    /**@ Rectangle bottom. */
    pjRectangleBottom(4),    
    /**@ Rectangle middle. */
    pjRectangleMiddle(3),    
    /**@ Rectangle top. */
    pjRectangleTop(2);

    private final long value;

    PjBarShape(long value) {
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
