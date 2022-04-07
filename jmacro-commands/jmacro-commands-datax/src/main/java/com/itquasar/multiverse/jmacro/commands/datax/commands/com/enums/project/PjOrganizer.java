package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjorganizer">https://docs.microsoft.com/en-us/office/vba/api/project.pjorganizer</a>}
*/
public enum PjOrganizer implements COMEnum {
    
    /**@ Calendars. */
    pjCalendars(5),    
    /**@ Drawings */
    pjDrawings(11),    
    /**@ Fields. */
    pjFields(9),    
    /**@ Filters. */
    pjFilters(2),    
    /**@ Forms. */
    pjForms(8),    
    /**@ Groups. */
    pjGroups(10),    
    /**@ Maps. */
    pjMaps(7),    
    /**@ Modules. */
    pjModules(3),    
    /**@ Reports. */
    pjReports(4),    
    /**@ Tables. */
    pjTables(1),    
    /**@ Toolbars. */
    pjToolbars(6),    
    /**@ Views. */
    pjViews(0);

    private final long value;

    PjOrganizer(long value) {
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
