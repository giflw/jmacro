package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acimesentencemode">https://docs.microsoft.com/en-us/office/vba/api/access.acimesentencemode</a>}
*/
public enum AcImeSentenceMode implements COMEnum {
    
    /**@ No description provided */
    acImeSentenceModeConversation(2),    
    /**@ No description provided */
    acImeSentenceModeNone(3),    
    /**@ No description provided */
    acImeSentenceModePhrasePredict(0),    
    /**@ No description provided */
    acImeSentenceModePluralClause(1);

    private final long value;

    AcImeSentenceMode(long value) {
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
