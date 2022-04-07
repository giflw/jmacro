package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vistypeselectiontypes">https://docs.microsoft.com/en-us/office/vba/api/visio.vistypeselectiontypes</a>}
*/
public enum VisTypeSelectionTypes implements COMEnum {
    
    /**@ A shape that is a bitmap. */
    visTypeSelBitmap(16),    
    /**@ A shape that contains other shapes. */
    visTypeSelGroup(1),    
    /**@ A shape that is a guide. */
    visTypeSelGuide(4),    
    /**@ A shape that is ink. */
    visTypeSelInk(32),    
    /**@ A shape that is a metafile. */
    visTypeSelMetafile(8),    
    /**@ A shape that is linked, embedded, or a control. */
    visTypeSelOLE(64),    
    /**@ A native Visio shape. */
    visTypeSelShape(2);

    private final long value;

    VisTypeSelectionTypes(long value) {
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
