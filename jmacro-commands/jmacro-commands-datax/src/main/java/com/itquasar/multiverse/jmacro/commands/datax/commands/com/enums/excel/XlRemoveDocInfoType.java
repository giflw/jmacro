package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlremovedocinfotype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlremovedocinfotype</a>}
*/
public enum XlRemoveDocInfoType implements COMEnum {
    
    /**@ Removes all documentation information. */
    xlRDIAll(99),    
    /**@ Removes comments from the document information. */
    xlRDIComments(1),    
    /**@ Removes content type data from the document information. */
    xlRDIContentType(16),    
    /**@ Removes defined name comments from the documentation information. */
    xlRDIDefinedNameComments(18),    
    /**@ Removes document management policy data from the document information. */
    xlRDIDocumentManagementPolicy(15),    
    /**@ Removes document properties from the document information. */
    xlRDIDocumentProperties(8),    
    /**@ Removes server properties from the document information. */
    xlRDIDocumentServerProperties(14),    
    /**@ Removes workspace data from the document information. */
    xlRDIDocumentWorkspace(10),    
    /**@ Removes email headers from the document information. */
    xlRDIEmailHeader(5),    
    /**@ Removes Data Model data from the document information. */
    xlRDIExcelDataModel(23),    
    /**@ Removes inactive data connection data from the document information. */
    xlRDIInactiveDataConnections(19),    
    /**@ Removes ink annotations from the document information. */
    xlRDIInkAnnotations(11),    
    /**@ Removes inline Web Extensions from the document information. */
    xlRDIInlineWebExtensions(21),    
    /**@ Removes printer paths from the document information. */
    xlRDIPrinterPath(20),    
    /**@ Removes the publish information data from the document information. */
    xlRDIPublishInfo(13),    
    /**@ Removes personal information from the document information. */
    xlRDIRemovePersonalInformation(4),    
    /**@ Removes routing slip information from the document information. */
    xlRDIRoutingSlip(6),    
    /**@ Removes scenario comments from the document information. */
    xlRDIScenarioComments(12),    
    /**@ Removes the send for review information from the document information. */
    xlRDISendForReview(7),    
    /**@ Removes task pane Web Extensions from the document information. */
    xlRDITaskpaneWebExtensions(22);

    private final long value;

    XlRemoveDocInfoType(long value) {
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
