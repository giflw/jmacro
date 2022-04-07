package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlmarkerstyle">https://docs.microsoft.com/en-us/office/vba/api/excel.xlmarkerstyle</a>}
*/
public enum XlMarkerStyle implements COMEnum {
    
    /**@ Automatic markers */
    xlMarkerStyleAutomatic(-4105),    
    /**@ Circular markers */
    xlMarkerStyleCircle(8),    
    /**@ Long bar markers */
    xlMarkerStyleDash(-4115),    
    /**@ Diamond-shaped markers */
    xlMarkerStyleDiamond(2),    
    /**@ Short bar markers */
    xlMarkerStyleDot(-4118),    
    /**@ No markers */
    xlMarkerStyleNone(-4142),    
    /**@ Picture markers */
    xlMarkerStylePicture(-4147),    
    /**@ Square markers with a plus sign */
    xlMarkerStylePlus(9),    
    /**@ Square markers */
    xlMarkerStyleSquare(1),    
    /**@ Square markers with an asterisk */
    xlMarkerStyleStar(5),    
    /**@ Triangular markers */
    xlMarkerStyleTriangle(3),    
    /**@ Square markers with an X */
    xlMarkerStyleX(-4168);

    private final long value;

    XlMarkerStyle(long value) {
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
