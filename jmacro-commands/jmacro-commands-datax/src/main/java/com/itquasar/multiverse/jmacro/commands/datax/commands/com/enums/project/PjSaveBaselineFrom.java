package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjsavebaselinefrom">https://docs.microsoft.com/en-us/office/vba/api/project.pjsavebaselinefrom</a>}
*/
public enum PjSaveBaselineFrom implements COMEnum {
    
    /**@ Baseline start and baseline finish dates. */
    pjCopyBaseline(1),    
    /**@ Baseline1 start and Baseline1 finish dates. */
    pjCopyBaseline1(12),    
    /**@ Baseline10 start and Baseline10 finish dates. */
    pjCopyBaseline10(21),    
    /**@ Baseline2 start and Baseline2 finish dates. */
    pjCopyBaseline2(13),    
    /**@ Baseline3 start and Baseline3 finish dates. */
    pjCopyBaseline3(14),    
    /**@ Baseline4 start and Baseline4 finish dates. */
    pjCopyBaseline4(15),    
    /**@ Baseline5 start and Baseline5 finish dates. */
    pjCopyBaseline5(16),    
    /**@ Baseline6 start and Baseline6 finish dates. */
    pjCopyBaseline6(17),    
    /**@ Baseline7 start and Baseline7 finish dates. */
    pjCopyBaseline7(18),    
    /**@ Baseline8 start and Baseline8 finish dates. */
    pjCopyBaseline8(19),    
    /**@ Baseline9 start and Baseline9 finish dates. */
    pjCopyBaseline9(20),    
    /**@ All scheduling information from the active project. */
    pjCopyCurrent(0),    
    /**@ Dates in the Start1 and Finish1 custom fields. */
    pjCopyStart_Finish1(2),    
    /**@ Dates in the Start10 and Finish10 custom fields. */
    pjCopyStart_Finish10(11),    
    /**@ Dates in the Start2 and Finish2 custom fields. */
    pjCopyStart_Finish2(3),    
    /**@ Dates in the Start3 and Finish3 custom fields. */
    pjCopyStart_Finish3(4),    
    /**@ Dates in the Start4 and Finish4 custom fields. */
    pjCopyStart_Finish4(5),    
    /**@ Dates in the Start5 and Finish5 custom fields. */
    pjCopyStart_Finish5(6),    
    /**@ Dates in the Start6 and Finish6 custom fields. */
    pjCopyStart_Finish6(7),    
    /**@ Dates in the Start7 and Finish7 custom fields. */
    pjCopyStart_Finish7(8),    
    /**@ Dates in the Start8 and Finish8 custom fields. */
    pjCopyStart_Finish8(9),    
    /**@ Dates in the Start9 and Finish9 custom fields. */
    pjCopyStart_Finish9(10);

    private final long value;

    PjSaveBaselineFrom(long value) {
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
