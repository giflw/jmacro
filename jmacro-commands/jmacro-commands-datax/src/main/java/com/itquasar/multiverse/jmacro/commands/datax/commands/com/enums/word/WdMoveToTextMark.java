package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmovetotextmark">https://docs.microsoft.com/en-us/office/vba/api/word.wdmovetotextmark</a>}
*/
public enum WdMoveToTextMark implements COMEnum {
    
    /**@ Marks moved text with bold formatting. */
    wdMoveToTextMarkBold(1),    
    /**@ Marks moved text with color only. Use the MoveToTextColor property to set the color of moved text. */
    wdMoveToTextMarkColorOnly(5),    
    /**@ Moved text is marked with a double strikethrough. */
    wdMoveToTextMarkDoubleStrikeThrough(7),    
    /**@ Moved text is marked with a double underline. */
    wdMoveToTextMarkDoubleUnderline(4),    
    /**@ Marks moved text with italic formatting. */
    wdMoveToTextMarkItalic(2),    
    /**@ No special formatting for moved text. */
    wdMoveToTextMarkNone(0),    
    /**@ Moved text is marked with a strikethrough. */
    wdMoveToTextMarkStrikeThrough(6),    
    /**@ Underlines moved text. */
    wdMoveToTextMarkUnderline(3);

    private final long value;

    WdMoveToTextMark(long value) {
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
