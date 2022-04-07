package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjmonthlabel">https://docs.microsoft.com/en-us/office/vba/api/project.pjmonthlabel</a>}
*/
public enum PjMonthLabel implements COMEnum {
    
    /**@ Examples: S, O, N, D */
    pjMonthLabelMonth_m(11),    
    /**@ Examples: 9, 10 */
    pjMonthLabelMonth_mm(57),    
    /**@ Examples: 9/10, 10/10 */
    pjMonthLabelMonth_mm_yy(86),    
    /**@ Examples: 9 '10, 10 '10 */
    pjMonthLabelMonth_mm_yyy(85),    
    /**@ Examples: Sep, Oct */
    pjMonthLabelMonth_mmm(10),    
    /**@ Examples: Sep '10, Oct '10 */
    pjMonthLabelMonth_mmm_yyy(8),    
    /**@ Examples: September, October */
    pjMonthLabelMonth_mmmm(9),    
    /**@ Examples: September 2010, October 2010 */
    pjMonthLabelMonth_mmmm_yyyy(7),    
    /**@ Examples: 5, 4 (months from end date of project) */
    pjMonthLabelMonthFromEnd_mm(59),    
    /**@ Examples: M5, M4 (months from end date of project) */
    pjMonthLabelMonthFromEnd_Mmm(58),    
    /**@ Examples: Month5, Month4 (months from end date of project) */
    pjMonthLabelMonthFromEnd_Month_mm(45),    
    /**@ Examples: 1, 2 (months from start date of project) */
    pjMonthLabelMonthFromStart_mm(61),    
    /**@ Examples: M1, M2 (months from start date of project) */
    pjMonthLabelMonthFromStart_Mmm(60),    
    /**@ Examples: Month1, Month2 (months from start date of project) */
    pjMonthLabelMonthFromStart_Month_mm(44),    
    /**@ No date is displayed. */
    pjMonthLabelNoDateFormat(35);

    private final long value;

    PjMonthLabel(long value) {
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
