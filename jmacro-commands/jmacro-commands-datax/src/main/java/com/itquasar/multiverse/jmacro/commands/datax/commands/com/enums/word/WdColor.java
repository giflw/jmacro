package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcolor">https://docs.microsoft.com/en-us/office/vba/api/word.wdcolor</a>}
*/
public enum WdColor implements COMEnum {
    
    /**@ Aqua color */
    wdColorAqua(13421619),    
    /**@ Automatic color; default; usually black */
    wdColorAutomatic(-16777216),    
    /**@ Black color */
    wdColorBlack(0),    
    /**@ Blue color */
    wdColorBlue(16711680),    
    /**@ Blue-gray color */
    wdColorBlueGray(10053222),    
    /**@ Bright green color */
    wdColorBrightGreen(65280),    
    /**@ Brown color */
    wdColorBrown(13209),    
    /**@ Dark blue color */
    wdColorDarkBlue(8388608),    
    /**@ Dark green color */
    wdColorDarkGreen(13056),    
    /**@ Dark red color */
    wdColorDarkRed(128),    
    /**@ Dark teal color */
    wdColorDarkTeal(6697728),    
    /**@ Dark yellow color */
    wdColorDarkYellow(32896),    
    /**@ Gold color */
    wdColorGold(52479),    
    /**@ Shade 05 of gray color */
    wdColorGray05(15987699),    
    /**@ Shade 10 of gray color */
    wdColorGray10(15132390),    
    /**@ Shade 125 of gray color */
    wdColorGray125(14737632),    
    /**@ Shade 15 of gray color */
    wdColorGray15(14277081),    
    /**@ Shade 20 of gray color */
    wdColorGray20(13421772),    
    /**@ Shade 25 of gray color */
    wdColorGray25(12632256),    
    /**@ Shade 30 of gray color */
    wdColorGray30(11776947),    
    /**@ Shade 35 of gray color */
    wdColorGray35(10921638),    
    /**@ Shade 375 of gray color */
    wdColorGray375(10526880),    
    /**@ Shade 40 of gray color */
    wdColorGray40(10066329),    
    /**@ Shade 45 of gray color */
    wdColorGray45(9211020),    
    /**@ Shade 50 of gray color */
    wdColorGray50(8421504),    
    /**@ Shade 55 of gray color */
    wdColorGray55(7566195),    
    /**@ Shade 60 of gray color */
    wdColorGray60(6710886),    
    /**@ Shade 625 of gray color */
    wdColorGray625(6316128),    
    /**@ Shade 65 of gray color */
    wdColorGray65(5855577),    
    /**@ Shade 70 of gray color */
    wdColorGray70(5000268),    
    /**@ Shade 75 of gray color */
    wdColorGray75(4210752),    
    /**@ Shade 80 of gray color */
    wdColorGray80(3355443),    
    /**@ Shade 85 of gray color */
    wdColorGray85(2500134),    
    /**@ Shade 875 of gray color */
    wdColorGray875(2105376),    
    /**@ Shade 90 of gray color */
    wdColorGray90(1644825),    
    /**@ Shade 95 of gray color */
    wdColorGray95(789516),    
    /**@ Green color */
    wdColorGreen(32768),    
    /**@ Indigo color */
    wdColorIndigo(10040115),    
    /**@ Lavender color */
    wdColorLavender(16751052),    
    /**@ Light blue color */
    wdColorLightBlue(16737843),    
    /**@ Light green color */
    wdColorLightGreen(13434828),    
    /**@ Light orange color */
    wdColorLightOrange(39423),    
    /**@ Light turquoise color */
    wdColorLightTurquoise(16777164),    
    /**@ Light yellow color */
    wdColorLightYellow(10092543),    
    /**@ Lime color */
    wdColorLime(52377),    
    /**@ Olive green color */
    wdColorOliveGreen(13107),    
    /**@ Orange color */
    wdColorOrange(26367),    
    /**@ Pale blue color */
    wdColorPaleBlue(16764057),    
    /**@ Pink color */
    wdColorPink(16711935),    
    /**@ Plum color */
    wdColorPlum(6697881),    
    /**@ Red color */
    wdColorRed(255),    
    /**@ Rose color */
    wdColorRose(13408767),    
    /**@ Sea green color */
    wdColorSeaGreen(6723891),    
    /**@ Sky blue color */
    wdColorSkyBlue(16763904),    
    /**@ Tan color */
    wdColorTan(10079487),    
    /**@ Teal color */
    wdColorTeal(8421376),    
    /**@ Turquoise color */
    wdColorTurquoise(16776960),    
    /**@ Violet color */
    wdColorViolet(8388736),    
    /**@ White color */
    wdColorWhite(16777215),    
    /**@ Yellow color */
    wdColorYellow(65535);

    private final long value;

    WdColor(long value) {
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
