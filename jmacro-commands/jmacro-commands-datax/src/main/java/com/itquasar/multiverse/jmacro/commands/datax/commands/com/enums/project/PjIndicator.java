package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjindicator">https://docs.microsoft.com/en-us/office/vba/api/project.pjindicator</a>}
*/
public enum PjIndicator implements COMEnum {
    
    /**@ The indicator is a double arrow. */
    pjIndicatorArrowDouble(42),    
    /**@ The indicator is a down arrow. */
    pjIndicatorArrowDown(44),    
    /**@ The indicator is a left arrow. */
    pjIndicatorArrowLeft(40),    
    /**@ The indicator is a right arrow. */
    pjIndicatorArrowRight(41),    
    /**@ The indicator is an up arrow. */
    pjIndicatorArrowUp(43),    
    /**@ The indicator is a check mark. */
    pjIndicatorCheckMark(54),    
    /**@ The indicator is a circle with the lower half filled. */
    pjIndicatorCircleBottomFill(46),    
    /**@ The indicator is a hollow circle. */
    pjIndicatorCircleHollow(51),    
    /**@ The indicator is a circle with the left side filled. */
    pjIndicatorCircleLeftFill(47),    
    /**@ The indicator is a circle with the right side filled. */
    pjIndicatorCircleRightFill(49),    
    /**@ The indicator is a filled circle. */
    pjIndicatorCircleRoundFill(50),    
    /**@ The indicator is a solid circle. */
    pjIndicatorCircleSolidFill(45),    
    /**@ The indicator is a circle with the upper half filled. */
    pjIndicatorCircleTopFill(48),    
    /**@ The indicator is a clock. */
    pjIndicatorClock(57),    
    /**@ The indicator is a gray dash. */
    pjIndicatorDashGray(65),    
    /**@ The indicator is a delete mark. */
    pjIndicatorDeleteMark(55),    
    /**@ The indicator is a lime-colored diamond. */
    pjIndicatorDiamondLime(37),    
    /**@ The indicator is a red-colored diamond. */
    pjIndicatorDiamondRed(39),    
    /**@ The indicator is a yellow-colored diamond. */
    pjIndicatorDiamondYellow(38),    
    /**@ The indicator is a lime-colored happy face. */
    pjIndicatorFaceHappyLime(60),    
    /**@ The indicator is a yellow-colored happy face. */
    pjIndicatorFaceHappyYellow(59),    
    /**@ The indicator is a red-colored sad face. */
    pjIndicatorFaceSadRed(64),    
    /**@ The indicator is a yellow-colored sad face. */
    pjIndicatorFaceSadYellow(63),    
    /**@ The indicator is a aqua-colored straight face. */
    pjIndicatorFaceStraightAqua(62),    
    /**@ The indicator is a yellow-colored straight face. */
    pjIndicatorFaceStraightYellow(61),    
    /**@ The indicator is an aqua flag. */
    pjIndicatorFlagAqua(18),    
    /**@ The indicator is a blue flag. */
    pjIndicatorFlagBlue(19),    
    /**@ The indicator is a fuchsia flag. */
    pjIndicatorFlagFuchsia(20),    
    /**@ The indicator is a lime flag. */
    pjIndicatorFlagLime(14),    
    /**@ The indicator is a red flag. */
    pjIndicatorFlagRed(16),    
    /**@ The indicator is a silver flag. */
    pjIndicatorFlagSilver(21),    
    /**@ The indicator is white flag. */
    pjIndicatorFlagWhite(17),    
    /**@ The indicator is yellow flag. */
    pjIndicatorFlagYellow(15),    
    /**@ The indicator is an unlit light bulb. */
    pjIndicatorLightBulbOff(52),    
    /**@ The indicator is a lit light bulb. */
    pjIndicatorLightBulbOn(53),    
    /**@ The indicator is a black minus sign. */
    pjIndicatorMinusBlack(35),    
    /**@ The indicator is a lime-colored minus sign. */
    pjIndicatorMinusLime(32),    
    /**@ The indicator is a red minus sign. */
    pjIndicatorMinusRed(34),    
    /**@ The indicator is a white minus sign. */
    pjIndicatorMinusWhite(36),    
    /**@ The indicator is a yellow minus sign. */
    pjIndicatorMinusYellow(33),    
    /**@ No indicator. */
    pjIndicatorNone(0),    
    /**@ The indicator is a black plus sign. */
    pjIndicatorPlusBlack(30),    
    /**@ The indicator is a lime plus sign. */
    pjIndicatorPlusLime(27),    
    /**@ The indicator is a red plus sign. */
    pjIndicatorPlusRed(29),    
    /**@ The indicator is a white plus sign. */
    pjIndicatorPlusWhite(31),    
    /**@ The indicator is a yellow plus sign. */
    pjIndicatorPlusYellow(28),    
    /**@ The indicator is a pushpin. */
    pjIndicatorPushPin(58),    
    /**@ The indicator is a question mark. */
    pjIndicatorQuestionMark(56),    
    /**@ The indicator is an aqua sphere. */
    pjIndicatorSphereAqua(6),    
    /**@ The indicator is a black sphere. */
    pjIndicatorSphereBlack(4),    
    /**@ The indicator is a blue sphere. */
    pjIndicatorSphereBlue(8),    
    /**@ The indicator is a fuchsia sphere. */
    pjIndicatorSphereFuchsia(9),    
    /**@ The indicator is a gray sphere. */
    pjIndicatorSphereGray(12),    
    /**@ The indicator is a green sphere. */
    pjIndicatorSphereGreen(7),    
    /**@ The indicator is a lime sphere. */
    pjIndicatorSphereLime(1),    
    /**@ The indicator is a maroon sphere. */
    pjIndicatorSphereMaroon(11),    
    /**@ The indicator is a purple sphere. */
    pjIndicatorSpherePurple(10),    
    /**@ The indicator is a red sphere. */
    pjIndicatorSphereRed(3),    
    /**@ The indicator is a silver sphere. */
    pjIndicatorSphereSilver(13),    
    /**@ The indicator is a white sphere. */
    pjIndicatorSphereWhite(5),    
    /**@ The indicator is a yellow sphere. */
    pjIndicatorSphereYellow(2),    
    /**@ The indicator is a black square. */
    pjIndicatorSquareBlack(25),    
    /**@ The indicator is a lime square. */
    pjIndicatorSquareLime(22),    
    /**@ The indicator is a red square. */
    pjIndicatorSquareRed(24),    
    /**@ The indicator is a white square. */
    pjIndicatorSquareWhite(26),    
    /**@ The indicator is a yellow square. */
    pjIndicatorSquareYellow(23);

    private final long value;

    PjIndicator(long value) {
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
