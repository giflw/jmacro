package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergedestination">https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergedestination</a>}
*/
public enum WdMailMergeDestination implements COMEnum {
    
    /**@ Send results to email recipient. */
    wdSendToEmail(2),    
    /**@ Send results to fax recipient. */
    wdSendToFax(3),    
    /**@ Send results to a new Word document. */
    wdSendToNewDocument(0),    
    /**@ Send results to a printer. */
    wdSendToPrinter(1);

    private final long value;

    WdMailMergeDestination(long value) {
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
