package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcustomlabelpagesize">https://docs.microsoft.com/en-us/office/vba/api/word.wdcustomlabelpagesize</a>}
*/
public enum WdCustomLabelPageSize implements COMEnum {
    
    /**@ A4 portrait label dimensions. */
    wdCustomLabelA4(2),    
    /**@ A4 landscape label dimensions. */
    wdCustomLabelA4LS(3),    
    /**@ A5 portrait label dimensions. */
    wdCustomLabelA5(4),    
    /**@ A5 landscape label dimensions. */
    wdCustomLabelA5LS(5),    
    /**@ B4 JIS label dimensions. */
    wdCustomLabelB4JIS(13),    
    /**@ B5 label dimensions. */
    wdCustomLabelB5(6),    
    /**@ Fanfold label dimensions. */
    wdCustomLabelFanfold(8),    
    /**@ Higaki portrait label dimensions. */
    wdCustomLabelHigaki(11),    
    /**@ Higaki landscape label dimensions. */
    wdCustomLabelHigakiLS(12),    
    /**@ Standard letter portrait label dimensions. */
    wdCustomLabelLetter(0),    
    /**@ Standard letter landscape label dimensions. */
    wdCustomLabelLetterLS(1),    
    /**@ Mini label dimensions. */
    wdCustomLabelMini(7),    
    /**@ Half-sheet portrait label dimensions. */
    wdCustomLabelVertHalfSheet(9),    
    /**@ Half-sheet landscape label dimensions. */
    wdCustomLabelVertHalfSheetLS(10);

    private final long value;

    WdCustomLabelPageSize(long value) {
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
