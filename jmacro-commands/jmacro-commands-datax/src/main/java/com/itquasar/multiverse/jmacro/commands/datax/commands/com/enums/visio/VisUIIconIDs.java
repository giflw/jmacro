package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visuiiconids">https://docs.microsoft.com/en-us/office/vba/api/visio.visuiiconids</a>}
*/
public enum VisUIIconIDs implements COMEnum {
    
    /**@ No description provided */
    visIconIXACCEPT(85),    
    /**@ No description provided */
    visIconIXADDIN(149),    
    /**@ No description provided */
    visIconIXALIGNBOTTOM(69),    
    /**@ No description provided */
    visIconIXALIGNBOX(224),    
    /**@ No description provided */
    visIconIXALIGNCENTER(65),    
    /**@ No description provided */
    visIconIXALIGNLEFT(64),    
    /**@ No description provided */
    visIconIXALIGNMIDDLE(68),    
    /**@ No description provided */
    visIconIXALIGNRIGHT(66),    
    /**@ No description provided */
    visIconIXALIGNTOP(67),    
    /**@ No description provided */
    visIconIXALIGN(63),    
    /**@ No description provided */
    visIconIXARRANGE(83),    
    /**@ No description provided */
    visIconIXBOLD(50),    
    /**@ No description provided */
    visIconIXBRING_FORWARD(245),    
    /**@ No description provided */
    visIconIXBRINGFRONT(90),    
    /**@ No description provided */
    visIconIXBULLETS(113),    
    /**@ No description provided */
    visIconIXCANCEL(84),    
    /**@ No description provided */
    visIconIXCANTFIND(129),    
    /**@ No description provided */
    visIconIXCASCADE(94),    
    /**@ No description provided */
    visIconIXCHART(134),    
    /**@ No description provided */
    visIconIXCHECKMARK(128),    
    /**@ No description provided */
    visIconIXCLEAR(9),    
    /**@ No description provided */
    visIconIXCLIPART(130),    
    /**@ No description provided */
    visIconIXCLOSE(143),    
    /**@ No description provided */
    visIconIXCONNECTIONPOINTS(36),    
    /**@ No description provided */
    visIconIXCONNECTIONPTTOOL(30),    
    /**@ No description provided */
    visIconIXCONNECTORTOOL(96),    
    /**@ No description provided */
    visIconIXCONNECTSHAPES(75),    
    /**@ No description provided */
    visIconIXCONNPOINTS(229),    
    /**@ No description provided */
    visIconIXCOPY(7),    
    /**@ No description provided */
    visIconIXCORNERSTYLE(40),    
    /**@ No description provided */
    visIconIXCROP(29),    
    /**@ No description provided */
    visIconIXCUSTOM_BALLOON(162),    
    /**@ No description provided */
    visIconIXCUSTOM_BANK(153),    
    /**@ No description provided */
    visIconIXCUSTOM_BELL(159),    
    /**@ No description provided */
    visIconIXCUSTOM_BOX(173),    
    /**@ No description provided */
    visIconIXCUSTOM_CALC(164),    
    /**@ No description provided */
    visIconIXCUSTOM_CAMCORD(163),    
    /**@ No description provided */
    visIconIXCUSTOM_CARDS(169),    
    /**@ No description provided */
    visIconIXCUSTOM_CLUB(168),    
    /**@ No description provided */
    visIconIXCUSTOM_DIAMOND(166),    
    /**@ No description provided */
    visIconIXCUSTOM_DOWN(178),    
    /**@ No description provided */
    visIconIXCUSTOM_EIGHTBALL(191),    
    /**@ No description provided */
    visIconIXCUSTOM_EYE(190),    
    /**@ No description provided */
    visIconIXCUSTOM_FEET(174),    
    /**@ No description provided */
    visIconIXCUSTOM_FISH(182),    
    /**@ No description provided */
    visIconIXCUSTOM_FROWN(152),    
    /**@ No description provided */
    visIconIXCUSTOM_GEARS(184),    
    /**@ No description provided */
    visIconIXCUSTOM_HEART(165),    
    /**@ No description provided */
    visIconIXCUSTOM_HOURGLASS(186),    
    /**@ No description provided */
    visIconIXCUSTOM_KEYBOARD(180),    
    /**@ No description provided */
    visIconIXCUSTOM_KEY(183),    
    /**@ No description provided */
    visIconIXCUSTOM_LEFT(175),    
    /**@ No description provided */
    visIconIXCUSTOM_LOAD(155),    
    /**@ No description provided */
    visIconIXCUSTOM_MAN(187),    
    /**@ No description provided */
    visIconIXCUSTOM_MIC(157),    
    /**@ No description provided */
    visIconIXCUSTOM_MUG(170),    
    /**@ No description provided */
    visIconIXCUSTOM_NOTE(160),    
    /**@ No description provided */
    visIconIXCUSTOM_PAGES(181),    
    /**@ No description provided */
    visIconIXCUSTOM_PASTE(154),    
    /**@ No description provided */
    visIconIXCUSTOM_PENCIL(172),    
    /**@ No description provided */
    visIconIXCUSTOM_PHONE(161),    
    /**@ No description provided */
    visIconIXCUSTOM_QUESTION(192),    
    /**@ No description provided */
    visIconIXCUSTOM_RIGHT(176),    
    /**@ No description provided */
    visIconIXCUSTOM_RUN(189),    
    /**@ No description provided */
    visIconIXCUSTOM_SAVE(156),    
    /**@ No description provided */
    visIconIXCUSTOM_SCALES(185),    
    /**@ No description provided */
    visIconIXCUSTOM_SMILE(151),    
    /**@ No description provided */
    visIconIXCUSTOM_SPADE(167),    
    /**@ No description provided */
    visIconIXCUSTOM_SPEAKER(158),    
    /**@ No description provided */
    visIconIXCUSTOM_TACK(179),    
    /**@ No description provided */
    visIconIXCUSTOM_TRASH(171),    
    /**@ No description provided */
    visIconIXCUSTOM_UP(177),    
    /**@ No description provided */
    visIconIXCUSTOM_WOMAN(188),    
    /**@ No description provided */
    visIconIXCUSTOMPROP_WINDOW(215),    
    /**@ No description provided */
    visIconIXCUSTPROP(111),    
    /**@ No description provided */
    visIconIXCUT(6),    
    /**@ No description provided */
    visIconIXDCREROUTE_ASNEEDED(214),    
    /**@ No description provided */
    visIconIXDCREROUTE_FREELY(213),    
    /**@ No description provided */
    visIconIXDCREROUTE_NEVER(235),    
    /**@ No description provided */
    visIconIXDCREROUTE(236),    
    /**@ No description provided */
    visIconIXDECRINDENT(114),    
    /**@ No description provided */
    visIconIXDECRPARA(116),    
    /**@ No description provided */
    visIconIXDELETECOMMENT(195),    
    /**@ No description provided */
    visIconIXDELETE(196),    
    /**@ No description provided */
    visIconIXDESIGNMODE(119),    
    /**@ No description provided */
    visIconIXDHORZ_CENTER(72),    
    /**@ No description provided */
    visIconIXDHORZ_EQSPACE(71),    
    /**@ No description provided */
    visIconIXDISTRIBUTE(70),    
    /**@ No description provided */
    visIconIXDOUBLE_UNDERLINE(253),    
    /**@ No description provided */
    visIconIXDRAWINGEXPLORER(219),    
    /**@ No description provided */
    visIconIXDVERT_EQSPACE(73),    
    /**@ No description provided */
    visIconIXDVERT_MIDDLE(74),    
    /**@ No description provided */
    visIconIXDYNGRID(221),    
    /**@ No description provided */
    visIconIXEDITCOMMENT(194),    
    /**@ No description provided */
    visIconIXEDITSTEN(197),    
    /**@ No description provided */
    visIconIXEXCHANGEFOLDER(137),    
    /**@ No description provided */
    visIconIXFILLCOLOR(43),    
    /**@ No description provided */
    visIconIXFILLPATTERN(47),    
    /**@ No description provided */
    visIconIXFIND(138),    
    /**@ No description provided */
    visIconIXFIRSTPAGE(76),    
    /**@ No description provided */
    visIconIXFLIPHORIZONTAL(18),    
    /**@ No description provided */
    visIconIXFLIPVERTICAL(19),    
    /**@ No description provided */
    visIconIXFOLDER(144),    
    /**@ No description provided */
    visIconIXFORMATPAINTER(101),    
    /**@ No description provided */
    visIconIXFULLSCREEN(124),    
    /**@ No description provided */
    visIconIXGLUE(32),    
    /**@ No description provided */
    visIconIXGOBACK(107),    
    /**@ No description provided */
    visIconIXGOFORWARD(108),    
    /**@ No description provided */
    visIconIXGRID(34),    
    /**@ No description provided */
    visIconIXGROUP(92),    
    /**@ No description provided */
    visIconIXGUIDES(226),    
    /**@ No description provided */
    visIconIXGUIDE(35),    
    /**@ No description provided */
    visIconIXHELPASSISTANT(133),    
    /**@ No description provided */
    visIconIXHELPBOOK(125),    
    /**@ No description provided */
    visIconIXHELPMODE(102),    
    /**@ No description provided */
    visIconIXICONBUCKET(87),    
    /**@ No description provided */
    visIconIXICONLASSO(88),    
    /**@ No description provided */
    visIconIXICONNAME(80),    
    /**@ No description provided */
    visIconIXICONONLY(81),    
    /**@ No description provided */
    visIconIXICONPENCIL(86),    
    /**@ No description provided */
    visIconIXICONSELNET(89),    
    /**@ No description provided */
    visIconIXIMAGE(131),    
    /**@ No description provided */
    visIconIXINCRINDENT(115),    
    /**@ No description provided */
    visIconIXINCRPARA(117),    
    /**@ No description provided */
    visIconIXINSERT_EQUATION(250),    
    /**@ No description provided */
    visIconIXINSERT_OBJECT(248),    
    /**@ No description provided */
    visIconIXINSERTCOMMENT(193),    
    /**@ No description provided */
    visIconIXINSERTCONTROL(118),    
    /**@ No description provided */
    visIconIXINSERTHYPERLINK(105),    
    /**@ No description provided */
    visIconIXITALIC(51),    
    /**@ No description provided */
    visIconIXLARGE_PADLOCK(249),    
    /**@ No description provided */
    visIconIXLASTPAGE(77),    
    /**@ No description provided */
    visIconIXLAYERPROPERTIES(103),    
    /**@ No description provided */
    visIconIXLAYOUTSHAPES(104),    
    /**@ No description provided */
    visIconIXLINECOLOR(44),    
    /**@ No description provided */
    visIconIXLINEEND(41),    
    /**@ No description provided */
    visIconIXLINEJUMPSTYLE_2PT(208),    
    /**@ No description provided */
    visIconIXLINEJUMPSTYLE_3PT(209),    
    /**@ No description provided */
    visIconIXLINEJUMPSTYLE_4PT(210),    
    /**@ No description provided */
    visIconIXLINEJUMPSTYLE_5PT(211),    
    /**@ No description provided */
    visIconIXLINEJUMPSTYLE_6PT(212),    
    /**@ No description provided */
    visIconIXLINEJUMPSTYLE_ARC(204),    
    /**@ No description provided */
    visIconIXLINEJUMPSTYLE_GAP(205),    
    /**@ No description provided */
    visIconIXLINEJUMPSTYLE_PAGE(218),    
    /**@ No description provided */
    visIconIXLINEJUMPSTYLE_SQUARE(206),    
    /**@ No description provided */
    visIconIXLINEJUMPSTYLE_TRIANGLE(207),    
    /**@ No description provided */
    visIconIXLINEPATTERN(46),    
    /**@ No description provided */
    visIconIXLINETOOL(22),    
    /**@ No description provided */
    visIconIXLINEWEIGHT(45),    
    /**@ No description provided */
    visIconIXMACROS(121),    
    /**@ No description provided */
    visIconIXMAILRECPT(135),    
    /**@ No description provided */
    visIconIXMAXIMIZE(142),    
    /**@ No description provided */
    visIconIXMINIMIZE(141),    
    /**@ No description provided */
    visIconIXNAMEONLY(82),    
    /**@ No description provided */
    visIconIXNEWSTEN(198),    
    /**@ No description provided */
    visIconIXNEWWINDOW(39),    
    /**@ No description provided */
    visIconIXNEW(0),    
    /**@ No description provided */
    visIconIXNEXTPAGE(14),    
    /**@ No description provided */
    visIconIXOPENSTENCIL(2),    
    /**@ No description provided */
    visIconIXOPEN(1),    
    /**@ No description provided */
    visIconIXOVALTOOL(25),    
    /**@ No description provided */
    visIconIXPAGEBREAKS(78),    
    /**@ No description provided */
    visIconIXPAGELINEJUMPCODE_DISP(217),    
    /**@ No description provided */
    visIconIXPAGELINEJUMPCODE_HORZ(201),    
    /**@ No description provided */
    visIconIXPAGELINEJUMPCODE_LASTROUTED(203),    
    /**@ No description provided */
    visIconIXPAGELINEJUMPCODE_NONE(200),    
    /**@ No description provided */
    visIconIXPAGELINEJUMPCODE_RDISP(231),    
    /**@ No description provided */
    visIconIXPAGELINEJUMPCODE_VERT(202),    
    /**@ No description provided */
    visIconIXPAGEPLOW(216),    
    /**@ No description provided */
    visIconIXPANZOOM(139),    
    /**@ No description provided */
    visIconIXPASTE(8),    
    /**@ No description provided */
    visIconIXPENCILTOOL(21),    
    /**@ No description provided */
    visIconIXPOINTERTOOL(20),    
    /**@ No description provided */
    visIconIXPOINTSIZEDOWN(48),    
    /**@ No description provided */
    visIconIXPOINTSIZEUP(49),    
    /**@ No description provided */
    visIconIXPREVIOUSPAGE(13),    
    /**@ No description provided */
    visIconIXPRINTPREVIEW(5),    
    /**@ No description provided */
    visIconIXPRINT(4),    
    /**@ No description provided */
    visIconIXQTRARCTOOL(23),    
    /**@ No description provided */
    visIconIXRECTANGLETOOL(24),    
    /**@ No description provided */
    visIconIXREDO(11),    
    /**@ No description provided */
    visIconIXREPEAT(12),    
    /**@ No description provided */
    visIconIXREPLACE(252),    
    /**@ No description provided */
    visIconIXRESTORE(140),    
    /**@ No description provided */
    visIconIXROTATECLOCKWISE(37),    
    /**@ No description provided */
    visIconIXROTATECOUNTERCLOCKWISE(38),    
    /**@ No description provided */
    visIconIXROTATETEXT(112),    
    /**@ No description provided */
    visIconIXROTATETOOL(28),    
    /**@ No description provided */
    visIconIXROUTINGRECPT(136),    
    /**@ No description provided */
    visIconIXRULER(33),    
    /**@ No description provided */
    visIconIXRULSUB(222),    
    /**@ No description provided */
    visIconIXSAVE(3),    
    /**@ No description provided */
    visIconIXSEARCHTHEWEB(106),    
    /**@ No description provided */
    visIconIXSEND_BACKWARD(246),    
    /**@ No description provided */
    visIconIXSENDBACK(91),    
    /**@ No description provided */
    visIconIXSHADOWSTYLE(42),    
    /**@ No description provided */
    visIconIXSHAPE_INTERSECT(220),    
    /**@ No description provided */
    visIconIXSHAPEEXPLORER(126),    
    /**@ No description provided */
    visIconIXSHAPEEXPL(110),    
    /**@ No description provided */
    visIconIXSHAPEEXT(230),    
    /**@ No description provided */
    visIconIXSHAPEGEO(225),    
    /**@ No description provided */
    visIconIXSHAPEHAND(227),    
    /**@ No description provided */
    visIconIXSHAPESHEET(120),    
    /**@ No description provided */
    visIconIXSHAPEVERT(228),    
    /**@ No description provided */
    visIconIXSHOWDOCSTEN(199),    
    /**@ No description provided */
    visIconIXSINGLETILE(99),    
    /**@ No description provided */
    visIconIXSIZEPOS(150),    
    /**@ No description provided */
    visIconIXSMALL_PADLOCK(247),    
    /**@ No description provided */
    visIconIXSMALLCAPS(234),    
    /**@ No description provided */
    visIconIXSNAP_LINES(232),    
    /**@ No description provided */
    visIconIXSNAPTOGRID(223),    
    /**@ No description provided */
    visIconIXSNAP(31),    
    /**@ No description provided */
    visIconIXSPELLING(100),    
    /**@ No description provided */
    visIconIXSPLINETOOL(79),    
    /**@ No description provided */
    visIconIXSTAMPTOOL(26),    
    /**@ No description provided */
    visIconIXSTRIKETHROUGH(233),    
    /**@ No description provided */
    visIconIXSTYLE(251),    
    /**@ No description provided */
    visIconIXSUBSCRIPT(54),    
    /**@ No description provided */
    visIconIXSUPERSCRIPT(53),    
    /**@ No description provided */
    visIconIXTEXTALIGNBOTTOM(62),    
    /**@ No description provided */
    visIconIXTEXTALIGNCENTER(57),    
    /**@ No description provided */
    visIconIXTEXTALIGNJUSTIFY(59),    
    /**@ No description provided */
    visIconIXTEXTALIGNLEFT(56),    
    /**@ No description provided */
    visIconIXTEXTALIGNMIDDLE(61),    
    /**@ No description provided */
    visIconIXTEXTALIGNRIGHT(58),    
    /**@ No description provided */
    visIconIXTEXTALIGNTOP(60),    
    /**@ No description provided */
    visIconIXTEXTBLOCKTOOL(97),    
    /**@ No description provided */
    visIconIXTEXTCOLOR(55),    
    /**@ No description provided */
    visIconIXTEXTOOL(27),    
    /**@ No description provided */
    visIconIXTILE(95),    
    /**@ No description provided */
    visIconIXUNDERLINE(52),    
    /**@ No description provided */
    visIconIXUNDO(10),    
    /**@ No description provided */
    visIconIXUNGROUP(93),    
    /**@ No description provided */
    visIconIXVBAMACRO(148),    
    /**@ No description provided */
    visIconIXVBEDITOR(122),    
    /**@ No description provided */
    visIconIXVERTICALTEXT(123),    
    /**@ No description provided */
    visIconIXVSD(145),    
    /**@ No description provided */
    visIconIXVSS(146),    
    /**@ No description provided */
    visIconIXVST(147),    
    /**@ No description provided */
    visIconIXWEBPAGE(127),    
    /**@ No description provided */
    visIconIXWEBTOOLBAR(109),    
    /**@ No description provided */
    visIconIXWHOLEPAGE(98),    
    /**@ No description provided */
    visIconIXWORDART(132),    
    /**@ No description provided */
    visIconIXZOOM100(17),    
    /**@ No description provided */
    visIconIXZOOMIN(16),    
    /**@ No description provided */
    visIconIXZOOMOUT(15);

    private final long value;

    VisUIIconIDs(long value) {
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
