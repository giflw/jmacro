package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcopypictureformat">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcopypictureformat</a>}
*/
public enum XlCopyPictureFormat implements COMEnum {
    
    /**@ Picture copied in bitmap (raster) format: bmp, jpg, gif, png. */
    xlBitmap(2),    
    /**@ Picture copied in vector format: emf, wmf. */
    xlPicture(-4147);

    private final long value;

    XlCopyPictureFormat(long value) {
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
