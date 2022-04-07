package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visautolinkbehaviors">https://docs.microsoft.com/en-us/office/vba/api/visio.visautolinkbehaviors</a>}
*/
public enum VisAutoLinkBehaviors implements COMEnum {
    
    /**@ Do not replace existing links. */
    visAutoLinkDontReplaceExistingLinks(16),    
    /**@ Show generic progress bar instead of more detailed one. */
    visAutoLinkGenericProgressBar(2),    
    /**@ Include hidden properties. */
    visAutoLinkIncludeHiddenProps(64),    
    /**@ Do not apply the default data graphic to linked shapes. */
    visAutoLinkNoApplyDataGraphic(4),    
    /**@ Allow null database values to map to "No Formula" in the Microsoft Office Visio ShapeSheet spreadsheet. */
    visAutolinkNullMatchesNoFormula(32),    
    /**@ Replace existing links. */
    visAutoLinkReplaceExistingLinks(8),    
    /**@ Link selected shapes only, not sub-shapes of selected shapes. */
    visAutoLinkSelectedShapesOnly(1);

    private final long value;

    VisAutoLinkBehaviors(long value) {
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
