package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjgridline">https://docs.microsoft.com/en-us/office/vba/api/project.pjgridline</a>}
*/
public enum PjGridline implements COMEnum {
    
    /**@ Bar rows. */
    pjBarRows(1),    
    /**@ Calendar days. */
    pjCalendarDays(0),    
    /**@ Calendar title horizontal. */
    pjCalendarTitleHorizontal(3),    
    /**@ Calendar title vertical. */
    pjCalendarTitleVertical(2),    
    /**@ Calendar weeks. */
    pjCalendarWeeks(1),    
    /**@ Date box bottom. */
    pjDateBoxBottom(5),    
    /**@ Date box top. */
    pjDateBoxTop(4),    
    /**@ Gantt current date. */
    pjGanttCurrentDate(4),    
    /**@ Gantt page breaks. */
    pjGanttPageBreaks(9),    
    /**@ Gantt project finish. */
    pjGanttProjectFinish(11),    
    /**@ Gantt project start. */
    pjGanttProjectStart(10),    
    /**@ Gantt project start. */
    pjGanttRows(0),    
    /**@ Gantt sheet columns. */
    pjGanttSheetColumns(6),    
    /**@ Gantt sheet rows. */
    pjGanttSheetRows(5),    
    /**@ Gantt status date. */
    pjGanttStatusDate(12),    
    /**@ Gantt title horizontal. */
    pjGanttTitleHorizontal(8),    
    /**@ Gantt title vertical. */
    pjGanttTitleVertical(7),    
    /**@ Graph current date. */
    pjGraphCurrentDate(3),    
    /**@ Graph project finish. */
    pjGraphProjectFinish(7),    
    /**@ Graph project start. */
    pjGraphProjectStart(6),    
    /**@ Graph status date. */
    pjGraphStatusDate(8),    
    /**@ Graph title horizontal. */
    pjGraphTitleHorizontal(5),    
    /**@ Graph title vertical. */
    pjGraphTitleVertical(4),    
    /**@ Horizontal. */
    pjHorizontal(2),    
    /**@ Major columns. */
    pjMajorColumns(2),    
    /**@ Major vertical */
    pjMajorVertical(0),    
    /**@ Minor columns. */
    pjMinorColumns(3),    
    /**@ Minor vertical. */
    pjMinorVertical(1),    
    /**@ Sheet columns. */
    pjSheetColumns(1),    
    /**@ Sheet page breaks. */
    pjSheetPageBreaks(4),    
    /**@ Sheet rows. */
    pjSheetRows(0),    
    /**@ Sheet title horizontal. */
    pjSheetTitleHorizontal(3),    
    /**@ Sheet title vertical. */
    pjSheetTitleVertical(2),    
    /**@ Usage columns. */
    pjUsageColumns(4),    
    /**@ Usage page breaks. */
    pjUsagePageBreaks(6),    
    /**@ Usage rows. */
    pjUsageRows(5),    
    /**@ Usage sheet columns. */
    pjUsageSheetColumns(1),    
    /**@ Usage sheet rows. */
    pjUsageSheetRows(0),    
    /**@ Usage title horizontal. */
    pjUsageTitleHorizontal(3),    
    /**@ Usage title vertical. */
    pjUsageTitleVertical(2);

    private final long value;

    PjGridline(long value) {
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
