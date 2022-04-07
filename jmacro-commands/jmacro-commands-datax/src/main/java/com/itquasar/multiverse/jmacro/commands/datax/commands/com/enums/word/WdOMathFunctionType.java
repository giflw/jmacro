package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdomathfunctiontype">https://docs.microsoft.com/en-us/office/vba/api/word.wdomathfunctiontype</a>}
*/
public enum WdOMathFunctionType implements COMEnum {
    
    /**@ Equation accent mark. */
    wdOMathFunctionAcc(1),    
    /**@ Equation fraction bar. */
    wdOMathFunctionBar(2),    
    /**@ Border box. */
    wdOMathFunctionBorderBox(4),    
    /**@ Box. */
    wdOMathFunctionBox(3),    
    /**@ Equation delimiters. */
    wdOMathFunctionDelim(5),    
    /**@ Equation array. */
    wdOMathFunctionEqArray(6),    
    /**@ Equation fraction. */
    wdOMathFunctionFrac(7),    
    /**@ Equation function. */
    wdOMathFunctionFunc(8),    
    /**@ Group character. */
    wdOMathFunctionGroupChar(9),    
    /**@ Equation lower limit. */
    wdOMathFunctionLimLow(10),    
    /**@ Equation upper limit. */
    wdOMathFunctionLimUpp(11),    
    /**@ Equation matrix. */
    wdOMathFunctionMat(12),    
    /**@ Equation N-ary operator. */
    wdOMathFunctionNary(13),    
    /**@ Equation normal text. */
    wdOMathFunctionNormalText(21),    
    /**@ Equation phantom. */
    wdOMathFunctionPhantom(14),    
    /**@ Equation base expression. */
    wdOMathFunctionRad(16),    
    /**@ Scr pre. */
    wdOMathFunctionScrPre(15),    
    /**@ Scr. sub. */
    wdOMathFunctionScrSub(17),    
    /**@ Scr. sub sup. */
    wdOMathFunctionScrSubSup(18),    
    /**@ Scr sup. */
    wdOMathFunctionScrSup(19),    
    /**@ Equation text. */
    wdOMathFunctionText(20);

    private final long value;

    WdOMathFunctionType(long value) {
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
