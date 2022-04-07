package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtextboxtightwrap">https://docs.microsoft.com/en-us/office/vba/api/word.wdtextboxtightwrap</a>}
*/
public enum WdTextboxTightWrap implements COMEnum {
    
    /**@ Wraps text around the text box tightly to the contents of the text box on all lines. */
    wdTightAll(1),    
    /**@ Wraps text tightly only on first and last lines. */
    wdTightFirstAndLastLines(2),    
    /**@ Wraps text tightly only on the first line. */
    wdTightFirstLineOnly(3),    
    /**@ Wraps text tightly only on the last line. */
    wdTightLastLineOnly(4),    
    /**@ Does not wrap text tightly around the contents of a text box. */
    wdTightNone(0);

    private final long value;

    WdTextboxTightWrap(long value) {
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
