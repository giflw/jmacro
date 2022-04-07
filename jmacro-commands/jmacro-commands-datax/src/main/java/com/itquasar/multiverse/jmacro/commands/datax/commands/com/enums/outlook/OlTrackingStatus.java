package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oltrackingstatus">https://docs.microsoft.com/en-us/office/vba/api/outlook.oltrackingstatus</a>}
*/
public enum OlTrackingStatus implements COMEnum {
    
    /**@ The item has been delivered to the recipient. */
    olTrackingDelivered(1),    
    /**@ No tracking information is available for the recipient. */
    olTrackingNone(0),    
    /**@ The item has not been delivered to the recipient. */
    olTrackingNotDelivered(2),    
    /**@ The item has not been read by the recipient. */
    olTrackingNotRead(3),    
    /**@ The item has been read by the recipient. */
    olTrackingRead(6),    
    /**@ The sender of the item attempted to recall the item but was unsuccessful. */
    olTrackingRecallFailure(4),    
    /**@ The sender of the item recalled the item. */
    olTrackingRecallSuccess(5),    
    /**@ The recipient replied to the item. */
    olTrackingReplied(7);

    private final long value;

    OlTrackingStatus(long value) {
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
