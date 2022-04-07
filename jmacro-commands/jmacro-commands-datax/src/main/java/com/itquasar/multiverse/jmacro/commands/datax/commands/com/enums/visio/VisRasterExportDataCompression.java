package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportdatacompression">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportdatacompression</a>}
*/
public enum VisRasterExportDataCompression implements COMEnum {
    
    /**@ No compression; the default for BMP. */
    visRasterNone(0),    
    /**@ RLE compression. */
    visRasterRLE(1),    
    /**@ Group 3 compression. */
    visRasterGroup3(2),    
    /**@ Packbits compression. */
    visRasterPackbits(3),    
    /**@ Group 4 compression. */
    visRasterGroup4(4),    
    /**@ LZW compression. */
    visRasterLZW(5),    
    /**@ Modified Huffman compression. */
    visRasterModifiedHuffman(6);

    private final long value;

    VisRasterExportDataCompression(long value) {
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
