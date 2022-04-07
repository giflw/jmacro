package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpapersize">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpapersize</a>}
*/
public enum XlPaperSize implements COMEnum {
    
    /**@ 10 in. x 14 in. */
    xlPaper10x14(16),    
    /**@ 11 in. x 17 in. */
    xlPaper11x17(17),    
    /**@ A3 (297 mm x 420 mm) */
    xlPaperA3(8),    
    /**@ A4 (210 mm x 297 mm) */
    xlPaperA4(9),    
    /**@ A4 Small (210 mm x 297 mm) */
    xlPaperA4Small(10),    
    /**@ A5 (148 mm x 210 mm) */
    xlPaperA5(11),    
    /**@ B4 (250 mm x 354 mm) */
    xlPaperB4(12),    
    /**@ A5 (148 mm x 210 mm) */
    xlPaperB5(13),    
    /**@ C size sheet */
    xlPaperCsheet(24),    
    /**@ D size sheet */
    xlPaperDsheet(25),    
    /**@ Envelope #10 (4-1/8 in. x 9-1/2 in.) */
    xlPaperEnvelope10(20),    
    /**@ Envelope #11 (4-1/2 in. x 10-3/8 in.) */
    xlPaperEnvelope11(21),    
    /**@ Envelope #12 (4-1/2 in. x 11 in.) */
    xlPaperEnvelope12(22),    
    /**@ Envelope #14 (5 in. x 11-1/2 in.) */
    xlPaperEnvelope14(23),    
    /**@ Envelope #9 (3-7/8 in. x 8-7/8 in.) */
    xlPaperEnvelope9(19),    
    /**@ Envelope B4 (250 mm x 353 mm) */
    xlPaperEnvelopeB4(33),    
    /**@ Envelope B5 (176 mm x 250 mm) */
    xlPaperEnvelopeB5(34),    
    /**@ Envelope B6 (176 mm x 125 mm) */
    xlPaperEnvelopeB6(35),    
    /**@ Envelope C3 (324 mm x 458 mm) */
    xlPaperEnvelopeC3(29),    
    /**@ Envelope C4 (229 mm x 324 mm) */
    xlPaperEnvelopeC4(30),    
    /**@ Envelope C5 (162 mm x 229 mm) */
    xlPaperEnvelopeC5(28),    
    /**@ Envelope C6 (114 mm x 162 mm) */
    xlPaperEnvelopeC6(31),    
    /**@ Envelope C65 (114 mm x 229 mm) */
    xlPaperEnvelopeC65(32),    
    /**@ Envelope DL (110 mm x 220 mm) */
    xlPaperEnvelopeDL(27),    
    /**@ Envelope (110 mm x 230 mm) */
    xlPaperEnvelopeItaly(36),    
    /**@ Envelope Monarch (3-7/8 in. x 7-1/2 in.) */
    xlPaperEnvelopeMonarch(37),    
    /**@ Envelope (3-5/8 in. x 6-1/2 in.) */
    xlPaperEnvelopePersonal(38),    
    /**@ E size sheet */
    xlPaperEsheet(26),    
    /**@ Executive (7-1/2 in. x 10-1/2 in.) */
    xlPaperExecutive(7),    
    /**@ German Legal Fanfold (8-1/2 in. x 13 in.) */
    xlPaperFanfoldLegalGerman(41),    
    /**@ German Legal Fanfold (8-1/2 in. x 13 in.) */
    xlPaperFanfoldStdGerman(40),    
    /**@ U.S. Standard Fanfold (14-7/8 in. x 11 in.) */
    xlPaperFanfoldUS(39),    
    /**@ Folio (8-1/2 in. x 13 in.) */
    xlPaperFolio(14),    
    /**@ Ledger (17 in. x 11 in.) */
    xlPaperLedger(4),    
    /**@ Legal (8-1/2 in. x 14 in.) */
    xlPaperLegal(5),    
    /**@ Letter (8-1/2 in. x 11 in.) */
    xlPaperLetter(1),    
    /**@ Letter Small (8-1/2 in. x 11 in.) */
    xlPaperLetterSmall(2),    
    /**@ Note (8-1/2 in. x 11 in.) */
    xlPaperNote(18),    
    /**@ Quarto (215 mm x 275 mm) */
    xlPaperQuarto(15),    
    /**@ Statement (5-1/2 in. x 8-1/2 in.) */
    xlPaperStatement(6),    
    /**@ Tabloid (11 in. x 17 in.) */
    xlPaperTabloid(3),    
    /**@ User-defined */
    xlPaperUser(256);

    private final long value;

    XlPaperSize(long value) {
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
