package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppbullettype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppbullettype</a>}
*/
public enum PpBulletType implements COMEnum {
    
    /**@ Mixed bullets */
    ppBulletMixed(-2),    
    /**@ No bullets */
    ppBulletNone(0),    
    /**@ Numbered bullets */
    ppBulletNumbered(2),    
    /**@ Bullets with an image */
    ppBulletPicture(3),    
    /**@ Unnumbered bullets */
    ppBulletUnnumbered(1);

    private final long value;

    PpBulletType(long value) {
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
