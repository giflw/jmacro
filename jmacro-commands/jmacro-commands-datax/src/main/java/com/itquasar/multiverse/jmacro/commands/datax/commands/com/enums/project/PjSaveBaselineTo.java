package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjsavebaselineto">https://docs.microsoft.com/en-us/office/vba/api/project.pjsavebaselineto</a>}
*/
public enum PjSaveBaselineTo implements COMEnum {
    
    /**@ All baseline information in the active project. */
    pjIntoBaseline(0),    
    /**@ Baseline1 start and Baseline1 finish dates. */
    pjIntoBaseline1(11),    
    /**@ Baseline10 start and Baseline10 finish dates. */
    pjIntoBaseline10(20),    
    /**@ Baseline2 start and Baseline2 finish dates. */
    pjIntoBaseline2(12),    
    /**@ Baseline3 start and Baseline3 finish dates. */
    pjIntoBaseline3(13),    
    /**@ Baseline4 start and Baseline4 finish dates. */
    pjIntoBaseline4(14),    
    /**@ Baseline5 start and Baseline5 finish dates. */
    pjIntoBaseline5(15),    
    /**@ Baseline6 start and Baseline6 finish dates. */
    pjIntoBaseline6(16),    
    /**@ Baseline7 start and Baseline7 finish dates. */
    pjIntoBaseline7(17),    
    /**@ Baseline8 start and Baselin8 finish dates. */
    pjIntoBaseline8(18),    
    /**@ Baseline9 start and Baseline9 finish dates. */
    pjIntoBaseline9(19),    
    /**@ Dates in the Start1 and Finish1 custom fields. */
    pjIntoStart_Finish1(1),    
    /**@ Dates in the Start10 and Finish10 custom fields. */
    pjIntoStart_Finish10(10),    
    /**@ Dates in the Start2 and Finish2 custom fields. */
    pjIntoStart_Finish2(2),    
    /**@ Dates in the Start3 and Finish3 custom fields. */
    pjIntoStart_Finish3(3),    
    /**@ Dates in the Start4 and Finish4 custom fields. */
    pjIntoStart_Finish4(4),    
    /**@ Dates in the Start5 and Finish5 custom fields. */
    pjIntoStart_Finish5(5),    
    /**@ Dates in the Start6 and Finish6 custom fields. */
    pjIntoStart_Finish6(6),    
    /**@ Dates in the Start7 and Finish7 custom fields. */
    pjIntoStart_Finish7(7),    
    /**@ Dates in the Start8 and Finish8 custom fields. */
    pjIntoStart_Finish8(8),    
    /**@ Dates in the Start9 and Finish9 custom fields. */
    pjIntoStart_Finish9(9);

    private final long value;

    PjSaveBaselineTo(long value) {
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
