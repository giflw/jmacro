package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpagetype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpagetype</a>}
*/
public enum PbPageType implements COMEnum {
    
    /**@ Left page */
    pbPageLeftPage(1),    
    /**@ Master page */
    pbPageMasterPage(4),    
    /**@ Right page */
    pbPageRightPage(2),    
    /**@ Scratch page */
    pbPageScratchPage(3);

    private final long value;

    PbPageType(long value) {
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
