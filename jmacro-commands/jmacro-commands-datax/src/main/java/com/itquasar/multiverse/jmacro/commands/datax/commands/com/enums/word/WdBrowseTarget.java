package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdbrowsetarget">https://docs.microsoft.com/en-us/office/vba/api/word.wdbrowsetarget</a>}
*/
public enum WdBrowseTarget implements COMEnum {
    
    /**@ Places insertion point before next or previous comment. */
    wdBrowseComment(3),    
    /**@ Places insertion point before next or previous edit. */
    wdBrowseEdit(10),    
    /**@ Places insertion point before next or previous endnote. */
    wdBrowseEndnote(5),    
    /**@ Places insertion point before next or previous browsefield. */
    wdBrowseField(6),    
    /**@ Places insertion point before next or previous browsefind. */
    wdBrowseFind(11),    
    /**@ Places insertion point before next or previous footnote. */
    wdBrowseFootnote(4),    
    /**@ Places insertion point before next or previous GoTo item. */
    wdBrowseGoTo(12),    
    /**@ Places insertion point before next or previous graphic. */
    wdBrowseGraphic(8),    
    /**@ Places insertion point before next or previous heading. */
    wdBrowseHeading(9),    
    /**@ Places insertion point before next or previous page. */
    wdBrowsePage(1),    
    /**@ Places insertion point before next or previous section. */
    wdBrowseSection(2),    
    /**@ Places insertion point before next or previous table. */
    wdBrowseTable(7);

    private final long value;

    WdBrowseTarget(long value) {
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
