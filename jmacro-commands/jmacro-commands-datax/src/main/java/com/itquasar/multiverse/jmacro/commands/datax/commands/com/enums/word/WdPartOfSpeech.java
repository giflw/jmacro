package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpartofspeech">https://docs.microsoft.com/en-us/office/vba/api/word.wdpartofspeech</a>}
*/
public enum WdPartOfSpeech implements COMEnum {
    
    /**@ An adjective. */
    wdAdjective(0),    
    /**@ An adverb. */
    wdAdverb(2),    
    /**@ A conjunction. */
    wdConjunction(5),    
    /**@ An idiom. */
    wdIdiom(8),    
    /**@ An interjection. */
    wdInterjection(7),    
    /**@ A noun. */
    wdNoun(1),    
    /**@ Some other part of speech. */
    wdOther(9),    
    /**@ A preposition. */
    wdPreposition(6),    
    /**@ A pronoun. */
    wdPronoun(4),    
    /**@ A verb. */
    wdVerb(3);

    private final long value;

    WdPartOfSpeech(long value) {
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
