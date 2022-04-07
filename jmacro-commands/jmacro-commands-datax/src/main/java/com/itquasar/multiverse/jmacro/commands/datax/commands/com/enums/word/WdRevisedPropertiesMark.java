package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisedpropertiesmark">https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisedpropertiesmark</a>}
*/
public enum WdRevisedPropertiesMark implements COMEnum {
    
    /**@ In bold. */
    wdRevisedPropertiesMarkBold(1),    
    /**@ In the designated color. */
    wdRevisedPropertiesMarkColorOnly(5),    
    /**@ Using double-strikethrough characters. */
    wdRevisedPropertiesMarkDoubleStrikeThrough(7),    
    /**@ With double-underline characters. */
    wdRevisedPropertiesMarkDoubleUnderline(4),    
    /**@ In italic. */
    wdRevisedPropertiesMarkItalic(2),    
    /**@ Using a special character. */
    wdRevisedPropertiesMarkNone(0),    
    /**@ Using strikethrough characters. */
    wdRevisedPropertiesMarkStrikeThrough(6),    
    /**@ In underline. */
    wdRevisedPropertiesMarkUnderline(3);

    private final long value;

    WdRevisedPropertiesMark(long value) {
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
