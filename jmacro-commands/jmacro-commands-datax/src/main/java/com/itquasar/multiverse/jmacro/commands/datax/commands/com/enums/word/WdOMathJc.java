package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdomathjc">https://docs.microsoft.com/en-us/office/vba/api/word.wdomathjc</a>}
*/
public enum WdOMathJc implements COMEnum {
    
    /**@ Center. */
    wdOMathJcCenter(2),    
    /**@ Center as a group. */
    wdOMathJcCenterGroup(1),    
    /**@ Inline. */
    wdOMathJcInline(7),    
    /**@ Left. */
    wdOMathJcLeft(3),    
    /**@ Right. */
    wdOMathJcRight(4);

    private final long value;

    WdOMathJc(long value) {
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
