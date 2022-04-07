package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcetimescaleddata">https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcetimescaleddata</a>}
*/
public enum PjResourceTimescaledData implements COMEnum {
    
    /**@ Actual Cost (resource) field. */
    pjResourceTimescaledActualCost(11),    
    /**@ Actual Overtime Work (resource) field. */
    pjResourceTimescaledActualOvertimeWork(39),    
    /**@ Actual Overtime Work Protected (resource) field. */
    pjResourceTimescaledActualOvertimeWorkProtected(721),    
    /**@ Actual Work (resource) field. */
    pjResourceTimescaledActualWork(14),    
    /**@ Actual Work Protected (resource) field. */
    pjResourceTimescaledActualWorkProtected(720),    
    /**@ ACWP (resource) field. */
    pjResourceTimescaledACWP(53),    
    /**@ Baseline10 Budget Cost (resource) field. */
    pjResourceTimescaledBaseline10BudgetCost(798),    
    /**@ Baseline10 Budget Work (resource) field. */
    pjResourceTimescaledBaseline10BudgetWork(797),    
    /**@ Baseline10 Cost (resource) field. */
    pjResourceTimescaledBaseline10Cost(433),    
    /**@ Baseline10 cumulative work (resource) field. */
    pjResourceTimescaledBaseline10CumulativeWork(835),    
    /**@ Baseline10 remaining cumulative work (resource) field. */
    pjResourceTimescaledBaseline10RemainingCumulativeWork(824),    
    /**@ Baseline10 Work (resource) field. */
    pjResourceTimescaledBaseline10Work(432),    
    /**@ Baseline1 Budget Cost (resource) field. */
    pjResourceTimescaledBaseline1BudgetCost(762),    
    /**@ Baseline1 Budget Work (resource) field. */
    pjResourceTimescaledBaseline1BudgetWork(761),    
    /**@ Baseline1 Cost (resource) field. */
    pjResourceTimescaledBaseline1Cost(343),    
    /**@ Baseline1 cumulative work (resource) field. */
    pjResourceTimescaledBaseline1CumulativeWork(826),    
    /**@ Baseline1 remaining cumulative work (resource) field. */
    pjResourceTimescaledBaseline1RemainingCumulativeWork(815),    
    /**@ Baseline1 Work (resource) field. */
    pjResourceTimescaledBaseline1Work(342),    
    /**@ Baseline2 Budget Cost (resource) field. */
    pjResourceTimescaledBaseline2BudgetCost(766),    
    /**@ Baseline2 Budget Work (resource) field. */
    pjResourceTimescaledBaseline2BudgetWork(765),    
    /**@ Baseline2 Cost (resource) field. */
    pjResourceTimescaledBaseline2Cost(353),    
    /**@ Baseline2 cumulative work (resource) field. */
    pjResourceTimescaledBaseline2CumulativeWork(827),    
    /**@ Baseline2 remaining cumulative work (resource) field. */
    pjResourceTimescaledBaseline2RemainingCumulativeWork(816),    
    /**@ Baseline2 Work (resource) field. */
    pjResourceTimescaledBaseline2Work(352),    
    /**@ Baseline3 Budget Cost (resource) field. */
    pjResourceTimescaledBaseline3BudgetCost(770),    
    /**@ Baseline3 Budget Work (resource) field. */
    pjResourceTimescaledBaseline3BudgetWork(769),    
    /**@ Baseline3 Cost (resource) field. */
    pjResourceTimescaledBaseline3Cost(363),    
    /**@ Baseline3 cumulative work (resource) field. */
    pjResourceTimescaledBaseline3CumulativeWork(828),    
    /**@ Baseline3 remaining cumulative work (resource) field. */
    pjResourceTimescaledBaseline3RemainingCumulativeWork(817),    
    /**@ Baseline3 Work (resource) field. */
    pjResourceTimescaledBaseline3Work(362),    
    /**@ Baseline4 Budget Cost (resource) field. */
    pjResourceTimescaledBaseline4BudgetCost(774),    
    /**@ Baseline4 Budget Work (resource) field. */
    pjResourceTimescaledBaseline4BudgetWork(773),    
    /**@ Baseline4 Cost (resource) field. */
    pjResourceTimescaledBaseline4Cost(373),    
    /**@ Baseline4 cumulative work (resource) field. */
    pjResourceTimescaledBaseline4CumulativeWork(829),    
    /**@ Baseline2 remaining cumulative work (resource) field. */
    pjResourceTimescaledBaseline4RemainingCumulativeWork(818),    
    /**@ Baseline4 Work (resource) field. */
    pjResourceTimescaledBaseline4Work(372),    
    /**@ Baseline5 Budget Cost (resource) field. */
    pjResourceTimescaledBaseline5BudgetCost(778),    
    /**@ Baseline5 Budget Work (resource) field. */
    pjResourceTimescaledBaseline5BudgetWork(777),    
    /**@ Baseline5 Cost (resource) field. */
    pjResourceTimescaledBaseline5Cost(383),    
    /**@ Baseline5 cumulative work (resource) field. */
    pjResourceTimescaledBaseline5CumulativeWork(830),    
    /**@ Baseline5 remaining cumulative work (resource) field. */
    pjResourceTimescaledBaseline5RemainingCumulativeWork(819),    
    /**@ Baseline5 Work (resource) field. */
    pjResourceTimescaledBaseline5Work(382),    
    /**@ Baseline6 Budget Cost (resource) field. */
    pjResourceTimescaledBaseline6BudgetCost(782),    
    /**@ Baseline6 Budget Work(resource) field. */
    pjResourceTimescaledBaseline6BudgetWork(781),    
    /**@ Baseline6 Cost (resource) field. */
    pjResourceTimescaledBaseline6Cost(393),    
    /**@ Baseline6 cumulative work (resource) field. */
    pjResourceTimescaledBaseline6CumulativeWork(831),    
    /**@ Baseline6 remaining cumulative work (resource) field. */
    pjResourceTimescaledBaseline6RemainingCumulativeWork(820),    
    /**@ Baseline6 Work (resource) field. */
    pjResourceTimescaledBaseline6Work(392),    
    /**@ Baseline7 Budget Cost (resource) field. */
    pjResourceTimescaledBaseline7BudgetCost(786),    
    /**@ Baseline7 Budget Work (resource) field. */
    pjResourceTimescaledBaseline7BudgetWork(785),    
    /**@ Baseline7 Cost (resource) field. */
    pjResourceTimescaledBaseline7Cost(403),    
    /**@ Baseline7 cumulative work (resource) field. */
    pjResourceTimescaledBaseline7CumulativeWork(832),    
    /**@ Baseline7 remaining cumulative work (resource) field. */
    pjResourceTimescaledBaseline7RemainingCumulativeWork(821),    
    /**@ Baseline7 Work (resource) field. */
    pjResourceTimescaledBaseline7Work(402),    
    /**@ Baseline8 Budget Cost (resource) field. */
    pjResourceTimescaledBaseline8BudgetCost(790),    
    /**@ Baseline8 Budget Work (resource) field. */
    pjResourceTimescaledBaseline8BudgetWork(789),    
    /**@ Baseline8 Cost (resource) field. */
    pjResourceTimescaledBaseline8Cost(413),    
    /**@ Baseline8 cumulative work (resource) field. */
    pjResourceTimescaledBaseline8CumulativeWork(833),    
    /**@ Baseline8 remaining cumulative work (resource) field. */
    pjResourceTimescaledBaseline8RemainingCumulativeWork(822),    
    /**@ Baseline8 Work (resource) field. */
    pjResourceTimescaledBaseline8Work(412),    
    /**@ Baseline9 Budget Cost (resource) field. */
    pjResourceTimescaledBaseline9BudgetCost(794),    
    /**@ Baseline9 Budget Work (resource) field. */
    pjResourceTimescaledBaseline9BudgetWork(793),    
    /**@ Baseline9 Cost (resource) field. */
    pjResourceTimescaledBaseline9Cost(423),    
    /**@ Baseline9 cumulative work (resource) field. */
    pjResourceTimescaledBaseline9CumulativeWork(834),    
    /**@ Baseline9 remaining cumulative work (resource) field. */
    pjResourceTimescaledBaseline9RemainingCumulativeWork(823),    
    /**@ Baseline9 Work (resource) field. */
    pjResourceTimescaledBaseline9Work(422),    
    /**@ Baseline Budget Cost (resource) field. */
    pjResourceTimescaledBaselineBudgetCost(758),    
    /**@ Baseline Budget Work (resource) field. */
    pjResourceTimescaledBaselineBudgetWork(757),    
    /**@ Baseline Cost (resource) field. */
    pjResourceTimescaledBaselineCost(17),    
    /**@ Baseline cumulative work (resource) field. */
    pjResourceTimescaledBaselineCumulativeWork(825),    
    /**@ Baseline remaining cumulative work (resource) field. */
    pjResourceTimescaledBaselineRemainingCumulativeWork(814),    
    /**@ Baseline Work (resource) field. */
    pjResourceTimescaledBaselineWork(15),    
    /**@ BCWP (resource) field. */
    pjResourceTimescaledBCWP(52),    
    /**@ BCWS (resource) field. */
    pjResourceTimescaledBCWS(51),    
    /**@ Budget Cost (resource) field. */
    pjResourceTimescaledBudgetCost(755),    
    /**@ Budget Work (resource) field. */
    pjResourceTimescaledBudgetWork(754),    
    /**@ Cost (resource) field. */
    pjResourceTimescaledCost(12),    
    /**@ Cumulative actual work (resource) field. */
    pjResourceTimescaledCumulativeActualWork(811),    
    /**@ Cumulative Cost (resource) field. */
    pjResourceTimescaledCumulativeCost(50),    
    /**@ Cumulative Work (resource) field. */
    pjResourceTimescaledCumulativeWork(41),    
    /**@ CV (resource) field. */
    pjResourceTimescaledCV(268),    
    /**@ Overallocation (resource) field. */
    pjResourceTimescaledOverallocation(42),    
    /**@ Overtime Work (resource) field. */
    pjResourceTimescaledOvertimeWork(16),    
    /**@ Peak Units (resource) field. */
    pjResourceTimescaledPeakUnits(26),    
    /**@ Percent Allocation (resource) field. */
    pjResourceTimescaledPercentAllocation(43),    
    /**@ Regular Work (resource) field. */
    pjResourceTimescaledRegularWork(38),    
    /**@ Remaining Availability (resource) field. */
    pjResourceTimescaledRemainingAvailability(44),    
    /**@ Remaining cumulative actual work (resource) field. */
    pjResourceTimescaledRemainingCumulativeActualWork(812),    
    /**@ Remaining cumulative work (resource) field. */
    pjResourceTimescaledRemainingCumulativeWork(813),    
    /**@ SV (resource) field. */
    pjResourceTimescaledSV(54),    
    /**@ Unit Availability (resource) field. */
    pjResourceTimescaledUnitAvailability(4),    
    /**@ Work (resource) field. */
    pjResourceTimescaledWork(13),    
    /**@ Work Availability (resource) field. */
    pjResourceTimescaledWorkAvailability(45);

    private final long value;

    PjResourceTimescaledData(long value) {
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
