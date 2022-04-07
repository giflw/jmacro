package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsectiondirection">https://docs.microsoft.com/en-us/office/vba/api/word.wdsectiondirection</a>}
*/
public enum WdSectionDirection implements COMEnum {
    
    /**@ Displays the section with left alignment and left-to-right reading order. */
    wdSectionDirectionLtr(1),    
    /**@ Displays the section with right alignment and right-to-left reading order. */
    wdSectionDirectionRtl(0);

    private final long value;

    WdSectionDirection(long value) {
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
