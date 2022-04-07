package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vissvgexportformat">https://docs.microsoft.com/en-us/office/vba/api/visio.vissvgexportformat</a>}
*/
public enum VisSVGExportFormat implements COMEnum {
    
    /**@ Include SVG elements only. */
    visSVGExcludeVisioElements(1),    
    /**@ Include both SVG elements and Visio elements. This is the default. */
    visSVGIncludeVisioElements(0);

    private final long value;

    VisSVGExportFormat(long value) {
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
