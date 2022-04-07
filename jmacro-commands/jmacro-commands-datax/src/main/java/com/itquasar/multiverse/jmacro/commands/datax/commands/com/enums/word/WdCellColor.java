package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcellcolor">https://docs.microsoft.com/en-us/office/vba/api/word.wdcellcolor</a>}
*/
public enum WdCellColor implements COMEnum {
    
    /**@ Highlighting color determined by reviewer. */
    wdCellColorByAuthor(-1),    
    /**@ Light blue. */
    wdCellColorLightBlue(2),    
    /**@ Light gray. */
    wdCellColorLightGray(7),    
    /**@ Light green. */
    wdCellColorLightGreen(6),    
    /**@ Light orange. */
    wdCellColorLightOrange(5),    
    /**@ Light purple. */
    wdCellColorLightPurple(4),    
    /**@ Light yellow. */
    wdCellColorLightYellow(3),    
    /**@ No highlighting. */
    wdCellColorNoHighlight(0),    
    /**@ Pink. */
    wdCellColorPink(1);

    private final long value;

    WdCellColor(long value) {
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
