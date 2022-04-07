package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrowindices">https://docs.microsoft.com/en-us/office/vba/api/visio.visrowindices</a>}
*/
public enum VisRowIndices implements COMEnum {
    
    /**@ Index of the first row in visSectionHyperlink. */
    visRow1stHyperlink(0),    
    /**@ Index of the row in visSectionObject that defines the 3D rotation properties of the shape. */
    visRow3DRotationProperties(30),    
    /**@ Index of the first row in visSectionAction. */
    visRowAction(0),    
    /**@ Index of the row in visSectionObject that defines the shape's alignment. */
    visRowAlign(14),    
    /**@ Index of the first row in visSectionAnnotation. */
    visRowAnnotation(0),    
    /**@ Index of the row in visSectionObject that defines the bevel properties of the shape. */
    visRowBevelProperties(29),    
    /**@ Index of the first row in visSectionCharacter. */
    visRowCharacter(0),    
    /**@ Index of the component properties row in a Geometry section (visSectionFirstComponent +). */
    visRowComponent(0),    
    /**@ Index of the first row in visSectionConnectionPts. */
    visRowConnectionPts(0),    
    /**@ Index of the first row in visSectionControl. */
    visRowControl(0),    
    /**@ Index of the row in visSectionObject that contains document properties. */
    visRowDoc(20),    
    /**@ Index of the row in visSectionObject that contains event information. */
    visRowEvent(5),    
    /**@ Index of the first row in visSectionTextField. */
    visRowField(0),    
    /**@ Index of the row in visSectionObject that defines fill properties. */
    visRowFill(3),    
    /**@ Row logically before every row in a section. */
    visRowFirst(0),    
    /**@ Index of the row in visSectionObject that defines foreign properties (shape of type visTypeForeignObject). */
    visRowForeign(9),    
    /**@ Index of the row in visSectionObject that defines the gradient properties of the shape. */
    visRowGradientProperties(26),    
    /**@ Index of first row in visSectionLineGradientStops and visSectionFillGradientStops. */
    visRowGradientStop(0),    
    /**@ Index of the row in visSectionObject that defines foreign properties (shape of type visTypeGroup). */
    visRowGroup(22),    
    /**@ Index of the row in visSectionObject that defines Help and copyright properties. */
    visRowHelpCopyright(16),    
    /**@ Index of the row in visSectionObject that defines image properties (shape whose property is visTypeBitMap). */
    visRowImage(21),    
    /**@ An invalid row index. */
    visRowInval(-1),    
    /**@ Row logically after every row in a section. */
    visRowLast(-2),    
    /**@ Index of the row in visSectionObject that defines what layers the shape belongs to. */
    visRowLayerMem(6),    
    /**@ Index of the first row in visSectionLayer. */
    visRowLayer(0),    
    /**@ Index of the row in visSectionObject that defines line properties. */
    visRowLine(2),    
    /**@ Index of the row in visSectionObject that defines its lock properties. */
    visRowLock(15),    
    /**@ Index of the row in visSectionObject that defines miscellaneous behaviors. */
    visRowMisc(17),    
    /**@ Unspecified row. */
    visRowNone(-1),    
    /**@ Index of the row in visSectionObject of a page or master that defines placement and routing. */
    visRowPageLayout(24),    
    /**@ Index of the row in visSectionObject that defines other effect properties. */
    visRowOtherEffectProperties(28),    
    /**@ Index of the row in visSectionObject that defines page or master properties (shape of type visTypePage). */
    visRowPage(10),    
    /**@ Index of the first row in visSectionParagraph. */
    visRowParagraph(0),    
    /**@ Index of the row in visSectionObject of a document that defines printing properties. (Print Properties section in the ShapeSheet window.) */
    visRowPrintProperties(25),    
    /**@ Index of the first row in visSectionProp. */
    visRowProp(0),    
    /**@ Index of the row in visSectionObject that defines QuickStyle properties. */
    visRowQuickStyleProperties(27),    
    /**@ Index of the row in visSectionObject that defines replace-shape behaviors. */
    visRowReplaceBehaviors(32),    
    /**@ Index of the first row in visSectionReview. */
    visRowReviewer(0),    
    /**@ Index of the row in visSectionObject of a page or master that defines the ruler and grid settings. */
    visRowRulerGrid(18),    
    /**@ Index of the first row in visSectionScratch. */
    visRowScratch(0),    
    /**@ Index of the row in visSectionObject of shape that defines placement and routing. */
    visRowShapeLayout(23),    
    /**@ Index of the first row in visSectionSmartTag. */
    visRowSmartTag(0),    
    /**@ Index of the row in visSectionObject that defines style properties. */
    visRowStyle(8),    
    /**@ Index of the first row in visSectionTab. */
    visRowTab(0),    
    /**@ Index of the row in visSectionObject that defines a shape's text transform properties. */
    visRowTextXForm(12),    
    /**@ Index of the row in visSectionObject that defines a shape or style's text block properties. */
    visRowText(11),    
    /**@ Index of the row in visSectionObject that defines theme properties for a shape. */
    visRowThemeProperties(31),    
    /**@ Index of the first row in visSectionUser. */
    visRowUser(0),    
    /**@ Index of the first vertex row in a Geometry section. */
    visRowVertex(1),    
    /**@ Index of the row in 1D shape's visSectionObject that defines its endpoints. */
    visRowXForm1D(4),    
    /**@ Index of the row in visSectionObject that defines the shape's transform properties. */
    visRowXFormOut(1);

    private final long value;

    VisRowIndices(long value) {
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
