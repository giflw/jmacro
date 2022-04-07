package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjserverpage">https://docs.microsoft.com/en-us/office/vba/api/project.pjserverpage</a>}
*/
public enum PjServerPage implements COMEnum {
    
    /**@ Show the Approvals page. */
    pjServerPageApprovals(0),    
    /**@ Show the Documents page from the project site. */
    pjServerPageDocuments(7),    
    /**@ Show the Issues page from the project site. */
    pjServerPageIssues(8),    
    /**@ Show the Permissions page. */
    pjServerPagePermissions(5),    
    /**@ Show the Portfolio Analyzer page. */
    pjServerPagePortfolioAnalyzer(3),    
    /**@ Show the Project Center page. */
    pjServerPageProjectCenter(2),    
    /**@ Show the Project Details page. */
    pjServerPageProjectDetails(6),    
    /**@ Show the Resource Center page. */
    pjServerPageResourceCenter(1),    
    /**@ Show the Risks page from the project site. */
    pjServerPageRisks(9),    
    /**@ Show the Status Reports page. */
    pjServerPageStatusReports(4),    
    /**@ Show the Project Site page. */
    pjServerPageWorkspace(10);

    private final long value;

    PjServerPage(long value) {
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
