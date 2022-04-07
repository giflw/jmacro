package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrecoverytype">https://docs.microsoft.com/en-us/office/vba/api/word.wdrecoverytype</a>}
*/
public enum WdRecoveryType implements COMEnum {
    
    /**@ Pastes a Microsoft Office Excel chart as an embedded OLE object. */
    wdChart(14),    
    /**@ Pastes an Excel chart and links it to the original Excel spreadsheet. */
    wdChartLinked(15),    
    /**@ Pastes an Excel chart as a picture. */
    wdChartPicture(13),    
    /**@ Preserves original formatting of the pasted material. */
    wdFormatOriginalFormatting(16),    
    /**@ Pastes as plain, unformatted text. */
    wdFormatPlainText(22),    
    /**@ Matches the formatting of the pasted text to the formatting of surrounding text. */
    wdFormatSurroundingFormattingWithEmphasis(20),    
    /**@ Merges a pasted list with neighboring lists. */
    wdListCombineWithExistingList(24),    
    /**@ Continues numbering of a pasted list from the list in the document. */
    wdListContinueNumbering(7),    
    /**@ Not supported. */
    wdListDontMerge(25),    
    /**@ Restarts numbering of a pasted list. */
    wdListRestartNumbering(8),    
    /**@ Not supported. */
    wdPasteDefault(0),    
    /**@ Pastes a single cell table as a separate table. */
    wdSingleCellTable(6),    
    /**@ Pastes a single cell as text. */
    wdSingleCellText(5),    
    /**@ Merges pasted cells into an existing table by inserting the pasted rows between the selected rows. */
    wdTableAppendTable(10),    
    /**@ Inserts a pasted table as rows between two rows in the target table. */
    wdTableInsertAsRows(11),    
    /**@ Pastes an appended table without merging table styles. */
    wdTableOriginalFormatting(12),    
    /**@ Pastes table cells and overwrites existing table cells. */
    wdTableOverwriteCells(23),    
    /**@ Uses the styles that are in use in the destination document. */
    wdUseDestinationStylesRecovery(19);

    private final long value;

    WdRecoveryType(long value) {
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
