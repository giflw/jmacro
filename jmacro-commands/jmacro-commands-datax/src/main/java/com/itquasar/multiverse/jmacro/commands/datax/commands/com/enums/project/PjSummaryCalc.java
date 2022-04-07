package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjsummarycalc">https://docs.microsoft.com/en-us/office/vba/api/project.pjsummarycalc</a>}
*/
public enum PjSummaryCalc implements COMEnum {
    
    /**@ Use formula. */
    pjCalcFormula(11),    
    /**@ No calculation. */
    pjCalcNone(10),    
    /**@ Rollup And. */
    pjCalcRollupAnd(1),    
    /**@ Rollup Average. */
    pjCalcRollupAverage(4),    
    /**@ Rollup Average First Sublevel. */
    pjCalcRollupAverageFirstSublevel(5),    
    /**@ Rollup Count All. */
    pjCalcRollupCountAll(2),    
    /**@ Rollup Count First Sublevel. */
    pjCalcRollupCountFirstSublevel(6),    
    /**@ Rollup Count Nonsummaries. */
    pjCalcRollupCountNonsummaries(7),    
    /**@ Rollup Max. */
    pjCalcRollupMax(0),    
    /**@ Rollup Min. */
    pjCalcRollupMin(1),    
    /**@ Rollup Or. */
    pjCalcRollupOr(0),    
    /**@ Rollup Sum. */
    pjCalcRollupSum(3);

    private final long value;

    PjSummaryCalc(long value) {
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
