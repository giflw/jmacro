package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visinsertobjargs">https://docs.microsoft.com/en-us/office/vba/api/visio.visinsertobjargs</a>}
*/
public enum VisInsertObjArgs implements COMEnum {
    
    /**@ None. */
    visInsertAsControl(8192),    
    /**@ None. */
    visInsertAsEmbed(16384),    
    /**@ Don't execute the new object's show verb. */
    visInsertDontShow(4096),    
    /**@ Display the new object as an icon */
    visInsertIcon(16),    
    /**@ If set, the new shape represents an OLE link to the named file. Otherwise, the InsertFromFile method produces an OLE object from the contents of the named file and embeds it in the document that contains the page, master, or group. */
    visInsertLink(8),    
    /**@ If set, when an ActiveX control is inserted, prevents Microsoft Visio from transitioning to design mode. */
    visInsertNoDesignModeTransition(256);

    private final long value;

    VisInsertObjArgs(long value) {
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
