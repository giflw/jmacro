package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionsmarkup">https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionsmarkup</a>}
*/
public enum WdRevisionsMarkup implements COMEnum {
    
    /**@ Displays the final document with all markup visible. */
    wdRevisionsMarkupAll(2),    
    /**@ Displays the final document with no markup visible. */
    wdRevisionsMarkupNone(0),    
    /**@ Displays the final document in simple markup: with revisions incorporated, but with no markup visible. */
    wdRevisionsMarkupSimple(1);

    private final long value;

    WdRevisionsMarkup(long value) {
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
