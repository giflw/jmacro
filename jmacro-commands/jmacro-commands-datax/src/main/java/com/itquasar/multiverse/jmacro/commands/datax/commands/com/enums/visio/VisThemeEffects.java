package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visthemeeffects">https://docs.microsoft.com/en-us/office/vba/api/visio.visthemeeffects</a>}
*/
public enum VisThemeEffects implements COMEnum {
    
    /**@ No theme effect. */
    visThemeEffectsNone(0),    
    /**@ Subdued. */
    visThemeEffectsSubdued(1),    
    /**@ Simple shadow. */
    visThemeEffectsSimpleShadow(2),    
    /**@ Button. */
    visThemeEffectsButton(3),    
    /**@ Square. */
    visThemeEffectsSquare(4),    
    /**@ Pillow */
    visThemeEffectsPillow(5),    
    /**@ Bevel illusion. */
    visThemeEffectsBevelIllusion(6),    
    /**@ Bevel highlight. */
    visThemeEffectsBevelHighlight(7),    
    /**@ Outline. */
    visThemeEffectsOutline(8),    
    /**@ Decal. */
    visThemeEffectsDecal(9),    
    /**@ Raised surface. */
    visThemeEffectsRaisedSurface(10),    
    /**@ Mesh. */
    visThemeEffectsMesh(11),    
    /**@ Pinstripe. */
    visThemeEffectsPinstripe(12),    
    /**@ Stripes. */
    visThemeEffectsStripes(13),    
    /**@ Oblique. */
    visThemeEffectsOblique(14),    
    /**@ Toy. */
    visThemeEffectsToy(15),    
    /**@ Basic shadow. */
    visThemeEffectsBasicShadow(16);

    private final long value;

    VisThemeEffects(long value) {
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
