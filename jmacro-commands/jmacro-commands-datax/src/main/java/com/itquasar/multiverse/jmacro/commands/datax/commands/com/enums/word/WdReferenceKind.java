package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdreferencekind">https://docs.microsoft.com/en-us/office/vba/api/word.wdreferencekind</a>}
*/
public enum WdReferenceKind implements COMEnum {
    
    /**@ Insert text value of the specified item. For example, insert text of the specified heading. */
    wdContentText(-1),    
    /**@ Insert endnote reference mark. */
    wdEndnoteNumber(6),    
    /**@ Insert formatted endnote reference mark. */
    wdEndnoteNumberFormatted(17),    
    /**@ Insert label, number, and any additional caption of specified equation, figure, or table. */
    wdEntireCaption(2),    
    /**@ Insert footnote reference mark. */
    wdFootnoteNumber(5),    
    /**@ Insert formatted footnote reference mark. */
    wdFootnoteNumberFormatted(16),    
    /**@ Insert complete heading or paragraph number. */
    wdNumberFullContext(-4),    
    /**@ Insert heading or paragraph without its relative position in the outline numbered list. */
    wdNumberNoContext(-3),    
    /**@ Insert heading or paragraph with as much of its relative position in the outline numbered list as necessary to identify the item. */
    wdNumberRelativeContext(-2),    
    /**@ Insert only the caption text of the specified equation, figure, or table. */
    wdOnlyCaptionText(4),    
    /**@ Insert only the label and number of the specified equation, figure, or table. */
    wdOnlyLabelAndNumber(3),    
    /**@ Insert page number of specified item. */
    wdPageNumber(7),    
    /**@ Insert the word "Above" or the word "Below" as appropriate. */
    wdPosition(15);

    private final long value;

    WdReferenceKind(long value) {
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
