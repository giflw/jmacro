package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visedition">https://docs.microsoft.com/en-us/office/vba/api/visio.visedition</a>}
*/
public enum VisEdition implements COMEnum {
    
    /**@ Standard edition. */
    visEditionStandard(0),    
    /**@ Professional edition. */
    visEditionProfessional(1);

    private final long value;

    VisEdition(long value) {
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
