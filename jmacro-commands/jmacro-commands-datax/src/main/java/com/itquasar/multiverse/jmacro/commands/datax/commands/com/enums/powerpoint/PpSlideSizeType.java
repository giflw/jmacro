package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslidesizetype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslidesizetype</a>}
*/
public enum PpSlideSizeType implements COMEnum {
    
    /**@ 35MM */
    ppSlideSize35MM(4),    
    /**@ A3 Paper */
    ppSlideSizeA3Paper(9),    
    /**@ A4 Paper */
    ppSlideSizeA4Paper(3),    
    /**@ B4 ISO Paper */
    ppSlideSizeB4ISOPaper(10),    
    /**@ B4 JIS Paper */
    ppSlideSizeB4JISPaper(12),    
    /**@ B5 ISO Paper */
    ppSlideSizeB5ISOPaper(11),    
    /**@ B5 JIS Paper */
    ppSlideSizeB5JISPaper(13),    
    /**@ Banner */
    ppSlideSizeBanner(6),    
    /**@ Custom */
    ppSlideSizeCustom(7),    
    /**@ Hagaki Card */
    ppSlideSizeHagakiCard(14),    
    /**@ Ledger Paper */
    ppSlideSizeLedgerPaper(8),    
    /**@ Letter Paper */
    ppSlideSizeLetterPaper(2),    
    /**@ On Screen */
    ppSlideSizeOnScreen(1),    
    /**@ Overhead */
    ppSlideSizeOverhead(5);

    private final long value;

    PpSlideSizeType(long value) {
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
