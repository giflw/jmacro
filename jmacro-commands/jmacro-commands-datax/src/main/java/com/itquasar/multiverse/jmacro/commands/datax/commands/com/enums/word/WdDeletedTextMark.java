package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddeletedtextmark">https://docs.microsoft.com/en-us/office/vba/api/word.wddeletedtextmark</a>}
*/
public enum WdDeletedTextMark implements COMEnum {
    
    /**@ Deleted text is displayed in bold. */
    wdDeletedTextMarkBold(5),    
    /**@ Deleted text is marked up by using caret characters. */
    wdDeletedTextMarkCaret(2),    
    /**@ Deleted text is displayed in a specified color (default is red). */
    wdDeletedTextMarkColorOnly(9),    
    /**@ Deleted text is marked up by using double-underline characters. */
    wdDeletedTextMarkDoubleUnderline(8),    
    /**@ Deleted text is hidden. */
    wdDeletedTextMarkHidden(0),    
    /**@ Deleted text is displayed in italic. */
    wdDeletedTextMarkItalic(6),    
    /**@ Deleted text is not marked up. */
    wdDeletedTextMarkNone(4),    
    /**@ Deleted text is marked up by using pound characters. */
    wdDeletedTextMarkPound(3),    
    /**@ Deleted text is marked up by using strikethrough characters. */
    wdDeletedTextMarkStrikeThrough(1),    
    /**@ Deleted text is underlined. */
    wdDeletedTextMarkUnderline(7),    
    /**@ Deleted text is marked up by using double-strikethrough characters. */
    wdDeletedTextMarkDoubleStrikeThrough(10);

    private final long value;

    WdDeletedTextMark(long value) {
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
