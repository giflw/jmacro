package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllistobjectsourcetype">https://docs.microsoft.com/en-us/office/vba/api/excel.xllistobjectsourcetype</a>}
*/
public enum XlListObjectSourceType implements COMEnum {
    
    /**@ External data source (Microsoft SharePoint Foundation site). */
    xlSrcExternal(0),    
    /**@ PowerPivot Model */
    xlSrcModel(4),    
    /**@ Query */
    xlSrcQuery(3),    
    /**@ Range */
    xlSrcRange(1),    
    /**@ XML */
    xlSrcXml(2);

    private final long value;

    XlListObjectSourceType(long value) {
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
