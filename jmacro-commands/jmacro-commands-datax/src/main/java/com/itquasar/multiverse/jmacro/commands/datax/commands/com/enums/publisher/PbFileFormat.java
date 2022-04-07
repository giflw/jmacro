package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbfileformat">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbfileformat</a>}
*/
public enum PbFileFormat implements COMEnum {
    
    /**@ The file was saved in HTML Filtered format. */
    pbFileHTMLFiltered(7),    
    /**@ The file was saved in plain text format. */
    pbFilePlainText(8),    
    /**@ The file was saved with the current version of Microsoft Publisher. */
    pbFilePublication(1),    
    /**@ The file was saved in a Publisher 2000 file format. */
    pbFilePublisher2000(3),    
    /**@ The file was saved in a Publisher 98 file format. */
    pbFilePublisher98(2),    
    /**@ The file was saved in Rich Text Format. */
    pbFileRTF(6),    
    /**@ The file was saved in Unicode Text Format. */
    pbFileUnicodeText(9),    
    /**@ The file was saved in the MHTML format that allows users to save a webpage and all its related files as a single file. */
    pbFileWebArchive(5);

    private final long value;

    PbFileFormat(long value) {
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
