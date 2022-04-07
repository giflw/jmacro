package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjjobtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjjobtype</a>}
*/
public enum PjJobType implements COMEnum {
    
    /**@ The queue job message is to check in the project. */
    pjCacheProjectCheckin(1),    
    /**@ The queue job message is to save the project. */
    pjCacheProjectSave(0),    
    /**@ The queue job message is to publish the project. */
    pjCacheProjectPublish(2);

    private final long value;

    PjJobType(long value) {
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
