package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpictureinsertas">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpictureinsertas</a>}
*/
public enum PbPictureInsertAs implements COMEnum {
    
    /**@ Embed all images. */
    pbPictureInsertAsEmbedded(1),    
    /**@ Images can either be linked externally or internally. */
    pbPictureInsertAsLinked(2),    
    /**@ Default. Image is inserted in its original state. */
    pbPictureInsertAsOriginalState(3);

    private final long value;

    PbPictureInsertAs(long value) {
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
