package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acproperty">https://docs.microsoft.com/en-us/office/vba/api/access.acproperty</a>}
*/
public enum AcProperty implements COMEnum {
    
    /**@ Set the BackColor property. */
    acPropertyBackColor(8),    
    /**@ Set the Caption property. */
    acPropertyCaption(9),    
    /**@ Set the Enabled property. */
    acPropertyEnabled(0),    
    /**@ Set the ForeColor property. */
    acPropertyForeColor(7),    
    /**@ Set the Height property. */
    acPropertyHeight(6),    
    /**@ Set the Left property. */
    acPropertyLeft(3),    
    /**@ Set the Locked property. */
    acPropertyLocked(2),    
    /**@ Set the Top property. */
    acPropertyTop(4),    
    /**@ Set the Value property. */
    acPropertyValue(10),    
    /**@ Set the Visible property. */
    acPropertyVisible(1),    
    /**@ Set the Width property. */
    acPropertyWidth(5);

    private final long value;

    AcProperty(long value) {
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
