package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjprojecttype">https://docs.microsoft.com/en-us/office/vba/api/project.pjprojecttype</a>}
*/
public enum PjProjectType implements COMEnum {
    
    /**@ Project type is a basic project site in SharePoint. */
    pjProjectTypeBasicProjectSite(8),    
    /**@ Project type is enterprise checked out. */
    pjProjectTypeEnterpriseCheckedOut(2),    
    /**@ Project type is enterprise global checked out. */
    pjProjectTypeEnterpriseGlobalCheckedOut(4),    
    /**@ Project type is enterprise global in memory. */
    pjProjectTypeEnterpriseGlobalInMemory(5),    
    /**@ Project type is enterprise global local. */
    pjProjectTypeEnterpriseGlobalLocal(6),    
    /**@ Project type is enterprise read-only. */
    pjProjectTypeEnterpriseReadOnly(3),    
    /**@ Project type is enterprise resources checked out. */
    pjProjectTypeEnterpriseResourcesCheckedOut(7),    
    /**@ Project type is not an enterprise project. */
    pjProjectTypeNonEnterprise(1),    
    /**@ Project type is unsaved. */
    pjProjectTypeUnsaved(0);

    private final long value;

    PjProjectType(long value) {
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
