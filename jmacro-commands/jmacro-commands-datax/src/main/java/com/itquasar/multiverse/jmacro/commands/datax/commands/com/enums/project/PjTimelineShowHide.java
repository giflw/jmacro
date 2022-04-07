package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtimelineshowhide">https://docs.microsoft.com/en-us/office/vba/api/project.pjtimelineshowhide</a>}
*/
public enum PjTimelineShowHide implements COMEnum {
    
    /**@ Shows or hides the timeline pan and zoom functionality. */
    pjTimelineShowHidePanZoom(1),    
    /**@ Shows or hides task dates on the timeline. */
    pjTimelineShowHideTaskDates(4),    
    /**@ Shows or hides task overlaps on the timeline. */
    pjTimelineShowHideTaskOverlaps(0),    
    /**@ Shows or hides the timeline time scale. */
    pjTimelineShowHideTimescale(2),    
    /**@ Shows or hides the Today mark on the timeline. */
    pjTimelineShowHideToday(3);

    private final long value;

    PjTimelineShowHide(long value) {
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
