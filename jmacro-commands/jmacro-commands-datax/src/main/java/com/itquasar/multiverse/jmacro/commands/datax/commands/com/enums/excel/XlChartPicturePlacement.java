package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlchartpictureplacement">https://docs.microsoft.com/en-us/office/vba/api/excel.xlchartpictureplacement</a>}
*/
public enum XlChartPicturePlacement implements COMEnum {
    
    /**@ Display on all faces. */
    xlAllFaces(7),    
    /**@ Display on end. */
    xlEnd(2),    
    /**@ Display on end and sides. */
    xlEndSides(3),    
    /**@ Display on front. */
    xlFront(4),    
    /**@ Display on front and end. */
    xlFrontEnd(6),    
    /**@ Display on front and sides. */
    xlFrontSides(5),    
    /**@ Display on sides. */
    xlSides(1);

    private final long value;

    XlChartPicturePlacement(long value) {
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
