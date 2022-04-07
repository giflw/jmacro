package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbmailmergedestination">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbmailmergedestination</a>}
*/
public enum PbMailMergeDestination implements COMEnum {
    
    /**@ Default Merge to an exisiting presentation. */
    pbMergeToExistingPublication(3),    
    /**@ Merge to a new presentation. */
    pbMergeToNewPublication(2),    
    /**@ Merge and send as an email message. */
    pbSendEmail(4),    
    /**@ Merge and send to the printer. */
    pbSendToPrinter(1);

    private final long value;

    PbMailMergeDestination(long value) {
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
