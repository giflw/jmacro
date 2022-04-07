package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjvisualreportstab">https://docs.microsoft.com/en-us/office/vba/api/project.pjvisualreportstab</a>}
*/
public enum PjVisualReportsTab implements COMEnum {
    
    /**@ Show the All tab, which contains all report types. */
    pjTabAll(0),    
    /**@ Show the tab for nontimephased assignment reports (the Assignment Summary tab). */
    pjTabAssignmentNTP(6),    
    /**@ Show the tab for timephased assignment reports (the Assignment Usage tab). */
    pjTabAssignmentTP(3),    
    /**@ Show the tab for nontimephased resource reports (the Resource Summary tab). */
    pjTabResourceNTP(5),    
    /**@ Show the tab for timephased resource reports (the Resource Usage tab). */
    pjTabResourceTP(2),    
    /**@ Show the tab for nontimephased task reports (the Task Summary tab). */
    pjTabTaskNTP(4),    
    /**@ Show the tab for timephased task reports (the Task Usage tab). */
    pjTabTaskTP(1);

    private final long value;

    PjVisualReportsTab(long value) {
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
