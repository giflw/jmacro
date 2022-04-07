package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisiontype">https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisiontype</a>}
*/
public enum WdRevisionType implements COMEnum {
    
    /**@ No revision. */
    wdNoRevision(0),    
    /**@ Table cell deleted. */
    wdRevisionCellDeletion(17),    
    /**@ Table cell inserted. */
    wdRevisionCellInsertion(16),    
    /**@ Table cells merged. */
    wdRevisionCellMerge(18),    
    /**@ This object, member, or enumeration is deprecated and is not intended to be used in your code. */
    wdRevisionCellSplit(19),    
    /**@ Revision marked as a conflict. */
    wdRevisionConflict(7),    
    /**@ Deletion revision conflict in a coauthored document. */
    wdRevisionConflictDelete(21),    
    /**@ Insertion revision conflict in a coauthored document */
    wdRevisionConflictInsert(20),    
    /**@ Deletion. */
    wdRevisionDelete(2),    
    /**@ Field display changed. */
    wdRevisionDisplayField(5),    
    /**@ Insertion. */
    wdRevisionInsert(1),    
    /**@ Content moved from. */
    wdRevisionMovedFrom(14),    
    /**@ Content moved to. */
    wdRevisionMovedTo(15),    
    /**@ Paragraph number changed. */
    wdRevisionParagraphNumber(4),    
    /**@ Paragraph property changed. */
    wdRevisionParagraphProperty(10),    
    /**@ Property changed. */
    wdRevisionProperty(3),    
    /**@ Revision marked as reconciled conflict. */
    wdRevisionReconcile(6),    
    /**@ Replaced. */
    wdRevisionReplace(9),    
    /**@ Section property changed. */
    wdRevisionSectionProperty(12),    
    /**@ Style changed. */
    wdRevisionStyle(8),    
    /**@ Style definition changed. */
    wdRevisionStyleDefinition(13),    
    /**@ Table property changed. */
    wdRevisionTableProperty(11);

    private final long value;

    WdRevisionType(long value) {
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
