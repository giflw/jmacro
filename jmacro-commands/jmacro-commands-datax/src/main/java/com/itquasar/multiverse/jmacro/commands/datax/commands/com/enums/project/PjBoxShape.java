package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjboxshape">https://docs.microsoft.com/en-us/office/vba/api/project.pjboxshape</a>}
*/
public enum PjBoxShape implements COMEnum {
    
    /**@ Capsule. */
    pjBoxCapsule(4),    
    /**@ Down trapezoid. */
    pjBoxDownTrapezoid(9),    
    /**@ Left parallelogram. */
    pjBoxLeftParallelogram(7),    
    /**@ Pointed ends. */
    pjBoxPointedEnds(5),    
    /**@ Rectangle. */
    pjBoxRectangle(0),    
    /**@ Right parallelogram. */
    pjBoxRightParallelogram(6),    
    /**@ Rounded rectangle. */
    pjBoxRoundedRectangle(2),    
    /**@ Up trapezoid. */
    pjBoxUpTrapezoid(8),    
    /**@ Wide rectangle. */
    pjBoxWideRectangle(1),    
    /**@ Wide rounded rectangle. */
    pjBoxWideRoundedRectangle(3);

    private final long value;

    PjBoxShape(long value) {
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
