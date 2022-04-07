package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdexportcreatebookmarks">https://docs.microsoft.com/en-us/office/vba/api/word.wdexportcreatebookmarks</a>}
*/
public enum WdExportCreateBookmarks implements COMEnum {
    
    /**@ Create a bookmark in the exported document for each Microsoft Word heading, which includes only headings within the main document and text boxes not within headers, footers, endnotes, footnotes, or comments. */
    wdExportCreateHeadingBookmarks(1),    
    /**@ Do not create bookmarks in the exported document. */
    wdExportCreateNoBookmarks(0),    
    /**@ Create a bookmark in the exported document for each Word bookmark, which includes all bookmarks except those contained within headers and footers. */
    wdExportCreateWordBookmarks(2);

    private final long value;

    WdExportCreateBookmarks(long value) {
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
