package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjvisualreportstemplatetype">https://docs.microsoft.com/en-us/office/vba/api/project.pjvisualreportstemplatetype</a>}
*/
public enum PjVisualReportsTemplateType implements COMEnum {
    
    /**@ Microsoft Excel report template. */
    pjExcel(1),    
    /**@ Microsoft Visio template with metric units. */
    pjVisioMetric(2),    
    /**@ Microsoft Visio template with U.S. English units. */
    pjVisioUS(3);

    private final long value;

    PjVisualReportsTemplateType(long value) {
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
