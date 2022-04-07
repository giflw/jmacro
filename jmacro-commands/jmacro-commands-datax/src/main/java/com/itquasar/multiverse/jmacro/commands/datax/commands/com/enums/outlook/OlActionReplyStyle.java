package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olactionreplystyle">https://docs.microsoft.com/en-us/office/vba/api/outlook.olactionreplystyle</a>}
*/
public enum OlActionReplyStyle implements COMEnum {
    
    /**@ The reply will include the original item embedded in it. */
    olEmbedOriginalItem(1),    
    /**@ The reply will include the text of the original item. */
    olIncludeOriginalText(2),    
    /**@ The reply will include the indented text of the original item. */
    olIndentOriginalText(3),    
    /**@ The reply will include a link to the original item. */
    olLinkOriginalItem(4),    
    /**@ The reply will not include any references to the original item or its text. */
    olOmitOriginalText(0),    
    /**@ The reply will include the original text with each line preceded by a symbol such as ">". */
    olReplyTickOriginalText(1000),    
    /**@ The reply style will be set based on the user's preference. */
    olUserPreference(5);

    private final long value;

    OlActionReplyStyle(long value) {
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
