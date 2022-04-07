package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olsharingprovider">https://docs.microsoft.com/en-us/office/vba/api/outlook.olsharingprovider</a>}
*/
public enum OlSharingProvider implements COMEnum {
    
    /**@ Represents the Exchange sharing provider. */
    olProviderExchange(1),    
    /**@ Represents a federated sharing provider. A SharingItem object with this type of provider is used for sharing relationships across organizational boundares (for example, between two organizations using Microsoft Exchange Server 2010). */
    olProviderFederate(7),    
    /**@ Represents the iCalendar sharing provider. */
    olProviderICal(4),    
    /**@ Represents the PubCal sharing provider. */
    olProviderPubCal(3),    
    /**@ Represents the Really Simple Syndication (RSS) sharing provider. */
    olProviderRSS(6),    
    /**@ Represents the SharePoint sharing provider. */
    olProviderSharePoint(5),    
    /**@ Represents an unknown sharing provider. This value is used if the sharing provider GUID in the sharing message does not match the GUID of any of the sharing providers represented in this enumeration. */
    olProviderUnknown(0),    
    /**@ Represents the WebCal sharing provider. */
    olProviderWebCal(2);

    private final long value;

    OlSharingProvider(long value) {
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
