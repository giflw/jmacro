package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjpastespecialtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjpastespecialtype</a>}
*/
public enum PjPasteSpecialType implements COMEnum {
    
    /**@ Paste an embedded object. */
    pjEmbedObject(0),    
    /**@ Paste HTML data. */
    pjHTMLData(4),    
    /**@ Paste an image. */
    pjPicture(1),    
    /**@ Paste project data. */
    pjProjectData(3),    
    /**@ Paste text data. */
    pjTextData(2),    
    /**@ Paste unformatted HTML data. */
    pjUnformattedHTMLData(5);

    private final long value;

    PjPasteSpecialType(long value) {
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
