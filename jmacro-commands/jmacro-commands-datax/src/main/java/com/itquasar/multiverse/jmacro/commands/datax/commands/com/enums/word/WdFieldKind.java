package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdfieldkind">https://docs.microsoft.com/en-us/office/vba/api/word.wdfieldkind</a>}
*/
public enum WdFieldKind implements COMEnum {
    
    /**@ A field that does not have a result, for example, an Index Entry (XE), Table of Contents Entry (TC), or Private field. */
    wdFieldKindCold(3),    
    /**@ A field that's automatically updated each time it is displayed or each time the page is reformatted, but which can also be manually updated (for example, INCLUDEPICTURE or FORMDROPDOWN). */
    wdFieldKindHot(1),    
    /**@ An invalid field (for example, a pair of field characters with nothing inside). */
    wdFieldKindNone(0),    
    /**@ A field that can be updated and has a result. This type includes fields that are automatically updated when the source changes and fields that can be manually updated (for example, DATE or INCLUDETEXT). */
    wdFieldKindWarm(2);

    private final long value;

    WdFieldKind(long value) {
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
