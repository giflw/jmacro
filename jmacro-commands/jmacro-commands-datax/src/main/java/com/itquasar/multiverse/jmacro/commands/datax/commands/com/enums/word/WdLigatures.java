package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdligatures">https://docs.microsoft.com/en-us/office/vba/api/word.wdligatures</a>}
*/
public enum WdLigatures implements COMEnum {
    
    /**@ Applies all types of ligatures to the font. */
    wdLigaturesAll(15),    
    /**@ Applies contextual ligatures to the font. Contextual ligatures are often designed to enhance readability, but may also be solely ornamental. Contextual ligatures may also be contextual alternates. */
    wdLigaturesContextual(2),    
    /**@ Applies contextual and discretional ligatures to the font. */
    wdLigaturesContextualDiscretional(10),    
    /**@ Applies contextual and historical ligatures to the font. */
    wdLigaturesContextualHistorical(6),    
    /**@ Applies contextual, historical, and discretional ligatures to a font. */
    wdLigaturesContextualHistoricalDiscretional(14),    
    /**@ Applies discretional ligatures to the font. Discretional ligatures are most often designed to be ornamental at the discretion of the type developer. */
    wdLigaturesDiscretional(8),    
    /**@ Applies historical ligatures to the font. Historical ligatures are similar to standard ligatures in that they were originally intended to improve the readability of the font, but may look archaic to the modern reader. */
    wdLigaturesHistorical(4),    
    /**@ Applies historical and discretional ligatures to the font. */
    wdLigaturesHistoricalDiscretional(12),    
    /**@ Does not apply any ligatures to the font. */
    wdLigaturesNone(0),    
    /**@ Applies standard ligatures to the font. Standard ligatures are designed to enhance readability. Standard ligatures in Latin languages include "fi", "fl", and "ff", for example. */
    wdLigaturesStandard(1),    
    /**@ Applies standard and contextual ligatures to the font. */
    wdLigaturesStandardContextual(3),    
    /**@ Applies standard, contextual and discretional ligatures to the font. */
    wdLigaturesStandardContextualDiscretional(11),    
    /**@ Applies standard, contextual, and historical ligatures to the font. */
    wdLigaturesStandardContextualHistorical(7),    
    /**@ Applies standard and discretional ligatures to the font. */
    wdLigaturesStandardDiscretional(9),    
    /**@ Applies standard and historical ligatures to the font. */
    wdLigaturesStandardHistorical(5),    
    /**@ Applies standard historical and discretional ligatures to the font. */
    wdLigaturesStandardHistoricalDiscretional(13);

    private final long value;

    WdLigatures(long value) {
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
