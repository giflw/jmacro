package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjpapersize">https://docs.microsoft.com/en-us/office/vba/api/project.pjpapersize</a>}
*/
public enum PjPaperSize implements COMEnum {
    
    /**@ 10x11 inches size. */
    pjPaper10x11(45),    
    /**@ 10x14 inches size. */
    pjPaper10x14(16),    
    /**@ 11x17 inches size. */
    pjPaper11x17(17),    
    /**@ 12/11 inches size. */
    pjPaper12x11(90),    
    /**@ 15x11 inches size. */
    pjPaper15x11(46),    
    /**@ A2 size. */
    pjPaperA2(66),    
    /**@ A3 size. */
    pjPaperA3(8),    
    /**@ A3 Extra size. */
    pjPaperA3Extra(63),    
    /**@ A3 Extra Transverse size. */
    pjPaperA3ExtraTransverse(68),    
    /**@ A3 Rotated size. */
    pjPaperA3Rotated(76),    
    /**@ A3 Transverse size. */
    pjPaperA3Transverse(67),    
    /**@ A4 size. */
    pjPaperA4(9),    
    /**@ A4 Extra size. */
    pjPaperA4Extra(53),    
    /**@ A4 Plus size. */
    pjPaperA4Plus(60),    
    /**@ A4 Rotated size. */
    pjPaperA4Rotated(77),    
    /**@ A4 Transverse size. */
    pjPaperA4Transverse(55),    
    /**@ A4 small size. */
    pjPaperA4Small(10),    
    /**@ A5 size. */
    pjPaperA5(11),    
    /**@ A5 Extra size. */
    pjPaperA5Extra(64),    
    /**@ A5 Rotated size. */
    pjPaperA5Rotated(78),    
    /**@ A5 Transverse size. */
    pjPaperA5Transverse(71),    
    /**@ A6 size. */
    pjPaperA6(70),    
    /**@ A6 Rotated size. */
    pjPaperA6Rotated(83),    
    /**@ B4 size. */
    pjPaperB4(12),    
    /**@ B4 JIS Rotated size. */
    pjPaperB4JISRotated(79),    
    /**@ B5 size. */
    pjPaperB5(13),    
    /**@ B5 Extra size. */
    pjPaperB5Extra(65),    
    /**@ B5 JIS Rotated size. */
    pjPaperB5JISRotated(80),    
    /**@ B5 Transverse size. */
    pjPaperB5Transverse(62),    
    /**@ B6 JIS size. */
    pjPaperB6JIS(88),    
    /**@ B6 JIS Rotated size. */
    pjPaperB6JISRotated(89),    
    /**@ C sheet size. */
    pjPaperCsheet(24),    
    /**@ Default. */
    pjPaperDefault(0),    
    /**@ Double Japanese Postcard Rotated size. */
    pjPaperDoubleJapanesePostcardRotated(82),    
    /**@ D sheet size. */
    pjPaperDsheet(25),    
    /**@ Envelop10 size. */
    pjPaperEnvelop10(20),    
    /**@ EnvelopB6 size. */
    pjPaperEnvelopB6(35),    
    /**@ Envelope11 size. */
    pjPaperEnvelope11(21),    
    /**@ Envelope12 size. */
    pjPaperEnvelope12(22),    
    /**@ Envelope14 size. */
    pjPaperEnvelope14(23),    
    /**@ Envelope9 size. */
    pjPaperEnvelope9(19),    
    /**@ EnvelopeB4 size. */
    pjPaperEnvelopeB4(33),    
    /**@ EnvelopeB5 size. */
    pjPaperEnvelopeB5(34),    
    /**@ EnvelopeC3 size. */
    pjPaperEnvelopeC3(29),    
    /**@ EnvelopeC4 size. */
    pjPaperEnvelopeC4(30),    
    /**@ EnvelopeC5 size. */
    pjPaperEnvelopeC5(28),    
    /**@ EnvelopeC6 size. */
    pjPaperEnvelopeC6(31),    
    /**@ EnvelopeC65 size. */
    pjPaperEnvelopeC65(32),    
    /**@ EnvelopeDL size. */
    pjPaperEnvelopeDL(27),    
    /**@ Envelope Invite size. */
    pjPaperEnvelopeInvite(47),    
    /**@ Envelope Italy size. */
    pjPaperEnvelopeItaly(36),    
    /**@ Envelope Monarch size. */
    pjPaperEnvelopeMonarch(37),    
    /**@ Envelope personal size. */
    pjPaperEnvelopePersonal(38),    
    /**@ Envelope Esheet size. */
    pjPaperEsheet(26),    
    /**@ Envelope executive size. */
    pjPaperExecutive(7),    
    /**@ Envelope fanfold legal German size. */
    pjPaperFanfoldLegalGerman(41),    
    /**@ Envelope paper fanfold standard German size. */
    pjPaperFanfoldStdGerman(40),    
    /**@ Envelope fanfold US sze. */
    pjPaperFanfoldUS(39),    
    /**@ Envelope folio size. */
    pjPaperFolio(14),    
    /**@ ISO B4 size. */
    pjPaperISOB4(42),    
    /**@ Japanese Double Postcard size. */
    pjPaperJapaneseDoublePostcard(69),    
    /**@ Japanese Envelope Chou3 size. */
    pjPaperJapaneseEnvelopeChou3(73),    
    /**@ Japanese Envelope Chou3 Rotated size. */
    pjPaperJapaneseEnvelopeChou3Rotated(86),    
    /**@ Japanese Envelope Chou4 size. */
    pjPaperJapaneseEnvelopeChou4(74),    
    /**@ Japanese Envelope Chou4 Rotated size. */
    pjPaperJapaneseEnvelopeChou4Rotated(87),    
    /**@ Japanese Envelope Kaku2 size. */
    pjPaperJapaneseEnvelopeKaku2(71),    
    /**@ Japanese Envelope Kaku2 Rotated size. */
    pjPaperJapaneseEnvelopeKaku2Rotated(84),    
    /**@ Japanese Envelope Kaku3 size. */
    pjPaperJapaneseEnvelopeKaku3(72),    
    /**@ Japanese Envelope Kaku3 Rotated size. */
    pjPaperJapaneseEnvelopeKaku3Rotated(85),    
    /**@ Japanese Envelope You4 size. */
    pjPaperJapaneseEnvelopeYou4(91),    
    /**@ Japanese Envelope You4 Rotated size. */
    pjPaperJapaneseEnvelopeYou4Rotated(92),    
    /**@ Japanese Postcard size. */
    pjPaperJapanesePostcard(43),    
    /**@ Japanese Postcard Rotated size. */
    pjPaperJapanesePostcardRotated(81),    
    /**@ Envelope ledger size. */
    pjPaperLedger(4),    
    /**@ Envelope legal size. */
    pjPaperLegal(5),    
    /**@ Envelope Legal Extra size. */
    pjPaperLegalExtra(51),    
    /**@ Envelope Letter size. */
    pjPaperLetter(1),    
    /**@ Envelope Letter Extra size. */
    pjPaperLetterExtra(50),    
    /**@ Envelope Letter Extra Traverse size. */
    pjPaperLetterExtraTraverse(56),    
    /**@ Envelope Letter Plus size. */
    pjPaperLetterPlus(59),    
    /**@ Envelope Letter Rotated size. */
    pjPaperLetterRotated(75),    
    /**@ Envelope Letter Traverse size. */
    pjPaperLetterTraverse(54),    
    /**@ Envelope small letter size. */
    pjPaperLetterSmall(2),    
    /**@ Note size. */
    pjPaperNote(18),    
    /**@ PRC 16K size. */
    pjPaperPRC16K(93),    
    /**@ PRC 32K size. */
    pjPaperPRC32K(94),    
    /**@ PRC 32K Big size. */
    pjPaperPRC32KBig(95),    
    /**@ PRC Envelope1 size. */
    pjPaperPRCEnvelope1(96),    
    /**@ PRC Envelope10 size. */
    pjPaperPRCEnvelope10(105),    
    /**@ PRC Envelope10 Rotated size. */
    pjPaperPRCEnvelope10Rotated(118),    
    /**@ PRC Envelope16K size. */
    pjPaperPRCEnvelope16K(106),    
    /**@ PRC Envelope1 Rotated size. */
    pjPaperPRCEnvelope1Rotated(109),    
    /**@ PRC Envelope2 size. */
    pjPaperPRCEnvelope2(97),    
    /**@ PRC Envelope2 Rotated size. */
    pjPaperPRCEnvelope2Rotated(110),    
    /**@ PRC Envelope3 size. */
    pjPaperPRCEnvelope3(98),    
    /**@ PRC Envelope 32K size. */
    pjPaperPRCEnvelope32K(107),    
    /**@ PRC Envelope32K Big Rotated size. */
    pjPaperPRCEnvelope32KBigRotated(108),    
    /**@ PRC Envelope3 Rotated size. */
    pjPaperPRCEnvelope3Rotated(111),    
    /**@ PRC Envelope4 size. */
    pjPaperPRCEnvelope4(99),    
    /**@ PRC Envelope4 Rotated size. */
    pjPaperPRCEnvelope4Rotated(112),    
    /**@ PRC Envelope5 size. */
    pjPaperPRCEnvelope5(100),    
    /**@ PRC Envelope5 Rotated size. */
    pjPaperPRCEnvelope5Rotated(113),    
    /**@ PRC Envelope6 size. */
    pjPaperPRCEnvelope6(101),    
    /**@ PRC Envelope6 Rotated size. */
    pjPaperPRCEnvelope6Rotated(113),    
    /**@ PRC Envelope7 size. */
    pjPaperPRCEnvelope7(102),    
    /**@ PRC Envelope7 Rotated size. */
    pjPaperPRCEnvelope7Rotated(115),    
    /**@ PRC Envelope8 size. */
    pjPaperPRCEnvelope8(103),    
    /**@ PRC Envelope8 Rotated size. */
    pjPaperPRCEnvelope8Rotated(116),    
    /**@ PRC Envelope9 size. */
    pjPaperPRCEnvelope9(104),    
    /**@ PRC Envelope9 Rotated size. */
    pjPaperPRCEnvelope9Rotated(117),    
    /**@ Quarto size. */
    pjPaperQuarto(15),    
    /**@ Statement size. */
    pjPaperStatement(6),    
    /**@ Super A size. */
    pjPaperSuperA(57),    
    /**@ Super B size. */
    pjPaperSuperB(58),    
    /**@ Tabloid size. */
    pjPaperTabloid(3),    
    /**@ Tabloid Extra size. */
    pjPaperTabloidExtra(52),    
    /**@ User size. */
    pjPaperUser(255);

    private final long value;

    PjPaperSize(long value) {
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
