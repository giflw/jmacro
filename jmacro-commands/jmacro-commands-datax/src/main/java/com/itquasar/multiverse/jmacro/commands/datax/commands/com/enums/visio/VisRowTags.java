package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrowtags">https://docs.microsoft.com/en-us/office/vba/api/visio.visrowtags</a>}
*/
public enum VisRowTags implements COMEnum {
    
    /**@ The row type of an ArcTo row in a Geometry section. */
    visTagArcTo(140),    
    /**@ The row type of a row in a visSectionConnectionPts section that has named rows. */
    visTagCnnctNamed(185),    
    /**@ The row type of an extended row in a visSectionConnectionPts section that has named rows. Seldom used. */
    visTagCnnctNamedABCD(187),    
    /**@ The row type of a row in a visSectionConnectionPts section that has unnamed rows. */
    visTagCnnctPt(153),    
    /**@ The row type of an extended row in a visSectionConnectionPts section that has unnamed rows. Seldom used. */
    visTagCnnctPtABCD(186),    
    /**@ The row type of the component properties row in a Geometry section. */
    visTagComponent(137),    
    /**@ The row type of a row in visSectionControls that doesn't supply a ToolTip. */
    visTagCtlPt(162),    
    /**@ The row type of a row in visSectionControls that supplies a ToolTip. */
    visTagCtlPtTip(170),    
    /**@ Connotes row of default type to AddRow, AddNamedRows, or AddRows methods. */
    visTagDefault(0),    
    /**@ The row type of an Ellipse row in a Geometry section. */
    visTagEllipse(143),    
    /**@ The row type of an EllipticalArcTo row in a Geometry section. */
    visTagEllipticalArcTo(144),    
    /**@ The row type of an InfiniteLine row in a Geometry section. */
    visTagInfiniteLine(141),    
    /**@ The row type of a LineTo row in a Geometry section. */
    visTagLineTo(139),    
    /**@ The row type of a MoveTo row in a Geometry section. */
    visTagMoveTo(138),    
    /**@ The row type of a NURBSTo row in a Geometry section. */
    visTagNURBSTo(195),    
    /**@ The row type of a PolylineTo row in a Geometry section. */
    visTagPolylineTo(193),    
    /**@ The row type of a RelCubBezTo row in a Geometry section. */
    visTagRelCubBezTo(236),    
    /**@ The row type of a RelEllipticalArcTo row in a Geometry section. */
    visTagRelEllipticalArcTo(240),    
    /**@ The row type of a RelLineTo row in a Geometry section. */
    visTagRelLineTo(239),    
    /**@ The row type of a RelMoveTo row in a Geometry section. */
    visTagRelMoveTo(238),    
    /**@ The row type of a RelQuadBezTo row in a Geometry section. */
    visTagRelQuadBezTo(23777),    
    /**@ The row type of a SplineStart row in a Geometry section. */
    visTagSplineBeg(165),    
    /**@ The row type of a SplineKnot row in a Geometry section. */
    visTagSplineSpan(166),    
    /**@ The row type of a row in a visSectionTab section that defines 0 (zero) tab stops. */
    visTagTab0(136),    
    /**@ The row type of a row in a visSectionTab section that defines up to 10 tab stops. */
    visTagTab10(151),    
    /**@ The row type of a row in a visSectionTab section that defines up to 2 tab stops. */
    visTagTab2(150),    
    /**@ The row type of a row in a visSectionTab section that defines up to 60 tab stops. */
    visTagTab60(181);

    private final long value;

    VisRowTags(long value) {
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
