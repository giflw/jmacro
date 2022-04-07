package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpictureresolution">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpictureresolution</a>}
*/
public enum PbPictureResolution implements COMEnum {
    
    /**@ 300 dpi */
    pbPictureResolutionCommercialPrint_300dpi(3),    
    /**@ Default */
    pbPictureResolutionDefault(0),    
    /**@ 150 dpi */
    pbPictureResolutionDesktopPrint_150dpi(2),    
    /**@ 96 dpi */
    pbPictureResolutionWeb_96dpi(1);

    private final long value;

    PbPictureResolution(long value) {
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
