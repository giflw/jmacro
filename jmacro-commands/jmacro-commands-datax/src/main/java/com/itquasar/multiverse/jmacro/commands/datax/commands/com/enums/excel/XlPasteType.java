package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpastetype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpastetype</a>}
*/
public enum XlPasteType implements COMEnum {
    
    /**@ Everything will be pasted. */
    xlPasteAll(-4104),    
    /**@ Everything except borders will be pasted. */
    xlPasteAllExceptBorders(7),    
    /**@ Everything will be pasted and conditional formats will be merged. */
    xlPasteAllMergingConditionalFormats(14),    
    /**@ Everything will be pasted using the source theme. */
    xlPasteAllUsingSourceTheme(13),    
    /**@ Copied column width is pasted. */
    xlPasteColumnWidths(8),    
    /**@ Comments are pasted. */
    xlPasteComments(-4144),    
    /**@ Copied source format is pasted. */
    xlPasteFormats(-4122),    
    /**@ Formulas are pasted. */
    xlPasteFormulas(-4123),    
    /**@ Formulas and Number formats are pasted. */
    xlPasteFormulasAndNumberFormats(11),    
    /**@ Validations are pasted. */
    xlPasteValidation(6),    
    /**@ Values are pasted. */
    xlPasteValues(-4163),    
    /**@ Values and Number formats are pasted. */
    xlPasteValuesAndNumberFormats(12);

    private final long value;

    XlPasteType(long value) {
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
