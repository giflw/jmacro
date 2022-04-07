package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdhighansitext">https://docs.microsoft.com/en-us/office/vba/api/word.wdhighansitext</a>}
*/
public enum WdHighAnsiText implements COMEnum {
    
    /**@ Microsoft Word interprets high-ANSI text as East Asian characters only if Word automatically detects East Asian language text. */
    wdAutoDetectHighAnsiFarEast(2),    
    /**@ Word doesn't interpret any high-ANSI text as East Asian characters. */
    wdHighAnsiIsFarEast(0),    
    /**@ Word interprets all high-ANSI text as East Asian characters. */
    wdHighAnsiIsHighAnsi(1);

    private final long value;

    WdHighAnsiText(long value) {
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
