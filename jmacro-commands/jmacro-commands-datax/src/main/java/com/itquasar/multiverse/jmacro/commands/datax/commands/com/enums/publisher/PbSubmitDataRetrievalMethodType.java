package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbsubmitdataretrievalmethodtype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbsubmitdataretrievalmethodtype</a>}
*/
public enum PbSubmitDataRetrievalMethodType implements COMEnum {
    
    /**@ Processes form data by sending an email message to a specified email address. */
    pbSubmitDataRetrievalEmail(2),    
    /**@ Processes form data using a script program provided by your Internet service provider. */
    pbSubmitDataRetrievalProgram(3),    
    /**@ Saves form data to a file stored on your Web server. */
    pbSubmitDataRetrievalSaveOnServer(1);

    private final long value;

    PbSubmitDataRetrievalMethodType(long value) {
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
