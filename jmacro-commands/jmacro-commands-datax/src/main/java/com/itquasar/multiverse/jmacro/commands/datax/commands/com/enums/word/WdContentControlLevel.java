package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcontentcontrollevel">https://docs.microsoft.com/en-us/office/vba/api/word.wdcontentcontrollevel</a>}
*/
public enum WdContentControlLevel implements COMEnum {
    
    /**@ Represents a content control that surrounds a table cell. */
    wdContentControlLevelCell(3),    
    /**@ Represents a content control that surrounds content within a single paragraph. */
    wdContentControlLevelInline(0),    
    /**@ Represents a content control that surrounds one or more complete paragraphs. */
    wdContentControlLevelParagraph(1),    
    /**@ Represents a content control that surrounds a table row. */
    wdContentControlLevelRow(2);

    private final long value;

    WdContentControlLevel(long value) {
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
