package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdremovedocinfotype">https://docs.microsoft.com/en-us/office/vba/api/word.wdremovedocinfotype</a>}
*/
public enum WdRemoveDocInfoType implements COMEnum {
    
    /**@ Removes all document information. */
    wdRDIAll(99),    
    /**@ Removes document comments. */
    wdRDIComments(1),    
    /**@ Removes content type information. */
    wdRDIContentType(16),    
    /**@ Removes document management policy information. */
    wdRDIDocumentManagementPolicy(15),    
    /**@ Removes document properties. */
    wdRDIDocumentProperties(8),    
    /**@ Removes document server properties. */
    wdRDIDocumentServerProperties(14),    
    /**@ Removes document workspace information. */
    wdRDIDocumentWorkspace(10),    
    /**@ Removes email header information. */
    wdRDIEmailHeader(5),    
    /**@ Removes ink annotations. */
    wdRDIInkAnnotations(11),    
    /**@ Removes personal information. */
    wdRDIRemovePersonalInformation(4),    
    /**@ Removes revision marks. */
    wdRDIRevisions(2),    
    /**@ Removes routing slip information. */
    wdRDIRoutingSlip(6),    
    /**@ Removes information stored when sending a document for review. */
    wdRDISendForReview(7),    
    /**@ Removes template information. */
    wdRDITemplate(9),    
    /**@ Removes taskpane web extensions information. */
    wdRDITaskpaneWebExtensions(17),    
    /**@ Removes document version information. */
    wdRDIVersions(3);

    private final long value;

    WdRemoveDocInfoType(long value) {
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
