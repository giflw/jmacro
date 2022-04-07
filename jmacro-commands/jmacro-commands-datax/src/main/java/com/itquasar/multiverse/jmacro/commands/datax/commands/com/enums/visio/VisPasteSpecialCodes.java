package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vispastespecialcodes">https://docs.microsoft.com/en-us/office/vba/api/visio.vispastespecialcodes</a>}
*/
public enum VisPasteSpecialCodes implements COMEnum {
    
    /**@ Paste bitmap. */
    visPasteBitmap(2),    
    /**@ Paste device-independent bitmap. */
    visPasteDIB(8),    
    /**@ Paste enhanced metafile. */
    visPasteEMF(14),    
    /**@ Paste hyperlink. */
    visPasteHyperlink(65538),    
    /**@ Paste Ink data. */
    visPasteInk(65544),    
    /**@ Paste metafile. */
    visPasteMetafile(3),    
    /**@ Paste OEM text. */
    visPasteOEMText(7),    
    /**@ Paste OLE object. */
    visPasteOLEObject(65536),    
    /**@ Paste rich text. */
    visPasteRichText(65537),    
    /**@ Paste ANSI text. */
    visPasteText(1),    
    /**@ Paste Uniform Resource Locator (URL). */
    visPasteURL(65539),    
    /**@ Paste Microsoft Visio icon. */
    visPasteVisioIcon(65543),    
    /**@ Paste Visio masters XML. */
    visPasteVisioMastersXML(65546),    
    /**@ Paste Visio masters. */
    visPasteVisioMasters(65541),    
    /**@ Paste Visio shapes XML. */
    visPasteVisioShapesXML(65545),    
    /**@ Paste Visio drawing data without internal data links. */
    visPasteVisioShapesWithoutDataLinks(65548),    
    /**@ Paste Visio shapes. */
    visPasteVisioShapes(65540),    
    /**@ Paste Visio text. */
    visPasteVisioText(65542);

    private final long value;

    VisPasteSpecialCodes(long value) {
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
