package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdreferencetype">https://docs.microsoft.com/en-us/office/vba/api/word.wdreferencetype</a>}
*/
public enum WdReferenceType implements COMEnum {
    
    /**@ Bookmark. */
    wdRefTypeBookmark(2),    
    /**@ Endnote. */
    wdRefTypeEndnote(4),    
    /**@ Footnote. */
    wdRefTypeFootnote(3),    
    /**@ Heading. */
    wdRefTypeHeading(1),    
    /**@ Numbered item. */
    wdRefTypeNumberedItem(0);

    private final long value;

    WdReferenceType(long value) {
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
