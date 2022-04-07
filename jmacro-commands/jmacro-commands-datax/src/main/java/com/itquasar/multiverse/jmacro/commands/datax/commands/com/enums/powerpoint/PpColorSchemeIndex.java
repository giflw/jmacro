package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppcolorschemeindex">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppcolorschemeindex</a>}
*/
public enum PpColorSchemeIndex implements COMEnum {
    
    /**@ Accent1 */
    ppAccent1(6),    
    /**@ Accent2 */
    ppAccent2(7),    
    /**@ Accent3 */
    ppAccent3(8),    
    /**@ Background */
    ppBackground(1),    
    /**@ Fill */
    ppFill(5),    
    /**@ Foreground */
    ppForeground(2),    
    /**@ Not scheme color */
    ppNotSchemeColor(0),    
    /**@ Mixed scheme color */
    ppSchemeColorMixed(-2),    
    /**@ Shadow */
    ppShadow(3),    
    /**@ Title */
    ppTitle(4);

    private final long value;

    PpColorSchemeIndex(long value) {
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
