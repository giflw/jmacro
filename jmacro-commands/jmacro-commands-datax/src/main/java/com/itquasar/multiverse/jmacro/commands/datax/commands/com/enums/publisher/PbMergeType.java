package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbmergetype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbmergetype</a>}
*/
public enum PbMergeType implements COMEnum {
    
    /**@ Catalog merge */
    pbCatalogMerge(3),    
    /**@ Email merge */
    pbEmailMerge(4),    
    /**@ Mail merge */
    pbMailMerge(2),    
    /**@ Default merge */
    pbMergeDefault(0);

    private final long value;

    PbMergeType(long value) {
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
