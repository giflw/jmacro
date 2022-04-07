package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtextunit">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtextunit</a>}
*/
public enum PbTextUnit implements COMEnum {
    
    /**@ Expand by a cell */
    pbTextUnitCell(12),    
    /**@ Expand by a character */
    pbTextUnitCharacter(1),    
    /**@ Expand by a CharFormat */
    pbTextUnitCharFormat(13),    
    /**@ Expand by a code point */
    pbTextUnitCodePoint(17),    
    /**@ Expand by a unit column */
    pbTextUnitColumn(9),    
    /**@ Expand by a unit line */
    pbTextUnitLine(5),    
    /**@ Expand by an object */
    pbTextUnitObject(16),    
    /**@ Expand by a ParaFormat */
    pbTextUnitParaFormat(14),    
    /**@ Expand by a paragraph */
    pbTextUnitParagraph(4),    
    /**@ Expand by a row */
    pbTextUnitRow(10),    
    /**@ Expand by a screen */
    pbTextUnitScreen(7),    
    /**@ Expand by a section */
    pbTextUnitSection(8),    
    /**@ Expand by a sentence */
    pbTextUnitSentence(3),    
    /**@ Expand by a story */
    pbTextUnitStory(6),    
    /**@ Expand by a table */
    pbTextUnitTable(15),    
    /**@ Expand by a window */
    pbTextUnitWindow(11),    
    /**@ Expand by a word */
    pbTextUnitWord(2);

    private final long value;

    PbTextUnit(long value) {
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
