package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportoperation">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportoperation</a>}
*/
public enum VisRasterExportOperation implements COMEnum {
    
    /**@ Baseline operation; the default. */
    visRasterBaseline(0),    
    /**@ Progressive operation. */
    visRasterProgressive(1);

    private final long value;

    VisRasterExportOperation(long value) {
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
