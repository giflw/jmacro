package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjautomaticsaveoptions">https://docs.microsoft.com/en-us/office/vba/api/project.pjautomaticsaveoptions</a>}
*/
public enum PjAutomaticSaveOptions implements COMEnum {
    
    /**@ Save only the active files. */
    pjAutomaticSaveActiveProjectOnly(1),    
    /**@ Save all the open files. */
    pjAutomaticSaveAllOpenProjectFiles(2);

    private final long value;

    PjAutomaticSaveOptions(long value) {
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
