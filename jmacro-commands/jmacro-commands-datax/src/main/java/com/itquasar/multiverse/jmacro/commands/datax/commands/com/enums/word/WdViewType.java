package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdviewtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdviewtype</a>}
*/
public enum WdViewType implements COMEnum {
    
    /**@ A master view. */
    wdMasterView(5),    
    /**@ A normal view. */
    wdNormalView(1),    
    /**@ An outline view. */
    wdOutlineView(2),    
    /**@ A print preview view. */
    wdPrintPreview(4),    
    /**@ A print view. */
    wdPrintView(3),    
    /**@ A reading view. */
    wdReadingView(7),    
    /**@ A Web view. */
    wdWebView(6);

    private final long value;

    WdViewType(long value) {
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
