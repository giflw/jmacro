package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdorganizerobject">https://docs.microsoft.com/en-us/office/vba/api/word.wdorganizerobject</a>}
*/
public enum WdOrganizerObject implements COMEnum {
    
    /**@ An AutoText item. */
    wdOrganizerObjectAutoText(1),    
    /**@ A command bar item. */
    wdOrganizerObjectCommandBars(2),    
    /**@ A project item. */
    wdOrganizerObjectProjectItems(3),    
    /**@ A style item. */
    wdOrganizerObjectStyles(0);

    private final long value;

    WdOrganizerObject(long value) {
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
