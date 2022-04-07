package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdscrollbartype">https://docs.microsoft.com/en-us/office/vba/api/word.wdscrollbartype</a>}
*/
public enum WdScrollbarType implements COMEnum {
    
    /**@ Scroll bars are available for the specified frame only if the contents are too large to fit in the allotted space. */
    wdScrollbarTypeAuto(0),    
    /**@ Scroll bars are never available for the specified frame. */
    wdScrollbarTypeNo(2),    
    /**@ Scroll bars are always available for the specified frame. */
    wdScrollbarTypeYes(1);

    private final long value;

    WdScrollbarType(long value) {
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
