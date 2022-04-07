package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visthemecolors">https://docs.microsoft.com/en-us/office/vba/api/visio.visthemecolors</a>}
*/
public enum VisThemeColors implements COMEnum {
    
    /**@ No theme colors */
    visThemeColorsNone(0),    
    /**@ Monochrome */
    visThemeColorsMonochrome(1),    
    /**@ Microsoft Office colors */
    visThemeColorsOffice(2),    
    /**@ Median */
    visThemeColorsMedian(3),    
    /**@ Concourse */
    visThemeColorsConcourse(4),    
    /**@ Solstice */
    visThemeColorsSolstice(5),    
    /**@ Technic */
    visThemeColorsTechnic(6),    
    /**@ Paper */
    visThemeColorsPaper(7),    
    /**@ Foundry */
    visThemeColorsFoundry(8),    
    /**@ Apex */
    visThemeColorsApex(9),    
    /**@ Trek */
    visThemeColorsTrek(10),    
    /**@ Module */
    visThemeColorsModule(11),    
    /**@ Oriel */
    visThemeColorsOriel(12),    
    /**@ Aspect */
    visThemeColorsAspect(13),    
    /**@ Equity */
    visThemeColorsEquity(14),    
    /**@ Civic */
    visThemeColorsCivic(15),    
    /**@ Opulent */
    visThemeColorsOpulent(16),    
    /**@ Verve */
    visThemeColorsVerve(17),    
    /**@ Origin */
    visThemeColorsOrigin(18),    
    /**@ Urban */
    visThemeColorsUrban(19),    
    /**@ Flow */
    visThemeColorsFlow(20),    
    /**@ Metro */
    visThemeColorsMetro(21),    
    /**@ Microsoft Office colors light */
    visThemeColorsOfficeLight(22),    
    /**@ Microsoft Office colors dark */
    visThemeColorsOfficeDark(23),    
    /**@ Median light */
    visThemeColorsMedianLight(24),    
    /**@ Median dark */
    visThemeColorsMedianDark(25),    
    /**@ Concourse light */
    visThemeColorsConcourseLight(26),    
    /**@ Concourse dark */
    visThemeColorsConcourseDark(27),    
    /**@ Paper light */
    visThemeColorsPaperLight(28),    
    /**@ Paper dark */
    visThemeColorsPaperDark(29),    
    /**@ Foundry light */
    visThemeColorsFoundryLight(30),    
    /**@ Foundry dark */
    visThemeColorsFoundryDark(31),    
    /**@ Equity light */
    visThemeColorsEquityLight(32),    
    /**@ Equity dark */
    visThemeColorsEquityDark(33),    
    /**@ Verve light */
    visThemeColorsVerveLight(34),    
    /**@ Verve dark */
    visThemeColorsVerveDark(35),    
    /**@ Basic */
    visThemeColorsBasic(36),    
    /**@ Adjacency */
    visThemeColorsAdjacency(37),    
    /**@ Angles */
    visThemeColorsAngles(38),    
    /**@ Apothecary */
    visThemeColorsApothecary(39),    
    /**@ Austin */
    visThemeColorsAustin(40),    
    /**@ Essential */
    visThemeColorsEssential(41),    
    /**@ Black tie */
    visThemeColorsBlackTie(42),    
    /**@ Composite */
    visThemeColorsComposite(43),    
    /**@ Clarity */
    visThemeColorsClarity(44),    
    /**@ Elemental */
    visThemeColorsElemental(45),    
    /**@ Executive */
    visThemeColorsExecutive(46),    
    /**@ Grid */
    visThemeColorsGrid(47),    
    /**@ Hardcover */
    visThemeColorsHardcover(48),    
    /**@ Horizon */
    visThemeColorsHorizon(49),    
    /**@ Newsprint */
    visThemeColorsNewsprint(50),    
    /**@ Couture */
    visThemeColorsCouture(51),    
    /**@ Perspective */
    visThemeColorsPerspective(52),    
    /**@ Pushpin */
    visThemeColorsPushpin(53),    
    /**@ Slipstream */
    visThemeColorsSlipstream(54),    
    /**@ Thatch */
    visThemeColorsThatch(55),    
    /**@ Waveform */
    visThemeColorsWaveform(56);

    private final long value;

    VisThemeColors(long value) {
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
