package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlrgbcolor">https://docs.microsoft.com/en-us/office/vba/api/excel.xlrgbcolor</a>}
*/
public enum XlRgbColor implements COMEnum {
    
    /**@ Alice Blue */
    rgbAliceBlue(16775408),    
    /**@ Antique White */
    rgbAntiqueWhite(14150650),    
    /**@ Aqua */
    rgbAqua(16776960),    
    /**@ Aquamarine */
    rgbAquamarine(13959039),    
    /**@ Azure */
    rgbAzure(16777200),    
    /**@ Beige */
    rgbBeige(14480885),    
    /**@ Bisque */
    rgbBisque(12903679),    
    /**@ Black */
    rgbBlack(0),    
    /**@ Blanched Almond */
    rgbBlanchedAlmond(13495295),    
    /**@ Blue */
    rgbBlue(16711680),    
    /**@ Blue Violet */
    rgbBlueViolet(14822282),    
    /**@ Brown */
    rgbBrown(2763429),    
    /**@ Burly Wood */
    rgbBurlyWood(8894686),    
    /**@ Cadet Blue */
    rgbCadetBlue(10526303),    
    /**@ Chartreuse */
    rgbChartreuse(65407),    
    /**@ Coral */
    rgbCoral(5275647),    
    /**@ Cornflower Blue */
    rgbCornflowerBlue(15570276),    
    /**@ Cornsilk */
    rgbCornsilk(14481663),    
    /**@ Crimson */
    rgbCrimson(3937500),    
    /**@ Dark Blue */
    rgbDarkBlue(9109504),    
    /**@ Dark Cyan */
    rgbDarkCyan(9145088),    
    /**@ Dark Goldenrod */
    rgbDarkGoldenrod(755384),    
    /**@ Dark Gray */
    rgbDarkGray(11119017),    
    /**@ Dark Green */
    rgbDarkGreen(25600),    
    /**@ Dark Grey */
    rgbDarkGrey(11119017),    
    /**@ Dark Khaki */
    rgbDarkKhaki(7059389),    
    /**@ Dark Magenta */
    rgbDarkMagenta(9109643),    
    /**@ Dark Olive Green */
    rgbDarkOliveGreen(3107669),    
    /**@ Dark Orange */
    rgbDarkOrange(36095),    
    /**@ Dark Orchid */
    rgbDarkOrchid(13382297),    
    /**@ Dark Red */
    rgbDarkRed(139),    
    /**@ Dark Salmon */
    rgbDarkSalmon(8034025),    
    /**@ Dark Sea Green */
    rgbDarkSeaGreen(9419919),    
    /**@ Dark Slate Blue */
    rgbDarkSlateBlue(9125192),    
    /**@ Dark Slate Gray */
    rgbDarkSlateGray(5197615),    
    /**@ Dark Slate Grey */
    rgbDarkSlateGrey(5197615),    
    /**@ Dark Turquoise */
    rgbDarkTurquoise(13749760),    
    /**@ Dark Violet */
    rgbDarkViolet(13828244),    
    /**@ Deep Pink */
    rgbDeepPink(9639167),    
    /**@ Deep Sky Blue */
    rgbDeepSkyBlue(16760576),    
    /**@ Dim Gray */
    rgbDimGray(6908265),    
    /**@ Dim Grey */
    rgbDimGrey(6908265),    
    /**@ Dodger Blue */
    rgbDodgerBlue(16748574),    
    /**@ Fire Brick */
    rgbFireBrick(2237106),    
    /**@ Floral White */
    rgbFloralWhite(15792895),    
    /**@ Forest Green */
    rgbForestGreen(2263842),    
    /**@ Fuchsia */
    rgbFuchsia(16711935),    
    /**@ Gainsboro */
    rgbGainsboro(14474460),    
    /**@ Ghost White */
    rgbGhostWhite(16775416),    
    /**@ Gold */
    rgbGold(55295),    
    /**@ Goldenrod */
    rgbGoldenrod(2139610),    
    /**@ Gray */
    rgbGray(8421504),    
    /**@ Green */
    rgbGreen(32768),    
    /**@ Green Yellow */
    rgbGreenYellow(3145645),    
    /**@ Grey */
    rgbGrey(8421504),    
    /**@ Honeydew */
    rgbHoneydew(15794160),    
    /**@ Hot Pink */
    rgbHotPink(11823615),    
    /**@ Indian Red */
    rgbIndianRed(6053069),    
    /**@ Indigo */
    rgbIndigo(8519755),    
    /**@ Ivory */
    rgbIvory(15794175),    
    /**@ Khaki */
    rgbKhaki(9234160),    
    /**@ Lavender */
    rgbLavender(16443110),    
    /**@ Lavender Blush */
    rgbLavenderBlush(16118015),    
    /**@ Lawn Green */
    rgbLawnGreen(64636),    
    /**@ Lemon Chiffon */
    rgbLemonChiffon(13499135),    
    /**@ Light Blue */
    rgbLightBlue(15128749),    
    /**@ Light Coral */
    rgbLightCoral(8421616),    
    /**@ Light Cyan */
    rgbLightCyan(9145088),    
    /**@ LightGoldenrodYellow */
    rgbLightGoldenrodYellow(13826810),    
    /**@ Light Gray */
    rgbLightGray(13882323),    
    /**@ Light Green */
    rgbLightGreen(9498256),    
    /**@ Light Grey */
    rgbLightGrey(13882323),    
    /**@ Light Pink */
    rgbLightPink(12695295),    
    /**@ Light Salmon */
    rgbLightSalmon(8036607),    
    /**@ Light Sea Green */
    rgbLightSeaGreen(11186720),    
    /**@ Light Sky Blue */
    rgbLightSkyBlue(16436871),    
    /**@ Light Slate Gray */
    rgbLightSlateGray(10061943),    
    /**@ Light Steel Blue */
    rgbLightSteelBlue(14599344),    
    /**@ Light Yellow */
    rgbLightYellow(14745599),    
    /**@ Lime */
    rgbLime(65280),    
    /**@ Lime Green */
    rgbLimeGreen(3329330),    
    /**@ Linen */
    rgbLinen(15134970),    
    /**@ Maroon */
    rgbMaroon(128),    
    /**@ Medium Aquamarine */
    rgbMediumAquamarine(11206502),    
    /**@ Medium Blue */
    rgbMediumBlue(13434880),    
    /**@ Medium Orchid */
    rgbMediumOrchid(13850042),    
    /**@ Medium Purple */
    rgbMediumPurple(14381203),    
    /**@ Medium Sea Green */
    rgbMediumSeaGreen(7451452),    
    /**@ Medium Slate Blue */
    rgbMediumSlateBlue(15624315),    
    /**@ Medium Spring Green */
    rgbMediumSpringGreen(10156544),    
    /**@ Medium Turquoise */
    rgbMediumTurquoise(13422920),    
    /**@ Medium Violet Red */
    rgbMediumVioletRed(8721863),    
    /**@ Midnight Blue */
    rgbMidnightBlue(7346457),    
    /**@ Mint Cream */
    rgbMintCream(16449525),    
    /**@ Misty Rose */
    rgbMistyRose(14804223),    
    /**@ Moccasin */
    rgbMoccasin(11920639),    
    /**@ Navajo White */
    rgbNavajoWhite(11394815),    
    /**@ Navy */
    rgbNavy(8388608),    
    /**@ Navy Blue */
    rgbNavyBlue(8388608),    
    /**@ Old Lace */
    rgbOldLace(15136253),    
    /**@ Olive */
    rgbOlive(32896),    
    /**@ Olive Drab */
    rgbOliveDrab(2330219),    
    /**@ Orange */
    rgbOrange(42495),    
    /**@ Orange Red */
    rgbOrangeRed(17919),    
    /**@ Orchid */
    rgbOrchid(14053594),    
    /**@ Pale Goldenrod */
    rgbPaleGoldenrod(7071982),    
    /**@ Pale Green */
    rgbPaleGreen(10025880),    
    /**@ Pale Turquoise */
    rgbPaleTurquoise(15658671),    
    /**@ Pale Violet Red */
    rgbPaleVioletRed(9662683),    
    /**@ Papaya Whip */
    rgbPapayaWhip(14020607),    
    /**@ Peach Puff */
    rgbPeachPuff(12180223),    
    /**@ Peru */
    rgbPeru(4163021),    
    /**@ Pink */
    rgbPink(13353215),    
    /**@ Plum */
    rgbPlum(14524637),    
    /**@ Powder Blue */
    rgbPowderBlue(15130800),    
    /**@ Purple */
    rgbPurple(8388736),    
    /**@ Red */
    rgbRed(255),    
    /**@ Rosy Brown */
    rgbRosyBrown(9408444),    
    /**@ Royal Blue */
    rgbRoyalBlue(14772545),    
    /**@ Salmon */
    rgbSalmon(7504122),    
    /**@ Sandy Brown */
    rgbSandyBrown(6333684),    
    /**@ Sea Green */
    rgbSeaGreen(5737262),    
    /**@ Seashell */
    rgbSeashell(15660543),    
    /**@ Sienna */
    rgbSienna(2970272),    
    /**@ Silver */
    rgbSilver(12632256),    
    /**@ Sky Blue */
    rgbSkyBlue(15453831),    
    /**@ Slate Blue */
    rgbSlateBlue(13458026),    
    /**@ Slate Gray */
    rgbSlateGray(9470064),    
    /**@ Snow */
    rgbSnow(16448255),    
    /**@ Spring Green */
    rgbSpringGreen(8388352),    
    /**@ Steel Blue */
    rgbSteelBlue(11829830),    
    /**@ Tan */
    rgbTan(9221330),    
    /**@ Teal */
    rgbTeal(8421376),    
    /**@ Thistle */
    rgbThistle(14204888),    
    /**@ Tomato */
    rgbTomato(4678655),    
    /**@ Turquoise */
    rgbTurquoise(13688896),    
    /**@ Violet */
    rgbViolet(15631086),    
    /**@ Wheat */
    rgbWheat(11788021),    
    /**@ White */
    rgbWhite(16777215),    
    /**@ White Smoke */
    rgbWhiteSmoke(16119285),    
    /**@ Yellow */
    rgbYellow(65535),    
    /**@ Yellow Green */
    rgbYellowGreen(3329434);

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
