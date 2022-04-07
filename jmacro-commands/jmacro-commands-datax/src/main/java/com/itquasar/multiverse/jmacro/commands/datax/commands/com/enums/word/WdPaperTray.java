package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpapertray">https://docs.microsoft.com/en-us/office/vba/api/word.wdpapertray</a>}
*/
public enum WdPaperTray implements COMEnum {
    
    /**@ Automatic sheet feed. */
    wdPrinterAutomaticSheetFeed(7),    
    /**@ Default bin. */
    wdPrinterDefaultBin(0),    
    /**@ Envelope feed. */
    wdPrinterEnvelopeFeed(5),    
    /**@ Form source. */
    wdPrinterFormSource(15),    
    /**@ Large-capacity bin. */
    wdPrinterLargeCapacityBin(11),    
    /**@ Large-format bin. */
    wdPrinterLargeFormatBin(10),    
    /**@ Lower bin. */
    wdPrinterLowerBin(2),    
    /**@ Manual envelope feed. */
    wdPrinterManualEnvelopeFeed(6),    
    /**@ Manual feed. */
    wdPrinterManualFeed(4),    
    /**@ Middle bin. */
    wdPrinterMiddleBin(3),    
    /**@ Printer's only bin. */
    wdPrinterOnlyBin(1),    
    /**@ Paper cassette. */
    wdPrinterPaperCassette(14),    
    /**@ Small-format bin. */
    wdPrinterSmallFormatBin(9),    
    /**@ Tractor feed. */
    wdPrinterTractorFeed(8),    
    /**@ Upper bin. */
    wdPrinterUpperBin(1);

    private final long value;

    WdPaperTray(long value) {
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
