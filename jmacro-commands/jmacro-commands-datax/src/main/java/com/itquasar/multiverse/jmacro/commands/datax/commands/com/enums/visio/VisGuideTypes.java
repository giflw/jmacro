package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visguidetypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visguidetypes</a>}
*/
public enum VisGuideTypes implements COMEnum {
    
    /**@ Vertical guide */
    visHorz(2),    
    /**@ Guide point */
    visPoint(1),    
    /**@ Horizontal guide */
    visVert(3);

    private final long value;

    VisGuideTypes(long value) {
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
