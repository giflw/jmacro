package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmovefromtextmark">https://docs.microsoft.com/en-us/office/vba/api/word.wdmovefromtextmark</a>}
*/
public enum WdMoveFromTextMark implements COMEnum {
    
    /**@ Marks moved text with bold formatting. */
    wdMoveFromTextMarkBold(6),    
    /**@ Marks moved text with a caret. */
    wdMoveFromTextMarkCaret(3),    
    /**@ Marks moved text with color only. Use the MoveFromTextColor property to set the color of moved text. */
    wdMoveFromTextMarkColorOnly(10),    
    /**@ Marks moved text with a double strikethrough. */
    wdMoveFromTextMarkDoubleStrikeThrough(1),    
    /**@ Marks moved text with a double underline. */
    wdMoveFromTextMarkDoubleUnderline(9),    
    /**@ Hides moved text. */
    wdMoveFromTextMarkHidden(0),    
    /**@ Marks moved text with italic formatting. */
    wdMoveFromTextMarkItalic(7),    
    /**@ No special formatting for moved text. */
    wdMoveFromTextMarkNone(5),    
    /**@ Marks moved text with a pound (number) sign. */
    wdMoveFromTextMarkPound(4),    
    /**@ Marks moved text with a strikethrough. */
    wdMoveFromTextMarkStrikeThrough(2),    
    /**@ Underlines moved text. */
    wdMoveFromTextMarkUnderline(8);

    private final long value;

    WdMoveFromTextMark(long value) {
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
