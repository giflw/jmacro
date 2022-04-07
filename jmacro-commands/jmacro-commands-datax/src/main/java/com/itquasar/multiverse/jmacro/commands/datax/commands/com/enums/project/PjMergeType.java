package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjmergetype">https://docs.microsoft.com/en-us/office/vba/api/project.pjmergetype</a>}
*/
public enum PjMergeType implements COMEnum {
    
    /**@ Append the data. */
    pjAppend(3),    
    /**@ Do not merge. */
    pjDoNotMerge(0),    
    /**@ Merge the data. */
    pjMerge(1),    
    /**@ Prompt the user to choose how to merge. */
    pjPrompt(2);

    private final long value;

    PjMergeType(long value) {
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
