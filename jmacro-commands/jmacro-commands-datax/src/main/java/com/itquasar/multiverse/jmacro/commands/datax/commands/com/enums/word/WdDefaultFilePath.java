package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddefaultfilepath">https://docs.microsoft.com/en-us/office/vba/api/word.wddefaultfilepath</a>}
*/
public enum WdDefaultFilePath implements COMEnum {
    
    /**@ Path for Auto Recover files. */
    wdAutoRecoverPath(5),    
    /**@ Border art path. */
    wdBorderArtPath(19),    
    /**@ Current folder path. */
    wdCurrentFolderPath(14),    
    /**@ Documents path. */
    wdDocumentsPath(0),    
    /**@ Graphics filters path. */
    wdGraphicsFiltersPath(10),    
    /**@ Pictures path. */
    wdPicturesPath(1),    
    /**@ Program path. */
    wdProgramPath(9),    
    /**@ Proofing tools path. */
    wdProofingToolsPath(12),    
    /**@ Startup path. */
    wdStartupPath(8),    
    /**@ Style Gallery path. */
    wdStyleGalleryPath(15),    
    /**@ Temp file path. */
    wdTempFilePath(13),    
    /**@ Text converters path. */
    wdTextConvertersPath(11),    
    /**@ Tools path. */
    wdToolsPath(6),    
    /**@ Tutorial path. */
    wdTutorialPath(7),    
    /**@ User Options path. */
    wdUserOptionsPath(4),    
    /**@ User templates path. */
    wdUserTemplatesPath(2),    
    /**@ Workgroup templates path. */
    wdWorkgroupTemplatesPath(3);

    private final long value;

    WdDefaultFilePath(long value) {
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
