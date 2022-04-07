package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdiagramservices">https://docs.microsoft.com/en-us/office/vba/api/visio.visdiagramservices</a>}
*/
public enum VisDiagramServices implements COMEnum {
    
    /**@ No diagram services. */
    visServiceNone(0),    
    /**@ All diagram services. */
    visServiceAll(-1),    
    /**@ Smooth transition behaviors to match user interface. */
    visServiceAnimations(8),    
    /**@ AutoSize (automatic page-sizing) behaviors. */
    visServiceAutoSizePage(1),    
    /**@ Structured-diagram behaviors that maintain existing relationships but don't create new relationships. */
    visServiceStructureBasic(2),    
    /**@ Structured-diagram behaviors that match all those in the user interface (UI). */
    visServiceStructureFull(4),    
    /**@ All diagram services that exist in Visio. */
    visServiceVersion140(7),    
    /**@ All diagram services that exist in Visio. */
    visServiceVersion150(8);

    private final long value;

    VisDiagramServices(long value) {
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
