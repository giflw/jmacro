package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdocumenttypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visdocumenttypes</a>}
*/
public enum VisDocumentTypes implements COMEnum {
    
    /**@ Not a Microsoft Visio document. */
    visDocTypeInval(0),    
    /**@ Document type is a drawing. */
    visTypeDrawing(1),    
    /**@ Document type is a stencil. */
    visTypeStencil(2),    
    /**@ Document type is a template. */
    visTypeTemplate(3);

    private final long value;

    VisDocumentTypes(long value) {
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
