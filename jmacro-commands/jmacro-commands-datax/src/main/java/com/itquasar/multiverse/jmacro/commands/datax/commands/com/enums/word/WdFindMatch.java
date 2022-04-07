package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdfindmatch">https://docs.microsoft.com/en-us/office/vba/api/word.wdfindmatch</a>}
*/
public enum WdFindMatch implements COMEnum {
    
    /**@ Not supported. */
    wdMatchAnyCharacter(65599),    
    /**@ Not supported. */
    wdMatchAnyDigit(65567),    
    /**@ Not supported. */
    wdMatchAnyLetter(65583),    
    /**@ Not supported. */
    wdMatchCaretCharacter(11),    
    /**@ Not supported. */
    wdMatchColumnBreak(14),    
    /**@ Not supported. */
    wdMatchCommentMark(5),    
    /**@ Not supported. */
    wdMatchEmDash(8212),    
    /**@ Not supported. */
    wdMatchEnDash(8211),    
    /**@ Not supported. */
    wdMatchEndnoteMark(65555),    
    /**@ Not supported. */
    wdMatchField(19),    
    /**@ Not supported. */
    wdMatchFootnoteMark(65554),    
    /**@ Not supported. */
    wdMatchGraphic(1),    
    /**@ Not supported. */
    wdMatchManualLineBreak(65551),    
    /**@ Not supported. */
    wdMatchManualPageBreak(65564),    
    /**@ Not supported. */
    wdMatchNonbreakingHyphen(30),    
    /**@ Not supported. */
    wdMatchNonbreakingSpace(160),    
    /**@ Not supported. */
    wdMatchOptionalHyphen(31),    
    /**@ Not supported. */
    wdMatchParagraphMark(65551),    
    /**@ Not supported. */
    wdMatchSectionBreak(65580),    
    /**@ Not supported. */
    wdMatchTabCharacter(9),    
    /**@ Not supported. */
    wdMatchWhiteSpace(65655);

    private final long value;

    WdFindMatch(long value) {
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
