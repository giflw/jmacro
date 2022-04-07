package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visfieldformats">https://docs.microsoft.com/en-us/office/vba/api/visio.visfieldformats</a>}
*/
public enum VisFieldFormats implements COMEnum {
    
    /**@ No description provided */
    visFmt0PlDefUnits(3),    
    /**@ No description provided */
    visFmt0PlNoUnits(2),    
    /**@ No description provided */
    visFmt1PlDefUnits(5),    
    /**@ No description provided */
    visFmt1PlNoUnits(4),    
    /**@ No description provided */
    visFmt2PlDefUnits(7),    
    /**@ No description provided */
    visFmt2PlNoUnits(6),    
    /**@ No description provided */
    visFmt3PlDefUnits(9),    
    /**@ No description provided */
    visFmt3PlNoUnits(8),    
    /**@ No description provided */
    visFmtDateDDMMYY(27),    
    /**@ No description provided */
    visFmtDateDMMMMYYYY(29),    
    /**@ No description provided */
    visFmtDateDMMMYYYY(28),    
    /**@ No description provided */
    visFmtDateDMYY(26),    
    /**@ No description provided */
    visFmtDategeMMMMddd_K(62),    
    /**@ No description provided */
    visFmtDategeMMMMddddww_K(60),    
    /**@ No description provided */
    visFmtDategggemd_J(56),    
    /**@ No description provided */
    visFmtDategggemdww_J(54),    
    /**@ No description provided */
    visFmtDateLong(21),    
    /**@ No description provided */
    visFmtDateMDYY(22),    
    /**@ No description provided */
    visFmtDateMMDDYY(23),    
    /**@ No description provided */
    visFmtDateMmmDYYYY(24),    
    /**@ No description provided */
    visFmtDateMmmmDYYYY(25),    
    /**@ No description provided */
    visFmtDateTWNfyyyymmdd_C(53),    
    /**@ No description provided */
    visFmtDateTWNfYYYYMMDDD_C(50),    
    /**@ No description provided */
    visFmtDateTWNfyyyymmddww_C(52),    
    /**@ No description provided */
    visFmtDateTWNsYYYYMMDDD_C(51),    
    /**@ No description provided */
    visFmtDateShort(20),    
    /**@ No description provided */
    visFmtDatewwyyyymd_S(79),    
    /**@ No description provided */
    visFmtDatewwyyyymmdd_S(78),    
    /**@ No description provided */
    visFmtDateyy_mm_dd(65),    
    /**@ No description provided */
    visFmtDateyymmdd(45),    
    /**@ No description provided */
    visFmtDateyyyy_m_d(64),    
    /**@ No description provided */
    visFmtDateyyyymd_J(57),    
    /**@ No description provided */
    visFmtDateyyyymd_K(63),    
    /**@ No description provided */
    visFmtDateyyyymd_S(76),    
    /**@ No description provided */
    visFmtDateyyyymdww_J(55),    
    /**@ No description provided */
    visFmtDateyyyymdww_K(61),    
    /**@ No description provided */
    visFmtDateyyyymd(44),    
    /**@ No description provided */
    visFmtDateyyyymmdd_S(77),    
    /**@ No description provided */
    visFmtDateYYYYMMMDDD_C(59),    
    /**@ No description provided */
    visFmtDateYYYYMMMDDDWWW_C(58),    
    /**@ No description provided */
    visFmtDegrees(12),    
    /**@ No description provided */
    visFmtFeetAndInches1Pl(13),    
    /**@ No description provided */
    visFmtFeetAndInches2Pl(14),    
    /**@ No description provided */
    visFmtFeetAndInches(10),    
    /**@ No description provided */
    visFmtFraction1PlDefUnits(16),    
    /**@ No description provided */
    visFmtFraction1PlNoUnits(15),    
    /**@ No description provided */
    visFmtFraction2PlDefUnits(18),    
    /**@ No description provided */
    visFmtFraction2PlNoUnits(17),    
    /**@ No description provided */
    visFmtMsoDateEnglish(208),    
    /**@ No description provided */
    visFmtMsoDateISO(204),    
    /**@ No description provided */
    visFmtMsoDateLongDay(201),    
    /**@ No description provided */
    visFmtMsoDateLong(202),    
    /**@ No description provided */
    visFmtMsoDateMon_Yr(210),    
    /**@ No description provided */
    visFmtMsoDateMonthYr(209),    
    /**@ No description provided */
    visFmtMsoDateShortAbb(207),    
    /**@ No description provided */
    visFmtMsoDateShortAlt(203),    
    /**@ No description provided */
    visFmtMsoDateShortMon(205),    
    /**@ No description provided */
    visFmtMsoDateShortSlash(206),    
    /**@ No description provided */
    visFmtMsoDateShort(200),    
    /**@ No description provided */
    visFmtMsoFEExtra1(217),    
    /**@ No description provided */
    visFmtMsoFEExtra2(218),    
    /**@ No description provided */
    visFmtMsoFEExtra3(219),    
    /**@ No description provided */
    visFmtMsoFEExtra4(220),    
    /**@ No description provided */
    visFmtMsoFEExtra5(221),    
    /**@ No description provided */
    visFmtMsoTime24(215),    
    /**@ No description provided */
    visFmtMsoTimeDatePM(211),    
    /**@ No description provided */
    visFmtMsoTimeDateSecPM(212),    
    /**@ No description provided */
    visFmtMsoTimePM(213),    
    /**@ No description provided */
    visFmtMsoTimeSec24(216),    
    /**@ No description provided */
    visFmtMsoTimeSecPM(214),    
    /**@ No description provided */
    visFmtNumGenDefUnits(1),    
    /**@ No description provided */
    visFmtNumGenNoUnits(0),    
    /**@ No description provided */
    visFmtRadians(11),    
    /**@ No description provided */
    visFmtStrLower(38),    
    /**@ No description provided */
    visFmtStrNormal(37),    
    /**@ No description provided */
    visFmtStrUpper(39),    
    /**@ No description provided */
    visFmtTimeAMPM_hmm_C(70),    
    /**@ No description provided */
    visFmtTimeAMPM_hmm_J(68),    
    /**@ No description provided */
    visFmtTimeAMPM_hmm_K(72),    
    /**@ No description provided */
    visFmtTimeAMPMhhmm_S(81),    
    /**@ No description provided */
    visFmtTimeAMPMhmm_C(66),    
    /**@ No description provided */
    visFmtTimeAMPMhmm_J(46),    
    /**@ No description provided */
    visFmtTimeAMPMhmm_K(67),    
    /**@ No description provided */
    visFmtTimeAMPMhmm_S(80),    
    /**@ No description provided */
    visFmtTimeGen(30),    
    /**@ No description provided */
    visFmtTimeHHMM24(34),    
    /**@ No description provided */
    visFmtTimeHHMMAMPM_E(75),    
    /**@ No description provided */
    visFmtTimeHHMMAMPM(36),    
    /**@ No description provided */
    visFmtTimeHHMM(32),    
    /**@ No description provided */
    visFmtTimehmm_C(71),    
    /**@ No description provided */
    visFmtTimehmm_J(69),    
    /**@ No description provided */
    visFmtTimehmm_K(73),    
    /**@ No description provided */
    visFmtTimeHMM24(33),    
    /**@ No description provided */
    visFmtTimeHMMAMPM_E(74),    
    /**@ No description provided */
    visFmtTimeHMMAMPM(35),    
    /**@ No description provided */
    visFmtTimeHMM(31);

    private final long value;

    VisFieldFormats(long value) {
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
