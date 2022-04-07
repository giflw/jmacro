package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpattern">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpattern</a>}
*/
public enum XlPattern implements COMEnum {
    
    /**@ Excel controls the pattern. */
    xlPatternAutomatic(-4105),    
    /**@ Checkerboard. */
    xlPatternChecker(9),    
    /**@ Criss-cross lines. */
    xlPatternCrissCross(16),    
    /**@ Dark diagonal lines running from the upper-left to the lower-right. */
    xlPatternDown(-4121),    
    /**@ 16% gray. */
    xlPatternGray16(17),    
    /**@ 25% gray. */
    xlPatternGray25(-4124),    
    /**@ 50% gray. */
    xlPatternGray50(-4125),    
    /**@ 75% gray. */
    xlPatternGray75(-4126),    
    /**@ 8% gray. */
    xlPatternGray8(18),    
    /**@ Grid. */
    xlPatternGrid(15),    
    /**@ Dark horizontal lines. */
    xlPatternHorizontal(-4128),    
    /**@ Light diagonal lines running from the upper-left to the lower-right. */
    xlPatternLightDown(13),    
    /**@ Light horizontal lines. */
    xlPatternLightHorizontal(11),    
    /**@ Light diagonal lines running from the lower-left to the upper-right. */
    xlPatternLightUp(14),    
    /**@ Light vertical bars. */
    xlPatternLightVertical(12),    
    /**@ No pattern. */
    xlPatternNone(-4142),    
    /**@ 75% dark gray. */
    xlPatternSemiGray75(10),    
    /**@ Solid color. */
    xlPatternSolid(1),    
    /**@ Dark diagonal lines running from the lower-left to the upper-right. */
    xlPatternUp(-4162),    
    /**@ Dark vertical bars. */
    xlPatternVertical(-4166);

    private final long value;

    XlPattern(long value) {
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
