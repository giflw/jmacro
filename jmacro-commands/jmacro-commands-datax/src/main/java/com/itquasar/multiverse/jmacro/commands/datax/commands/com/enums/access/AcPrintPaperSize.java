package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acprintpapersize">https://docs.microsoft.com/en-us/office/vba/api/access.acprintpapersize</a>}
*/
public enum AcPrintPaperSize implements COMEnum {
    
    /**@ 10 x 14 in. */
    acPRPS10x14(16),    
    /**@ 11 x 17 in. */
    acPRPS11x17(17),    
    /**@ A3 (297 mm x 420 mm) */
    acPRPSA3(8),    
    /**@ A4 (210 mm x 297 mm) */
    acPRPSA4(9),    
    /**@ A4 Small (210 mm x 297 mm) */
    acPRPSA4Small(10),    
    /**@ A5 (148 mm x 210 mm) */
    acPRPSA5(11),    
    /**@ B4 (250 mm x 354 mm) */
    acPRPSB4(12),    
    /**@ B5 (148 mm x 210 mm) */
    acPRPSB5(13),    
    /**@ C size sheet */
    acPRPSCSheet(24),    
    /**@ D size sheet */
    acPRPSDSheet(25),    
    /**@ Envelope #10 (4-1/8 in. x 9-1/2 in.) */
    acPRPSEnv10(20),    
    /**@ Envelope #11 (4-1/2 in. x 10-3/8 in.) */
    acPRPSEnv11(21),    
    /**@ Envelope #12 (4-1/2 in. x 11 in.) */
    acPRPSEnv12(22),    
    /**@ Envelope #14 (5 in. x 11-1/2 in.) */
    acPRPSEnv14(23),    
    /**@ Envelope #9 (3-7/8 in. x 8-7/8 in.) */
    acPRPSEnv9(19),    
    /**@ Envelope B4 (250 mm x 353 mm) */
    acPRPSEnvB4(33),    
    /**@ Envelope B5 (176 mm x 250 mm) */
    acPRPSEnvB5(34),    
    /**@ Envelope B6 (176 mm x 125 mm) */
    acPRPSEnvB6(35),    
    /**@ Envelope C3 (324 mm x 458 mm) */
    acPRPSEnvC3(29),    
    /**@ Envelope C4 (229 mm x 324 mm) */
    acPRPSEnvC4(30),    
    /**@ Envelope C5 (162 mm x 229 mm) */
    acPRPSEnvC5(28),    
    /**@ Envelope C6 (114 mm x 162 mm) */
    acPRPSEnvC6(31),    
    /**@ Envelope C65 (114 mm x 229 mm) */
    acPRPSEnvC65(32),    
    /**@ Envelope DL (110 mm x 220 mm) */
    acPRPSEnvDL(27),    
    /**@ Italian envelope (110 mm x 230 mm) */
    acPRPSEnvItaly(36),    
    /**@ Monarch envelope (3-7/8 in. x 7-1/2 in.) */
    acPRPSEnvMonarch(37),    
    /**@ Envelope (3-5/8 in. x 6-1/2 in.) */
    acPRPSEnvPersonal(38),    
    /**@ E size sheet */
    acPRPSESheet(26),    
    /**@ Executive (7-1/2 in. x 10-1/2 in.) */
    acPRPSExecutive(7),    
    /**@ German Legal Fanfold (8-1/2 in. x 13 in.) */
    acPRPSFanfoldLglGerman(41),    
    /**@ German Standard Fanfold (8-1/2 in. x 12 in.) */
    acPRPSFanfoldStdGerman(40),    
    /**@ U.S. Standard Fanfold (14-7/8 in. x 11 in.) */
    acPRPSFanfoldUS(39),    
    /**@ Folio (8-1/2 in. x 13 in.) */
    acPRPSFolio(14),    
    /**@ Ledger (17 in. x 11 in.) */
    acPRPSLedger(4),    
    /**@ Legal (8-1/2 in. x 14 in.) */
    acPRPSLegal(5),    
    /**@ Letter (8-1/2 in. x 11 in.) */
    acPRPSLetter(1),    
    /**@ Letter Small (8-1/2 in. x 11 in.) */
    acPRPSLetterSmall(2),    
    /**@ Note (8-1/2 in. x 11 in.) */
    acPRPSNote(18),    
    /**@ Quarto (215 mm x 275 mm) */
    acPRPSQuarto(15),    
    /**@ Statement (5-1/2 in. x 8-1/2 in.) */
    acPRPSStatement(6),    
    /**@ Tabloid (11 in. x 17 in.) */
    acPRPSTabloid(3),    
    /**@ User-defined */
    acPRPSUser(256);

    private final long value;

    AcPrintPaperSize(long value) {
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
