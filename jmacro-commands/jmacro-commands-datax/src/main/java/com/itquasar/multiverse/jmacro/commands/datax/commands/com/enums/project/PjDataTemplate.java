package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjdatatemplate">https://docs.microsoft.com/en-us/office/vba/api/project.pjdatatemplate</a>}
*/
public enum PjDataTemplate implements COMEnum {
    
    /**@ Copy the template. */
    pjDataTemplateCopy(1),    
    /**@ Delete the template. */
    pjDataTemplateDelete(3),    
    /**@ Create the template. */
    pjDataTemplateNew(0),    
    /**@ Rename the template. */
    pjDataTemplateRename(2);

    private final long value;

    PjDataTemplate(long value) {
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
