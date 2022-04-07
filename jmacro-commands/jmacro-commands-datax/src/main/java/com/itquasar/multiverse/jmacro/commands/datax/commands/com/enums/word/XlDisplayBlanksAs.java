package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xldisplayblanksas">https://docs.microsoft.com/en-us/office/vba/api/word.xldisplayblanksas</a>}
*/
public enum XlDisplayBlanksAs implements COMEnum {
    
    /**@ Values are interpolated into the chart. */
    xlInterpolated(3),    
    /**@ Blank cells are not plotted. */
    xlNotPlotted(1),    
    /**@ Blanks are plotted as zero. */
    xlZero(2);

    private final long value;

    XlDisplayBlanksAs(long value) {
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
