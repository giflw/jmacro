package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtextureindex">https://docs.microsoft.com/en-us/office/vba/api/word.wdtextureindex</a>}
*/
public enum WdTextureIndex implements COMEnum {
    
    /**@ 10 percent shading. */
    wdTexture10Percent(100),    
    /**@ 12.5 percent shading. */
    wdTexture12Pt5Percent(125),    
    /**@ 15 percent shading. */
    wdTexture15Percent(150),    
    /**@ 17.5 percent shading. */
    wdTexture17Pt5Percent(175),    
    /**@ 20 percent shading. */
    wdTexture20Percent(200),    
    /**@ 22.5 percent shading. */
    wdTexture22Pt5Percent(225),    
    /**@ 25 percent shading. */
    wdTexture25Percent(250),    
    /**@ 27.5 percent shading. */
    wdTexture27Pt5Percent(275),    
    /**@ 2.5 percent shading. */
    wdTexture2Pt5Percent(25),    
    /**@ 30 percent shading. */
    wdTexture30Percent(300),    
    /**@ 32.5 percent shading. */
    wdTexture32Pt5Percent(325),    
    /**@ 35 percent shading. */
    wdTexture35Percent(350),    
    /**@ 37.5 percent shading. */
    wdTexture37Pt5Percent(375),    
    /**@ 40 percent shading. */
    wdTexture40Percent(400),    
    /**@ 42.5 percent shading. */
    wdTexture42Pt5Percent(425),    
    /**@ 45 percent shading. */
    wdTexture45Percent(450),    
    /**@ 47.5 percent shading. */
    wdTexture47Pt5Percent(475),    
    /**@ 50 percent shading. */
    wdTexture50Percent(500),    
    /**@ 52.5 percent shading. */
    wdTexture52Pt5Percent(525),    
    /**@ 55 percent shading. */
    wdTexture55Percent(550),    
    /**@ 57.5 percent shading. */
    wdTexture57Pt5Percent(575),    
    /**@ 5 percent shading. */
    wdTexture5Percent(50),    
    /**@ 60 percent shading. */
    wdTexture60Percent(600),    
    /**@ 62.5 percent shading. */
    wdTexture62Pt5Percent(625),    
    /**@ 65 percent shading. */
    wdTexture65Percent(650),    
    /**@ 67.5 percent shading. */
    wdTexture67Pt5Percent(675),    
    /**@ 70 percent shading. */
    wdTexture70Percent(700),    
    /**@ 72.5 percent shading. */
    wdTexture72Pt5Percent(725),    
    /**@ 75 percent shading. */
    wdTexture75Percent(750),    
    /**@ 77.5 percent shading. */
    wdTexture77Pt5Percent(775),    
    /**@ 7.5 percent shading. */
    wdTexture7Pt5Percent(75),    
    /**@ 80 percent shading. */
    wdTexture80Percent(800),    
    /**@ 82.5 percent shading. */
    wdTexture82Pt5Percent(825),    
    /**@ 85 percent shading. */
    wdTexture85Percent(850),    
    /**@ 87.5 percent shading. */
    wdTexture87Pt5Percent(875),    
    /**@ 90 percent shading. */
    wdTexture90Percent(900),    
    /**@ 92.5 percent shading. */
    wdTexture92Pt5Percent(925),    
    /**@ 95 percent shading. */
    wdTexture95Percent(950),    
    /**@ 97.5 percent shading. */
    wdTexture97Pt5Percent(975),    
    /**@ Horizontal cross shading. */
    wdTextureCross(-11),    
    /**@ Dark horizontal cross shading. */
    wdTextureDarkCross(-5),    
    /**@ Dark diagonal cross shading. */
    wdTextureDarkDiagonalCross(-6),    
    /**@ Dark diagonal down shading. */
    wdTextureDarkDiagonalDown(-3),    
    /**@ Dark diagonal up shading. */
    wdTextureDarkDiagonalUp(-4),    
    /**@ Dark horizontal shading. */
    wdTextureDarkHorizontal(-1),    
    /**@ Dark vertical shading. */
    wdTextureDarkVertical(-2),    
    /**@ Diagonal cross shading. */
    wdTextureDiagonalCross(-12),    
    /**@ Diagonal down shading. */
    wdTextureDiagonalDown(-9),    
    /**@ Diagonal up shading. */
    wdTextureDiagonalUp(-10),    
    /**@ Horizontal shading. */
    wdTextureHorizontal(-7),    
    /**@ No shading. */
    wdTextureNone(0),    
    /**@ Solid shading. */
    wdTextureSolid(1000),    
    /**@ Vertical shading. */
    wdTextureVertical(-8);

    private final long value;

    WdTextureIndex(long value) {
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
