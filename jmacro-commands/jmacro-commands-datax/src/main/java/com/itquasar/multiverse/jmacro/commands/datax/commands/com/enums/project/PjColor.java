package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcolor">https://docs.microsoft.com/en-us/office/vba/api/project.pjcolor</a>}
*/
public enum PjColor implements COMEnum {
    
    /**@ Color is aqua. */
    pjAqua(4),    
    /**@ Color is black. */
    pjBlack(0),    
    /**@ Color is blue. */
    pjBlue(5),    
    /**@ Color is selected automatically. */
    pjColorAutomatic(16),    
    /**@ Color is fuchsia. */
    pjFuchsia(6),    
    /**@ Color is gray. */
    pjGray(14),    
    /**@ Color is green. */
    pjGreen(9),    
    /**@ Color is lime. */
    pjLime(3),    
    /**@ Color is maroon. */
    pjMaroon(8),    
    /**@ Color is navy blue. */
    pjNavy(11),    
    /**@ Color is olive. */
    pjOlive(10),    
    /**@ Color is purple. */
    pjPurple(12),    
    /**@ Color is red. */
    pjRed(1),    
    /**@ Color is silver. */
    pjSilver(15),    
    /**@ Color is teal. */
    pjTeal(13),    
    /**@ Color is white. */
    pjWhite(7),    
    /**@ Color is yellow. */
    pjYellow(2);

    private final long value;

    PjColor(long value) {
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
