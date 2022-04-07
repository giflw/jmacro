package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcommitmenttasklinktype">https://docs.microsoft.com/en-us/office/vba/api/project.pjcommitmenttasklinktype</a>}
*/
public enum PjCommitmentTaskLinkType implements COMEnum {
    
    /**@ No task link. */
    pjNoLink(0),    
    /**@ A link that targets the date the task deliverable ends. */
    pjTargetFinish(2),    
    /**@ A link that targets the date the task deliverable begins. */
    pjTargetStart(1);

    private final long value;

    PjCommitmentTaskLinkType(long value) {
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
