package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtimescaleddata">https://docs.microsoft.com/en-us/office/vba/api/project.pjtimescaleddata</a>}
*/
public enum PjTimescaledData implements COMEnum {
    
    /**@ Actual Cost field. */
    pjActualCost(10),    
    /**@ Actual Fixed Cost field. */
    pjActualFixedCost(47),    
    /**@ Actual Overtime Work field. */
    pjActualOvertimeWork(5),    
    /**@ Actual Overtime Work Protected field. */
    pjActualOvertimeWorkProtected(53),    
    /**@ Actual Work field. */
    pjActualWork(4),    
    /**@ Actual Work Protected field. */
    pjActualWorkProtected(52),    
    /**@ ACWP field. */
    pjACWP(15),    
    /**@ All Assignment rows. */
    pjAllAssignmentRows(24),    
    /**@ All Resource rows. */
    pjAllResourceRows(23),    
    /**@ All Task rows. */
    pjAllTaskRows(23),    
    /**@ Baseline10 Budget Cost field. */
    pjBaseline10BudgetCost(77),    
    /**@ Baseline10 Budget Work field. */
    pjBaseline10BudgetWork(76),    
    /**@ Baseline10 Cost field. */
    pjBaseline10Cost(46),    
    /**@ Baseline10 cumulative work. */
    pjBaseline10CumulativeWork(115),    
    /**@ Baseline10 remaining cumulative work. */
    pjBaseline10RemainingCumulativeWork(93),    
    /**@ Baseline10 remaining tasks. */
    pjBaseline10RemainingTasks(104),    
    /**@ Baseline10 Work field. */
    pjBaseline10Work(45),    
    /**@ Baseline1 Budget Cost field. */
    pjBaseline1BudgetCost(59),    
    /**@ Baseline1 Budget Work field. */
    pjBaseline1BudgetWork(58),    
    /**@ Baseline1 Cost field. */
    pjBaseline1Cost(28),    
    /**@ Baseline1 cumulative work. */
    pjBaseline1CumulativeWork(106),    
    /**@ Baseline1 remaining cumulative work. */
    pjBaseline1RemainingCumulativeWork(84),    
    /**@ Baseline1 remaining tasks. */
    pjBaseline1RemainingTasks(95),    
    /**@ Baseline1 Work field. */
    pjBaseline1Work(27),    
    /**@ Baseline2 Budget Cost field. */
    pjBaseline2BudgetCost(61),    
    /**@ Baseline2 Budget Work field. */
    pjBaseline2BudgetWork(60),    
    /**@ Baseline2 Cost field. */
    pjBaseline2Cost(30),    
    /**@ Baseline2 cumulative work. */
    pjBaseline2CumulativeWork(107),    
    /**@ Baseline2 remaining cumulative work. */
    pjBaseline2RemainingCumulativeWork(85),    
    /**@ Baseline2 remaining tasks. */
    pjBaseline2RemainingTasks(96),    
    /**@ Baseline2 Work field. */
    pjBaseline2Work(29),    
    /**@ Baseline3 Budget Cost field. */
    pjBaseline3BudgetCost(63),    
    /**@ Baseline3 Budget Work field. */
    pjBaseline3BudgetWork(62),    
    /**@ Baseline3 Cost field. */
    pjBaseline3Cost(32),    
    /**@ Baseline3 cumulative work. */
    pjBaseline3CumulativeWork(108),    
    /**@ Baseline3 remaining cumulative work. */
    pjBaseline3RemainingCumulativeWork(86),    
    /**@ Baseline3 remaining tasks. */
    pjBaseline3RemainingTasks(97),    
    /**@ Baseline3 Work field. */
    pjBaseline3Work(31),    
    /**@ Baseline4 Budget Cost field. */
    pjBaseline4BudgetCost(65),    
    /**@ Baseline4 Budget Work field. */
    pjBaseline4BudgetWork(64),    
    /**@ Baseline4 Cost field. */
    pjBaseline4Cost(34),    
    /**@ Baseline4 cumulative work. */
    pjBaseline4CumulativeWork(109),    
    /**@ Baseline4 remaining cumulative work. */
    pjBaseline4RemainingCumulativeWork(87),    
    /**@ Baseline4 remaining tasks. */
    pjBaseline4RemainingTasks(98),    
    /**@ Baseline4 Work field. */
    pjBaseline4Work(33),    
    /**@ Baseline5 Budget Cost field. */
    pjBaseline5BudgetCost(67),    
    /**@ Baseline5 Budget Work field. */
    pjBaseline5BudgetWork(66),    
    /**@ Baseline5 Cost field. */
    pjBaseline5Cost(36),    
    /**@ Baseline5 cumulative work. */
    pjBaseline5CumulativeWork(110),    
    /**@ Baseline5 remaining cumulative work. */
    pjBaseline5RemainingCumulativeWork(88),    
    /**@ Baseline5 remaining tasks. */
    pjBaseline5RemainingTasks(99),    
    /**@ Baseline5 Work field. */
    pjBaseline5Work(35),    
    /**@ Baseline6 Budget Cost field. */
    pjBaseline6BudgetCost(69),    
    /**@ Baseline6 Budget Work field. */
    pjBaseline6BudgetWork(68),    
    /**@ Baseline6 Cost field. */
    pjBaseline6Cost(38),    
    /**@ Baseline6 cumulative work. */
    pjBaseline6CumulativeWork(111),    
    /**@ Baseline6 remaining cumulative work. */
    pjBaseline6RemainingCumulativeWork(89),    
    /**@ Baseline6 remaining tasks. */
    pjBaseline6RemainingTasks(100),    
    /**@ Baseline6 Work field. */
    pjBaseline6Work(37),    
    /**@ Baseline7 Budget Cost field. */
    pjBaseline7BudgetCost(71),    
    /**@ Baseline7 Budget Work field. */
    pjBaseline7BudgetWork(70),    
    /**@ Baseline7 Cost field. */
    pjBaseline7Cost(40),    
    /**@ Baseline7 cumulative work. */
    pjBaseline7CumulativeWork(112),    
    /**@ Baseline7 remaining cumulative work. */
    pjBaseline7RemainingCumulativeWork(90),    
    /**@ Baseline7 remaining tasks. */
    pjBaseline7RemainingTasks(101),    
    /**@ Baseline7 Work field. */
    pjBaseline7Work(39),    
    /**@ Baseline8 Budget Cost field. */
    pjBaseline8BudgetCost(73),    
    /**@ Baseline8 Budget Work field. */
    pjBaseline8BudgetWork(72),    
    /**@ Baseline8 Cost field. */
    pjBaseline8Cost(42),    
    /**@ Baseline8 cumulative work. */
    pjBaseline8CumulativeWork(113),    
    /**@ Baseline8 remaining cumulative work. */
    pjBaseline8RemainingCumulativeWork(91),    
    /**@ Baseline8 remaining tasks. */
    pjBaseline8RemainingTasks(102),    
    /**@ Baseline8 Work field. */
    pjBaseline8Work(41),    
    /**@ Baseline9 Budget Cost field. */
    pjBaseline9BudgetCost(75),    
    /**@ Baseline9 Budget Work field. */
    pjBaseline9BudgetWork(74),    
    /**@ Baseline9 Budget Work */
    pjBaseline9Cost(44),    
    /**@ Baseline9 cumulative work. */
    pjBaseline9CumulativeWork(114),    
    /**@ Baseline9 remaining cumulative work. */
    pjBaseline9RemainingCumulativeWork(92),    
    /**@ Baseline9 remaining tasks. */
    pjBaseline9RemainingTasks(103),    
    /**@ Baseline9 Work field. */
    pjBaseline9Work(43),    
    /**@ Baseline Budget Cost field. */
    pjBaselineBudgetCost(57),    
    /**@ Baseline Budget Work field. */
    pjBaselineBudgetWork(56),    
    /**@ Baseline Cost field. */
    pjBaselineCost(11),    
    /**@ Baseline cumulative work. */
    pjBaselineCumulativeWork(105),    
    /**@ Baseline remaining cumulative work. */
    pjBaselineRemainingCumulativeWork(83),    
    /**@ Baseline remaining tasks. */
    pjBaselineRemainingTasks(94),    
    /**@ Baseline Work field. */
    pjBaselineWork(7),    
    /**@ BCWP field. */
    pjBCWP(14),    
    /**@ BCWS field. */
    pjBCWS(13),    
    /**@ Budget Cost field. */
    pjBudgetCost(55),    
    /**@ Budget Work field. */
    pjBudgetWork(54),    
    /**@ Cost field. */
    pjCost(1),    
    /**@ CPI field. */
    pjCPI(48),    
    /**@ Cumulative Percentage Complete field. */
    pjCumPctComplete(22),    
    /**@ Cumulative actual work. */
    pjCumulativeActualWork(78),    
    /**@ Cumulative Cost field. */
    pjCumulativeCost(3),    
    /**@ Cumulative Work field. */
    pjCumulativeWork(2),    
    /**@ CV field. */
    pjCV(17),    
    /**@ CVP field. */
    pjCVP(50),    
    /**@ Fixed Cost field. */
    pjFixedCost(9),    
    /**@ Overallocation field. */
    pjOverallocation(8),    
    /**@ Overtime Work field. */
    pjOvertimeWork(6),    
    /**@ Percentage Complete field. */
    pjPctComplete(21),    
    /**@ Peak Units field. */
    pjPeakUnits(19),    
    /**@ Percentage Allocation field. */
    pjPercentAllocation(18),    
    /**@ Regular Work field. */
    pjRegularWork(12),    
    /**@ Remaining actual tasks. */
    pjRemainingActualTasks(82),    
    /**@ Remaining Availability field. */
    pjRemainingAvailability(20),    
    /**@ Remaining Cost field. */
    pjRemainingCost(78),    
    /**@ Remaining cumulative actual work. */
    pjRemainingCumulativeActualWork(79),    
    /**@ Remaining cumulative work. */
    pjRemainingCumulativeWork(80),    
    /**@ Remaining tasks. */
    pjRemainingTasks(81),    
    /**@ SPI field. */
    pjSPI(49),    
    /**@ SV field. */
    pjSV(16),    
    /**@ SVP field. */
    pjSVP(51),    
    /**@ Unit Availability field. */
    pjUnitAvailability(25),    
    /**@ Work field. */
    pjWork(0),    
    /**@ Work Availability field. */
    pjWorkAvailability(26);

    private final long value;

    PjTimescaledData(long value) {
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
