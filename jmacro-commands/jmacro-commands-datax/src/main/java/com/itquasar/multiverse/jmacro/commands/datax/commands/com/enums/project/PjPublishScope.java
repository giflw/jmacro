package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjpublishscope">https://docs.microsoft.com/en-us/office/vba/api/project.pjpublishscope</a>}
*/
public enum PjPublishScope implements COMEnum {
    
    /**@ All. */
    pjPublishScopeAll(1),    
    /**@ Default. */
    pjPublishScopeDefault(0),    
    /**@ Selected. */
    pjPublishScopeSelected(3),    
    /**@ Visible. */
    pjPublishScopeVisible(2);

    private final long value;

    PjPublishScope(long value) {
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
