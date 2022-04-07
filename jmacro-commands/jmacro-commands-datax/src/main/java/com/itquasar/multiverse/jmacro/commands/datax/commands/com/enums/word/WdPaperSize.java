package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpapersize">https://docs.microsoft.com/en-us/office/vba/api/word.wdpapersize</a>}
*/
public enum WdPaperSize implements COMEnum {
    
    /**@ 10 inches wide, 14 inches long. */
    wdPaper10x14(0),    
    /**@ Legal 11 inches wide, 17 inches long. */
    wdPaper11x17(1),    
    /**@ A3 dimensions. */
    wdPaperA3(6),    
    /**@ A4 dimensions. */
    wdPaperA4(7),    
    /**@ Small A4 dimensions. */
    wdPaperA4Small(8),    
    /**@ A5 dimensions. */
    wdPaperA5(9),    
    /**@ B4 dimensions. */
    wdPaperB4(10),    
    /**@ B5 dimensions. */
    wdPaperB5(11),    
    /**@ C sheet dimensions. */
    wdPaperCSheet(12),    
    /**@ Custom paper size. */
    wdPaperCustom(41),    
    /**@ D sheet dimensions. */
    wdPaperDSheet(13),    
    /**@ Legal envelope, size 10. */
    wdPaperEnvelope10(25),    
    /**@ Envelope, size 11. */
    wdPaperEnvelope11(26),    
    /**@ Envelope, size 12. */
    wdPaperEnvelope12(27),    
    /**@ Envelope, size 14. */
    wdPaperEnvelope14(28),    
    /**@ Envelope, size 9. */
    wdPaperEnvelope9(24),    
    /**@ B4 envelope. */
    wdPaperEnvelopeB4(29),    
    /**@ B5 envelope. */
    wdPaperEnvelopeB5(30),    
    /**@ B6 envelope. */
    wdPaperEnvelopeB6(31),    
    /**@ C3 envelope. */
    wdPaperEnvelopeC3(32),    
    /**@ C4 envelope. */
    wdPaperEnvelopeC4(33),    
    /**@ C5 envelope. */
    wdPaperEnvelopeC5(34),    
    /**@ C6 envelope. */
    wdPaperEnvelopeC6(35),    
    /**@ C65 envelope. */
    wdPaperEnvelopeC65(36),    
    /**@ DL envelope. */
    wdPaperEnvelopeDL(37),    
    /**@ Italian envelope. */
    wdPaperEnvelopeItaly(38),    
    /**@ Monarch envelope. */
    wdPaperEnvelopeMonarch(39),    
    /**@ Personal envelope. */
    wdPaperEnvelopePersonal(40),    
    /**@ E sheet dimensions. */
    wdPaperESheet(14),    
    /**@ Executive dimensions. */
    wdPaperExecutive(5),    
    /**@ German legal fanfold dimensions. */
    wdPaperFanfoldLegalGerman(15),    
    /**@ German standard fanfold dimensions. */
    wdPaperFanfoldStdGerman(16),    
    /**@ United States fanfold dimensions. */
    wdPaperFanfoldUS(17),    
    /**@ Folio dimensions. */
    wdPaperFolio(18),    
    /**@ Ledger dimensions. */
    wdPaperLedger(19),    
    /**@ Legal dimensions. */
    wdPaperLegal(4),    
    /**@ Letter dimensions. */
    wdPaperLetter(2),    
    /**@ Small letter dimensions. */
    wdPaperLetterSmall(3),    
    /**@ Note dimensions. */
    wdPaperNote(20),    
    /**@ Quarto dimensions. */
    wdPaperQuarto(21),    
    /**@ Statement dimensions. */
    wdPaperStatement(22),    
    /**@ Tabloid dimensions. */
    wdPaperTabloid(23);

    private final long value;

    WdPaperSize(long value) {
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
