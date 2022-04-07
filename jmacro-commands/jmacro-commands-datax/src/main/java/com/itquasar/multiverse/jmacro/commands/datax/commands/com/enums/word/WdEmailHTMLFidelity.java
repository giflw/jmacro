package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdemailhtmlfidelity">https://docs.microsoft.com/en-us/office/vba/api/word.wdemailhtmlfidelity</a>}
*/
public enum WdEmailHTMLFidelity implements COMEnum {
    
    /**@ Leaves HTML intact. */
    wdEmailHTMLFidelityHigh(3),    
    /**@ Removes all HTML tags that don't affect how a message displays. */
    wdEmailHTMLFidelityLow(1),    
    /**@ Not supported. */
    wdEmailHTMLFidelityMedium(2);

    private final long value;

    WdEmailHTMLFidelity(long value) {
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
