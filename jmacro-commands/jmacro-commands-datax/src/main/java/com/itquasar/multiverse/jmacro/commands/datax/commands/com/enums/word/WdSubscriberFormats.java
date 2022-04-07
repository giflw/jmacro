package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsubscriberformats">https://docs.microsoft.com/en-us/office/vba/api/word.wdsubscriberformats</a>}
*/
public enum WdSubscriberFormats implements COMEnum {
    
    /**@ Not supported. */
    wdSubscriberBestFormat(0),    
    /**@ Not supported. */
    wdSubscriberPict(4),    
    /**@ Not supported. */
    wdSubscriberRTF(1),    
    /**@ Not supported. */
    wdSubscriberText(2);

    private final long value;

    WdSubscriberFormats(long value) {
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
