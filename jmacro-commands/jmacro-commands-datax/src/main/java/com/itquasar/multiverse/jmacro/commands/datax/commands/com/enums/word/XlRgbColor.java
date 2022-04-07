package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlrgbcolor">https://docs.microsoft.com/en-us/office/vba/api/word.xlrgbcolor</a>}
*/
public enum XlRgbColor implements COMEnum {
    
    /**@ Alice Blue */
    xlAliceBlue(16775408),    
    /**@ Antique White */
    xlAntiqueWhite(14150650),    
    /**@ Aqua */
    xlAqua(16776960),    
    /**@ Aquamarine */
    xlAquamarine(13959039),    
    /**@ Azure */
    xlAzure(16777200),    
    /**@ Beige */
    xlBeige(14480885),    
    /**@ Bisque */
    xlBisque(12903679),    
    /**@ Black */
    xlBlack(0),    
    /**@ Blanched Almond */
    xlBlanchedAlmond(13495295),    
    /**@ Blue */
    xlBlue(16711680),    
    /**@ Blue Violet */
    xlBlueViolet(14822282),    
    /**@ Brown */
    xlBrown(2763429),    
    /**@ Burly Wood */
    xlBurlyWood(8894686),    
    /**@ Cadet Blue */
    xlCadetBlue(10526303),    
    /**@ Chartreuse */
    xlChartreuse(65407),    
    /**@ Coral */
    xlCoral(5275647),    
    /**@ Cornflower Blue */
    xlCornflowerBlue(15570276),    
    /**@ Cornsilk */
    xlCornsilk(14481663),    
    /**@ Crimson */
    xlCrimson(3937500),    
    /**@ Dark Blue */
    xlDarkBlue(9109504),    
    /**@ Dark Cyan */
    xlDarkCyan(9145088),    
    /**@ Dark Goldenrod */
    xlDarkGoldenrod(755384),    
    /**@ Dark Gray */
    xlDarkGray(11119017),    
    /**@ Dark Green */
    xlDarkGreen(25600),    
    /**@ Dark Grey */
    xlDarkGrey(11119017),    
    /**@ Dark Khaki */
    xlDarkKhaki(7059389),    
    /**@ Dark Magenta */
    xlDarkMagenta(9109643),    
    /**@ Dark Olive Green */
    xlDarkOliveGreen(3107669),    
    /**@ Dark Orange */
    xlDarkOrange(36095),    
    /**@ Dark Orchid */
    xlDarkOrchid(13382297),    
    /**@ Dark Red */
    xlDarkRed(139),    
    /**@ Dark Salmon */
    xlDarkSalmon(8034025),    
    /**@ Dark Sea Green */
    xlDarkSeaGreen(9419919),    
    /**@ Dark Slate Blue */
    xlDarkSlateBlue(9125192),    
    /**@ Dark Slate Gray */
    xlDarkSlateGray(5197615),    
    /**@ Dark Slate Grey */
    xlDarkSlateGrey(5197615),    
    /**@ Dark Turquoise */
    xlDarkTurquoise(13749760),    
    /**@ Dark Violet */
    xlDarkViolet(13828244),    
    /**@ Deep Pink */
    xlDeepPink(9639167),    
    /**@ Deep Sky Blue */
    xlDeepSkyBlue(16760576),    
    /**@ Dim Gray */
    xlDimGray(6908265),    
    /**@ Dim Grey */
    xlDimGrey(6908265),    
    /**@ Dodger Blue */
    xlDodgerBlue(16748574),    
    /**@ Fire Brick */
    xlFireBrick(2237106),    
    /**@ Floral White */
    xlFloralWhite(15792895),    
    /**@ Forest Green */
    xlForestGreen(2263842),    
    /**@ Fuchsia */
    xlFuchsia(16711935),    
    /**@ Gainsboro */
    xlGainsboro(14474460),    
    /**@ Ghost White */
    xlGhostWhite(16775416),    
    /**@ Gold */
    xlGold(55295),    
    /**@ Goldenrod */
    xlGoldenrod(2139610),    
    /**@ Gray */
    xlGray(8421504),    
    /**@ Green */
    xlGreen(32768),    
    /**@ Green Yellow */
    xlGreenYellow(3145645),    
    /**@ Grey */
    xlGrey(8421504),    
    /**@ Honeydew */
    xlHoneydew(15794160),    
    /**@ Hot Pink */
    xlHotPink(11823615),    
    /**@ Indian Red */
    xlIndianRed(6053069),    
    /**@ Indigo */
    xlIndigo(8519755),    
    /**@ Ivory */
    xlIvory(15794175),    
    /**@ Khaki */
    xlKhaki(9234160),    
    /**@ Lavender */
    xlLavender(16443110),    
    /**@ Lavender Blush */
    xlLavenderBlush(16118015),    
    /**@ Lawn Green */
    xlLawnGreen(64636),    
    /**@ Lemon Chiffon */
    xlLemonChiffon(13499135),    
    /**@ Light Blue */
    xlLightBlue(15128749),    
    /**@ Light Coral */
    xlLightCoral(8421616),    
    /**@ Light Cyan */
    xlLightCyan(9145088),    
    /**@ LightGoldenrodYellow */
    xlLightGoldenrodYellow(13826810),    
    /**@ Light Gray */
    xlLightGray(13882323),    
    /**@ Light Green */
    xlLightGreen(9498256),    
    /**@ Light Grey */
    xlLightGrey(13882323),    
    /**@ Light Pink */
    xlLightPink(12695295),    
    /**@ Light Salmon */
    xlLightSalmon(8036607),    
    /**@ Light Sea Green */
    xlLightSeaGreen(11186720),    
    /**@ Light Sky Blue */
    xlLightSkyBlue(16436871),    
    /**@ Light Slate Gray */
    xlLightSlateGray(10061943),    
    /**@ Light Slate Grey */
    xlLightSlateGrey(10061943),    
    /**@ Light Steel Blue */
    xlLightSteelBlue(14599344),    
    /**@ Light Yellow */
    xlLightYellow(14745599),    
    /**@ Lime */
    xlLime(65280),    
    /**@ Lime Green */
    xlLimeGreen(3329330),    
    /**@ Linen */
    xlLinen(15134970),    
    /**@ Maroon */
    xlMaroon(128),    
    /**@ Medium Aquamarine */
    xlMediumAquamarine(11206502),    
    /**@ Medium Blue */
    xlMediumBlue(13434880),    
    /**@ Medium Orchid */
    xlMediumOrchid(13850042),    
    /**@ Medium Purple */
    xlMediumPurple(14381203),    
    /**@ Medium Sea Green */
    xlMediumSeaGreen(7451452),    
    /**@ Medium Slate Blue */
    xlMediumSlateBlue(15624315),    
    /**@ Medium Spring Green */
    xlMediumSpringGreen(10156544),    
    /**@ Medium Turquoise */
    xlMediumTurquoise(13422920),    
    /**@ Medium Violet Red */
    xlMediumVioletRed(8721863),    
    /**@ Midnight Blue */
    xlMidnightBlue(7346457),    
    /**@ Mint Cream */
    xlMintCream(16449525),    
    /**@ Misty Rose */
    xlMistyRose(14804223),    
    /**@ Moccasin */
    xlMoccasin(11920639),    
    /**@ Navajo White */
    xlNavajoWhite(11394815),    
    /**@ Navy */
    xlNavy(8388608),    
    /**@ Navy Blue */
    xlNavyBlue(8388608),    
    /**@ Old Lace */
    xlOldLace(15136253),    
    /**@ Olive */
    xlOlive(32896),    
    /**@ Olive Drab */
    xlOliveDrab(2330219),    
    /**@ Orange */
    xlOrange(42495),    
    /**@ Orange Red */
    xlOrangeRed(17919),    
    /**@ Orchid */
    xlOrchid(14053594),    
    /**@ Pale Goldenrod */
    xlPaleGoldenrod(7071982),    
    /**@ Pale Green */
    xlPaleGreen(10025880),    
    /**@ Pale Turquoise */
    xlPaleTurquoise(15658671),    
    /**@ Pale Violet Red */
    xlPaleVioletRed(9662683),    
    /**@ Papaya Whip */
    xlPapayaWhip(14020607),    
    /**@ Peach Puff */
    xlPeachPuff(12180223),    
    /**@ Peru */
    xlPeru(4163021),    
    /**@ Pink */
    xlPink(13353215),    
    /**@ Plum */
    xlPlum(14524637),    
    /**@ Powder Blue */
    xlPowderBlue(15130800),    
    /**@ Purple */
    xlPurple(8388736),    
    /**@ Red */
    xlRed(255),    
    /**@ Rosy Brown */
    xlRosyBrown(9408444),    
    /**@ Royal Blue */
    xlRoyalBlue(14772545),    
    /**@ Salmon */
    xlSalmon(7504122),    
    /**@ Sandy Brown */
    xlSandyBrown(6333684),    
    /**@ Sea Green */
    xlSeaGreen(5737262),    
    /**@ Seashell */
    xlSeashell(15660543),    
    /**@ Sienna */
    xlSienna(2970272),    
    /**@ Silver */
    xlSilver(12632256),    
    /**@ Sky Blue */
    xlSkyBlue(15453831),    
    /**@ Slate Blue */
    xlSlateBlue(13458026),    
    /**@ Slate Gray */
    xlSlateGray(9470064),    
    /**@ Slate Grey */
    xlSlateGrey(9470064),    
    /**@ Snow */
    xlSnow(16448255),    
    /**@ Spring Green */
    xlSpringGreen(8388352),    
    /**@ Steel Blue */
    xlSteelBlue(11829830),    
    /**@ Tan */
    xlTan(9221330),    
    /**@ Teal */
    xlTeal(8421376),    
    /**@ Thistle */
    xlThistle(14204888),    
    /**@ Tomato */
    xlTomato(4678655),    
    /**@ Turquoise */
    xlTurquoise(13688896),    
    /**@ Violet */
    xlViolet(15631086),    
    /**@ Wheat */
    xlWheat(11788021),    
    /**@ White */
    xlWhite(16777215),    
    /**@ White Smoke */
    xlWhiteSmoke(16119285),    
    /**@ Yellow */
    xlYellow(65535),    
    /**@ Yellow Green */
    xlYellowGreen(3329434);

    private final long value;

    XlRgbColor(long value) {
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
