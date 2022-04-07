package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbfieldtype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbfieldtype</a>}
*/
public enum PbFieldType implements COMEnum {
    
    /**@ Date and time */
    pbFieldDateTime(4),    
    /**@ Absolute page hyperlink */
    pbFieldHyperlinkAbsolutePage(11),    
    /**@ Email hyperlink */
    pbFieldHyperlinkEmail(12),    
    /**@ File hyperlink */
    pbFieldHyperlinkFile(13),    
    /**@ Relative page hyperlink */
    pbFieldHyperlinkRelativePage(10),    
    /**@ URL hyperlink */
    pbFieldHyperlinkURL(9),    
    /**@ IHIV */
    pbFieldIHIV(6),    
    /**@ Mail merge */
    pbFieldMailMerge(5),    
    /**@ None */
    pbFieldNone(0),    
    /**@ Page number */
    pbFieldPageNumber(1),    
    /**@ Next page number */
    pbFieldPageNumberNext(2),    
    /**@ Previous page number */
    pbFieldPageNumberPrev(3),    
    /**@ Personalized hyperlink URL */
    pbFieldPersonalizedHyperlinkURL(14),    
    /**@ Phonetic guide */
    pbFieldPhoneticGuide(7),    
    /**@ Wizard sample text */
    pbFieldWizardSampleText(8);

    private final long value;

    PbFieldType(long value) {
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
