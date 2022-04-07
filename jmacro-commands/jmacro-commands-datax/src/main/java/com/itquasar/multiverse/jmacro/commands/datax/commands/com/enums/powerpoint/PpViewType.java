package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppviewtype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppviewtype</a>}
*/
public enum PpViewType implements COMEnum {
    
    /**@ Handout Master */
    ppViewHandoutMaster(4),    
    /**@ Master Thumbnails */
    ppViewMasterThumbnails(12),    
    /**@ Normal */
    ppViewNormal(9),    
    /**@ Notes Master */
    ppViewNotesMaster(5),    
    /**@ Notes Page */
    ppViewNotesPage(3),    
    /**@ Outline */
    ppViewOutline(6),    
    /**@ Print Preview */
    ppViewPrintPreview(10),    
    /**@ Slide */
    ppViewSlide(1),    
    /**@ Slide Master */
    ppViewSlideMaster(2),    
    /**@ Slide Sorter */
    ppViewSlideSorter(7),    
    /**@ Thumbnails */
    ppViewThumbnails(11),    
    /**@ Title Master */
    ppViewTitleMaster(8);

    private final long value;

    PpViewType(long value) {
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
