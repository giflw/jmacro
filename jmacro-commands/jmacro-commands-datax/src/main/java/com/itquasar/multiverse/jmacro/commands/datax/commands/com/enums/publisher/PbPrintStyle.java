package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbprintstyle">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbprintstyle</a>}
*/
public enum PbPrintStyle implements COMEnum {
    
    /**@ Prints the publication in the booklet style with a side fold. */
    pbPrintStyleBookletSideFold(5),    
    /**@ Prints the publication in the booklet style with a top fold. */
    pbPrintStyleBookletTopFold(6),    
    /**@ Prints the publication in the default style. */
    pbPrintStyleDefault(0),    
    /**@ Prints the publication in the envelope style. */
    pbPrintStyleEnvelope(11),    
    /**@ Prints the publication in the half fold on the side style. */
    pbPrintStyleHalfFoldSide(7),    
    /**@ Prints the publication in the half fold on the top style. */
    pbPrintStyleHalfFoldTop(8),    
    /**@ Prints multiple copies of the publication per sheet. */
    pbPrintStyleMultipleCopiesPerSheet(3),    
    /**@ Prints multiple pages of the publication per sheet. */
    pbPrintStyleMultiplePagesPerSheet(4),    
    /**@ Prints one page of the publication on one sheet. */
    pbPrintStyleOnePagePerSheet(1),    
    /**@ Prints the publication in the quarter fold side style. */
    pbPrintStyleQuarterFoldSide(10),    
    /**@ Prints the publication in the quarter fold top style. */
    pbPrintStyleQuarterFoldTop(9),    
    /**@ Prints the publication in the tiled style. */
    pbPrintStyleTiled(2);

    private final long value;

    PbPrintStyle(long value) {
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
