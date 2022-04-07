package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddefaultlistbehavior">https://docs.microsoft.com/en-us/office/vba/api/word.wddefaultlistbehavior</a>}
*/
public enum WdDefaultListBehavior implements COMEnum {
    
    /**@ Use formatting compatible with Microsoft Word 2002. */
    wdWord10ListBehavior(2),    
    /**@ Use formatting compatible with Microsoft Word 97. */
    wdWord8ListBehavior(0),    
    /**@ Use Web-oriented formatting as introduced in Microsoft Word 2000. */
    wdWord9ListBehavior(1);

    private final long value;

    WdDefaultListBehavior(long value) {
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
