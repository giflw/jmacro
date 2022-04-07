package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visgetsetargs">https://docs.microsoft.com/en-us/office/vba/api/visio.visgetsetargs</a>}
*/
public enum VisGetSetArgs implements COMEnum {
    
    /**@ Results returned as doubles (VT_R8). */
    visGetFloats(0),    
    /**@ Formulas returned in universal syntax (VT_BSTR). */
    visGetFormulasU(5),    
    /**@ Formulas returned as strings (VT_BSTR). */
    visGetFormulas(4),    
    /**@ Results returned as rounded long integers (VT_I4). */
    visGetRoundedInts(2),    
    /**@ Results returned as strings (VT_BSTR). */
    visGetStrings(3),    
    /**@ Results returned as truncated long integers (VT_I4). */
    visGetTruncatedInts(1),    
    /**@ Override present cell values even if they're guarded. */
    visSetBlastGuards(2),    
    /**@ Treat strings in results as formulas. */
    visSetFormulas(1),    
    /**@ Test for establishment of circular cell references. */
    visSetTestCircular(4),    
    /**@ Formulas are in universal syntax. */
    visSetUniversalSyntax(8);

    private final long value;

    VisGetSetArgs(long value) {
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
