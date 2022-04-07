package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjalign">https://docs.microsoft.com/en-us/office/vba/api/project.pjalign</a>}
*/
public enum PjAlign implements COMEnum {
    
    /**@ Aligns the bottom edges of the boxes. */
    pjAlignBottoms(5),    
    /**@ Aligns the boxes vertically. */
    pjAlignCenters(1),    
    /**@ Aligns the left edges of the boxes. */
    pjAlignLefts(0),    
    /**@ Aligns the boxes horizontally. */
    pjAlignMiddles(4),    
    /**@ Aligns the right edges of the boxes. */
    pjAlignRights(2),    
    /**@ Aligns the top edges of the boxes. */
    pjAlignTops(3);

    private final long value;

    PjAlign(long value) {
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
