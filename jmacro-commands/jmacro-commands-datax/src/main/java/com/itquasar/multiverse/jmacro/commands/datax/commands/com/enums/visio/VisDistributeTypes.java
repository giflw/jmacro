package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdistributetypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visdistributetypes</a>}
*/
public enum VisDistributeTypes implements COMEnum {
    
    /**@ Distributes shapes hoirzontally so that their bottom edges are uniformly spaced. */
    visDistHorzCenter(2),    
    /**@ Distributes shapes horizontally so that their left edges are uniformly spaced. */
    visDistHorzLeft(1),    
    /**@ Distributes shapes horizontally so that their right edges are uniformly spaced. */
    visDistHorzRight(3),    
    /**@ Distributes shapes horizontally so that there is a uniform space between shapes. */
    visDistHorzSpace(0),    
    /**@ Distributes shapes vertically so that their bottom edges are uniformly spaced. */
    visDistVertBottom(7),    
    /**@ Distributes shapes vertically so that their centers are uniformly spaced. */
    visDistVertMiddle(6),    
    /**@ Distributes shapes vertically so that there is a uniform space between shapes. */
    visDistVertSpace(4),    
    /**@ Distributes shapes vertically so that their top edges are uniformly spaced. */
    visDistVertTop(5);

    private final long value;

    VisDistributeTypes(long value) {
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
