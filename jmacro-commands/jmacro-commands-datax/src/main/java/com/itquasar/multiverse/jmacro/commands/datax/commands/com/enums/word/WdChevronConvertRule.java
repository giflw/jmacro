package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdchevronconvertrule">https://docs.microsoft.com/en-us/office/vba/api/word.wdchevronconvertrule</a>}
*/
public enum WdChevronConvertRule implements COMEnum {
    
    /**@ The converter attempts to convert text enclosed in chevrons (< >) to mail merge fields. */
    wdAlwaysConvert(1),    
    /**@ The converter prompts the user to convert or not convert chevrons when a Word for the Macintosh document is opened. */
    wdAskToConvert(3),    
    /**@ The converter prompts the user to convert or not convert chevrons when a Word for the Macintosh document is opened. */
    wdAskToNotConvert(2),    
    /**@ The converter passes the text through without attempting any interpretation. */
    wdNeverConvert(0);

    private final long value;

    WdChevronConvertRule(long value) {
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
