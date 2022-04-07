package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcustomoutlinecodesequence">https://docs.microsoft.com/en-us/office/vba/api/project.pjcustomoutlinecodesequence</a>}
*/
public enum PjCustomOutlineCodeSequence implements COMEnum {
    
    /**@ Characters. */
    pjCustomOutlineCodeCharacters(3),    
    /**@ Lowercase letters. */
    pjCustomOutlineCodeLowercaseLetters(2),    
    /**@ Numbers. */
    pjCustomOutlineCodeNumbers(0),    
    /**@ Uppercase letters. */
    pjCustomOutlineCodeUppercaseLetters(1);

    private final long value;

    PjCustomOutlineCodeSequence(long value) {
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
