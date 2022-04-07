package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pppublishsourcetype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pppublishsourcetype</a>}
*/
public enum PpPublishSourceType implements COMEnum {
    
    /**@ Publish all. */
    ppPublishAll(1),    
    /**@ Publish a named slideshow. */
    ppPublishNamedSlideShow(3),    
    /**@ Publish a range of slides. */
    ppPublishSlideRange(2);

    private final long value;

    PpPublishSourceType(long value) {
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
