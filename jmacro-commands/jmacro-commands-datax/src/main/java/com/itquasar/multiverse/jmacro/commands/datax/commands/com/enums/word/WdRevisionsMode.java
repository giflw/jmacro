package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionsmode">https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionsmode</a>}
*/
public enum WdRevisionsMode implements COMEnum {
    
    /**@ Displays revisions in balloons in the left or right margin. */
    wdBalloonRevisions(0),    
    /**@ Displays revisions within the text using strikethrough for deletions and underlining for insertions. This is the default setting for prior versions of Word. */
    wdInLineRevisions(1),    
    /**@ Not supported. */
    wdMixedRevisions(2);

    private final long value;

    WdRevisionsMode(long value) {
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
