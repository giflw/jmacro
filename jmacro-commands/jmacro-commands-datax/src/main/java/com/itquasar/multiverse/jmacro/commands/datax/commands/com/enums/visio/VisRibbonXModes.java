package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visribbonxmodes">https://docs.microsoft.com/en-us/office/vba/api/visio.visribbonxmodes</a>}
*/
public enum VisRibbonXModes implements COMEnum {
    
    /**@ Display the custom user interface (UI) when no document is active. */
    visRXModeNone(0),    
    /**@ Display the custom UI in Drawing mode. */
    visRXModeDrawing(1),    
    /**@ Display the custom UI in Stencil mode. */
    visRXModeStencil(2),    
    /**@ Display the custom UI in Print Preview mode. */
    visRXModePrintPreview(4);

    private final long value;

    VisRibbonXModes(long value) {
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
