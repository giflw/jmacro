package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlhalign">https://docs.microsoft.com/en-us/office/vba/api/excel.xlhalign</a>}
*/
public enum XlHAlign implements COMEnum {
    
    /**@ Center. */
    xlHAlignCenter(-4108),    
    /**@ Center across selection. */
    xlHAlignCenterAcrossSelection(7),    
    /**@ Distribute. */
    xlHAlignDistributed(-4117),    
    /**@ Fill. */
    xlHAlignFill(5),    
    /**@ Align according to data type. */
    xlHAlignGeneral(1),    
    /**@ Justify. */
    xlHAlignJustify(-4130),    
    /**@ Left. */
    xlHAlignLeft(-4131),    
    /**@ Right. */
    xlHAlignRight(-4152);

    private final long value;

    XlHAlign(long value) {
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
