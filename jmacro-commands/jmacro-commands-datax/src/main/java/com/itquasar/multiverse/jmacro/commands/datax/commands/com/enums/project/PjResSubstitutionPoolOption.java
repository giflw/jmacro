package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjressubstitutionpooloption">https://docs.microsoft.com/en-us/office/vba/api/project.pjressubstitutionpooloption</a>}
*/
public enum PjResSubstitutionPoolOption implements COMEnum {
    
    /**@ Use resources specified in the list of resources in the EnterpriseResSubstitutionWizard method. */
    pjResSubstitutionResInList(2),    
    /**@ Use resources already specified in the project. */
    pjResSubstitutionResInProject(0),    
    /**@ Use resources in the resource breakdown structure (RBS) level specified in the EnterpriseResSubstitutionWizard method. */
    pjResSubstitutionResInRBS(1);

    private final long value;

    PjResSubstitutionPoolOption(long value) {
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
