package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vispublishdatarecordsets">https://docs.microsoft.com/en-us/office/vba/api/visio.vispublishdatarecordsets</a>}
*/
public enum VisPublishDataRecordsets implements COMEnum {
    
    /**@ Publish all data recordsets in the document. */
    visPublishDataRecordsetAll(0),    
    /**@ Publish none of the data recordsets in the document. */
    visPublishDataRecordsetNone(1),    
    /**@ Publish selected data recordsets. */
    visPublishDataRecordsetSelect(2);

    private final long value;

    VisPublishDataRecordsets(long value) {
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
