package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visreplaceflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visreplaceflags</a>}
*/
public enum VisReplaceFlags implements COMEnum {
    
    /**@ Use the behavior specified by the ShapeSheet cells ReplaceLockText, ReplaceLockShapeData, and ReplaceLockFormat, all in the Change Shape Behavior section. */
    visReplaceShapeDefault(0),    
    /**@ Override the behavior specified by the following ShapeSheet cells, all in the Change Shape Behavior section: behave as if ReplaceLockText = 0, ReplaceLockShapeData = 0, and ReplaceLockFormat = 0. */
    visReplaceShapeKeepBasic(1),    
    /**@ Override the behavior specified by the ReplaceLockFormat cell in the Change Shape Behavior section: behave as if ReplaceLockFormat = 1. */
    visReplaceShapeLockFormat(8),    
    /**@ Override the behavior specified by the ReplaceLockShapeData cell in the Change Shape Behavior section: behave as if ReplaceLockShapeData = 1. */
    visReplaceShapeLockShapeData(4),    
    /**@ Override the behavior specified by the ReplaceLockText cell in the Change Shape Behavior section: behave as if ReplaceLockText = 1. */
    visReplaceShapeLockText(2);

    private final long value;

    VisReplaceFlags(long value) {
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
