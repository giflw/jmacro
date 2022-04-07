package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportcolorreduction">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportcolorreduction</a>}
*/
public enum VisRasterExportColorReduction implements COMEnum {
    
    /**@ Adaptive color reduction; the default for GIF files. */
    visRasterAdaptive(0),    
    /**@ Diffusion color reduction. */
    visRasterDiffusion(1),    
    /**@ Halftone color reduction. */
    visRasterHalftone(2);

    private final long value;

    VisRasterExportColorReduction(long value) {
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
