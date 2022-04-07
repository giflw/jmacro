package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjweeklabel">https://docs.microsoft.com/en-us/office/vba/api/project.pjweeklabel</a>}
*/
public enum PjWeekLabel implements COMEnum {
    
    /**@ No date is displayed. */
    pjWeekLabelNoDateFormat(35),    
    /**@ Examples: Mon 30, Tue 1 */
    pjWeekLabelWeek_ddd_dd(88),    
    /**@ Examples: Mon S 30, Tue O 1 */
    pjWeekLabelWeek_ddd_m_dd(97),    
    /**@ Examples: Mon 9/30, Tue 10/1 */
    pjWeekLabelWeek_ddd_mm_dd(90),    
    /**@ Examples: Mon 9/30/10, Tue 10/1/10 */
    pjWeekLabelWeek_ddd_mm_dd_yy(100),    
    /**@ Examples: Mon Sep 30, Tue Oct 1 */
    pjWeekLabelWeek_ddd_mmm_dd(93),    
    /**@ Examples: Mon Sep 30 '10, Tue Oct 1 '10 */
    pjWeekLabelWeek_ddd_mmm_dd_yyy(101),    
    /**@ Examples: Mon September 30, Tue October 1 */
    pjWeekLabelWeek_ddd_mmmm_dd(96),    
    /**@ Examples: Mon September 30 '10, Tue October 1 '10 */
    pjWeekLabelWeek_ddd_mmmm_dd_yyy(102),    
    /**@ Examples: Sun 9, Sun 10, Sun 11 */
    pjWeekLabelWeek_ddd_ww(103),    
    /**@ Examples: Mo S 30, Tu O 1 */
    pjWeekLabelWeek_ddi_m_dd(98),    
    /**@ Examples: Mo 9/30, Tu 10/1 */
    pjWeekLabelWeek_ddi_mm_dd(91),    
    /**@ Examples: Mo Sep 30, Tu 1Oct 1 */
    pjWeekLabelWeek_ddi_mmm_dd(94),    
    /**@ Examples: M S 30, T O 1 */
    pjWeekLabelWeek_di_m_dd(99),    
    /**@ Examples: M 9/30, T 10/1 */
    pjWeekLabelWeek_di_mm_dd(92),    
    /**@ Examples: M Sep 30, T Oct 1 */
    pjWeekLabelWeek_di_mmm_dd(95),    
    /**@ Examples: S 30, O 1. */
    pjWeekLabelWeek_m_dd(89),    
    /**@ Examples: 9/30, 10/1 */
    pjWeekLabelWeek_mm_dd(17),    
    /**@ Examples: 9/30/10, 10/10/10 */
    pjWeekLabelWeek_mm_dd_yy(16),    
    /**@ Examples: Sep 30, Oct 1. */
    pjWeekLabelWeek_mmm_dd(15),    
    /**@ Examples: Sept 30 '10, Oct 1 '10 */
    pjWeekLabelWeek_mmm_dd_yyy(13),    
    /**@ Examples: September 30, October 1. */
    pjWeekLabelWeek_mmmm_dd(14),    
    /**@ Examples: September 30 2010, October 1 2010 */
    pjWeekLabelWeek_mmmm_dd_yyyy(12),    
    /**@ Examples: 29, 5, 12 */
    pjWeekLabelWeekDayOfMonth_dd(87),    
    /**@ Examples: Week 3, Week 2, Week 1, Week -1, Week -2 */
    pjWeekLabelWeekFromEnd_Week_ww(43),    
    /**@ Examples: 3, 2, 1, -1, -2 */
    pjWeekLabelWeekFromEnd_ww(68),    
    /**@ Examples: W3, W2, W1, W-1, W-2 */
    pjWeekLabelWeekFromEnd_Www(67),    
    /**@ Examples: Week -2, Week -1, Week 1, Week 2, Week 3 */
    pjWeekLabelWeekFromStart_Week_ww(42),    
    /**@ Examples: -2, -1, 1, 2, 3 */
    pjWeekLabelWeekFromStart_ww(70),    
    /**@ Examples: W-2, W-1, W1, W2, W3 */
    pjWeekLabelWeekFromStart_Www(69),    
    /**@ Examples: 1 11, 1 12, 1 13, 1 14, where 1 is the first day of the week. */
    pjWeekLabelWeekNumber_dd_ww(104),    
    /**@ Examples: 11, 12, 13, 14 */
    pjWeekLabelWeekNumber_ww(50);

    private final long value;

    PjWeekLabel(long value) {
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
