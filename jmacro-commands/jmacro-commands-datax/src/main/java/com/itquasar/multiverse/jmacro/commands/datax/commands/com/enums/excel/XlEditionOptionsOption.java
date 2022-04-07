package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xleditionoptionsoption">https://docs.microsoft.com/en-us/office/vba/api/excel.xleditionoptionsoption</a>}
*/
public enum XlEditionOptionsOption implements COMEnum {
    
    /**@ Automatic update. */
    xlAutomaticUpdate(4),    
    /**@ Cancel. */
    xlCancel(1),    
    /**@ Change attributes. */
    xlChangeAttributes(6),    
    /**@ Manual update. */
    xlManualUpdate(5),    
    /**@ Open source. */
    xlOpenSource(3),    
    /**@ Select. */
    xlSelect(3),    
    /**@ Send to Microsoft Publisher. */
    xlSendPublisher(2),    
    /**@ Update subscriber. */
    xlUpdateSubscriber(2);

    private final long value;

    XlEditionOptionsOption(long value) {
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
