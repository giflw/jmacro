package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbfixedformatintent">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbfixedformatintent</a>}
*/
public enum PbFixedFormatIntent implements COMEnum {
    
    /**@ Submit the publication to a commercial press. */
    pbIntentCommercial(4),    
    /**@ Squeeze the publication to the smallest file size. This satisfies the on-screen viewing scenario where the publication is viewed on a computer monitor. */
    pbIntentMinimum(1),    
    /**@ Print the publication on a desktop printer or at a copy store, such as Kinko's. */
    pbIntentPrinting(3),    
    /**@ Distribute the publication as an email message or from a website. Note that the user does not know how the publication will be viewed: on-screen or printed from a desktop printer. Both the desktop printing scenario and the on-screen viewing scenario must be met by this intent. */
    pbIntentStandard(2);

    private final long value;

    PbFixedFormatIntent(long value) {
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
