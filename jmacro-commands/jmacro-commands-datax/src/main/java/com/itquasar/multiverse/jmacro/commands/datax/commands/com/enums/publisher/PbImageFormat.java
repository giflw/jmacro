package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbimageformat">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbimageformat</a>}
*/
public enum PbImageFormat implements COMEnum {
    
    /**@ CMYKJPEG */
    pbImageFormatCMYKJPEG(10),    
    /**@ DIB */
    pbImageFormatDIB(7),    
    /**@ EMF */
    pbImageFormatEMF(2),    
    /**@ GIF */
    pbImageFormatGIF(8),    
    /**@ JPEG */
    pbImageFormatJPEG(5),    
    /**@ PICT */
    pbImageFormatPICT(4),    
    /**@ PNG */
    pbImageFormatPNG(6),    
    /**@ TIFF */
    pbImageFormatTIFF(9),    
    /**@ Unknown */
    pbImageFormatUNKNOWN(1),    
    /**@ WMF */
    pbImageFormatWMF(3);

    private final long value;

    PbImageFormat(long value) {
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
