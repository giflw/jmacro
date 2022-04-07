package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcalendardatelabel">https://docs.microsoft.com/en-us/office/vba/api/project.pjcalendardatelabel</a>}
*/
public enum PjCalendarDateLabel implements COMEnum {
    
    /**@ Examples: Mon, Tue. */
    pjCalendarLabelDay_ddd(19),    
    /**@ Examples: Mon 30, Tue 1. */
    pjCalendarLabelDay_ddd_dd(105),    
    /**@ Examples: Mon S 30, Tue O 1. */
    pjCalendarLabelDay_ddd_m_dd(112),    
    /**@ Examples: Mon 9/30, Tue 10/1. */
    pjCalendarLabelDay_ddd_mm_dd(108),    
    /**@ Examples: Mon 9/30/02, Tue 10/1/02. */
    pjCalendarLabelDay_ddd_mm_dd_yy(52),    
    /**@ Examples: Mon Sep 30, Tue Oct 1. */
    pjCalendarLabelDay_ddd_mmm_dd(23),    
    /**@ Examples: Mon Sep 30, '02; Tue Oct 1, '02. */
    pjCalendarLabelDay_ddd_mmm_dd_yyy(22),    
    /**@ Examples: Mon September 30, Tue October 1. */
    pjCalendarLabelDay_ddd_mmmm_dd(111),    
    /**@ Examples: Tuesday, Wednesday. */
    pjCalendarLabelDay_dddd(18),    
    /**@ Examples: Mo, Tu. */
    pjCalendarLabelDay_ddi(119),    
    /**@ Examples: Mo 30, Tu 1. */
    pjCalendarLabelDay_ddi_dd(106),    
    /**@ Examples: Mo S 30, Tu O 1. */
    pjCalendarLabelDay_ddi_m_dd(113),    
    /**@ Examples: Mo 9/30, Tu 10/1. */
    pjCalendarLabelDay_ddi_mm_dd(109),    
    /**@ Examples: M, T. */
    pjCalendarLabelDay_di(20),    
    /**@ Examples: M 30, T 1. */
    pjCalendarLabelDay_di_dd(107),    
    /**@ Examples: M S 30, T O 1. */
    pjCalendarLabelDay_di_m_dd(114),    
    /**@ Examples: M 9/30, T 10/1. */
    pjCalendarLabelDay_di_mm_dd(110),    
    /**@ Examples: M30, T1. */
    pjCalendarLabelDay_didd(121),    
    /**@ Examples: S 30, O 1. */
    pjCalendarLabelDay_m_dd(115),    
    /**@ Examples: 9/30, 10/1. */
    pjCalendarLabelDay_mm_dd(27),    
    /**@ Examples: 9/30/02, 10/1/02. */
    pjCalendarLabelDay_mm_dd_yy(26),    
    /**@ Examples: Sep 30, Oct 1. */
    pjCalendarLabelDay_mmm_dd(25),    
    /**@ Examples: Sep 30, '02; Oct 1, '02. */
    pjCalendarLabelDay_mmm_dd_yyy(24),    
    /**@ Examples: Day 2, Day 1, Day -1, Day -2, from the project end date. */
    pjCalendarLabelDayFromEnd_Day_dd(41),    
    /**@ Examples: 2, 1, -1, -2. */
    pjCalendarLabelDayFromEnd_dd(54),    
    /**@ Examples: D2, D1, D-1, D-2 */
    pjCalendarLabelDayFromEnd_Ddd(53),    
    /**@ Examples: Day -2, Day -1, Day 1, Day 2, from the project start date. */
    pjCalendarLabelDayFromStart_Day_dd(40),    
    /**@ Examples: -2, -1, 1, 2. */
    pjCalendarLabelDayFromStart_dd(56),    
    /**@ Examples: D-2, D-1, D1, D2. */
    pjCalendarLabelDayFromStart_Ddd(55),    
    /**@ Examples: 10, 11, 12 */
    pjCalendarLabelDayOfMonth_dd(21),    
    /**@ Examples: 70, 71, 72. */
    pjCalendarLabelDayOfYear_dd(118),    
    /**@ Examples: 70 '09, 71 '09, 72 '09. */
    pjCalendarLabelDayOfYear_dd_yyy(116),    
    /**@ Examples: 70 2009, 71 2009, 72 2009 */
    pjCalendarLabelDayOfYear_dd_yyyy(117),    
    /**@ No date is displayed. */
    pjNoDateFormat(35),    
    /**@ Overflow indicator. */
    pjOverflowIndicator(122);

    private final long value;

    PjCalendarDateLabel(long value) {
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
