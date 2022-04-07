package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdhelptype">https://docs.microsoft.com/en-us/office/vba/api/word.wdhelptype</a>}
*/
public enum WdHelpType implements COMEnum {
    
    /**@ Displays the Help Topics dialog box. */
    wdHelp(0),    
    /**@ Displays the About Microsoft Word dialog box. */
    wdHelpAbout(1),    
    /**@ Displays Help describing the command associated with the active view or pane. */
    wdHelpActiveWindow(2),    
    /**@ Displays the Help Topics dialog box. */
    wdHelpContents(3),    
    /**@ Displays examples and demos. */
    wdHelpExamplesAndDemos(4),    
    /**@ Displays Help topics for AreA Hangul users. */
    wdHelpHWP(13),    
    /**@ Displays Help topics for Ichitaro users. */
    wdHelpIchitaro(11),    
    /**@ Displays the Help Topics dialog box. */
    wdHelpIndex(5),    
    /**@ Displays keyboard shortcuts associated with help. */
    wdHelpKeyboard(6),    
    /**@ Displays Help topics for IBM Personal Editor 2 users. */
    wdHelpPE2(12),    
    /**@ Displays product support information */
    wdHelpPSSHelp(7),    
    /**@ Displays quick previews. */
    wdHelpQuickPreview(8),    
    /**@ Displays the Help Topics dialog box. */
    wdHelpSearch(9),    
    /**@ Displays a list of Help topics that describe how to use Help. */
    wdHelpUsingHelp(10);

    private final long value;

    WdHelpType(long value) {
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
