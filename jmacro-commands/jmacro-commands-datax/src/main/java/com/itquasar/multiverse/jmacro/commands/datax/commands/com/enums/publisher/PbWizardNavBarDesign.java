package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardnavbardesign">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardnavbardesign</a>}
*/
public enum PbWizardNavBarDesign implements COMEnum {
    
    /**@ Ambient */
    pbnbDesignAmbient(2),    
    /**@ Baseline */
    pbnbDesignBaseline(26),    
    /**@ Bracket */
    pbnbDesignBracket(11),    
    /**@ BulletStaff */
    pbnbDesignBulletStaff(20),    
    /**@ Capsule */
    pbnbDesignCapsule(3),    
    /**@ Cornice */
    pbnbDesignCornice(15),    
    /**@ Counter */
    pbnbDesignCounter(13),    
    /**@ Dimension */
    pbnbDesignDimension(8),    
    /**@ Dotted Arrow */
    pbnbDesignDottedArrow(9),    
    /**@ Edge */
    pbnbDesignEdge(17),    
    /**@ Enclosed Arrow */
    pbnbDesignEnclosedArrow(12),    
    /**@ End Cap */
    pbnbDesignEndCap(14),    
    /**@ Hollow Arrow */
    pbnbDesignHollowArrow(10),    
    /**@ Key Punch */
    pbnbDesignKeyPunch(22),    
    /**@ Offset */
    pbnbDesignOffset(7),    
    /**@ Outline */
    pbnbDesignOutline(5),    
    /**@ Radius */
    pbnbDesignRadius(6),    
    /**@ Rectangle */
    pbnbDesignRectangle(1),    
    /**@ RoundBullet */
    pbnbDesignRoundBullet(23),    
    /**@ SquareBullet */
    pbnbDesignSquareBullet(24),    
    /**@ Staff */
    pbnbDesignStaff(16),    
    /**@ TopBar */
    pbnbDesignTopBar(21),    
    /**@ TopDrawer */
    pbnbDesignTopDrawer(4),    
    /**@ TopLine */
    pbnbDesignTopLine(18),    
    /**@ Underscore */
    pbnbDesignUnderscore(19),    
    /**@ Watermark */
    pbnbDesignWatermark(25);

    private final long value;

    PbWizardNavBarDesign(long value) {
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
