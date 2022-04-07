package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimeffect">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimeffect</a>}
*/
public enum MsoAnimEffect implements COMEnum {
    
    /**@ Appears */
    msoAnimEffectAppear(1),    
    /**@ Arcs Up */
    msoAnimEffectArcUp(47),    
    /**@ Ascends */
    msoAnimEffectAscend(39),    
    /**@ Blasts */
    msoAnimEffectBlast(64),    
    /**@ Blinds */
    msoAnimEffectBlinds(3),    
    /**@ Bold Flash */
    msoAnimEffectBoldFlash(63),    
    /**@ Bold Reveals */
    msoAnimEffectBoldReveal(65),    
    /**@ Boomerangs */
    msoAnimEffectBoomerang(25),    
    /**@ Bounce */
    msoAnimEffectBounce(26),    
    /**@ Box */
    msoAnimEffectBox(4),    
    /**@ Brush on Color */
    msoAnimEffectBrushOnColor(66),    
    /**@ Brush on Underline */
    msoAnimEffectBrushOnUnderline(67),    
    /**@ Center Revolves */
    msoAnimEffectCenterRevolve(40),    
    /**@ FillColor Changes */
    msoAnimEffectChangeFillColor(54),    
    /**@ Font Changes */
    msoAnimEffectChangeFont(55),    
    /**@ Font Color Changes */
    msoAnimEffectChangeFontColor(56),    
    /**@ Font Size Changes */
    msoAnimEffectChangeFontSize(57),    
    /**@ Font Style Changes */
    msoAnimEffectChangeFontStyle(58),    
    /**@ Line color Changes */
    msoAnimEffectChangeLineColor(60),    
    /**@ Checkerboard Effect */
    msoAnimEffectCheckerboard(5),    
    /**@ Circle */
    msoAnimEffectCircle(6),    
    /**@ Color Bleeds */
    msoAnimEffectColorBlend(68),    
    /**@ Color Revealed */
    msoAnimEffectColorReveal(27),    
    /**@ Color Wave */
    msoAnimEffectColorWave(69),    
    /**@ Complementary Color */
    msoAnimEffectComplementaryColor(70),    
    /**@ Complementary Color2 */
    msoAnimEffectComplementaryColor2(71),    
    /**@ Contrasting Color */
    msoAnimEffectContrastingColor(72),    
    /**@ Crawl Effect */
    msoAnimEffectCrawl(7),    
    /**@ Credits Effect */
    msoAnimEffectCredits(28),    
    /**@ Custom Effect */
    msoAnimEffectCustom(0),    
    /**@ Darken Effect */
    msoAnimEffectDarken(73),    
    /**@ Desaturate Effect */
    msoAnimEffectDesaturate(74),    
    /**@ Descend Effect */
    msoAnimEffectDescend(42),    
    /**@ Diamond Effect */
    msoAnimEffectDiamond(8),    
    /**@ Dissolve Effect */
    msoAnimEffectDissolve(9),    
    /**@ EaseIn Effect */
    msoAnimEffectEaseIn(29),    
    /**@ Expand Effect */
    msoAnimEffectExpand(50),    
    /**@ Fade Effect */
    msoAnimEffectFade(10),    
    /**@ Faded Swivel Effect */
    msoAnimEffectFadedSwivel(41),    
    /**@ Faded Zoom Effect */
    msoAnimEffectFadedZoom(48),    
    /**@ Flash Bulb Effect */
    msoAnimEffectFlashBulb(75),    
    /**@ Flash Once */
    msoAnimEffectFlashOnce(11),    
    /**@ Flicker Effect */
    msoAnimEffectFlicker(76),    
    /**@ Flip Effect */
    msoAnimEffectFlip(51),    
    /**@ Float Effect */
    msoAnimEffectFloat(30),    
    /**@ Fly Effect */
    msoAnimEffectFly(2),    
    /**@ Fold Effect */
    msoAnimEffectFold(53),    
    /**@ Glide Effect */
    msoAnimEffectGlide(49),    
    /**@ Grow and Turn Effect */
    msoAnimEffectGrowAndTurn(31),    
    /**@ Grow and Shrink Effect */
    msoAnimEffectGrowShrink(59),    
    /**@ Grow with Color Effect */
    msoAnimEffectGrowWithColor(77),    
    /**@ Lighten Effect */
    msoAnimEffectLighten(78),    
    /**@ Light Speed Effect */
    msoAnimEffectLightSpeed(32),    
    /**@ Media Pause Effect */
    msoAnimEffectMediaPause(84),    
    /**@ Media Play Effect */
    msoAnimEffectMediaPlay(83),    
    /**@ Media Stop Effect */
    msoAnimEffectMediaStop(85),    
    /**@ Path4PointStar Effect */
    msoAnimEffectPath4PointStar(101),    
    /**@ Path5PointStar Effect */
    msoAnimEffectPath5PointStar(90),    
    /**@ Path6PointStar Effect */
    msoAnimEffectPath6PointStar(96),    
    /**@ Path8PointStar Effect */
    msoAnimEffectPath8PointStar(102),    
    /**@ Moves on the Arc Down path */
    msoAnimEffectPathArcDown(122),    
    /**@ Moves on the Arc Left path */
    msoAnimEffectPathArcLeft(136),    
    /**@ Moves on the Arc Right Path */
    msoAnimEffectPathArcRight(143),    
    /**@ Moves on the Arc Up path */
    msoAnimEffectPathArcUp(129),    
    /**@ Moves on the Bean path */
    msoAnimEffectPathBean(116),    
    /**@ Moves on the Bounce Left path */
    msoAnimEffectPathBounceLeft(126),    
    /**@ Moves on the Bounce Right path */
    msoAnimEffectPathBounceRight(139),    
    /**@ Moves on the Buzzsaw path */
    msoAnimEffectPathBuzzsaw(110),    
    /**@ Moves on a Circular Path */
    msoAnimEffectPathCircle(86),    
    /**@ Moves on a Crescent Moon path */
    msoAnimEffectPathCrescentMoon(91),    
    /**@ Moves on a CurvedSquare path */
    msoAnimEffectPathCurvedSquare(105),    
    /**@ Moves on a Curved X path */
    msoAnimEffectPathCurvedX(106),    
    /**@ Moves on a Curvy Left path */
    msoAnimEffectPathCurvyLeft(133),    
    /**@ Moves on a Curvy Right path */
    msoAnimEffectPathCurvyRight(146),    
    /**@ Moves on a Curvy Star path */
    msoAnimEffectPathCurvyStar(108),    
    /**@ Moves on a Decaying Wave path */
    msoAnimEffectPathDecayingWave(145),    
    /**@ Moves on a Diagonal Down-Right path */
    msoAnimEffectPathDiagonalDownRight(134),    
    /**@ Moves on a Diagonal Up-Right path */
    msoAnimEffectPathDiagonalUpRight(141),    
    /**@ Moves on a Diamond path */
    msoAnimEffectPathDiamond(88),    
    /**@ Moves on a Down path */
    msoAnimEffectPathDown(127),    
    /**@ Moves on a equilateral triangle path */
    msoAnimEffectPathEqualTriangle(98),    
    /**@ Moves on a Figure8Four path */
    msoAnimEffectPathFigure8Four(113),    
    /**@ Moves on a Football path */
    msoAnimEffectPathFootball(97),    
    /**@ Moves on a Funnel path */
    msoAnimEffectPathFunnel(137),    
    /**@ Moves on a Heart shape path */
    msoAnimEffectPathHeart(94),    
    /**@ Moves on a Heart Beat path */
    msoAnimEffectPathHeartbeat(130),    
    /**@ Moves on a Hexagon path */
    msoAnimEffectPathHexagon(89),    
    /**@ Moves on a Horizontal Figure8 path */
    msoAnimEffectPathHorizontalFigure8(111),    
    /**@ Moves on a Inverted Square path */
    msoAnimEffectPathInvertedSquare(119),    
    /**@ Moves on a Inverted Triangle path */
    msoAnimEffectPathInvertedTriangle(118),    
    /**@ Moves on a Left path */
    msoAnimEffectPathLeft(120),    
    /**@ Moves on a LoopdeLoop path */
    msoAnimEffectPathLoopdeLoop(109),    
    /**@ Moves on a Neutron path */
    msoAnimEffectPathNeutron(114),    
    /**@ Moves on a Octagon path */
    msoAnimEffectPathOctagon(95),    
    /**@ Moves on a Parallelogram path */
    msoAnimEffectPathParallelogram(99),    
    /**@ Moves on a Peanut path */
    msoAnimEffectPathPeanut(112),    
    /**@ Moves on a Pentagon path */
    msoAnimEffectPathPentagon(100),    
    /**@ Moves on a Plus path */
    msoAnimEffectPathPlus(117),    
    /**@ Moves on a PointyStar path */
    msoAnimEffectPathPointyStar(104),    
    /**@ Moves on a Right path */
    msoAnimEffectPathRight(149),    
    /**@ Moves on a RightTriangle path */
    msoAnimEffectPathRightTriangle(87),    
    /**@ Moves on a SCurve1 path */
    msoAnimEffectPathSCurve1(144),    
    /**@ Moves on a SCurve2 path */
    msoAnimEffectPathSCurve2(124),    
    /**@ Moves on a SineWave path */
    msoAnimEffectPathSineWave(125),    
    /**@ Moves on a SpiralLeft path */
    msoAnimEffectPathSpiralLeft(140),    
    /**@ Moves on a SpiralRight path */
    msoAnimEffectPathSpiralRight(131),    
    /**@ Moves on a Spring path */
    msoAnimEffectPathSpring(138),    
    /**@ Moves on a Square path */
    msoAnimEffectPathSquare(92),    
    /**@ Moves on a StairsDown path */
    msoAnimEffectPathStairsDown(147),    
    /**@ Moves on a Swoosh path */
    msoAnimEffectPathSwoosh(115),    
    /**@ Moves on a Teardrop path */
    msoAnimEffectPathTeardrop(103),    
    /**@ Moves on a Trapezoid path */
    msoAnimEffectPathTrapezoid(93),    
    /**@ Moves on a TurnDown path */
    msoAnimEffectPathTurnDown(135),    
    /**@ Moves on a TurnRight path */
    msoAnimEffectPathTurnRight(121),    
    /**@ Moves on a TurnUp path */
    msoAnimEffectPathTurnUp(128),    
    /**@ Moves on a TurnUpRight path */
    msoAnimEffectPathTurnUpRight(142),    
    /**@ Moves on an Up path */
    msoAnimEffectPathUp(148),    
    /**@ Moves on a VerticalFigure8 path */
    msoAnimEffectPathVerticalFigure8(107),    
    /**@ Moves on a Wave path */
    msoAnimEffectPathWave(132),    
    /**@ Moves on a Zigzag path */
    msoAnimEffectPathZigzag(123),    
    /**@ Peek effect */
    msoAnimEffectPeek(12),    
    /**@ Pinwel effect */
    msoAnimEffectPinwheel(33),    
    /**@ Plus effect */
    msoAnimEffectPlus(13),    
    /**@ Random Bars effect */
    msoAnimEffectRandomBars(14),    
    /**@ Random effects */
    msoAnimEffectRandomEffects(24),    
    /**@ Rise Up effect */
    msoAnimEffectRiseUp(34),    
    /**@ Shimmer effect */
    msoAnimEffectShimmer(52),    
    /**@ Sling effect */
    msoAnimEffectSling(43),    
    /**@ Spin effect */
    msoAnimEffectSpin(61),    
    /**@ Spinner effect */
    msoAnimEffectSpinner(44),    
    /**@ Spiral effect */
    msoAnimEffectSpiral(15),    
    /**@ Split effect */
    msoAnimEffectSplit(16),    
    /**@ Stretch effect */
    msoAnimEffectStretch(17),    
    /**@ Stretchy effect */
    msoAnimEffectStretchy(45),    
    /**@ Strips effect */
    msoAnimEffectStrips(18),    
    /**@ Emphasis effect */
    msoAnimEffectStyleEmphasis(79),    
    /**@ Swish effect */
    msoAnimEffectSwish(35),    
    /**@ Swivel effect */
    msoAnimEffectSwivel(19),    
    /**@ Teeter effect */
    msoAnimEffectTeeter(80),    
    /**@ Thin line effect */
    msoAnimEffectThinLine(36),    
    /**@ Transparency effect */
    msoAnimEffectTransparency(62),    
    /**@ Unfold effect */
    msoAnimEffectUnfold(37),    
    /**@ Vertical Grow effect */
    msoAnimEffectVerticalGrow(81),    
    /**@ Wave effect */
    msoAnimEffectWave(82),    
    /**@ Wedge effect */
    msoAnimEffectWedge(20),    
    /**@ Wheel effect */
    msoAnimEffectWheel(21),    
    /**@ Whip effect */
    msoAnimEffectWhip(38),    
    /**@ Wipe effect */
    msoAnimEffectWipe(22),    
    /**@ Zip effect */
    msoAnimEffectZip(46),    
    /**@ Zoom effect */
    msoAnimEffectZoom(23);

    private final long value;

    MsoAnimEffect(long value) {
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
