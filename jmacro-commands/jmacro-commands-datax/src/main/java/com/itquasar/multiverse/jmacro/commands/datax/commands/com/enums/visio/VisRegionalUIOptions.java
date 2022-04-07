package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visregionaluioptions">https://docs.microsoft.com/en-us/office/vba/api/visio.visregionaluioptions</a>}
*/
public enum VisRegionalUIOptions implements COMEnum {
    
    /**@ Always hide regional UI. */
    visRegionalUIOptionsHide(0),    
    /**@ Always show regional UI. */
    visRegionalUIOptionsShow(1),    
    /**@ Not used. */
    visRegionalUIOptionsUseSystemSettings(-1);

    private final long value;

    VisRegionalUIOptions(long value) {
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
