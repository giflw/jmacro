package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjreportlayouttemplateid">https://docs.microsoft.com/en-us/office/vba/api/project.pjreportlayouttemplateid</a>}
*/
public enum PjReportLayoutTemplateId implements COMEnum {
    
    /**@ Apply a comparison report template. */
    pjReportLayoutComparison(3),    
    /**@ Apply a report template with a title and a chart. */
    pjReportLayoutTitleAndChart(1),    
    /**@ Apply a report template with a title and a table. */
    pjReportLayoutTitleAndTable(2),    
    /**@ Apply a report template with a title only. */
    pjReportLayoutTitleOnly(0);

    private final long value;

    PjReportLayoutTemplateId(long value) {
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
