package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcegraphstyle">https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcegraphstyle</a>}
*/
public enum PjResourceGraphStyle implements COMEnum {
    
    /**@ Area. */
    pjArea(1),    
    /**@ Bar. */
    pjBar(0),    
    /**@ Do not show. */
    pjDoNotShow(5),    
    /**@ Line graph. */
    pjLineGraph(3),    
    /**@ Step. */
    pjStep(2),    
    /**@ Step line. */
    pjStepLine(4);

    private final long value;

    PjResourceGraphStyle(long value) {
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
