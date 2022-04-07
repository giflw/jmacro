package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpictureconvertortype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpictureconvertortype</a>}
*/
public enum XlPictureConvertorType implements COMEnum {
    
    /**@ Windows version 2.0 - compatible bitmap */
    xlBMP(1),    
    /**@ Computer Graphics Metafile */
    xlCGM(7),    
    /**@ DRW */
    xlDRW(4),    
    /**@ DXF */
    xlDXF(5),    
    /**@ Encapsulated Postscript */
    xlEPS(8),    
    /**@ HGL */
    xlHGL(6),    
    /**@ Bitmap Graphic (Apple PICT format) */
    xlPCT(13),    
    /**@ PC Paintbrush Bitmap Graphic */
    xlPCX(10),    
    /**@ PIC */
    xlPIC(11),    
    /**@ PLT */
    xlPLT(12),    
    /**@ Tagged Image Format File */
    xlTIF(9),    
    /**@ Windows Metafile */
    xlWMF(2),    
    /**@ WordPerfect/DrawPerfect Graphic */
    xlWPG(3);

    private final long value;

    XlPictureConvertorType(long value) {
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
