package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vissectionindices">https://docs.microsoft.com/en-us/office/vba/api/visio.vissectionindices</a>}
*/
public enum VisSectionIndices implements COMEnum {
    
    /**@ Stores the actions that appear on the shortcut menu. */
    visSectionAction(240),    
    /**@ Index of a section whose rows represent annotations. */
    visSectionAnnotation(246),    
    /**@ Stores character properties; for example, font. */
    visSectionCharacter(3),    
    /**@ Stores an object's connection points. */
    visSectionConnectionPts(7),    
    /**@ Stores an object's control handles. */
    visSectionControls(9),    
    /**@ Index of a section whose rows represent fill gradient stops. */
    visSectionFillGradientStops(249),    
    /**@ An object's first Geometry section. Additional sections have indices (visSectionFirstComponent + ). */
    visSectionFirstComponent(10),    
    /**@ Index whose value is less than any other section index. */
    visSectionFirst(0),    
    /**@ Stores hyperlinks. */
    visSectionHyperlink(244),    
    /**@ An invalid index that no section will ever have. */
    visSectionInval(255),    
    /**@ An object's last Geometry section. */
    visSectionLastComponent(239),    
    /**@ Index whose value is greater than any other section index. */
    visSectionLast(252),    
    /**@ Stores a page or master's layer properties. */
    visSectionLayer(241),    
    /**@ Index of a section whose rows represent line gradient stops. */
    visSectionLineGradientStops(248),    
    /**@ Unspecified section. */
    visSectionNone(255),    
    /**@ Stores general non-repeating properties of an object. */
    visSectionObject(1),    
    /**@ Stores paragraph properties; for example, indentation. */
    visSectionParagraph(4),    
    /**@ Stores shape data (formerly custom properties). */
    visSectionProp(243),    
    /**@ Index of section whose rows represent reviewers. */
    visSectionReviewer(245),    
    /**@ Holds scratch cells. */
    visSectionScratch(6),    
    /**@ Index of section whose rows represent SmartTags. */
    visSectionSmartTag(247),    
    /**@ Stores position and alignment of tab stops. */
    visSectionTab(5),    
    /**@ Stores an object's text fields. */
    visSectionTextField(8),    
    /**@ Stores cells created and used by an external solution. */
    visSectionUser(242);

    private final long value;

    VisSectionIndices(long value) {
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
