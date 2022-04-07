package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrectangletype">https://docs.microsoft.com/en-us/office/vba/api/word.wdrectangletype</a>}
*/
public enum WdRectangleType implements COMEnum {
    
    /**@ Represents a region corresponding to a line that separates columns. */
    wdLineBetweenColumnRectangle(5),    
    /**@ Represents a space occupied by a comment balloon. */
    wdMarkupRectangle(2),    
    /**@ Represents a space occupied by the more (...) indicator that appears in a comment balloon when there is additional text for the comment. */
    wdMarkupRectangleButton(3),    
    /**@ Represents a space occupied by a page border. */
    wdPageBorderRectangle(4),    
    /**@ Represents a space occupied by a selection tool, for example the table selection tool in the upper-left corner of a table or the anchor for an image. */
    wdSelection(6),    
    /**@ Represents a space occupied by a shape. */
    wdShapeRectangle(1),    
    /**@ Not applicable. */
    wdSystem(7),    
    /**@ Represents a space occupied by text. */
    wdTextRectangle(0),    
    /**@ Represents space occupied by a content control, equation, or document building block in-document control. */
    wdDocumentControlRectangle(13),    
    /**@ Represents space occupied by the email message navigation buttons when reading email in Microsoft Office Outlook. */
    wdMailNavArea(12),    
    /**@ Represents space occupied for the presentation of revision balloons on the page. This space is only printed if you print using "Document Showing Markup" in the Print dialog box. */
    wdMarkupRectangleArea(8),    
    /**@ Represents space occupied by the Go button used to find matching pairs of tracked moves in a document. */
    wdMarkupRectangleMoveMatch(10),    
    /**@ Represents space occupied by the page navigation buttons when reading a document in full page reading view. */
    wdReadingModeNavigation(9),    
    /**@ Represents space occupied for page turning when reading a document in full page reading view. */
    wdReadingModePanningArea(11);

    private final long value;

    WdRectangleType(long value) {
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
