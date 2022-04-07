package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vissavepreviewmode">https://docs.microsoft.com/en-us/office/vba/api/visio.vissavepreviewmode</a>}
*/
public enum VisSavePreviewMode implements COMEnum {
    
    /**@ The first page; includes only Microsoft Visio shapes. Does not include embedded objects, text, or gradient fills. */
    visSavePreviewDraft1st(1),    
    /**@ All file pages; includes only Visio shapes. Does not include embedded objects, text, or gradient fills. */
    visSavePreviewDraftAll(4),    
    /**@ No preview picture. */
    visSavePreviewNone(0);

    private final long value;

    VisSavePreviewMode(long value) {
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
