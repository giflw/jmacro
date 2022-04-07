package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtasklinktype">https://docs.microsoft.com/en-us/office/vba/api/project.pjtasklinktype</a>}
*/
public enum PjTaskLinkType implements COMEnum {
    
    /**@ Link tasks from finish to finish. */
    pjFinishToFinish(0),    
    /**@ Link tasks from finish to start. */
    pjFinishToStart(1),    
    /**@ Link tasks from start to finish. */
    pjStartToFinish(2),    
    /**@ Link tasks from start to start. */
    pjStartToStart(3);

    private final long value;

    PjTaskLinkType(long value) {
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
