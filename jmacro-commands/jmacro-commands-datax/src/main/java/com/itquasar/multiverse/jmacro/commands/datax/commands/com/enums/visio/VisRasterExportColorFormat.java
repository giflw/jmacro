package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportcolorformat">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportcolorformat</a>}
*/
public enum VisRasterExportColorFormat implements COMEnum {
    
    /**@ Bi-level color format */
    visRasterBiLevel(0),    
    /**@ 16-color format */
    visRaster16Color(1),    
    /**@ 256-color format */
    visRaster256Color(2),    
    /**@ 24-bit color format; the default for PNG, TIFF, and BMP */
    visRaster24Bit(3),    
    /**@ RGB color format; the default for JPG */
    visRasterRGB(4),    
    /**@ YCC color format */
    visRasterYCC(5),    
    /**@ Grayscale color format */
    visRasterGrayScale(6),    
    /**@ CMYK color format */
    visRasterCMYK(7),    
    /**@ 16-color grayscale color format */
    visRaster16ColorGrayScale(8),    
    /**@ 256-color grayscale color format */
    visRaster256ColorGrayScale(9),    
    /**@ 16-bit color format */
    visRaster16Bit(10);

    private final long value;

    VisRasterExportColorFormat(long value) {
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
