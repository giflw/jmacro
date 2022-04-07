package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oluserpropertytype">https://docs.microsoft.com/en-us/office/vba/api/outlook.oluserpropertytype</a>}
*/
public enum OlUserPropertyType implements COMEnum {
    
    /**@ The property type is a combination of other types. It corresponds to the MAPI type PT_STRING8. */
    olCombination(19),    
    /**@ Represents a Currency property type. It corresponds to the MAPI type PT_CURRENCY. */
    olCurrency(14),    
    /**@ Represents a DateTime property type. It corresponds to the MAPI type PT_SYSTIME. */
    olDateTime(5),    
    /**@ Represents a time duration property type. It corresponds to the MAPI type PT_LONG. */
    olDuration(7),    
    /**@ Represents an enumeration property type. It corresponds to the MAPI type PT_LONG. */
    olEnumeration(21),    
    /**@ Represents a formula property type. It corresponds to the MAPI type PT_STRING8. See UserDefinedProperty.Formula property. */
    olFormula(18),    
    /**@ Represents an Integer number property type. It corresponds to the MAPI type PT_LONG. */
    olInteger(20),    
    /**@ Represents a String array property type used to store keywords. It corresponds to the MAPI type PT_MV_STRING8. */
    olKeywords(11),    
    /**@ Represents a Double number property type. It corresponds to the MAPI type PT_DOUBLE. */
    olNumber(3),    
    /**@ Represents an Outlook internal property type. */
    olOutlookInternal(0),    
    /**@ Represents a Double number property type used to store a percentage. It corresponds to the MAPI type PT_LONG. */
    olPercent(12),    
    /**@ Represents a smart from property type. This property indicates that if the From property of an Outlook item is empty, then the To property should be used instead. */
    olSmartFrom(22),    
    /**@ Represents a String property type. It corresponds to the MAPI type PT_STRING8. */
    olText(1),    
    /**@ Represents a yes/no (Boolean) property type. It corresponds to the MAPI type PT_BOOLEAN. */
    olYesNo(6);

    private final long value;

    OlUserPropertyType(long value) {
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
