package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vismemberaddoptions">https://docs.microsoft.com/en-us/office/vba/api/visio.vismemberaddoptions</a>}
*/
public enum VisMemberAddOptions implements COMEnum {
    
    /**@ Defer to the setting of the ContainerProperties.ResizeAsNeeded property. */
    visMemberAddUseResizeSetting(0),    
    /**@ Expand the container to fit the incoming shape(s). */
    visMemberAddExpandContainer(1),    
    /**@ Do not expand the container to fit the incoming shape(s). */
    visMemberAddDoNotExpand(2);

    private final long value;

    VisMemberAddOptions(long value) {
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
