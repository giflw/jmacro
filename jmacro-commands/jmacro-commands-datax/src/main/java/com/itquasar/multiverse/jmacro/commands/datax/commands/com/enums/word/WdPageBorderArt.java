package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpageborderart">https://docs.microsoft.com/en-us/office/vba/api/word.wdpageborderart</a>}
*/
public enum WdPageBorderArt implements COMEnum {
    
    /**@ An apple border. */
    wdArtApples(1),    
    /**@ An arched scalloped border. */
    wdArtArchedScallops(97),    
    /**@ A baby pacifier border. */
    wdArtBabyPacifier(70),    
    /**@ A baby rattle border. */
    wdArtBabyRattle(71),    
    /**@ Balloons in three colors as the border. */
    wdArtBalloons3Colors(11),    
    /**@ A hot air balloon border. */
    wdArtBalloonsHotAir(12),    
    /**@ A basic black-dashed border. */
    wdArtBasicBlackDashes(155),    
    /**@ A basic black-dotted border. */
    wdArtBasicBlackDots(156),    
    /**@ A basic black squares border. */
    wdArtBasicBlackSquares(154),    
    /**@ A basic thin-lines border. */
    wdArtBasicThinLines(151),    
    /**@ A basic white-dashed border. */
    wdArtBasicWhiteDashes(152),    
    /**@ A basic white-dotted border. */
    wdArtBasicWhiteDots(147),    
    /**@ A basic white squares border. */
    wdArtBasicWhiteSquares(153),    
    /**@ A basic wide inline border. */
    wdArtBasicWideInline(150),    
    /**@ A basic wide midline border. */
    wdArtBasicWideMidline(148),    
    /**@ A basic wide outline border. */
    wdArtBasicWideOutline(149),    
    /**@ A bats border. */
    wdArtBats(37),    
    /**@ A birds border. */
    wdArtBirds(102),    
    /**@ A birds-in-flight border. */
    wdArtBirdsFlight(35),    
    /**@ A cabins border. */
    wdArtCabins(72),    
    /**@ A cake slice border. */
    wdArtCakeSlice(3),    
    /**@ A candy corn border. */
    wdArtCandyCorn(4),    
    /**@ A Celtic knotwork border. */
    wdArtCelticKnotwork(99),    
    /**@ A certificate banner border. */
    wdArtCertificateBanner(158),    
    /**@ A chain-link border. */
    wdArtChainLink(128),    
    /**@ A champagne bottle border. */
    wdArtChampagneBottle(6),    
    /**@ A checked-bar black border. */
    wdArtCheckedBarBlack(145),    
    /**@ A checked-bar colored border. */
    wdArtCheckedBarColor(61),    
    /**@ A checkered border. */
    wdArtCheckered(144),    
    /**@ A Christmas tree border. */
    wdArtChristmasTree(8),    
    /**@ A circles-and-lines border. */
    wdArtCirclesLines(91),    
    /**@ A circles-and-rectangles border. */
    wdArtCirclesRectangles(140),    
    /**@ A classical wave border. */
    wdArtClassicalWave(56),    
    /**@ A clocks border. */
    wdArtClocks(27),    
    /**@ A compass border. */
    wdArtCompass(54),    
    /**@ A confetti border. */
    wdArtConfetti(31),    
    /**@ A confetti border using shades of gray. */
    wdArtConfettiGrays(115),    
    /**@ A confetti outline border. */
    wdArtConfettiOutline(116),    
    /**@ A confetti streamers border. */
    wdArtConfettiStreamers(14),    
    /**@ A confetti white border. */
    wdArtConfettiWhite(117),    
    /**@ A triangles border. */
    wdArtCornerTriangles(141),    
    /**@ A coupon-cut-out dashes border. */
    wdArtCouponCutoutDashes(163),    
    /**@ A coupon-cut-out dots border. */
    wdArtCouponCutoutDots(164),    
    /**@ A crazy maze border. */
    wdArtCrazyMaze(100),    
    /**@ A butterfly border. */
    wdArtCreaturesButterfly(32),    
    /**@ A fish border. */
    wdArtCreaturesFish(34),    
    /**@ An insect border. */
    wdArtCreaturesInsects(142),    
    /**@ A ladybug border. */
    wdArtCreaturesLadyBug(33),    
    /**@ A cross-stitch border. */
    wdArtCrossStitch(138),    
    /**@ A cup border. */
    wdArtCup(67),    
    /**@ A deco arch border. */
    wdArtDecoArch(89),    
    /**@ A deco arch colored border. */
    wdArtDecoArchColor(50),    
    /**@ A deco blocks border. */
    wdArtDecoBlocks(90),    
    /**@ A diamond border using shades of gray. */
    wdArtDiamondsGray(88),    
    /**@ A double-D border. */
    wdArtDoubleD(55),    
    /**@ A double-diamonds border. */
    wdArtDoubleDiamonds(127),    
    /**@ An earth number 1 border. */
    wdArtEarth1(22),    
    /**@ An earth number 2 border. */
    wdArtEarth2(21),    
    /**@ An eclipsing squares number 1 border. */
    wdArtEclipsingSquares1(101),    
    /**@ An eclipsing squares number 2 border. */
    wdArtEclipsingSquares2(86),    
    /**@ A black eggs border. */
    wdArtEggsBlack(66),    
    /**@ A fans border. */
    wdArtFans(51),    
    /**@ A film border. */
    wdArtFilm(52),    
    /**@ A fire crackers border. */
    wdArtFirecrackers(28),    
    /**@ A block flowers print border. */
    wdArtFlowersBlockPrint(49),    
    /**@ A daisies border. */
    wdArtFlowersDaisies(48),    
    /**@ A modern flowers number 1 border. */
    wdArtFlowersModern1(45),    
    /**@ A modern flowers number 2 border. */
    wdArtFlowersModern2(44),    
    /**@ A pansy border. */
    wdArtFlowersPansy(43),    
    /**@ A red rose border. */
    wdArtFlowersRedRose(39),    
    /**@ A rose border. */
    wdArtFlowersRoses(38),    
    /**@ A teacup border. */
    wdArtFlowersTeacup(103),    
    /**@ A tiny flower border. */
    wdArtFlowersTiny(42),    
    /**@ A gems border. */
    wdArtGems(139),    
    /**@ A gingerbread man border. */
    wdArtGingerbreadMan(69),    
    /**@ A gradient border. */
    wdArtGradient(122),    
    /**@ A handmade number 1 border. */
    wdArtHandmade1(159),    
    /**@ A handmade number 2 border. */
    wdArtHandmade2(160),    
    /**@ A heart-balloon border. */
    wdArtHeartBalloon(16),    
    /**@ A heart border in shades of gray. */
    wdArtHeartGray(68),    
    /**@ A hearts border. */
    wdArtHearts(15),    
    /**@ A heebie-jeebies border. */
    wdArtHeebieJeebies(120),    
    /**@ A holly border. */
    wdArtHolly(41),    
    /**@ A funky house border. */
    wdArtHouseFunky(73),    
    /**@ An hypnotic border. */
    wdArtHypnotic(87),    
    /**@ An ice cream cones border. */
    wdArtIceCreamCones(5),    
    /**@ A light bulb border. */
    wdArtLightBulb(121),    
    /**@ A lightning number 1 border. */
    wdArtLightning1(53),    
    /**@ A lightning number 2 border. */
    wdArtLightning2(119),    
    /**@ A maple leaf border. */
    wdArtMapleLeaf(81),    
    /**@ A maple muffins border. */
    wdArtMapleMuffins(2),    
    /**@ A map pins border. */
    wdArtMapPins(30),    
    /**@ A marquee border. */
    wdArtMarquee(146),    
    /**@ A marquee toothed border. */
    wdArtMarqueeToothed(131),    
    /**@ A moons border. */
    wdArtMoons(125),    
    /**@ A mosaic border. */
    wdArtMosaic(118),    
    /**@ A music notes border. */
    wdArtMusicNotes(79),    
    /**@ A northwest border. */
    wdArtNorthwest(104),    
    /**@ An ovals border. */
    wdArtOvals(126),    
    /**@ A packages border. */
    wdArtPackages(26),    
    /**@ A black palms border. */
    wdArtPalmsBlack(80),    
    /**@ A colored palms border. */
    wdArtPalmsColor(10),    
    /**@ A paper clips border. */
    wdArtPaperClips(82),    
    /**@ A papyrus border. */
    wdArtPapyrus(92),    
    /**@ A party favor border. */
    wdArtPartyFavor(13),    
    /**@ A party glass border. */
    wdArtPartyGlass(7),    
    /**@ A pencils border. */
    wdArtPencils(25),    
    /**@ A people border. */
    wdArtPeople(84),    
    /**@ A people-wearing-hats border. */
    wdArtPeopleHats(23),    
    /**@ A people-waving border. */
    wdArtPeopleWaving(85),    
    /**@ A poinsettias border. */
    wdArtPoinsettias(40),    
    /**@ A postage stamp border. */
    wdArtPostageStamp(135),    
    /**@ A pumpkin number 1 border. */
    wdArtPumpkin1(65),    
    /**@ A pushpin note number 1 border. */
    wdArtPushPinNote1(63),    
    /**@ A pushpin note number 2 border. */
    wdArtPushPinNote2(64),    
    /**@ A pyramids border. */
    wdArtPyramids(113),    
    /**@ An external pyramids border. */
    wdArtPyramidsAbove(114),    
    /**@ A quadrants border. */
    wdArtQuadrants(60),    
    /**@ A rings border. */
    wdArtRings(29),    
    /**@ A safari border. */
    wdArtSafari(98),    
    /**@ A saw-tooth border. */
    wdArtSawtooth(133),    
    /**@ A saw-tooth border using shades of gray. */
    wdArtSawtoothGray(134),    
    /**@ A scared cat border. */
    wdArtScaredCat(36),    
    /**@ A Seattle border. */
    wdArtSeattle(78),    
    /**@ A shadowed squared border. */
    wdArtShadowedSquares(57),    
    /**@ A shark-tooth border. */
    wdArtSharksTeeth(132),    
    /**@ A shorebird tracks border. */
    wdArtShorebirdTracks(83),    
    /**@ A sky rocket border. */
    wdArtSkyrocket(77),    
    /**@ A fancy snowflake border. */
    wdArtSnowflakeFancy(76),    
    /**@ A snowflake border. */
    wdArtSnowflakes(75),    
    /**@ A sombrero border. */
    wdArtSombrero(24),    
    /**@ A southwest border. */
    wdArtSouthwest(105),    
    /**@ A stars border. */
    wdArtStars(19),    
    /**@ A 3D stars border. */
    wdArtStars3D(17),    
    /**@ A black stars border. */
    wdArtStarsBlack(74),    
    /**@ A shadowed stars border. */
    wdArtStarsShadowed(18),    
    /**@ A stars-on-top border. */
    wdArtStarsTop(157),    
    /**@ A sun border. */
    wdArtSun(20),    
    /**@ A swirling border. */
    wdArtSwirligig(62),    
    /**@ A torn-paper border. */
    wdArtTornPaper(161),    
    /**@ A black torn-paper border. */
    wdArtTornPaperBlack(162),    
    /**@ A trees border. */
    wdArtTrees(9),    
    /**@ A triangle party border. */
    wdArtTriangleParty(123),    
    /**@ A triangles border. */
    wdArtTriangles(129),    
    /**@ A tribal number 1 border. */
    wdArtTribal1(130),    
    /**@ A tribal number 2 border. */
    wdArtTribal2(109),    
    /**@ A tribal number 3 border. */
    wdArtTribal3(108),    
    /**@ A tribal number 4 border. */
    wdArtTribal4(107),    
    /**@ A tribal number 5 border. */
    wdArtTribal5(110),    
    /**@ A tribal number 6 border. */
    wdArtTribal6(106),    
    /**@ A twisted lines number 1 border. */
    wdArtTwistedLines1(58),    
    /**@ A twisted lines number 2 border. */
    wdArtTwistedLines2(124),    
    /**@ A vine border. */
    wdArtVine(47),    
    /**@ A wave-line border. */
    wdArtWaveline(59),    
    /**@ A weaving angle border. */
    wdArtWeavingAngles(96),    
    /**@ A weaving braid border. */
    wdArtWeavingBraid(94),    
    /**@ A weaving ribbon border. */
    wdArtWeavingRibbon(95),    
    /**@ A weaving strips border. */
    wdArtWeavingStrips(136),    
    /**@ A white flower border. */
    wdArtWhiteFlowers(46),    
    /**@ A woodwork border. */
    wdArtWoodwork(93),    
    /**@ An X illusion border. */
    wdArtXIllusions(111),    
    /**@ A zany triangle border. */
    wdArtZanyTriangles(112),    
    /**@ A zigzag border. */
    wdArtZigZag(137),    
    /**@ A zigzag stitch border. */
    wdArtZigZagStitch(143);

    private final long value;

    WdPageBorderArt(long value) {
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
