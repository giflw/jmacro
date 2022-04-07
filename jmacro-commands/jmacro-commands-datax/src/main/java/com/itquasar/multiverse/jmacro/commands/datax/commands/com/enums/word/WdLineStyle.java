package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlinestyle">https://docs.microsoft.com/en-us/office/vba/api/word.wdlinestyle</a>}
*/
public enum WdLineStyle implements COMEnum {
    
    /**@ A dash followed by a dot. */
    wdLineStyleDashDot(5),    
    /**@ A dash followed by two dots. */
    wdLineStyleDashDotDot(6),    
    /**@ A dash followed by a dot stroke, thus rendering a border similar to a barber pole. */
    wdLineStyleDashDotStroked(20),    
    /**@ A dash followed by a large gap. */
    wdLineStyleDashLargeGap(4),    
    /**@ A dash followed by a small gap. */
    wdLineStyleDashSmallGap(3),    
    /**@ Dots. */
    wdLineStyleDot(2),    
    /**@ Double solid lines. */
    wdLineStyleDouble(7),    
    /**@ Double wavy solid lines. */
    wdLineStyleDoubleWavy(19),    
    /**@ The border appears to have a 3D embossed look. */
    wdLineStyleEmboss3D(21),    
    /**@ The border appears to have a 3D engraved look. */
    wdLineStyleEngrave3D(22),    
    /**@ The border appears to be inset. */
    wdLineStyleInset(24),    
    /**@ No border. */
    wdLineStyleNone(0),    
    /**@ The border appears to be outset. */
    wdLineStyleOutset(23),    
    /**@ A single solid line. */
    wdLineStyleSingle(1),    
    /**@ A single wavy solid line. */
    wdLineStyleSingleWavy(18),    
    /**@ An internal single thick solid line surrounded by a single thin solid line with a large gap between them. */
    wdLineStyleThickThinLargeGap(16),    
    /**@ An internal single thick solid line surrounded by a single thin solid line with a medium gap between them. */
    wdLineStyleThickThinMedGap(13),    
    /**@ An internal single thick solid line surrounded by a single thin solid line with a small gap between them. */
    wdLineStyleThickThinSmallGap(10),    
    /**@ An internal single thin solid line surrounded by a single thick solid line with a large gap between them. */
    wdLineStyleThinThickLargeGap(15),    
    /**@ An internal single thin solid line surrounded by a single thick solid line with a medium gap between them. */
    wdLineStyleThinThickMedGap(12),    
    /**@ An internal single thin solid line surrounded by a single thick solid line with a small gap between them. */
    wdLineStyleThinThickSmallGap(9),    
    /**@ An internal single thin solid line surrounded by a single thick solid line surrounded by a single thin solid line with a large gap between all lines. */
    wdLineStyleThinThickThinLargeGap(17),    
    /**@ An internal single thin solid line surrounded by a single thick solid line surrounded by a single thin solid line with a medium gap between all lines. */
    wdLineStyleThinThickThinMedGap(14),    
    /**@ An internal single thin solid line surrounded by a single thick solid line surrounded by a single thin solid line with a small gap between all lines. */
    wdLineStyleThinThickThinSmallGap(11),    
    /**@ Three solid thin lines. */
    wdLineStyleTriple(8);

    private final long value;

    WdLineStyle(long value) {
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
