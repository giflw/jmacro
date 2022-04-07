package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visbuiltinstenciltypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visbuiltinstenciltypes</a>}
*/
public enum VisBuiltInStencilTypes implements COMEnum {
    
    /**@ The hidden stencil that contains the shapes displayed in the Backgrounds gallery (Design tab). */
    visBuiltInStencilBackgrounds(0),    
    /**@ The hidden stencil that contains the shapes displayed in the Borders and Titles gallery (Design tab). */
    visBuiltInStencilBorders(1),    
    /**@ The hidden stencil that contains the shapes displayed in the Container gallery (Insert tab). */
    visBuiltInStencilContainers(2),    
    /**@ The hidden stencil that contains the shapes displayed in the Callout gallery (Insert tab). */
    visBuiltInStencilCallouts(3),    
    /**@ The hidden stencil that contains the shapes displayed in the Insert Legend gallery (Data tab). */
    visBuiltInStencilLegends(4);

    private final long value;

    VisBuiltInStencilTypes(long value) {
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
