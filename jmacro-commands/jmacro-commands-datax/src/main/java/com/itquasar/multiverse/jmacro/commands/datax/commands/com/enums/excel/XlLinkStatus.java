package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllinkstatus">https://docs.microsoft.com/en-us/office/vba/api/excel.xllinkstatus</a>}
*/
public enum XlLinkStatus implements COMEnum {
    
    /**@ Copied values. */
    xlLinkStatusCopiedValues(10),    
    /**@ Unable to determine status. */
    xlLinkStatusIndeterminate(5),    
    /**@ Invalid name. */
    xlLinkStatusInvalidName(7),    
    /**@ File missing. */
    xlLinkStatusMissingFile(1),    
    /**@ Sheet missing. */
    xlLinkStatusMissingSheet(2),    
    /**@ Not started. */
    xlLinkStatusNotStarted(6),    
    /**@ No errors. */
    xlLinkStatusOK(0),    
    /**@ Status may be out of date. */
    xlLinkStatusOld(3),    
    /**@ Not yet calculated. */
    xlLinkStatusSourceNotCalculated(4),    
    /**@ Not open. */
    xlLinkStatusSourceNotOpen(8),    
    /**@ Source document is open. */
    xlLinkStatusSourceOpen(9);

    private final long value;

    XlLinkStatus(long value) {
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
