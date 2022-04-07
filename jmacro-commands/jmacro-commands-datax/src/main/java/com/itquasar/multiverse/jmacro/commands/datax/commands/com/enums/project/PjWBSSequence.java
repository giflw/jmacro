package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjwbssequence">https://docs.microsoft.com/en-us/office/vba/api/project.pjwbssequence</a>}
*/
public enum PjWBSSequence implements COMEnum {
    
    /**@ Lowercase letters. */
    pjWBSOrderedLowercaseLetters(2),    
    /**@ Numbers. */
    pjWBSOrderedNumbers(0),    
    /**@ Uppercase letters. */
    pjWBSOrderedUppercaseLetters(1),    
    /**@ Unordered characters. */
    pjWBSUnorderedCharacters(3);

    private final long value;

    PjWBSSequence(long value) {
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
