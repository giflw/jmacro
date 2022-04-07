package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjworkcontourtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjworkcontourtype</a>}
*/
public enum PjWorkContourType implements COMEnum {
    
    /**@ Back-loaded. */
    pjBackLoaded(1),    
    /**@ Bell. */
    pjBell(6),    
    /**@ Contour. */
    pjContour(8),    
    /**@ Double peak. */
    pjDoublePeak(3),    
    /**@ Early peak. */
    pjEarlyPeak(4),    
    /**@ Flat. */
    pjFlat(0),    
    /**@ Front-loaded. */
    pjFrontLoaded(2),    
    /**@ Late peak. */
    pjLatePeak(5),    
    /**@ Turtle. */
    pjTurtle(7);

    private final long value;

    PjWorkContourType(long value) {
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
