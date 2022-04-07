package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbschemecolorindex">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbschemecolorindex</a>}
*/
public enum PbSchemeColorIndex implements COMEnum {
    
    /**@ Sets the color to Accent1 scheme color. */
    pbSchemeColorAccent1(2),    
    /**@ Sets the color to Accent2 scheme color. */
    pbSchemeColorAccent2(3),    
    /**@ Sets the color to Accent3 scheme color. */
    pbSchemeColorAccent3(4),    
    /**@ Sets the color to Accent4 scheme color. */
    pbSchemeColorAccent4(5),    
    /**@ Sets the color to Accent5 scheme color. */
    pbSchemeColorAccent5(8),    
    /**@ Sets the color scheme to followed hyperlink. */
    pbSchemeColorFollowedHyperlink(7),    
    /**@ Sets the color scheme to color hyperlink. */
    pbSchemeColorHyperlink(6),    
    /**@ Sets the color to main. */
    pbSchemeColorMain(1),    
    /**@ Sets the color scheme to none. */
    pbSchemeColorNone(0);

    private final long value;

    PbSchemeColorIndex(long value) {
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
