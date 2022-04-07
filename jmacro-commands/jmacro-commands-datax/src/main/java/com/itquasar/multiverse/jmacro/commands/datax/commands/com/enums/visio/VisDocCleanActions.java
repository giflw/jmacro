package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdoccleanactions">https://docs.microsoft.com/en-us/office/vba/api/visio.visdoccleanactions</a>}
*/
public enum VisDocCleanActions implements COMEnum {
    
    /**@ Perform all actions. */
    visDocCleanActAll(16383),    
    /**@ Detect invalid display list linkages. */
    visDocCleanActBadDisplayLists(256),    
    /**@ Detect fields that have missing or nonstandard formulas. */
    visDocCleanActBadFieldFormulas(2048),    
    /**@ Detect fields that have out-of-sync count and marker values. Change the position of escape characters to match character counts. */
    visDocCleanActBadFieldMarks(4096),    
    /**@ Detect formulas that have #Ref() errors. */
    visDocCleanActBadReferences(8192),    
    /**@ Detect formulas that can be generated from the result. */
    visDocCleanActConstantFormulas(32),    
    /**@ Default conditions to detect. */
    visDocCleanActDefault(8152),    
    /**@ Detect deleted fields. */
    visDocCleanActDeletedFields(1024),    
    /**@ Detect duplicate subscriptions (cell dependencies). */
    visDocCleanActDuplicateSubs(128),    
    /**@ Detect empty local rows and sections. */
    visDocCleanActEmptyRowsAndSects(2),    
    /**@ Detect unnecessary local overrides. */
    visDocCleanActLocalFormulas(1),    
    /**@ Detect missing subscriptions (cell dependencies). */
    visDocCleanActMissingSubs(16),    
    /**@ Detect results that are almost zero and change them to zero. */
    visDocCleanActNearZero(64),    
    /**@ Detect non-default font settings. */
    visDocCleanActNonDefaultFonts(4),    
    /**@ Detect results that don't match formulas. */
    visDocCleanActStaleResults(8),    
    /**@ Default conditions to report. */
    visDocCleanAlertDefault(0),    
    /**@ Default conditions to fix. */
    visDocCleanFixDefault(984);

    private final long value;

    VisDocCleanActions(long value) {
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
