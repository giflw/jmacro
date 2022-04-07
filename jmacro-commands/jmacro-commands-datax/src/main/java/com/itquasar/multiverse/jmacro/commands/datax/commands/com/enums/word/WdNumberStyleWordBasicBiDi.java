package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdnumberstylewordbasicbidi">https://docs.microsoft.com/en-us/office/vba/api/word.wdnumberstylewordbasicbidi</a>}
*/
public enum WdNumberStyleWordBasicBiDi implements COMEnum {
    
    /**@ Not supported. */
    wdCaptionNumberStyleBidiLetter1(49),    
    /**@ Not supported. */
    wdCaptionNumberStyleBidiLetter2(50),    
    /**@ Not supported. */
    wdListNumberStyleBidi1(49),    
    /**@ Not supported. */
    wdListNumberStyleBidi2(50),    
    /**@ Not supported. */
    wdNoteNumberStyleBidiLetter1(49),    
    /**@ Not supported. */
    wdNoteNumberStyleBidiLetter2(50),    
    /**@ Not supported. */
    wdPageNumberStyleBidiLetter1(49),    
    /**@ Not supported. */
    wdPageNumberStyleBidiLetter2(50);

    private final long value;

    WdNumberStyleWordBasicBiDi(long value) {
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
