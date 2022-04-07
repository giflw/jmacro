package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtaskpanes">https://docs.microsoft.com/en-us/office/vba/api/word.wdtaskpanes</a>}
*/
public enum WdTaskPanes implements COMEnum {
    
    /**@ Apply styles pane. */
    wdTaskPaneApplyStyles(17),    
    /**@ Document actions pane. */
    wdTaskPaneDocumentActions(7),    
    /**@ Document protection pane. */
    wdTaskPaneDocumentProtection(6),    
    /**@ Fax service pane. */
    wdTaskPaneFaxService(11),    
    /**@ Formatting pane. */
    wdTaskPaneFormatting(0),    
    /**@ Help pane. */
    wdTaskPaneHelp(9),    
    /**@ Mail merge pane. */
    wdTaskPaneMailMerge(2),    
    /**@ Proofing pane. */
    wdTaskPaneProofing(20),    
    /**@ Research pane. */
    wdTaskPaneResearch(10),    
    /**@ Reveal formatting codes pane. */
    wdTaskPaneRevealFormatting(1),    
    /**@ Revisions pane flex pane. */
    wdTaskPaneRevPaneFlex(22),    
    /**@ Search pane. */
    wdTaskPaneSearch(4),    
    /**@ Signature pane. */
    wdTaskPaneSignature(14),    
    /**@ Style inspector pane. */
    wdTaskPaneStyleInspector(15),    
    /**@ Thesaurus pane. */
    wdTaskPaneThesaurus(23),    
    /**@ Translate pane. */
    wdTaskPaneTranslate(3),    
    /**@ XML document pane. */
    wdTaskPaneXMLDocument(12),    
    /**@ XML mapping pane. */
    wdTaskPaneXMLMapping(21),    
    /**@ XML structure pane. */
    wdTaskPaneXMLStructure(5);

    private final long value;

    WdTaskPanes(long value) {
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
