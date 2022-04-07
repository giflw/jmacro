package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainerformattype">https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainerformattype</a>}
*/
public enum VisContainerFormatType implements COMEnum {
    
    /**@ Change whether container membership is locked. */
    visContainerFormatLockMembership(0),    
    /**@ Change how the container resizes automatically. */
    visContainerFormatContainerAutoResize(1),    
    /**@ Force the container to resize so as to tightly include all member shapes, including any applicable margins between the container and the shapes. */
    visContainerFormatFitToContents(2);

    private final long value;

    VisContainerFormatType(long value) {
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
