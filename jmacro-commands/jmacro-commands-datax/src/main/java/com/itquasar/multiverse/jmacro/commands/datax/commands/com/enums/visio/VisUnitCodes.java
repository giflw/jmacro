package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visunitcodes">https://docs.microsoft.com/en-us/office/vba/api/visio.visunitcodes</a>}
*/
public enum VisUnitCodes implements COMEnum {
    
    /**@ Acre */
    visAcre(36),    
    /**@ Angle units */
    visAngleUnits(80),    
    /**@ Centimeters */
    visCentimeters(69),    
    /**@ Ciceros and didots */
    visCicerosAndDidots(52),    
    /**@ Ciceros */
    visCiceros(54),    
    /**@ Currency */
    visCurrency(111),    
    /**@ Date */
    visDate(40),    
    /**@ Degrees, minutes, and seconds */
    visDegreeMinSec(82),    
    /**@ Degrees */
    visDegrees(81),    
    /**@ Didots */
    visDidots(53),    
    /**@ Drawing units */
    visDrawingUnits(64),    
    /**@ Duration */
    visDurationUnits(42),    
    /**@ Elapsed days */
    visElapsedDay(44),    
    /**@ Elapsed hours */
    visElapsedHour(45),    
    /**@ Elapsed minutes */
    visElapsedMin(46),    
    /**@ Elapsed seconds */
    visElapsedSec(47),    
    /**@ Elapsed weeks */
    visElapsedWeek(43),    
    /**@ Feet and inches */
    visFeetAndInches(67),    
    /**@ Feet */
    visFeet(66),    
    /**@ Hectares */
    visHectare(37),    
    /**@ Inches */
    visInches(65),    
    /**@ Fractions of inches */
    visInchFrac(73),    
    /**@ Kilometers */
    visKilometers(72),    
    /**@ Meters */
    visMeters(71),    
    /**@ Fractions of miles */
    visMileFrac(74),    
    /**@ Miles */
    visMiles(68),    
    /**@ Millimeters */
    visMillimeters(70),    
    /**@ Minutes */
    visMin(84),    
    /**@ Nautical miles */
    visNautMiles(76),    
    /**@ No unit conversion */
    visNoCast(252),    
    /**@ Number */
    visNumber(32),    
    /**@ Page units */
    visPageUnits(63),    
    /**@ Percent */
    visPercent(33),    
    /**@ Picas and points */
    visPicasAndPoints(49),    
    /**@ Picas */
    visPicas(51),    
    /**@ Points */
    visPoints(50),    
    /**@ Radians */
    visRadians(83),    
    /**@ Seconds */
    visSec(85),    
    /**@ Type units */
    visTypeUnits(48),    
    /**@ Color units */
    visUnitsColor(251),    
    /**@ GUID units */
    visUnitsGUID(95),    
    /**@ Invalid units */
    visUnitsInval(255),    
    /**@ NURBS units */
    visUnitsNURBS(138),    
    /**@ Point units */
    visUnitsPoint(225),    
    /**@ Polyline units */
    visUnitsPolyline(139),    
    /**@ String units */
    visUnitsString(231),    
    /**@ Yards */
    visYards(75);

    private final long value;

    VisUnitCodes(long value) {
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
