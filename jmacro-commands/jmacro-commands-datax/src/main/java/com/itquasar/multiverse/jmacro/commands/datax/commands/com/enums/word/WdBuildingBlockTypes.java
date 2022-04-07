package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdbuildingblocktypes">https://docs.microsoft.com/en-us/office/vba/api/word.wdbuildingblocktypes</a>}
*/
public enum WdBuildingBlockTypes implements COMEnum {
    
    /**@ Autotext building block. */
    wdTypeAutoText(9),    
    /**@ Bibliography building block. */
    wdTypeBibliography(34),    
    /**@ Cover page building block. */
    wdTypeCoverPage(2),    
    /**@ Custom building block. */
    wdTypeCustom1(29),    
    /**@ Custom building block. */
    wdTypeCustom2(30),    
    /**@ Custom building block. */
    wdTypeCustom3(31),    
    /**@ Custom building block. */
    wdTypeCustom4(32),    
    /**@ Custom building block. */
    wdTypeCustom5(33),    
    /**@ Custom autotext building block. */
    wdTypeCustomAutoText(23),    
    /**@ Custom bibliography building block. */
    wdTypeCustomBibliography(35),    
    /**@ Custom cover page building block. */
    wdTypeCustomCoverPage(16),    
    /**@ Custom equations building block. */
    wdTypeCustomEquations(17),    
    /**@ Custom footers building block. */
    wdTypeCustomFooters(18),    
    /**@ Custom headers building block. */
    wdTypeCustomHeaders(19),    
    /**@ Custom page numbering building block. */
    wdTypeCustomPageNumber(20),    
    /**@ Building block for custom page numbering on the bottom of the page. */
    wdTypeCustomPageNumberBottom(26),    
    /**@ Custom page numbering building block. */
    wdTypeCustomPageNumberPage(27),    
    /**@ Building block for custom page numbering on the top of the page. */
    wdTypeCustomPageNumberTop(25),    
    /**@ Custom quick parts building block. */
    wdTypeCustomQuickParts(15),    
    /**@ Custom table of contents building block. */
    wdTypeCustomTableOfContents(28),    
    /**@ Custom table building block. */
    wdTypeCustomTables(21),    
    /**@ Custom text box building block. */
    wdTypeCustomTextBox(24),    
    /**@ Custom watermark building block. */
    wdTypeCustomWatermarks(22),    
    /**@ Equation building block. */
    wdTypeEquations(3),    
    /**@ Footer building block. */
    wdTypeFooters(4),    
    /**@ Header building block. */
    wdTypeHeaders(5),    
    /**@ Page numbering building block. */
    wdTypePageNumber(6),    
    /**@ Building block for page numbering on the bottom of the page. */
    wdTypePageNumberBottom(12),    
    /**@ Page numbering building block. */
    wdTypePageNumberPage(13),    
    /**@ Building block for page numbering on the top of the page. */
    wdTypePageNumberTop(11),    
    /**@ Quick parts building block. */
    wdTypeQuickParts(1),    
    /**@ Table of contents building block. */
    wdTypeTableOfContents(14),    
    /**@ Table building block. */
    wdTypeTables(7),    
    /**@ Text box building block. */
    wdTypeTextBox(10),    
    /**@ Watermark building block. */
    wdTypeWatermarks(8);

    private final long value;

    WdBuildingBlockTypes(long value) {
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
