package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pppastedatatype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pppastedatatype</a>}
*/
public enum PpPasteDataType implements COMEnum {
    
    /**@ Paste bitmap. */
    ppPasteBitmap(1),    
    /**@ Paste the default content of the clipboard. */
    ppPasteDefault(0),    
    /**@ Paste enhanced Metafile */
    ppPasteEnhancedMetafile(2),    
    /**@ Paste a GIF image. */
    ppPasteGIF(4),    
    /**@ Paste HTML. */
    ppPasteHTML(8),    
    /**@ Paste a JPG image. */
    ppPasteJPG(5),    
    /**@ Paste a Metafile picture. */
    ppPasteMetafilePicture(3),    
    /**@ Paste OLE object. */
    ppPasteOLEObject(10),    
    /**@ Paste PNG image. */
    ppPastePNG(6),    
    /**@ Paste RTF. */
    ppPasteRTF(9),    
    /**@ Paste a shape. */
    ppPasteShape(11),    
    /**@ Paste text. */
    ppPasteText(7);

    private final long value;

    PpPasteDataType(long value) {
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
