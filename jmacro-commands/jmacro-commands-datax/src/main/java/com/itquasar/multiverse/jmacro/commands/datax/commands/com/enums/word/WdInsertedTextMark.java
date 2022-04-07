package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdinsertedtextmark">https://docs.microsoft.com/en-us/office/vba/api/word.wdinsertedtextmark</a>}
*/
public enum WdInsertedTextMark implements COMEnum {
    
    /**@ Inserted text is displayed in bold. */
    wdInsertedTextMarkBold(1),    
    /**@ Inserted text is displayed in a specified color. */
    wdInsertedTextMarkColorOnly(5),    
    /**@ Inserted text is marked up by using double-underline characters. */
    wdInsertedTextMarkDoubleUnderline(4),    
    /**@ Inserted text is displayed in italic. */
    wdInsertedTextMarkItalic(2),    
    /**@ Inserted text is not marked up. */
    wdInsertedTextMarkNone(0),    
    /**@ Inserted text is marked up by using strikethrough characters. */
    wdInsertedTextMarkStrikeThrough(6),    
    /**@ Inserted text is underlined. */
    wdInsertedTextMarkUnderline(3),    
    /**@ Inserted text is marked up by using double-strikethrough characters. */
    wdInsertedTextMarkDoubleStrikeThrough(7);

    private final long value;

    WdInsertedTextMark(long value) {
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
