package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olsaveastype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olsaveastype</a>}
*/
public enum OlSaveAsType implements COMEnum {
    
    /**@ Microsoft Office Word format (.doc) */
    olDoc(4),    
    /**@ HTML format (.html) */
    olHTML(5),    
    /**@ iCal format (.ics) */
    olICal(8),    
    /**@ MIME HTML format (.mht) */
    olMHTML(10),    
    /**@ Outlook message format (.msg) */
    olMSG(3),    
    /**@ Outlook Unicode message format (.msg) */
    olMSGUnicode(9),    
    /**@ Rich Text format (.rtf) */
    olRTF(1),    
    /**@ Microsoft Outlook template (.oft) */
    olTemplate(2),    
    /**@ Text format (.txt) */
    olTXT(0),    
    /**@ VCal format (.vcs) */
    olVCal(7),    
    /**@ VCard format (.vcf) */
    olVCard(6);

    private final long value;

    OlSaveAsType(long value) {
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
