package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppentryeffect">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppentryeffect</a>}
*/
public enum PpEntryEffect implements COMEnum {
    
    /**@ Appear */
    ppEffectAppear(3844),    
    /**@ Blinds Horizontal */
    ppEffectBlindsHorizontal(769),    
    /**@ Blinds Vertical */
    ppEffectBlindsVertical(770),    
    /**@ Box Down */
    ppEffectBoxDown(3925),    
    /**@ Box In */
    ppEffectBoxIn(3074),    
    /**@ Box Left */
    ppEffectBoxLeft(3922),    
    /**@ Box Out */
    ppEffectBoxOut(3073),    
    /**@ Box Right */
    ppEffectBoxRight(3924),    
    /**@ Box Up */
    ppEffectBoxUp(3923),    
    /**@ Checkerboard Across */
    ppEffectCheckerboardAcross(1025),    
    /**@ Checkerboard Down */
    ppEffectCheckerboardDown(1026),    
    /**@ Circle Out */
    ppEffectCircleOut(3845),    
    /**@ Comb Horizontal */
    ppEffectCombHorizontal(3847),    
    /**@ Comb Vertical */
    ppEffectCombVertical(3848),    
    /**@ Conveyor Left */
    ppEffectConveyorLeft(3882),    
    /**@ Conveyor Right */
    ppEffectConveyorRight(3883),    
    /**@ Cover Down */
    ppEffectCoverDown(1284),    
    /**@ Cover Left */
    ppEffectCoverLeft(1281),    
    /**@ Cover Left Down */
    ppEffectCoverLeftDown(1287),    
    /**@ Cover Left Up */
    ppEffectCoverLeftUp(1285),    
    /**@ No description provided */
    ppEffectCoverRight(1283),    
    /**@ Cover Right Down */
    ppEffectCoverRightDown(1288),    
    /**@ Cover Right Up */
    ppEffectCoverRightUp(1286),    
    /**@ Cover Up */
    ppEffectCoverUp(1282),    
    /**@ Crawl From Down */
    ppEffectCrawlFromDown(3344),    
    /**@ Crawl From Left */
    ppEffectCrawlFromLeft(3341),    
    /**@ Crawl From Right */
    ppEffectCrawlFromRight(3343),    
    /**@ Crawl From Up */
    ppEffectCrawlFromUp(3342),    
    /**@ Effect Cube Down */
    ppEffectCubeDown(3917),    
    /**@ Effect Cube Left */
    ppEffectCubeLeft(3914),    
    /**@ Effect Cube Right */
    ppEffectCubeRight(3916),    
    /**@ Effect Cube Up */
    ppEffectCubeUp(3915),    
    /**@ Cut */
    ppEffectCut(257),    
    /**@ Cut Through Black */
    ppEffectCutThroughBlack(258),    
    /**@ Diamond Out */
    ppEffectDiamondOut(3846),    
    /**@ Dissolve */
    ppEffectDissolve(1537),    
    /**@ Doors Horizontal */
    ppEffectDoorsHorizontal(3885),    
    /**@ Doors Vertical */
    ppEffectDoorsVertical(3884),    
    /**@ Fade */
    ppEffectFade(1793),    
    /**@ Fade Smoothly */
    ppEffectFadeSmoothly(3849),    
    /**@ Ferris Wheel Left */
    ppEffectFerrisWheelLeft(3899),    
    /**@ Ferris Wheel Rightt */
    ppEffectFerrisWheelRight(3900),    
    /**@ Flashbulb */
    ppEffectFlashbulb(3909),    
    /**@ Flash Once Fast */
    ppEffectFlashOnceFast(3841),    
    /**@ Flash Once Medium */
    ppEffectFlashOnceMedium(3842),    
    /**@ Flash Once Slow */
    ppEffectFlashOnceSlow(3843),    
    /**@ Flip Down */
    ppEffectFlipDown(3908),    
    /**@ Flip Left */
    ppEffectFlipLeft(3905),    
    /**@ Flip Right */
    ppEffectFlipRight(3907),    
    /**@ Flip Up */
    ppEffectFlipUp(3906),    
    /**@ Fly From Bottom */
    ppEffectFlyFromBottom(3332),    
    /**@ From Bottom Left */
    ppEffectFlyFromBottomLeft(3335),    
    /**@ From Bottom Right */
    ppEffectFlyFromBottomRight(3336),    
    /**@ Fly From Left */
    ppEffectFlyFromLeft(3329),    
    /**@ Fly From Right */
    ppEffectFlyFromRight(3331),    
    /**@ Fly From Top */
    ppEffectFlyFromTop(3330),    
    /**@ Fly From Top Left */
    ppEffectFlyFromTopLeft(3333),    
    /**@ Fly From Top Right */
    ppEffectFlyFromTopRight(3334),    
    /**@ Fly Through In */
    ppEffectFlyThroughIn(3890),    
    /**@ Fly Through In Bounce */
    ppEffectFlyThroughInBounce(3892),    
    /**@ Fly Through Out */
    ppEffectFlyThroughOut(3891),    
    /**@ Fly Through Out Bounce */
    ppEffectFlyThroughOutBounce(3893),    
    /**@ Gallery Left */
    ppEffectGalleryLeft(3880),    
    /**@ Gallery Right */
    ppEffectGalleryRight(3881),    
    /**@ Glitter Diamond Down */
    ppEffectGlitterDiamondDown(3875),    
    /**@ Glitter Diamond Left */
    ppEffectGlitterDiamondLeft(3872),    
    /**@ Glitter Diamond Right */
    ppEffectGlitterDiamondRight(3874),    
    /**@ Glitter Diamond Up */
    ppEffectGlitterDiamondUp(3873),    
    /**@ Glitter Hexagon Down */
    ppEffectGlitterHexagonDown(3879),    
    /**@ Glitter Hexagon Left */
    ppEffectGlitterHexagonLeft(3876),    
    /**@ Glitter Hexagon Right */
    ppEffectGlitterHexagonRight(3878),    
    /**@ Glitter Hexagon Up */
    ppEffectGlitterHexagonUp(3877),    
    /**@ Honeycomb */
    ppEffectHoneycomb(3898),    
    /**@ Mixed */
    ppEffectMixed(-2),    
    /**@ Newsflash */
    ppEffectNewsflash(3850),    
    /**@ None */
    ppEffectNone(0),    
    /**@ Orbit Down */
    ppEffectOrbitDown(3929),    
    /**@ Orbit Left */
    ppEffectOrbitLeft(3926),    
    /**@ Orbit Right */
    ppEffectOrbitRight(3928),    
    /**@ Orbit Up */
    ppEffectOrbitUp(3927),    
    /**@ Pan Down */
    ppEffectPanDown(3933),    
    /**@ Pan Left */
    ppEffectPanLeft(3930),    
    /**@ Pan Right */
    ppEffectPanRight(3932),    
    /**@ Pan Up */
    ppEffectPanUp(3931),    
    /**@ Peek From Down */
    ppEffectPeekFromDown(3338),    
    /**@ Peek From Left */
    ppEffectPeekFromLeft(3337),    
    /**@ Peek From Right */
    ppEffectPeekFromRight(3339),    
    /**@ Peek From Up */
    ppEffectPeekFromUp(3340),    
    /**@ Plus Out */
    ppEffectPlusOut(3851),    
    /**@ Push Down */
    ppEffectPushDown(3852),    
    /**@ Push Left */
    ppEffectPushLeft(3853),    
    /**@ Push Right */
    ppEffectPushRight(3854),    
    /**@ Push Up */
    ppEffectPushUp(3855),    
    /**@ Random */
    ppEffectRandom(513),    
    /**@ Random Bars Horizontal */
    ppEffectRandomBarsHorizontal(2305),    
    /**@ Random Bars Vertical */
    ppEffectRandomBarsVertical(2306),    
    /**@ Reveal Black Left */
    ppEffectRevealBlackLeft(3896),    
    /**@ Reveal Black Right */
    ppEffectRevealBlackRight(3897),    
    /**@ Reveal Smooth Left */
    ppEffectRevealSmoothLeft(3894),    
    /**@ Reveal Smooth Right */
    ppEffectRevealSmoothRight(3895),    
    /**@ Ripple Center */
    ppEffectRippleCenter(3867),    
    /**@ Ripple Left Down */
    ppEffectRippleLeftDown(3870),    
    /**@ Ripple Left Up */
    ppEffectRippleLeftUp(3869),    
    /**@ Ripple Right Down */
    ppEffectRippleRightDown(3871),    
    /**@ Ripple Right Up */
    ppEffectRippleRightUp(3868),    
    /**@ Rotate Down */
    ppEffectRotateDown(3921),    
    /**@ Rotate Left */
    ppEffectRotateLeft(3918),    
    /**@ Rotate Right */
    ppEffectRotateRight(3920),    
    /**@ Rotate Up */
    ppEffectRotateUp(3919),    
    /**@ Shred Rectangle In */
    ppEffectShredRectangleIn(3912),    
    /**@ Shred Rectangle Out */
    ppEffectShredRectangleOut(3913),    
    /**@ Shred Strips In */
    ppEffectShredStripsIn(3910),    
    /**@ Shred Strips Out */
    ppEffectShredStripsOut(3911),    
    /**@ Spiral */
    ppEffectSpiral(3357),    
    /**@ Split Horizontal In */
    ppEffectSplitHorizontalIn(3586),    
    /**@ Split Horizontal Out */
    ppEffectSplitHorizontalOut(3585),    
    /**@ Split Vertical In */
    ppEffectSplitVerticalIn(3588),    
    /**@ Split Vertical Out */
    ppEffectSplitVerticalOut(3587),    
    /**@ Stretch Across */
    ppEffectStretchAcross(3351),    
    /**@ Stretch Down */
    ppEffectStretchDown(3355),    
    /**@ Stretch Left */
    ppEffectStretchLeft(3352),    
    /**@ Stretch Right */
    ppEffectStretchRight(3354),    
    /**@ Stretch Up */
    ppEffectStretchUp(3353),    
    /**@ Strips Down Left */
    ppEffectStripsDownLeft(2563),    
    /**@ Strips Down Right */
    ppEffectStripsDownRight(2564),    
    /**@ Strips Left Down */
    ppEffectStripsLeftDown(2567),    
    /**@ Strips Left Up */
    ppEffectStripsLeftUp(2565),    
    /**@ Strips Right Down */
    ppEffectStripsRightDown(2568),    
    /**@ Strips Right Up */
    ppEffectStripsRightUp(2566),    
    /**@ Strips Up Left */
    ppEffectStripsUpLeft(2561),    
    /**@ Strips Up Right */
    ppEffectStripsUpRight(2562),    
    /**@ Switch Down */
    ppEffectSwitchDown(3904),    
    /**@ Switch Left */
    ppEffectSwitchLeft(3901),    
    /**@ Switch Right */
    ppEffectSwitchRight(3903),    
    /**@ Switch Up */
    ppEffectSwitchUp(3902),    
    /**@ Swivel */
    ppEffectSwivel(3356),    
    /**@ Uncover Down */
    ppEffectUncoverDown(2052),    
    /**@ Uncover Left */
    ppEffectUncoverLeft(2049),    
    /**@ Uncover Left Down */
    ppEffectUncoverLeftDown(2055),    
    /**@ Uncover Left Up */
    ppEffectUncoverLeftUp(2053),    
    /**@ Effect Uncover Right */
    ppEffectUncoverRight(2051),    
    /**@ Uncover Right Down */
    ppEffectUncoverRightDown(2056),    
    /**@ Uncover Right Up */
    ppEffectUncoverRightUp(2054),    
    /**@ Uncover Up */
    ppEffectUncoverUp(2050),    
    /**@ VortexDown */
    ppEffectVortexDown(3866),    
    /**@ Vortex Left */
    ppEffectVortexLeft(3863),    
    /**@ Vortex Right */
    ppEffectVortexRight(3865),    
    /**@ Vortex Up */
    ppEffectVortexUp(3864),    
    /**@ Warp In */
    ppEffectWarpIn(3888),    
    /**@ Warp Out */
    ppEffectWarpOut(3889),    
    /**@ Wedge */
    ppEffectWedge(3856),    
    /**@ Wheel1 Spoke */
    ppEffectWheel1Spoke(3857),    
    /**@ Wheel2 Spokes */
    ppEffectWheel2Spokes(3858),    
    /**@ Wheel3 Spokes */
    ppEffectWheel3Spokes(3859),    
    /**@ Wheel4 Spokes */
    ppEffectWheel4Spokes(3860),    
    /**@ Wheel8 Spokes */
    ppEffectWheel8Spokes(3861),    
    /**@ Wheel Reverse 1 Spoke */
    ppEffectWheelReverse1Spoke(3862),    
    /**@ Window Horizontal */
    ppEffectWindowHorizontal(3887),    
    /**@ Window Vertical */
    ppEffectWindowVertical(3886),    
    /**@ Wipe Down */
    ppEffectWipeDown(2820),    
    /**@ Wipe Left */
    ppEffectWipeLeft(2817),    
    /**@ Wipe Right */
    ppEffectWipeRight(2819),    
    /**@ Wipe Up */
    ppEffectWipeUp(2818),    
    /**@ Zoom Bottom */
    ppEffectZoomBottom(3350),    
    /**@ Zoom Center */
    ppEffectZoomCenter(3349),    
    /**@ Zoom In */
    ppEffectZoomIn(3345),    
    /**@ Zoom In Slightly */
    ppEffectZoomInSlightly(3346),    
    /**@ Zoom Out */
    ppEffectZoomOut(3347),    
    /**@ Zoom Out Slightly */
    ppEffectZoomOutSlightly(3348);

    private final long value;

    PpEntryEffect(long value) {
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
