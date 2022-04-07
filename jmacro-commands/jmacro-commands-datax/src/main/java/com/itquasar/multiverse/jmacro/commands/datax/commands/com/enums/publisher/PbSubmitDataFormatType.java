package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbsubmitdataformattype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbsubmitdataformattype</a>}
*/
public enum PbSubmitDataFormatType implements COMEnum {
    
    /**@ Saves Web form data to a comma-delimited text file. */
    pbSubmitDataFormatCSV(3),    
    /**@ Saves Web form data to an HTML file. */
    pbSubmitDataFormatHTML(1),    
    /**@ Saves Web form data to a formatted file. */
    pbSubmitDataFormatRichText(2),    
    /**@ Saves Web form data to a tab-delimited text file. */
    pbSubmitDataFormatTab(4);

    private final long value;

    PbSubmitDataFormatType(long value) {
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
