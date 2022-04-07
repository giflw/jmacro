package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimproperty">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimproperty</a>}
*/
public enum MsoAnimProperty implements COMEnum {
    
    /**@ Color */
    msoAnimColor(7),    
    /**@ Height */
    msoAnimHeight(4),    
    /**@ None */
    msoAnimNone(0),    
    /**@ Opacity */
    msoAnimOpacity(5),    
    /**@ Rotation */
    msoAnimRotation(6),    
    /**@ Shape filled with back color */
    msoAnimShapeFillBackColor(1007),    
    /**@ Shape filled with color */
    msoAnimShapeFillColor(1005),    
    /**@ Shape fill on */
    msoAnimShapeFillOn(1004),    
    /**@ Shape fill opacity */
    msoAnimShapeFillOpacity(1006),    
    /**@ Colored line */
    msoAnimShapeLineColor(1009),    
    /**@ Shape line on */
    msoAnimShapeLineOn(1008),    
    /**@ Brightness of the picture */
    msoAnimShapePictureBrightness(1001),    
    /**@ Contrast of the picture */
    msoAnimShapePictureContrast(1000),    
    /**@ Gamma properties of the picture */
    msoAnimShapePictureGamma(1002),    
    /**@ Grayscale properties of the picture */
    msoAnimShapePictureGrayscale(1003),    
    /**@ Shadow properties of the picture */
    msoAnimShapeShadowColor(1012),    
    /**@ Shadow Offset X */
    msoAnimShapeShadowOffsetX(1014),    
    /**@ ShadowOffset Y */
    msoAnimShapeShadowOffsetY(1015),    
    /**@ Shadow on */
    msoAnimShapeShadowOn(1010),    
    /**@ Opacity of the shape's shadow */
    msoAnimShapeShadowOpacity(1013),    
    /**@ Type of shadow */
    msoAnimShapeShadowType(1011),    
    /**@ Text bullet character */
    msoAnimTextBulletCharacter(111),    
    /**@ Text bullet color */
    msoAnimTextBulletColor(114),    
    /**@ Text bullet fontname */
    msoAnimTextBulletFontName(112),    
    /**@ Text bullet number */
    msoAnimTextBulletNumber(113),    
    /**@ Relative size of text bullet */
    msoAnimTextBulletRelativeSize(115),    
    /**@ Text bullet style */
    msoAnimTextBulletStyle(116),    
    /**@ Text bullet type */
    msoAnimTextBulletType(117),    
    /**@ Text font bold */
    msoAnimTextFontBold(100),    
    /**@ Text font color */
    msoAnimTextFontColor(101),    
    /**@ Text font emboss */
    msoAnimTextFontEmboss(102),    
    /**@ Text font italic */
    msoAnimTextFontItalic(103),    
    /**@ Text font name */
    msoAnimTextFontName(104),    
    /**@ Text font shadow */
    msoAnimTextFontShadow(105),    
    /**@ Text font size */
    msoAnimTextFontSize(106),    
    /**@ Text font strikethrough */
    msoAnimTextFontStrikeThrough(110),    
    /**@ Text font subscript */
    msoAnimTextFontSubscript(107),    
    /**@ Text font superscript */
    msoAnimTextFontSuperscript(108),    
    /**@ Text font underline */
    msoAnimTextFontUnderline(109),    
    /**@ Visibility */
    msoAnimVisibility(8),    
    /**@ Width */
    msoAnimWidth(3),    
    /**@ X coordinate */
    msoAnimX(1),    
    /**@ Y coordinate */
    msoAnimY(2);

    private final long value;

    MsoAnimProperty(long value) {
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
