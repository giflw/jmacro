package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdunderline">https://docs.microsoft.com/en-us/office/vba/api/word.wdunderline</a>}
*/
public enum WdUnderline implements COMEnum {
    
    /**@ Dashes. */
    wdUnderlineDash(7),    
    /**@ Heavy dashes. */
    wdUnderlineDashHeavy(23),    
    /**@ Long dashes. */
    wdUnderlineDashLong(39),    
    /**@ Long heavy dashes. */
    wdUnderlineDashLongHeavy(55),    
    /**@ Alternating dots and dashes. */
    wdUnderlineDotDash(9),    
    /**@ Alternating heavy dots and heavy dashes. */
    wdUnderlineDotDashHeavy(25),    
    /**@ An alternating dot-dot-dash pattern. */
    wdUnderlineDotDotDash(10),    
    /**@ An alternating heavy dot-dot-dash pattern. */
    wdUnderlineDotDotDashHeavy(26),    
    /**@ Dots. */
    wdUnderlineDotted(4),    
    /**@ Heavy dots. */
    wdUnderlineDottedHeavy(20),    
    /**@ A double line. */
    wdUnderlineDouble(3),    
    /**@ No underline. */
    wdUnderlineNone(0),    
    /**@ A single line. default. */
    wdUnderlineSingle(1),    
    /**@ A single thick line. */
    wdUnderlineThick(6),    
    /**@ A single wavy line. */
    wdUnderlineWavy(11),    
    /**@ A double wavy line. */
    wdUnderlineWavyDouble(43),    
    /**@ A heavy wavy line. */
    wdUnderlineWavyHeavy(27),    
    /**@ Underline individual words only. */
    wdUnderlineWords(2);

    private final long value;

    WdUnderline(long value) {
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
