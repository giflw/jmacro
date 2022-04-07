package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjassignmenttimescaleddata">https://docs.microsoft.com/en-us/office/vba/api/project.pjassignmenttimescaleddata</a>}
*/
public enum PjAssignmentTimescaledData implements COMEnum {
    
    /**@ Represents the Actual Cost (Assignment) field. */
    pjAssignmentTimescaledActualCost(28),    
    /**@ Represents the Actual Overtime Work (Assignment) field. */
    pjAssignmentTimescaledActualOvertimeWork(13),    
    /**@ Represents the Actual Overtime Work Protected (Assignment) field. */
    pjAssignmentTimescaledActualOvertimeWorkProtected(631),    
    /**@ Represents the Actual Work (Assignment) field. */
    pjAssignmentTimescaledActualWork(10),    
    /**@ Represents the Actual Work Protected (Assignment) field. */
    pjAssignmentTimescaledActualWorkProtected(630),    
    /**@ Represents the ACWP (Assignment) field. */
    pjAssignmentTimescaledACWP(36),    
    /**@ Represents the Baseline10 Budget Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline10BudgetCost(714),    
    /**@ Represents the Baseline10 Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaseline10BudgetWork(713),    
    /**@ Represents the Baseline10 Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline10Cost(371),    
    /**@ Represents the Baseline10 Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline10CumulativeWork(762),    
    /**@ Represents the Baseline10 Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline10RemainingCumulativeWork(740),    
    /**@ Represents the Baseline10 Work (Assignment) field. */
    pjAssignmentTimescaledBaseline10Work(370),    
    /**@ Represents the Baseline1 Budget Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline1BudgetCost(678),    
    /**@ Represents the Baseline1 Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaseline1BudgetWork(677),    
    /**@ Represents the Baseline1 Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline1Cost(290),    
    /**@ Represents the Baseline1 Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline1CumulativeWork(753),    
    /**@ Represents the Baseline1 Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline1RemainingCumulativeWork(731),    
    /**@ Represents the Baseline1 Work (Assignment) field. */
    pjAssignmentTimescaledBaseline1Work(289),    
    /**@ Represents the Baseline2 Budget Cost (Assignment) field.. */
    pjAssignmentTimescaledBaseline2BudgetCost(682),    
    /**@ Represents the Baseline2 Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaseline2BudgetWork(681),    
    /**@ Represents the Baseline2 Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline2Cost(299),    
    /**@ Represents the Baseline2 Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline2CumulativeWork(754),    
    /**@ Represents the Baseline2 Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline2RemainingCumulativeWork(732),    
    /**@ Represents the Baseline2 Work (Assignment) field. */
    pjAssignmentTimescaledBaseline2Work(298),    
    /**@ Represents the Baseline3 Budget Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline3BudgetCost(686),    
    /**@ Represents the Baseline3 Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaseline3BudgetWork(685),    
    /**@ Represents the Baseline3 Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline3Cost(308),    
    /**@ Represents the Baseline3 Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline3CumulativeWork(755),    
    /**@ Represents the Baseline3 Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline3RemainingCumulativeWork(733),    
    /**@ Represents the Baseline3 Work (Assignment) field. */
    pjAssignmentTimescaledBaseline3Work(307),    
    /**@ Represents the Baseline4 Budget Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline4BudgetCost(690),    
    /**@ Represents the Baseline4 Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaseline4BudgetWork(689),    
    /**@ Represents the Baseline4 Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline4Cost(317),    
    /**@ Represents the Baseline4 Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline4CumulativeWork(756),    
    /**@ Represents the Baseline4 Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline4RemainingCumulativeWork(734),    
    /**@ Represents the Baseline4 Work (Assignment) field. */
    pjAssignmentTimescaledBaseline4Work(316),    
    /**@ Represents the Baseline5 Budget Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline5BudgetCost(694),    
    /**@ Represents the Baseline5 Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaseline5BudgetWork(693),    
    /**@ Represents the Baseline5 Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline5Cost(326),    
    /**@ Represents the Baseline5 Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline5CumulativeWork(757),    
    /**@ Represents the Baseline5 Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline5RemainingCumulativeWork(735),    
    /**@ Represents the Baseline5 Work (Assignment) field. */
    pjAssignmentTimescaledBaseline5Work(325),    
    /**@ Represents the Baseline6 Budget Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline6BudgetCost(698),    
    /**@ Represents the Baseline6 Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaseline6BudgetWork(697),    
    /**@ Represents the Baseline6 Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline6Cost(335),    
    /**@ Represents the Baseline6 Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline6CumulativeWork(758),    
    /**@ Represents the Baseline6 Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline6RemainingCumulativeWork(736),    
    /**@ Represents the Baseline6 Work (Assignment) field. */
    pjAssignmentTimescaledBaseline6Work(334),    
    /**@ Represents the Baseline7 Budget Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline7BudgetCost(702),    
    /**@ Represents the Baseline7 Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaseline7BudgetWork(701),    
    /**@ Represents the Baseline7 Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline7Cost(344),    
    /**@ Represents the Baseline7 Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline7CumulativeWork(759),    
    /**@ Represents the Baseline7 Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline7RemainingCumulativeWork(737),    
    /**@ Represents the Baseline7 Work (Assignment) field. */
    pjAssignmentTimescaledBaseline7Work(343),    
    /**@ Represents the Baseline8 Budget Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline8BudgetCost(706),    
    /**@ Represents the Baseline8 Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaseline8BudgetWork(705),    
    /**@ Represents the Baseline8 Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline8Cost(353),    
    /**@ Represents the Baseline8 Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline8CumulativeWork(760),    
    /**@ Represents the Baseline8 Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline8RemainingCumulativeWork(738),    
    /**@ Represents the Baseline8 Work (Assignment) field. */
    pjAssignmentTimescaledBaseline8Work(352),    
    /**@ Represents the Baseline9 Budget Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline9BudgetCost(710),    
    /**@ Represents the Baseline9 Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaseline9BudgetWork(709),    
    /**@ Represents the Baseline9 Cost (Assignment) field. */
    pjAssignmentTimescaledBaseline9Cost(362),    
    /**@ Represents the Baseline9 Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline9CumulativeWork(761),    
    /**@ Represents the Baseline9 Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaseline9RemainingCumulativeWork(739),    
    /**@ Represents the Baseline9 Work (Assignment) field. */
    pjAssignmentTimescaledBaseline9Work(361),    
    /**@ Represents the Baseline Budget Cost Budget (Assignment) field. */
    pjAssignmentTimescaledBaselineBudgetCost(674),    
    /**@ Represents the Baseline Budget Work (Assignment) field. */
    pjAssignmentTimescaledBaselineBudgetWork(673),    
    /**@ Represents the Baseline Cost (Assignment) field. */
    pjAssignmentTimescaledBaselineCost(32),    
    /**@ Represents the Baseline Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaselineCumulativeWork(752),    
    /**@ Represents the Baseline Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledBaselineRemainingCumulativeWork(730),    
    /**@ Represents the Baseline Work (Assignment) field. */
    pjAssignmentTimescaledBaselineWork(16),    
    /**@ Represents the BCWP (Assignment) field. */
    pjAssignmentTimescaledBCWP(35),    
    /**@ Represents the BCWS (Assignment) field. */
    pjAssignmentTimescaledBCWS(34),    
    /**@ Represents the Budget Cost (Assignment) field. */
    pjAssignmentTimescaledBudgetCost(670),    
    /**@ Represents the Budget Work (Assignment) field. */
    pjAssignmentTimescaledBudgetWork(669),    
    /**@ Represents the Cost (Assignment) field. */
    pjAssignmentTimescaledCost(26),    
    /**@ Represents the Cumulative Actual Work (Assignment) field. */
    pjAssignmentTimescaledCumulativeActualWork(727),    
    /**@ Represents the Cumulative Cost (Assignment) field */
    pjAssignmentTimescaledCumulativeCost(33),    
    /**@ Represents the Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledCumulativeWork(15),    
    /**@ Represents the CV (Assignment) field. */
    pjAssignmentTimescaledCV(247),    
    /**@ Represents the Overallocation (Assignment) field. */
    pjAssignmentTimescaledOverallocation(17),    
    /**@ Represents the Overtime Work (Assignment) field. */
    pjAssignmentTimescaledOvertimeWork(9),    
    /**@ Represents the Peak Units (Assignment) field. */
    pjAssignmentTimescaledPeakUnits(19),    
    /**@ Represents the Percent Allocation (Assignment) field. */
    pjAssignmentTimescaledPercentAllocation(18),    
    /**@ Represents the Regular Work (Assignment) field. */
    pjAssignmentTimescaledRegularWork(11),    
    /**@ Represents the Remaining Cumulative Actual Work (Assignment) field. */
    pjAssignmentTimescaledRemainingCumulativeActualWork(728),    
    /**@ Represents the Remaining Cumulative Work (Assignment) field. */
    pjAssignmentTimescaledRemainingCumulativeWork(729),    
    /**@ Represents the SV (Assignment) field. */
    pjAssignmentTimescaledSV(37),    
    /**@ Represents the Work (Assignment) field. */
    pjAssignmentTimescaledWork(8);

    private final long value;

    PjAssignmentTimescaledData(long value) {
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
