package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjpriority">https://docs.microsoft.com/en-us/office/vba/api/project.pjpriority</a>}
*/
public enum PjPriority implements COMEnum {
    
    /**@ Do not level. */
    pjPriorityDoNotLevel(9),    
    /**@ High priority. */
    pjPriorityHigh(5),    
    /**@ Higher priority. */
    pjPriorityHigher(6),    
    /**@ Highest priority. */
    pjPriorityHighest(8),    
    /**@ Low priority. */
    pjPriorityLow(3),    
    /**@ Lower priority. */
    pjPriorityLower(2),    
    /**@ Lowest priority. */
    pjPriorityLowest(0),    
    /**@ Medium priority. */
    pjPriorityMedium(4),    
    /**@ Very high priority. */
    pjPriorityVeryHigh(7),    
    /**@ Very low priority. */
    pjPriorityVeryLow(1);

    private final long value;

    PjPriority(long value) {
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
