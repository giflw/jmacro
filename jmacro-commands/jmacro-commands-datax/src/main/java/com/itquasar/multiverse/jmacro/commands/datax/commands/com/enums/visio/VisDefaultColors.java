package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdefaultcolors">https://docs.microsoft.com/en-us/office/vba/api/visio.visdefaultcolors</a>}
*/
public enum VisDefaultColors implements COMEnum {
    
    /**@ Black */
    visBlack(0),    
    /**@ Blue */
    visBlue(4),    
    /**@ Cyan */
    visCyan(7),    
    /**@ Dark blue */
    visDarkBlue(10),    
    /**@ Dark cyan */
    visDarkCyan(13),    
    /**@ Dark gray */
    visDarkGray(19),    
    /**@ Dark green */
    visDarkGreen(9),    
    /**@ Dark red */
    visDarkRed(8),    
    /**@ Dark yellow */
    visDarkYellow(11),    
    /**@ 10% gray */
    visGray10(15),    
    /**@ 20% gray */
    visGray20(16),    
    /**@ 30% gray */
    visGray30(17),    
    /**@ 40% gray */
    visGray40(18),    
    /**@ 50% gray */
    visGray50(19),    
    /**@ 60% gray */
    visGray60(20),    
    /**@ 70% gray */
    visGray70(21),    
    /**@ 80% gray */
    visGray80(22),    
    /**@ 90% gray */
    visGray90(23),    
    /**@ Gray */
    visGray(14),    
    /**@ Green */
    visGreen(3),    
    /**@ Magenta */
    visMagenta(6),    
    /**@ Purple */
    visPurple(12),    
    /**@ Red */
    visRed(2),    
    /**@ Transparent */
    visTransparent(0),    
    /**@ White */
    visWhite(1),    
    /**@ Yellow */
    visYellow(5);

    private final long value;

    VisDefaultColors(long value) {
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
