package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vismasterproperties">https://docs.microsoft.com/en-us/office/vba/api/visio.vismasterproperties</a>}
*/
public enum VisMasterProperties implements COMEnum {
    
    /**@ Generate icon automatically from shape data. */
    visAutomatic(1),    
    /**@ Master name center-aligned. */
    visCenter(2),    
    /**@ Icon size is double (64 x 64 pixels). */
    visDouble(4),    
    /**@ Use bitmap icon format. */
    visIconFormatBMP(2),    
    /**@ Use Visio icon format. */
    visIconFormatVisio(0),    
    /**@ Master name left-aligned. */
    visLeft(1),    
    /**@ Generate icon manually. */
    visManual(0),    
    /**@ Fill pattern is centered. */
    visMasFPCenter(4096),    
    /**@ Fill pattern is scaled. */
    visMasFPScale(16384),    
    /**@ Fill pattern is stretched to fit available space. */
    visMasFPStretch(8192),    
    /**@ Fill pattern is tiled (repeated). */
    visMasFPTile(0),    
    /**@ Master is a fill pattern. */
    visMasIsFillPat(4),    
    /**@ Master is a line end. */
    visMasIsLineEnd(2),    
    /**@ Master is a line pattern. */
    visMasIsLinePat(1),    
    /**@ Use default line-end properties. */
    visMasLEDefault(0),    
    /**@ Line end is scaled. */
    visMasLEScale(1024),    
    /**@ Line end always remains upright (does not rotate with the line). */
    visMasLEUpright(256),    
    /**@ Line pattern is annotated. */
    visMasLPAnnotate(48),    
    /**@ Line pattern is scaled. */
    visMasLPScale(64),    
    /**@ Line pattern is stretched to fit available space. */
    visMasLPStretch(32),    
    /**@ Line pattern is tiled and deformed when line curves. */
    visMasLPTileDeform(0),    
    /**@ Line pattern is tiled (repeated). */
    visMasLPTile(16),    
    /**@ Icon size is normal (32 x 32 pixels). */
    visNormal(1),    
    /**@ Master name right-aligned. */
    visRight(3),    
    /**@ Icon size is tall (32 x 64 pixels). */
    visTall(2),    
    /**@ Icon size is wide (64 x 32 pixels) */
    visWide(3);

    private final long value;

    VisMasterProperties(long value) {
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
