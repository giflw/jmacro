package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpastedatatype">https://docs.microsoft.com/en-us/office/vba/api/word.wdpastedatatype</a>}
*/
public enum WdPasteDataType implements COMEnum {
    
    /**@ Bitmap. */
    wdPasteBitmap(4),    
    /**@ Device-independent bitmap. */
    wdPasteDeviceIndependentBitmap(5),    
    /**@ Enhanced metafile. */
    wdPasteEnhancedMetafile(9),    
    /**@ HTML. */
    wdPasteHTML(10),    
    /**@ Hyperlink. */
    wdPasteHyperlink(7),    
    /**@ Metafile picture. */
    wdPasteMetafilePicture(3),    
    /**@ OLE object. */
    wdPasteOLEObject(0),    
    /**@ Rich Text Format (RTF). */
    wdPasteRTF(1),    
    /**@ Shape. */
    wdPasteShape(8),    
    /**@ Text. */
    wdPasteText(2);

    private final long value;

    WdPasteDataType(long value) {
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
