package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdupdatestylelistbehavior">https://docs.microsoft.com/en-us/office/vba/api/word.wdupdatestylelistbehavior</a>}
*/
public enum WdUpdateStyleListBehavior implements COMEnum {
    
    /**@ Adds the numbering or bullets pattern of the selection to all paragraphs in the document that use the same style. */
    wdListBehaviorAddBulletsNumbering(1),    
    /**@ Keeps the existing numbering or bullets pattern for all other paragraphs that use the same style and does not apply the numbering or bullets pattern of the selection. */
    wdListBehaviorKeepPreviousPattern(0);

    private final long value;

    WdUpdateStyleListBehavior(long value) {
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
