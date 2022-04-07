package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcolorscheme">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcolorscheme</a>}
*/
public enum PbColorScheme implements COMEnum {
    
    /**@ Alpine */
    pbColorSchemeAlpine(-1),    
    /**@ Aqua */
    pbColorSchemeAqua(-2),    
    /**@ Berry */
    pbColorSchemeBerry(-3),    
    /**@ Black Gray */
    pbColorSchemeBlackGray(-4),    
    /**@ Black and White */
    pbColorSchemeBlackWhite(-58),    
    /**@ Brown */
    pbColorSchemeBrown(-5),    
    /**@ Burgundy */
    pbColorSchemeBurgundy(-6),    
    /**@ Cavern */
    pbColorSchemeCavern(-7),    
    /**@ Celebration */
    pbColorSchemeCelebration(-1004),    
    /**@ Cherry */
    pbColorSchemeCherry(-1002),    
    /**@ Citrus */
    pbColorSchemeCitrus(-8),    
    /**@ Clay */
    pbColorSchemeClay(-9),    
    /**@ Cranberry */
    pbColorSchemeCranberry(-10),    
    /**@ Crocus */
    pbColorSchemeCrocus(-11),    
    /**@ Custom */
    pbColorSchemeCustom(1),    
    /**@ DarkBlue */
    pbColorSchemeDarkBlue(-61),    
    /**@ Desert */
    pbColorSchemeDesert(-12),    
    /**@ Field */
    pbColorSchemeField(-13),    
    /**@ FirstUserDefined */
    pbColorSchemeFirstUserDefined(2000),    
    /**@ Fjord */
    pbColorSchemeFjord(-14),    
    /**@ Floral */
    pbColorSchemeFloral(-15),    
    /**@ Garnet */
    pbColorSchemeGarnet(-16),    
    /**@ No description provided */
    pbColorSchemeGlacier(-17),    
    /**@ Green */
    pbColorSchemeGreen(-59),    
    /**@ Heather */
    pbColorSchemeHeather(-18),    
    /**@ Iris */
    pbColorSchemeIris(-19),    
    /**@ Island */
    pbColorSchemeIsland(-20),    
    /**@ Ivy */
    pbColorSchemeIvy(-21),    
    /**@ Lagoon */
    pbColorSchemeLagoon(-22),    
    /**@ Lilac */
    pbColorSchemeLilac(-23),    
    /**@ No description provided */
    pbColorSchemeMahogany(-24),    
    /**@ Marine */
    pbColorSchemeMarine(-25),    
    /**@ Maroon */
    pbColorSchemeMaroon(-26),    
    /**@ Meadow */
    pbColorSchemeMeadow(-27),    
    /**@ Mist */
    pbColorSchemeMist(-28),    
    /**@ Mistletoe */
    pbColorSchemeMistletoe(-29),    
    /**@ Monarch */
    pbColorSchemeMonarch(-41),    
    /**@ Moss */
    pbColorSchemeMoss(-30),    
    /**@ Mountain */
    pbColorSchemeMountain(-31),    
    /**@ Mulberry */
    pbColorSchemeMulberry(-32),    
    /**@ Navy */
    pbColorSchemeNavy(-33),    
    /**@ Nutmeg */
    pbColorSchemeNutmeg(-34),    
    /**@ Ocean */
    pbColorSchemeOcean(-1000),    
    /**@ Olive */
    pbColorSchemeOlive(-35),    
    /**@ Orange */
    pbColorSchemeOrange(-1003),    
    /**@ Orchid */
    pbColorSchemeOrchid(-36),    
    /**@ Parrot */
    pbColorSchemeParrot(-37),    
    /**@ Peach */
    pbColorSchemePeach(-1005),    
    /**@ Pebbles */
    pbColorSchemePebbles(-38),    
    /**@ Prairie */
    pbColorSchemePrairie(-39),    
    /**@ Purple */
    pbColorSchemePurple(-1001),    
    /**@ Rain Forest */
    pbColorSchemeRainForest(-40),    
    /**@ Red */
    pbColorSchemeRed(-60),    
    /**@ Redwood */
    pbColorSchemeRedwood(-42),    
    /**@ Reef */
    pbColorSchemeReef(-43),    
    /**@ Sagebrush */
    pbColorSchemeSagebrush(-44),    
    /**@ Sapphire */
    pbColorSchemeSapphire(-45),    
    /**@ Shamrock */
    pbColorSchemeShamrock(-46),    
    /**@ Sienna */
    pbColorSchemeSienna(-47),    
    /**@ Spice */
    pbColorSchemeSpice(-48),    
    /**@ Sunrise */
    pbColorSchemeSunrise(-49),    
    /**@ Sunset */
    pbColorSchemeSunset(-50),    
    /**@ Teal */
    pbColorSchemeTeal(-51),    
    /**@ Tidepool */
    pbColorSchemeTidepool(-52),    
    /**@ Tropics */
    pbColorSchemeTropics(-53),    
    /**@ Trout */
    pbColorSchemeTrout(-54),    
    /**@ Vineyard */
    pbColorSchemeVineyard(-55),    
    /**@ Waterfall */
    pbColorSchemeWaterfall(-56),    
    /**@ Wildflower */
    pbColorSchemeWildflower(-57);

    private final long value;

    PbColorScheme(long value) {
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
