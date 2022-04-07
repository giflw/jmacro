package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdshapeposition">https://docs.microsoft.com/en-us/office/vba/api/word.wdshapeposition</a>}
*/
public enum WdShapePosition implements COMEnum {
    
    /**@ At the bottom. */
    wdShapeBottom(-999997),    
    /**@ In the center. */
    wdShapeCenter(-999995),    
    /**@ Inside the selected range. */
    wdShapeInside(-999994),    
    /**@ On the left. */
    wdShapeLeft(-999998),    
    /**@ Outside the selected range. */
    wdShapeOutside(-999993),    
    /**@ On the right. */
    wdShapeRight(-999996),    
    /**@ At the top. */
    wdShapeTop(-999999);

    private final long value;

    WdShapePosition(long value) {
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
