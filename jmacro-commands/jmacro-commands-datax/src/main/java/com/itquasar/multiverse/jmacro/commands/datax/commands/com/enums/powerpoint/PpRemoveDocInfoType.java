package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppremovedocinfotype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppremovedocinfotype</a>}
*/
public enum PpRemoveDocInfoType implements COMEnum {
    
    /**@ Remove all document information. */
    ppRDIAll(99),    
    /**@ Remove resolved @mentioned users from comments. */
    ppRDIAtMentions(18),    
    /**@ Remove comments. */
    ppRDIComments(1),    
    /**@ Remove content type information. */
    ppRDIContentType(16),    
    /**@ Remove document management policy information. */
    ppRDIDocumentManagementPolicy(15),    
    /**@ Remove document properties. */
    ppRDIDocumentProperties(8),    
    /**@ Remove document server properties. */
    ppRDIDocumentServerProperties(14),    
    /**@ Remove document workspace information. */
    ppRDIDocumentWorkspace(10),    
    /**@ Remove Ink annotations. NOTE: This constant has been deprecated, but it remains part of the object model for backward compatibility. You should not use it in new applications. */
    ppRDIInkAnnotations(11),    
    /**@ Remove publication path information. */
    ppRDIPublishPath(13),    
    /**@ Remove personal information. */
    ppRDIRemovePersonalInformation(4),    
    /**@ Remove slide update information. */
    ppRDISlideUpdateInformation(17);

    private final long value;

    PpRemoveDocInfoType(long value) {
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
