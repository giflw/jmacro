package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtasktimescaleddata">https://docs.microsoft.com/en-us/office/vba/api/project.pjtasktimescaleddata</a>}
*/
public enum PjTaskTimescaledData implements COMEnum {
    
    /**@ Actual Cost (task) field. */
    pjTaskTimescaledActualCost(7),    
    /**@ Actual Fixed Cost (task) field. */
    pjTaskTimescaledActualFixedCost(171),    
    /**@ Actual Overtime Work (task) field. */
    pjTaskTimescaledActualOvertimeWork(164),    
    /**@ Actual Overtime Work Protected field. */
    pjTaskTimescaledActualOvertimeWorkProtected(1140),    
    /**@ Actual Work (task) field. */
    pjTaskTimescaledActualWork(2),    
    /**@ Actual Work Protected (task) field. */
    pjTaskTimescaledActualWorkProtected(1139),    
    /**@ Actual cost of work performed (task) field. */
    pjTaskTimescaledACWP(120),    
    /**@ Baseline10 Budget Cost (task) field. */
    pjTaskTimescaledBaseline10BudgetCost(1248),    
    /**@ Baseline10 Budget Work (task) field. */
    pjTaskTimescaledBaseline10BudgetWork(1247),    
    /**@ Baseline10 Cost (task) field. */
    pjTaskTimescaledBaseline10Cost(590),    
    /**@ Baseline10 cumulative work (task) field. */
    pjTaskTimescaledBaseline10CumulativeWork(1378),    
    /**@ Baseline10 remaining cumulative work (task) field. */
    pjTaskTimescaledBaseline10RemainingCumulativeWork(1356),    
    /**@ Baseline10 remaining tasks (task) field. */
    pjTaskTimescaledBaseline10RemainingTasks(1367),    
    /**@ Baseline10 Work (task) field. */
    pjTaskTimescaledBaseline10Work(591),    
    /**@ Baseline1 Budget Cost (task) field. */
    pjTaskTimescaledBaseline1BudgetCost(1185),    
    /**@ Baseline1 Budget Work (task) field. */
    pjTaskTimescaledBaseline1BudgetWork(1184),    
    /**@ Baseline1 Cost (task) field. */
    pjTaskTimescaledBaseline1Cost(484),    
    /**@ Baseline1 cumulative work (task) field. */
    pjTaskTimescaledBaseline1CumulativeWork(1369),    
    /**@ Baseline1 remaining cumulative work (task) field. */
    pjTaskTimescaledBaseline1RemainingCumulativeWork(1347),    
    /**@ Baseline1 remaining tasks (task) field. */
    pjTaskTimescaledBaseline1RemainingTasks(1358),    
    /**@ Baseline1 Work (task) field. */
    pjTaskTimescaledBaseline1Work(485),    
    /**@ Baseline2 Budget Cost (task) field. */
    pjTaskTimescaledBaseline2BudgetCost(1192),    
    /**@ Baseline2 Budget Work (task) field. */
    pjTaskTimescaledBaseline2BudgetWork(1191),    
    /**@ Baseline2 Cost (task) field. */
    pjTaskTimescaledBaseline2Cost(495),    
    /**@ Baseline2 cumulative work (task) field. */
    pjTaskTimescaledBaseline2CumulativeWork(1370),    
    /**@ Baseline2 remaining cumulative work (task) field. */
    pjTaskTimescaledBaseline2RemainingCumulativeWork(1348),    
    /**@ Baseline2 remaining tasks (task) field. */
    pjTaskTimescaledBaseline2RemainingTasks(1359),    
    /**@ Baseline2 Work (task) field. */
    pjTaskTimescaledBaseline2Work(496),    
    /**@ Baseline3 Budget Cost (task) field. */
    pjTaskTimescaledBaseline3BudgetCost(1199),    
    /**@ Baseline3 Budget Work (task) field. */
    pjTaskTimescaledBaseline3BudgetWork(1198),    
    /**@ Baseline3 Cost (task) field. */
    pjTaskTimescaledBaseline3Cost(506),    
    /**@ Baseline3 cumulative work (task) field. */
    pjTaskTimescaledBaseline3CumulativeWork(1371),    
    /**@ Baseline3 remaining cumulative work (task) field. */
    pjTaskTimescaledBaseline3RemainingCumulativeWork(1349),    
    /**@ Baseline3 remaining tasks (task) field. */
    pjTaskTimescaledBaseline3RemainingTasks(1360),    
    /**@ dBaseline3 Work (task) field. */
    pjTaskTimescaledBaseline3Work(507),    
    /**@ Baseline4 Budget Cost (task) field. */
    pjTaskTimescaledBaseline4BudgetCost(1206),    
    /**@ Baseline4 Budget Work (task) field. */
    pjTaskTimescaledBaseline4BudgetWork(1205),    
    /**@ Baseline4 Cost (task) field. */
    pjTaskTimescaledBaseline4Cost(517),    
    /**@ Baseline4 cumulative work (task) field. */
    pjTaskTimescaledBaseline4CumulativeWork(1372),    
    /**@ Baseline2 remaining cumulative work (task) field. */
    pjTaskTimescaledBaseline4RemainingCumulativeWork(1350),    
    /**@ Baseline4 remaining tasks (task) field. */
    pjTaskTimescaledBaseline4RemainingTasks(1361),    
    /**@ Baseline4 Work (task) field. */
    pjTaskTimescaledBaseline4Work(518),    
    /**@ Baseline5 Budget Cost (task) field. */
    pjTaskTimescaledBaseline5BudgetCost(1213),    
    /**@ Baseline5 Budget Work (task) field. */
    pjTaskTimescaledBaseline5BudgetWork(1212),    
    /**@ Baseline5 Cost (task) field. */
    pjTaskTimescaledBaseline5Cost(528),    
    /**@ Baseline5 cumulative work (task) field. */
    pjTaskTimescaledBaseline5CumulativeWork(1373),    
    /**@ Baseline5 remaining cumulative work (task) field. */
    pjTaskTimescaledBaseline5RemainingCumulativeWork(1351),    
    /**@ Baseline5 remaining tasks (task) field. */
    pjTaskTimescaledBaseline5RemainingTasks(1362),    
    /**@ Baseline5 Work (task) field. */
    pjTaskTimescaledBaseline5Work(529),    
    /**@ Baseline6 Budget Cost (task) field. */
    pjTaskTimescaledBaseline6BudgetCost(1220),    
    /**@ Baseline6 Budget Work (task) field. */
    pjTaskTimescaledBaseline6BudgetWork(1219),    
    /**@ Baseline6 Cost (task) field. */
    pjTaskTimescaledBaseline6Cost(546),    
    /**@ Baseline6 cumulative work (task) field. */
    pjTaskTimescaledBaseline6CumulativeWork(1374),    
    /**@ Baseline6 remaining cumulative work (task) field. */
    pjTaskTimescaledBaseline6RemainingCumulativeWork(1352),    
    /**@ Baseline6 remaining tasks (task) field. */
    pjTaskTimescaledBaseline6RemainingTasks(1363),    
    /**@ Baseline6 Work (task) field. */
    pjTaskTimescaledBaseline6Work(547),    
    /**@ Baseline7 Budget Cost (task) field. */
    pjTaskTimescaledBaseline7BudgetCost(1227),    
    /**@ Baseline7 Budget Work (task) field. */
    pjTaskTimescaledBaseline7BudgetWork(1226),    
    /**@ Baseline7 Cost (task) field. */
    pjTaskTimescaledBaseline7Cost(557),    
    /**@ Baseline7 cumulative work (task) field. */
    pjTaskTimescaledBaseline7CumulativeWork(1375),    
    /**@ Baseline7 remaining cumulative work (task) field. */
    pjTaskTimescaledBaseline7RemainingCumulativeWork(1353),    
    /**@ Baseline7 remaining tasks (task) field. */
    pjTaskTimescaledBaseline7RemainingTasks(1364),    
    /**@ Baseline7 Work (task) field. */
    pjTaskTimescaledBaseline7Work(558),    
    /**@ Baseline8 Budget Cost (task) field. */
    pjTaskTimescaledBaseline8BudgetCost(1234),    
    /**@ Baseline8 Budget Work (task) field. */
    pjTaskTimescaledBaseline8BudgetWork(1233),    
    /**@ Baseline8 Cost (task) field. */
    pjTaskTimescaledBaseline8Cost(568),    
    /**@ Baseline8 cumulative work (task) field. */
    pjTaskTimescaledBaseline8CumulativeWork(1376),    
    /**@ Baseline8 remaining cumulative work (task) field. */
    pjTaskTimescaledBaseline8RemainingCumulativeWork(1354),    
    /**@ Baseline8 remaining tasks (task) field. */
    pjTaskTimescaledBaseline8RemainingTasks(1365),    
    /**@ Baseline8 Work (task) field. */
    pjTaskTimescaledBaseline8Work(569),    
    /**@ Baseline9 Budget Cost (task) field. */
    pjTaskTimescaledBaseline9BudgetCost(1241),    
    /**@ Baseline9 Budget Work (task) field. */
    pjTaskTimescaledBaseline9BudgetWork(1240),    
    /**@ Baseline9 Cost (task) field. */
    pjTaskTimescaledBaseline9Cost(579),    
    /**@ Baseline9 cumulative work (task) field. */
    pjTaskTimescaledBaseline9CumulativeWork(1377),    
    /**@ Baseline9 remaining cumulative work (task) field. */
    pjTaskTimescaledBaseline9RemainingCumulativeWork(1355),    
    /**@ Baseline9 remaining tasks (task) field. */
    pjTaskTimescaledBaseline9RemainingTasks(1366),    
    /**@ Baseline9 Work (task) field. */
    pjTaskTimescaledBaseline9Work(580),    
    /**@ Baseline Budget Cost (task) field. */
    pjTaskTimescaledBaselineBudgetCost(1178),    
    /**@ Baseline Budget Work (task) field. */
    pjTaskTimescaledBaselineBudgetWork(1177),    
    /**@ Baseline Cost (task) field. */
    pjTaskTimescaledBaselineCost(6),    
    /**@ Baseline cumulative work (task) field. */
    pjTaskTimescaledBaselineCumulativeWork(1368),    
    /**@ Baseline remaining cumulative work (task) field. */
    pjTaskTimescaledBaselineRemainingCumulativeWork(1346),    
    /**@ Baseline remaining tasks (task) field. */
    pjTaskTimescaledBaselineRemainingTasks(1357),    
    /**@ Baseline Work (task) field. */
    pjTaskTimescaledBaselineWork(1),    
    /**@ BCWP (task) field. */
    pjTaskTimescaledBCWP(11),    
    /**@ BCWS (task) field. */
    pjTaskTimescaledBCWS(12),    
    /**@ Budget Cost (task) field. */
    pjTaskTimescaledBudgetCost(1173),    
    /**@ Budget Work (task) field. */
    pjTaskTimescaledBudgetWork(1172),    
    /**@ Cost (task) field. */
    pjTaskTimescaledCost(5),    
    /**@ CPI (task) field. */
    pjTaskTimescaledCPI(537),    
    /**@ Cumulative actual work (task) field. */
    pjTaskTimescaledCumulativeActualWork(1341),    
    /**@ Cumulative Cost (task) field. */
    pjTaskTimescaledCumulativeCost(177),    
    /**@ Cumulative Percent Complete (task) field. */
    pjTaskTimescaledCumulativePercentComplete(240),    
    /**@ Cumulative Work (task) field. */
    pjTaskTimescaledCumulativeWork(176),    
    /**@ CV (task) field. */
    pjTaskTimescaledCV(83),    
    /**@ CVP (task) field. */
    pjTaskTimescaledCVP(539),    
    /**@ Fixed Cost (task) field. */
    pjTaskTimescaledFixedCost(8),    
    /**@ Overallocation (task) field. */
    pjTaskTimescaledOverallocation(167),    
    /**@ Overtime Work (task) field. */
    pjTaskTimescaledOvertimeWork(163),    
    /**@ Percent Complete (task) field. */
    pjTaskTimescaledPercentComplete(32),    
    /**@ Regular Work (task) field. */
    pjTaskTimescaledRegularWork(166),    
    /**@ Remaining actual tasks (task) field. */
    pjTaskTimescaledRemainingActualTasks(1345),    
    /**@ Remaining cumulative actual work (task) field. */
    pjTaskTimescaledRemainingCumulativeActualWork(1342),    
    /**@ Remaining cumulative work (task) field. */
    pjTaskTimescaledRemainingCumulativeWork(1343),    
    /**@ Remaining tasks (task) field. */
    pjTaskTimescaledRemainingTasks(1344),    
    /**@ SPI (task) field. */
    pjTaskTimescaledSPI(538),    
    /**@ SV (task) field. */
    pjTaskTimescaledSV(13),    
    /**@ SVP (task)field. */
    pjTaskTimescaledSVP(540),    
    /**@ Work (task) field. */
    pjTaskTimescaledWork(0);

    private final long value;

    PjTaskTimescaledData(long value) {
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
