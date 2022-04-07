package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vispapersizes">https://docs.microsoft.com/en-us/office/vba/api/visio.vispapersizes</a>}
*/
public enum VisPaperSizes implements COMEnum {
    
    /**@ A3 297 x 420 mm */
    visPaperSizeA3(8),    
    /**@ A4 210 x 297 mm */
    visPaperSizeA4(9),    
    /**@ A5 148 x 210 mm */
    visPaperSizeA5(11),    
    /**@ B4 (JIS) 250 x 354 mm */
    visPaperSizeB4(12),    
    /**@ B5 (JIS) 182 x 257 mm */
    visPaperSizeB5(13),    
    /**@ Folio 8 1/2 x 13 in. */
    visPaperSizeFolio(14),    
    /**@ Legal 8 1/2 x 14 in. */
    visPaperSizeLegal(5),    
    /**@ Letter 8 1/2 x 11 in. */
    visPaperSizeLetter(1),    
    /**@ Note 8 1/2 x 11 in. */
    visPaperSizeNote(18),    
    /**@ C size sheet 17 x 22 in. */
    visPaperSizeSizeC(24),    
    /**@ D size sheet 22 x 34 in. */
    visPaperSizeSizeD(25),    
    /**@ E size sheet 34 x 44 in. */
    visPaperSizeSizeE(26),    
    /**@ Unknown */
    visPaperSizeUnknown(0);

    private final long value;

    VisPaperSizes(long value) {
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
