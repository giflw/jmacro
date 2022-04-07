package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscutcopypastecodes">https://docs.microsoft.com/en-us/office/vba/api/visio.viscutcopypastecodes</a>}
*/
public enum VisCutCopyPasteCodes implements COMEnum {
    
    /**@ Follow default copying behavior. */
    visCopyPasteNormal(0),    
    /**@ Copy shapes to their original coordinate locations. */
    visCopyPasteNoTranslate(1),    
    /**@ Copy shapes to the center of the page. */
    visCopyPasteCenter(2),    
    /**@ Do not clean up connectors attached to cut shapes. */
    visCopyPasteNoHealConnectors(4),    
    /**@ Do not cut and copy unselected members of containers or lists. */
    visCopyPasteNoContainerMembers(8),    
    /**@ Do not cut and copy unselected callouts associated with shapes. */
    visCopyPasteNoAssociatedCallouts(22),    
    /**@ Do not add pasted shapes to any underlying containers. */
    visCopyPasteDontAddToContainers(50),    
    /**@ Do not offset shapes on copy. */
    visCopyPasteNoCascade(100);

    private final long value;

    VisCutCopyPasteCodes(long value) {
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
