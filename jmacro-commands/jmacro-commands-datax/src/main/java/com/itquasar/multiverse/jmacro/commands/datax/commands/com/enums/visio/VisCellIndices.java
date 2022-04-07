package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscellindices">https://docs.microsoft.com/en-us/office/vba/api/visio.viscellindices</a>}
*/
public enum VisCellIndices implements COMEnum {
    
    /**@ BeginX Cell (1D Endpoints Section) */
    vis1DBeginX(0),    
    /**@ BeginY Cell (1D Endpoints Section) */
    vis1DBeginY(1),    
    /**@ EndX Cell (1D Endpoints Section) */
    vis1DEndX(2),    
    /**@ EndY Cell (1D Endpoints Section) */
    vis1DEndY(3),    
    /**@ Action Cell (Actions Section) */
    visActionAction(3),    
    /**@ BeginGroup Cell (Actions Section) */
    visActionBeginGroup(8),    
    /**@ ButtonFace Cell (Actions Section) */
    visActionButtonFace(15),    
    /**@ Checked Cell (Actions Section) */
    visActionChecked(4),    
    /**@ Disabled Cell (Actions Section) */
    visActionDisabled(5),    
    /**@ Invisible Cell (Actions Section) */
    visActionInvisible(7),    
    /**@ Menu Cell (Actions Section) */
    visActionMenu(0),    
    /**@ ReadOnly Cell (Actions Section) */
    visActionReadOnly(6),    
    /**@ SortKey Cell (Actions Section) */
    visActionSortKey(16),    
    /**@ TagName Cell (Actions Section) */
    visActionTagName(14),    
    /**@ AlignBottom Cell (Alignment Section) */
    visAlignBottom(5),    
    /**@ AlignCenter Cell (Alignment Section) */
    visAlignCenter(1),    
    /**@ AlignLeft Cell (Alignment Section) */
    visAlignLeft(0),    
    /**@ AlignMiddle Cell (Alignment Section) */
    visAlignMiddle(4),    
    /**@ AlignRight Cell (Alignment Section) */
    visAlignRight(2),    
    /**@ AlignTop Cell (Alignment Section) */
    visAlignTop(3),    
    /**@ Comment Cell (Annotation Section) */
    visAnnotationComment(5),    
    /**@ Date Cell (Annotation Section) */
    visAnnotationDate(4),    
    /**@ LangID Cell (Annotation Section) */
    visAnnotationLangID(6),    
    /**@ In previous versions of Visio, represented the MarkerIndex Cell (Annotation Section), which is now deprecated. */
    visAnnotationMarkerIndex(3),    
    /**@ ReviewerID Cell (Annotation Section) */
    visAnnotationReviewerID(2),    
    /**@ X Cell (Annotation Section) */
    visAnnotationX(0),    
    /**@ Y Cell (Annotation Section) */
    visAnnotationY(1),    
    /**@ D Cell (Geometry Section) */
    visAspectRatio(5),    
    /**@ BegTrigger Cell (Glue Info Section) */
    visBegTrigger(11),    
    /**@ BevelBottomHeight Cell (Bevel Properties Section) */
    visBevelBottomHeight(5),    
    /**@ BevelBottomType Cell (Bevel Properties Section) */
    visBevelBottomType(3),    
    /**@ BevelBottomWidth Cell (Bevel Properties Section) */
    visBevelBottomWidth(4),    
    /**@ BevelContourColor Cell (Bevel Properties Section) */
    visBevelContourColor(8),    
    /**@ BevelContourSize Cell (Bevel Properties Section) */
    visBevelContourSize(9),    
    /**@ BevelDepthColor Cell (Bevel Properties Section) */
    visBevelDepthColor(6),    
    /**@ BevelDepthSize Cell (Bevel Properties Section) */
    visBevelDepthSize(7),    
    /**@ BevelLightingAngle Cell (Bevel Properties Section) */
    visBevelLightingAngle(12),    
    /**@ BevelLightingType Cell (Bevel Properties Section) */
    visBevelLightingType(11),    
    /**@ BevelMaterialType Cell (Bevel Properties Section) */
    visBevelMaterialType(10),    
    /**@ BevelTopHeight Cell (Bevel Properties Section) */
    visBevelTopHeight(2),    
    /**@ BevelTopType Cell (Bevel Properties Section) */
    visBevelTopType(0),    
    /**@ BevelTopWidth Cell (Bevel Properties Section) */
    visBevelTopWidth(1),    
    /**@ A Cell (Geometry Section) */
    visBow(2),    
    /**@ BulletSize Cell (Paragraph Section) */
    visBulletFontSize(11),    
    /**@ BulletFont Cell (Paragraph Section) */
    visBulletFont(9),    
    /**@ Bullet Cell (Paragraph Section) */
    visBulletIndex(7),    
    /**@ BulletString Cell (Paragraph Section) */
    visBulletString(8),    
    /**@ Cell logically at or before every other cell in a row. */
    visCellFirst(0),    
    /**@ An index no cell will ever have. */
    visCellInval(255),    
    /**@ Unspecified cell. */
    visCellNone(255),    
    /**@ AsianFont Cell (Character Section) */
    visCharacterAsianFont(51),    
    /**@ Case Cell (Character Section) */
    visCharacterCase(3),    
    /**@ Transparency Cell (Character Section) */
    visCharacterColorTrans(17),    
    /**@ Color Cell (Character Section) */
    visCharacterColor(1),    
    /**@ ComplexScriptFont Cell (Character Section) */
    visCharacterComplexScriptFont(52),    
    /**@ ComplexScriptSize Cell (Character Section) */
    visCharacterComplexScriptSize(54),    
    /**@ DoubleULine Cell (Character Section) */
    visCharacterDblUnderline(8),    
    /**@ DoubleStrikethrough Cell (Character Section) */
    visCharacterDoubleStrikethrough(13),    
    /**@ Font Cell (Character Section) */
    visCharacterFont(0),    
    /**@ Scale Cell (Character Section) */
    visCharacterFontScale(5),    
    /**@ LangID Cell (Character Section) */
    visCharacterLangID(57),    
    /**@ Spacing Cell (Character Section) */
    visCharacterLetterspace(16),    
    /**@ Overline Cell (Character Section) */
    visCharacterOverline(9),    
    /**@ Pos Cell (Character Section) */
    visCharacterPos(4),    
    /**@ Size Cell (Character Section) */
    visCharacterSize(7),    
    /**@ Strikethru Cell (Character Section) */
    visCharacterStrikethru(10),    
    /**@ Style Cell (Character Section) */
    visCharacterStyle(2),    
    /**@ ColorSchemeIndex Cell (Theme Properties Section) */
    visColorSchemeIndex(0),    
    /**@ Compound Type Cell (Line Format Section) */
    visCompoundType(10),    
    /**@ ConnectorSchemeIndex Cell (Theme Properties Section) */
    visConnectorSchemeIndex(2),    
    /**@ AutoGen Cell (Connection Points Section) */
    visCnnctAutoGen(5),    
    /**@ DirX / A Cell (Connection Points Section) */
    visCnnctA(2),    
    /**@ DirY / B Cell (Connection Points Section) */
    visCnnctB(3),    
    /**@ Type / C Cell (Connection Points Section) */
    visCnnctC(4),    
    /**@ DirX / A Cell (Connection Points Section) */
    visCnnctDirX(2),    
    /**@ DirY / B Cell (Connection Points Section) */
    visCnnctDirY(3),    
    /**@ D Cell (Connection Points Section) */
    visCnnctD(5),    
    /**@ Type / C Cell (Connection Points Section) */
    visCnnctType(4),    
    /**@ X Cell (Connection Points Section) */
    visCnnctX(0),    
    /**@ Y Cell (Connection Points Section) */
    visCnnctY(1),    
    /**@ Comment Cell (Miscellaneous Section) */
    visComment(16),    
    /**@ NoFill Cell (Geometry Section) */
    visCompNoFill(0),    
    /**@ NoLine Cell (Geometry Section) */
    visCompNoLine(1),    
    /**@ NoQuickDrag Cell (Geometry Section) */
    visCompNoQuickDrag(5),    
    /**@ NoShow Cell (Geometry Section) */
    visCompNoShow(2),    
    /**@ NoSnap Cell (Geometry Section) */
    visCompNoSnap(3),    
    /**@ Path Cell (Geometry Section) */
    visCompPath(4),    
    /**@ A Cell (Geometry Section) */
    visControl1X(2),    
    /**@ B Cell (Geometry Section) */
    visControl1Y(3),    
    /**@ C Cell (Geometry Section) */
    visControl2X(4),    
    /**@ D Cell (Geometry Section) */
    visControl2Y(5),    
    /**@ A Cell (Geometry Section) */
    visControlX(2),    
    /**@ B Cell (Geometry Section) */
    visControlY(3),    
    /**@ Copyright Cell (Miscellaneous Section) */
    visCopyright(1),    
    /**@ Can Glue Cell (Controls Section) */
    visCtlGlue(6),    
    /**@ Tip Cell (Controls Section) */
    visCtlTip(8),    
    /**@ X Behavior Cell (Controls Section) */
    visCtlXCon(4),    
    /**@ X Dynamics Cell (Controls Section) */
    visCtlXDyn(2),    
    /**@ X Cell (Controls Section) */
    visCtlX(0),    
    /**@ Y Behavior Cell (Controls Section) */
    visCtlYCon(5),    
    /**@ Y Dynamics Cell (Controls Section) */
    visCtlYDyn(3),    
    /**@ Y Cell (Controls Section) */
    visCtlY(1),    
    /**@ Ask Cell (Shape Data Section) */
    visCustPropsAsk(7),    
    /**@ Calendar Cell (Shape Data Section) */
    visCustPropsCalendar(15),    
    /**@ DataLinked Cell (Shape Data Section) */
    visCustPropsDataLinked(8),    
    /**@ Format Cell (Shape Data Section) */
    visCustPropsFormat(3),    
    /**@ Invisible Cell (Shape Data Section) */
    visCustPropsInvis(6),    
    /**@ Label Cell (Shape Data Section) */
    visCustPropsLabel(2),    
    /**@ LangID Cell (Shape Data Section) */
    visCustPropsLangID(14),    
    /**@ Prompt Cell (Shape Data Section) */
    visCustPropsPrompt(1),    
    /**@ SortKey Cell (Shape Data Section) */
    visCustPropsSortKey(4),    
    /**@ Type Cell (Shape Data Section) */
    visCustPropsType(5),    
    /**@ Value Cell (Shape Data Section) */
    visCustPropsValue(0),    
    /**@ AddMarkup Cell (Document Properties Section) */
    visDocAddMarkup(3),    
    /**@ DocLangID Cell (Document Properties Section) */
    visDocLangID(19),    
    /**@ LockDuplicate Cell (Document Properties Section) */
    visDocLockDuplicate(7),    
    /**@ LockPreview Cell (Document Properties Section) */
    visDocLockPreview(1),    
    /**@ LockReplace Cell (Document Properties Section) */
    visDocLockReplace(5),    
    /**@ NoCoauth Cell (Document Properties Section) */
    visDocNoCoauth(6),    
    /**@ OutputFormat Cell (Document Properties Section) */
    visDocOutputFormat(0),    
    /**@ PreviewQuality Cell (Document Properties Section) */
    visDocPreviewQuality(9),    
    /**@ PreviewScope Cell (Document Properties Section) */
    visDocPreviewScope(10),    
    /**@ ViewMarkup Cell (Document Properties Section) */
    visDocViewMarkup(4),    
    /**@ IsDropSource Cell (Miscellaneous Section) */
    visDropSource(17),    
    /**@ DynFeedback Cell (Miscellaneous Section) */
    visDynFeedback(8),    
    /**@ C Cell (Geometry Section) */
    visEccentricityAngle(4),    
    /**@ EffectSchemeIndex Cell (Theme Properties Section) */
    visEffectSchemeIndex(1),    
    /**@ X Cell (Geometry Section) */
    visEllipseCenterX(0),    
    /**@ Y Cell (Geometry Section) */
    visEllipseCenterY(1),    
    /**@ A Cell (Geometry Section) */
    visEllipseMajorX(2),    
    /**@ B Cell (Geometry Section) */
    visEllipseMajorY(3),    
    /**@ C Cell (Geometry Section) */
    visEllipseMinorX(4),    
    /**@ D Cell (Geometry Section) */
    visEllipseMinorY(5),    
    /**@ EmbellishmentIndex Cell (Theme Properties Section) */
    visEmbellishmentIndex(7),    
    /**@ EndTrigger Cell (Glue Info Section) */
    visEndTrigger(12),    
    /**@ EventDblClick Cell (Events Section) */
    visEvtCellDblClick(2),    
    /**@ EventDrop Cell (Events Section) */
    visEvtCellDrop(4),    
    /**@ EventMultiDrop Cell (Events Section) */
    visEvtCellMultiDrop(22),    
    /**@ TheText Cell (Events Section) */
    visEvtCellTheText(1),    
    /**@ EventXFMod Cell (Events Section) */
    visEvtCellXFMod(3),    
    /**@ Calendar Cell (Text Fields Section) */
    visFieldCalendar(7),    
    /**@ Value Cell (Text Fields Section) */
    visFieldCell(0),    
    /**@ Format Cell (Text Fields Section) */
    visFieldFormat(2),    
    /**@ ObjectKind Cell (Text Fields Section) */
    visFieldObjectKind(10),    
    /**@ Type Cell (Text Fields Section) */
    visFieldType(3),    
    /**@ UICategory Cell (Text Fields Section) */
    visFieldUICategory(4),    
    /**@ UICode Cell (Text Fields Section) */
    visFieldUICode(5),    
    /**@ UIFormat Cell (Text Fields Section) */
    visFieldUIFormat(6),    
    /**@ FillBkgndTrans Cell (Fill Format Section) */
    visFillBkgndTrans(7),    
    /**@ FillBkgnd Cell (Fill Format Section) */
    visFillBkgnd(1),    
    /**@ FillForegndTrans Cell (Fill Format Section) */
    visFillForegndTrans(6),    
    /**@ FillForegnd Cell (Fill Format Section) */
    visFillForegnd(0),    
    /**@ FillGradientAngle Cell (Gradient Properties Section) */
    visFillGradientAngle(3),    
    /**@ FillGradientDir Cell (Gradient Properties Section) */
    visFillGradientDir(2),    
    /**@ FillGradientEnabled Cell (Gradient Properties Section) */
    visFillGradientEnabled(5),    
    /**@ FillPattern Cell (Fill Format Section) */
    visFillPattern(2),    
    /**@ In previous versions of Visio, represented the ShdwBkgndTrans Cell (Fill Format Section), which is now deprecated. */
    visFillShdwBkgndTrans(9),    
    /**@ In previous versions of Visio, represented the ShdwBkgnd Cell (Fill Format Section), which is now deprecated. */
    visFillShdwBkgnd(4),    
    /**@ ShapeShdwBlur Cell (Fill Format Section) */
    visFillShdwBlur(15),    
    /**@ ShdwForegndTrans Cell (Fill Format Section) */
    visFillShdwForegndTrans(8),    
    /**@ ShdwForegnd Cell (Fill Format Section) */
    visFillShdwForegnd(3),    
    /**@ ShapeShdwObliqueAngle Cell (Fill Format Section) */
    visFillShdwObliqueAngle(13),    
    /**@ ShapeShdwOffsetX Cell (Fill Format Section) */
    visFillShdwOffsetX(11),    
    /**@ ShapeShdwOffsetY Cell (Fill Format Section) */
    visFillShdwOffsetY(12),    
    /**@ ShdwPattern Cell (Fill Format Section) */
    visFillShdwPattern(5),    
    /**@ ShapeShdwScaleFactor Cell (Fill Format Section) */
    visFillShdwScaleFactor(14),    
    /**@ ShapeShdwShow Cell (Fill Format Section) */
    visFillShdwShow(16),    
    /**@ ShdwType Cell (Page Properties Section) */
    visFillShdwType(10),    
    /**@ Flags Cell (Paragraph Section) */
    visFlags(13),    
    /**@ FontSchemeIndex Cell (Theme Properties Section) */
    visFontSchemeIndex(3),    
    /**@ ClippingPath Cell (Foreign Image Info Section) */
    visFrgnImgClippingPath(4),    
    /**@ ImgHeight Cell (Foreign Image Info Section) */
    visFrgnImgHeight(3),    
    /**@ ImgOffsetX Cell (Foreign Image Info Section) */
    visFrgnImgOffsetX(0),    
    /**@ ImgOffsetY Cell (Foreign Image Info Section) */
    visFrgnImgOffsetY(1),    
    /**@ ImgWidth Cell (Foreign Image Info Section) */
    visFrgnImgWidth(2),    
    /**@ GlowColor Cell (Additional Effects Properties Section) */
    visGlowColor(4),    
    /**@ GlowColorTrans Cell (Additional Effects Properties Section) */
    visGlowColorTrans(5),    
    /**@ GlowSize Cell (Additional Effects Properties Section) */
    visGlowSize(6),    
    /**@ GlueType Cell (Glue Info Section) */
    visGlueType(9),    
    /**@ Color Cell (Fill Gradient Stops Section) */
    visGradientStopColor(0),    
    /**@ Trans Cell (Fill Gradient Stops Section) */
    visGradientStopColorTrans(1),    
    /**@ Position (Fill Gradient Stops Section) */
    visGradientStopPosition(2),    
    /**@ DisplayMode Cell (Group Properties Section) */
    visGroupDisplayMode(1),    
    /**@ DontMoveChildren Cell (Group Properties Section) */
    visGroupDontMoveChildren(5),    
    /**@ IsDropTarget Cell (Group Properties Section) */
    visGroupIsDropTarget(2),    
    /**@ IsSnapTarget Cell (Group Properties Section) */
    visGroupIsSnapTarget(3),    
    /**@ IsTextEditTarget Cell (Group Properties Section) */
    visGroupIsTextEditTarget(4),    
    /**@ SelectMode Cell (Group Properties Section) */
    visGroupSelectMode(0),    
    /**@ HideText Cell (Miscellaneous Section) */
    visHideText(5),    
    /**@ Address Cell (Hyperlinks Section) */
    visHLinkAddress(1),    
    /**@ Default Cell (Hyperlinks Section) */
    visHLinkDefault(7),    
    /**@ Description Cell (Hyperlinks Section) */
    visHLinkDescription(0),    
    /**@ ExtraInfo Cell (Hyperlinks Section) */
    visHLinkExtraInfo(3),    
    /**@ Frame Cell (Hyperlinks Section) */
    visHLinkFrame(4),    
    /**@ Invisible Cell (Hyperlinks Section) */
    visHLinkInvisible(8),    
    /**@ NewWindow Cell (Hyperlinks Section) */
    visHLinkNewWin(5),    
    /**@ SortKey Cell (Hyperlinks Section) */
    visHLinkSortKey(15),    
    /**@ SubAddress Cell (Hyperlinks Section) */
    visHLinkSubAddress(2),    
    /**@ HAlign Cell (Paragraph Section) */
    visHorzAlign(6),    
    /**@ Blur Cell (Image Properties Section) */
    visImageBlur(4),    
    /**@ Brightness Cell (Image Properties Section) */
    visImageBrightness(2),    
    /**@ Contrast Cell (Image Properties Section) */
    visImageContrast(1),    
    /**@ Denoise Cell (Image Properties Section) */
    visImageDenoise(5),    
    /**@ Gamma Cell (Image Properties Section) */
    visImageGamma(0),    
    /**@ Sharpen Cell (Image Properties Section) */
    visImageSharpen(3),    
    /**@ Transparency Cell (Image Properties Section) */
    visImageTransparency(6),    
    /**@ IndFirst Cell (Paragraph Section) */
    visIndentFirst(0),    
    /**@ IndLeft Cell (Paragraph Section) */
    visIndentLeft(1),    
    /**@ IndRight Cell (Paragraph Section) */
    visIndentRight(2),    
    /**@ X Cell (Geometry Section) */
    visInfiniteLineX1(0),    
    /**@ A Cell (Geometry Section) */
    visInfiniteLineX2(2),    
    /**@ Y Cell (Geometry Section) */
    visInfiniteLineY1(1),    
    /**@ B Cell (Geometry Section) */
    visInfiniteLineY2(3),    
    /**@ Active Cell (Layers Section) */
    visLayerActive(6),    
    /**@ Transparency Cell (Layers Section) */
    visLayerColorTrans(11),    
    /**@ Color Cell (Layers Section) */
    visLayerColor(2),    
    /**@ Glue Cell (Layers Section) */
    visLayerGlue(9),    
    /**@ Lock Cell (Layers Section) */
    visLayerLock(7),    
    /**@ Layer Membership Cell (Layer Membership Section) */
    visLayerMember(0),    
    /**@ Universal Name Cell (Layers Section) */
    visLayerNameUniv(10),    
    /**@ Name Cell (Layers Section) */
    visLayerName(0),    
    /**@ Print Cell (Layers Section) */
    visLayerPrint(5),    
    /**@ Snap Cell (Layers Section) */
    visLayerSnap(8),    
    /**@ Status Cell (Layers Section) */
    visLayerStatus(3),    
    /**@ Visible Cell (Layers Section) */
    visLayerVisible(4),    
    /**@ BeginArrowSize Cell (Line Format Section) */
    visLineBeginArrowSize(8),    
    /**@ BeginArrow Cell (Line Format Section) */
    visLineBeginArrow(5),    
    /**@ LineColorTrans Cell (Line Format Section) */
    visLineColorTrans(9),    
    /**@ LineColor Cell (Line Format Section) */
    visLineColor(1),    
    /**@ EndArrowSize Cell (Line Format Section) */
    visLineEndArrowSize(4),    
    /**@ EndArrow Cell (Line Format Section) */
    visLineEndArrow(6),    
    /**@ LineCap Cell (Line Format Section) */
    visLineEndCap(7),    
    /**@ LineGradientAngle Cell (Gradient Properties Section) */
    visLineGradientAngle(1),    
    /**@ LineGradientDir Cell (Gradient Properties Section) */
    visLineGradientDir(0),    
    /**@ LineGradientEnabled Cell (Gradient Properties Section) */
    visLineGradientEnabled(4),    
    /**@ LinePattern Cell (Line Format Section) */
    visLinePattern(2),    
    /**@ Rounding Cell (Line Format Section) */
    visLineRounding(3),    
    /**@ LineWeight Cell (Line Format Section) */
    visLineWeight(0),    
    /**@ LockAspect Cell (Protection Section) */
    visLockAspect(4),    
    /**@ LockBegin Cell (Protection Section) */
    visLockBegin(6),    
    /**@ LockCalcWH Cell (Protection Section) */
    visLockCalcWH(14),    
    /**@ LockCrop Cell (Protection Section) */
    visLockCrop(9),    
    /**@ LockCustProp Cell (Protection Section) */
    visLockCustProp(16),    
    /**@ LockDelete Cell (Protection Section) */
    visLockDelete(5),    
    /**@ LockEnd Cell (Protection Section) */
    visLockEnd(7),    
    /**@ LockFormat Cell (Protection Section) */
    visLockFormat(12),    
    /**@ LockFromGroupFormat Cell (Protection Section) */
    visLockFromGroupFormat(17),    
    /**@ LockGroup Cell (Protection Section) */
    visLockGroup(13),    
    /**@ LockHeight Cell (Protection Section) */
    visLockHeight(1),    
    /**@ LockMoveX Cell (Protection Section) */
    visLockMoveX(2),    
    /**@ LockMoveY Cell (Protection Section) */
    visLockMoveY(3),    
    /**@ LockReplace Cell (Protection Cell) */
    visLockReplace(23),    
    /**@ LockRotate Cell (Protection Section) */
    visLockRotate(8),    
    /**@ LockSelect Cell (Protection Section) */
    visLockSelect(15),    
    /**@ LockTextEdit Cell (Protection Section) */
    visLockTextEdit(11),    
    /**@ LockThemeColors Cell (Protection Section) */
    visLockThemeColors(18),    
    /**@ LockThemeConnectors Cell (Protection Section) */
    visLockThemeConnectors(20),    
    /**@ LockThemeEffects Cell (Protection Section) */
    visLockThemeEffects(19),    
    /**@ LockThemeFonts Cell (Protection Section) */
    visLockThemeFonts(21),    
    /**@ LockThemeIndex Cell (Protection Section) */
    visLockThemeIndex(22),    
    /**@ LockVariation Cell (Protection Section) */
    visLockVariation(24),    
    /**@ LockVtxEdit Cell (Protection Section) */
    visLockVtxEdit(10),    
    /**@ LockWidth Cell (Protection Section) */
    visLockWidth(0),    
    /**@ ObjType Cell (Miscellaneous Section) */
    visLOFlags(13),    
    /**@ NoAlignBox Cell (Miscellaneous Section) */
    visNoAlignBox(3),    
    /**@ NoCtlHandles Cell (Miscellaneous Section) */
    visNoCtlHandles(2),    
    /**@ NoLiveDynamics Cell (Miscellaneous Section) */
    visNoLiveDynamics(18),    
    /**@ NonPrinting Cell (Miscellaneous Section) */
    visNonPrinting(1),    
    /**@ NoObjHandles Cell (Miscellaneous Section) */
    visNoObjHandles(0),    
    /**@ E Cell (Geometry Section) */
    visNURBSData(6),    
    /**@ C Cell (Geometry Section) */
    visNURBSKnotPrev(4),    
    /**@ A Cell (Geometry Section) */
    visNURBSKnot(2),    
    /**@ D Cell (Geometry Section) */
    visNURBSWeightPrev(5),    
    /**@ B Cell (Geometry Section) */
    visNURBSWeight(3),    
    /**@ Calendar Cell (Miscellaneous Section) */
    visObjCalendar(25),    
    /**@ DropOnPageScale Cell (Miscellaneous Section) */
    visObjDropOnPageScale(28),    
    /**@ HelpTopic Cell (Miscellaneous Section) */
    visObjHelp(0),    
    /**@ ShapeKeywords cell (Miscellaneous Section) */
    visObjKeywords(27),    
    /**@ LangID Cell (Miscellaneous Section) */
    visObjLangID(26),    
    /**@ LocalizeMerge Cell (Miscellaneous Section) */
    visObjLocalizeMerge(19),    
    /**@ NoProofing Cell (Miscellaneous Section) */
    visObjNoProofing(20),    
    /**@ Reserved for internal use only. */
    visObjTheme(29),    
    /**@ Reserved for internal use only. */
    visObjThemeModern(30),    
    /**@ DrawingScale Cell (Page Properties Section) */
    visPageDrawingScale(5),    
    /**@ DrawingScaleType Cell (Page Properties Section) */
    visPageDrawScaleType(7),    
    /**@ DrawingSizeType Cell (Page Properties Section) */
    visPageDrawSizeType(6),    
    /**@ PageHeight Cell (Page Properties Section) */
    visPageHeight(1),    
    /**@ InhibitSnap Cell (Page Properties Section) */
    visPageInhibitSnap(26),    
    /**@ PageLockDuplicate Cell (Page Properties Section) */
    visPageLockDuplicate(30),    
    /**@ PageLockReplace Cell (Page Properties Section) */
    visPageLockReplace(28),    
    /**@ InhibitSnap Cell (Page Properties Section) */
    visPageScale(4),    
    /**@ ShdwObliqueAngle Cell (Page Properties Section) */
    visPageShdwObliqueAngle(36),    
    /**@ ShdwOffsetX Cell (Page Properties Section) */
    visPageShdwOffsetX(2),    
    /**@ ShdwOffsetY Cell (Page Properties Section) */
    visPageShdwOffsetY(3),    
    /**@ ShdwScaleFactor Cell (Page Properties Section) */
    visPageShdwScaleFactor(37),    
    /**@ ShdwType Cell (Page Properties Section) */
    visPageShdwType(35),    
    /**@ UIVisibility Cell (Page Properties Section) */
    visPageUIVisibility(34),    
    /**@ PageWidth Cell (Page Properties Section) */
    visPageWidth(0),    
    /**@ Reserved for internal use only. */
    visPageZOrderChanged(39),    
    /**@ AvenueSizeX Cell (Page Layout Section) */
    visPLOAvenueSizeX(20),    
    /**@ AvenueSizeY Cell (Page Layout Section) */
    visPLOAvenueSizeY(21),    
    /**@ AvoidPageBreaks Cell (Page Layout Section) */
    visPLOAvoidPageBreaks(4),    
    /**@ BlockSizeX Cell (Page Layout Section) */
    visPLOBlockSizeX(18),    
    /**@ BlockSizeY Cell (Page Layout Section) */
    visPLOBlockSizeY(19),    
    /**@ CtrlAsInput Cell (Page Layout Section) */
    visPLOCtrlAsInput(3),    
    /**@ DynamicsOff Cell (Page Layout Section) */
    visPLODynamicsOff(2),    
    /**@ EnableGrid Cell (Page Layout Section) */
    visPLOEnableGrid(1),    
    /**@ LineJumpCode Cell (Page Layout Section) */
    visPLOJumpCode(12),    
    /**@ LineJumpFactorX Cell (Page Layout Section) */
    visPLOJumpDirX(14),    
    /**@ LineJumpFactorY Cell (Page Layout Section) */
    visPLOJumpDirY(15),    
    /**@ LineJumpFactorX Cell (Page Layout Section) */
    visPLOJumpFactorX(24),    
    /**@ LineJumpFactorXYCell (Page Layout Section) */
    visPLOJumpFactorY(25),    
    /**@ LineJumpStyle Cell (Page Layout Section) */
    visPLOJumpStyle(13),    
    /**@ LineAdjustFrom Cell (Page Layout Section) */
    visPLOLineAdjustFrom(26),    
    /**@ LineAdjustTo Cell (Page Layout Section) */
    visPLOLineAdjustTo(27),    
    /**@ LineRouteExt Cell (Page Layout Section) */
    visPLOLineRouteExt(29),    
    /**@ LineToLineX Cell (Page Layout Section) */
    visPLOLineToLineX(22),    
    /**@ LineToLineY Cell (Page Layout Section) */
    visPLOLineToLineY(23),    
    /**@ LineToNodeX Cell (Page Layout Section) */
    visPLOLineToNodeX(16),    
    /**@ LineToNodeY Cell (Page Layout Section) */
    visPLOLineToNodeY(17),    
    /**@ PlaceDepth Cell (Page Layout Section) */
    visPLOPlaceDepth(10),    
    /**@ PlaceFlip Cell (Page Layout Section) */
    visPLOPlaceFlip(28),    
    /**@ PlaceStyle Cell (Page Layout Section) */
    visPLOPlaceStyle(8),    
    /**@ PlowCode Cell (Page Layout Section) */
    visPLOPlowCode(11),    
    /**@ ResizePage Cell (Page Layout Section) */
    visPLOResizePage(0),    
    /**@ RouteStyle Cell (Page Layout Section) */
    visPLORouteStyle(9),    
    /**@ PageShapeSplit Cell (Page Layout Section) */
    visPLOSplit(30),    
    /**@ A Cell (Geometry Section) */
    visPolylineData(2),    
    /**@ PageBottomMargin Cell (Print Properties Section) */
    visPrintPropertiesBottomMargin(3),    
    /**@ CenterX Cell (Print Properties Section) */
    visPrintPropertiesCenterX(8),    
    /**@ CenterY Cell (Print Properties Section) */
    visPrintPropertiesCenterY(9),    
    /**@ PageLeftMargin Cell (Print Properties Section) */
    visPrintPropertiesLeftMargin(0),    
    /**@ OnPage Cell (Print Properties Section) */
    visPrintPropertiesOnPage(10),    
    /**@ PrintPageOrientation Cell (Print Properties Section) */
    visPrintPropertiesPageOrientation(16),    
    /**@ PagesX Cell (Print Properties Section) */
    visPrintPropertiesPagesX(6),    
    /**@ PagesY Cell (Print Properties Section) */
    visPrintPropertiesPagesY(7),    
    /**@ PaperKind Cell (Print Properties Section) */
    visPrintPropertiesPaperKind(17),    
    /**@ PaperSource Cell (Print Properties Section) */
    visPrintPropertiesPaperSource(18),    
    /**@ PrintGrid Cell (Print Properties Section) */
    visPrintPropertiesPrintGrid(11),    
    /**@ PageRightMargin Cell (Print Properties Section) */
    visPrintPropertiesRightMargin(1),    
    /**@ ScaleX Cell (Print Properties Section) */
    visPrintPropertiesScaleX(4),    
    /**@ ScaleY Cell (Print Properties Section) */
    visPrintPropertiesScaleY(5),    
    /**@ PageTopMargin Cell (Print Properties Section) */
    visPrintPropertiesTopMargin(2),    
    /**@ QuickStyleEffectsMatrix Cell (Quick Style Section) */
    visQuickStyleEffectsMatrix(6),    
    /**@ QuickStyleFillColor Cell (Quick Style Section) */
    visQuickStyleFillColor(1),    
    /**@ QuickStyleFillMatrix Cell (Quick Style Section) */
    visQuickStyleFillMatrix(5),    
    /**@ QuickStyleFontColor Cell (Quick Style Section) */
    visQuickStyleFontColor(3),    
    /**@ QuickStyleFontMatrix Cell (Quick Style Section) */
    visQuickStyleFontMatrix(7),    
    /**@ QuickStyleLineColor Cell (Quick Style Section) */
    visQuickStyleLineColor(0),    
    /**@ QuickStyleLineMatrix Cell (Quick Style Section) */
    visQuickStyleLineMatrix(4),    
    /**@ QuickStyleShadowColor Cell (Quick Style Section) */
    visQuickStyleShadowColor(2),    
    /**@ QuickStyleType Cell (Quick Style Section) */
    visQuickStyleType(8),    
    /**@ QuickStyleVariation Cell (Quick Style Section) */
    visQuickStyleVariation(9),    
    /**@ ReflectionBlur Cell (Additional Effects Properties Section) */
    visReflectionBlur(3),    
    /**@ ReflectionDist Cell (Additional Effects Properties Section) */
    visReflectionDist(2),    
    /**@ ReflectionSize Cell (Additional Effects Properties Section) */
    visReflectionSize(1),    
    /**@ ReflectionTrans Cell (Additional Effects Properties Section) */
    visReflectionTrans(0),    
    /**@ ReplaceCopyCells Cell (Change Shape Behavior Section) */
    visReplaceCopyCells(3),    
    /**@ ReplaceLockFormat Cell (Change Shape Behavior Section) */
    visReplaceLockFormat(2),    
    /**@ ReplaceLockShapeData Cell (Change Shape Behavior Section) */
    visReplaceLockShapeData(1),    
    /**@ ReplaceLockText Cell (Change Shape Behavior Section) */
    visReplaceLockText(0),    
    /**@ Color Cell (Reviewer Section) */
    visReviewerColor(2),    
    /**@ CurrentIndex Cell (Reviewer Section) */
    visReviewerCurrentIndex(4),    
    /**@ Initials Cell (Reviewer Section) */
    visReviewerInitials(1),    
    /**@ Name Cell (Reviewer Section) */
    visReviewerName(0),    
    /**@ ReviewerID Cell (Reviewer Section) */
    visReviewerReviewerID(3),    
    /**@ RotateGradientWithShape Cell (Gradient Properties Section) */
    visRotateGradientWithShape(6),    
    /**@ RotationType Cell (3D Rotation Properties Section) */
    visRotationType(3),    
    /**@ RotationXAngle Cell (3D Rotation Properties Section) */
    visRotationXAngle(0),    
    /**@ RotationYAngle Cell (3D Rotation Properties Section) */
    visRotationYAngle(1),    
    /**@ RotationZAngle Cell (3D Rotation Properties Section) */
    visRotationZAngle(2),    
    /**@ KeepTextFlat Cell (3D Rotation Properties Section) */
    visKeepTextFlat(6),    
    /**@ DistanceFromGround Cell (3D Rotation Properties Section) */
    visDistanceFromGround(5),    
    /**@ Perspective Cell (3D Rotation Properties Section) */
    visPerspective(4),    
    /**@ A Cell (Scratch Section) */
    visScratchA(2),    
    /**@ B Cell (Scratch Section) */
    visScratchB(3),    
    /**@ C Cell (Scratch Section) */
    visScratchC(4),    
    /**@ D Cell (Scratch Section) */
    visScratchD(5),    
    /**@ X Cell (Scratch Section) */
    visScratchX(0),    
    /**@ Y Cell (Scratch Section) */
    visScratchY(1),    
    /**@ SketchAmount Cell (Additional Effects Properties Section) */
    visSketchAmount(10),    
    /**@ SketchEnabled Cell (Additional Effects Properties Section) */
    visSketchEnabled(9),    
    /**@ SketchFillChange Cell (Additional Effects Properties Section) */
    visSketchFillChange(13),    
    /**@ SketchLineChange Cell (Additional Effects Properties Section) */
    visSketchLineChange(12),    
    /**@ SketchLineWeight Cell (Additional Effects Properties Section) */
    visSketchLineWeight(11),    
    /**@ SketchSeed Cell (Additional Effects Properties Section) */
    visSketchSeed(8),    
    /**@ Reserved for internal use only. */
    visSLOCategoryChanged(24),    
    /**@ ConFixedCode Cell (Shape Layout Section) */
    visSLOConFixedCode(12),    
    /**@ ShapeFixedCode Cell (Shape Layout Section) */
    visSLOFixedCode(8),    
    /**@ ConLineJumpCode Cell (Shape Layout Section) */
    visSLOJumpCode(13),    
    /**@ ConLineJumpDirX Cell (Shape Layout Section) */
    visSLOJumpDirX(16),    
    /**@ ConLineJumpDirY Cell (Shape Layout Section) */
    visSLOJumpDirY(17),    
    /**@ ConLineJumpStyle Cell (Shape Layout Section) */
    visSLOJumpStyle(14),    
    /**@ ConLineRouteExt Cell (Shape Layout Section) */
    visSLOLineRouteExt(19),    
    /**@ ShapePermeablePlace Cell (Shape Layout Section) */
    visSLOPermeablePlace(2),    
    /**@ ShapePermeableX Cell (Shape Layout Section) */
    visSLOPermX(0),    
    /**@ ShapePermeableY Cell (Shape Layout Section) */
    visSLOPermY(1),    
    /**@ ShapePlaceFlip Cell (Shape Layout Section) */
    visSLOPlaceFlip(18),    
    /**@ ShapePlaceStyle Cell (Shape Layout Section) */
    visSLOPlaceStyle(11),    
    /**@ ShapePlowCode Cell (Shape Layout Section) */
    visSLOPlowCode(9),    
    /**@ Relationships Cell (Shape Layout Section) */
    visSLORelationships(3),    
    /**@ Reserved for internal use only. */
    visSLORelChanged(23),    
    /**@ ShapeRouteStyle Cell (Shape Layout Section) */
    visSLORouteStyle(10),    
    /**@ ShapeSplittable Cell (Shape Layout Section) */
    visSLOSplittable(21),    
    /**@ ShapeSplit Cell (Shape Layout Section) */
    visSLOSplit(20),    
    /**@ ZOrderChanged Cell (Shape Layout Section) */
    visSLOZOrderChanged(25),    
    /**@ ButtonFace Cell (Smart Tags Section) */
    visSmartTagButtonFace(6),    
    /**@ Description Cell (Smart Tags Section) */
    visSmartTagDescription(15),    
    /**@ Disabled Cell (Smart Tags Section) */
    visSmartTagDisabled(7),    
    /**@ DisplayMode Cell (Smart Tags Section) */
    visSmartTagDisplayMode(5),    
    /**@ TagName Cell (Smart Tags Section) */
    visSmartTagName(2),    
    /**@ X Justify Cell (Smart Tags Section) */
    visSmartTagXJustify(3),    
    /**@ X Cell (Smart Tags Section) */
    visSmartTagX(0),    
    /**@ Y Justify Cell (Smart Tags Section) */
    visSmartTagYJustify(4),    
    /**@ Y Cell (Smart Tags Section) */
    visSmartTagY(1),    
    /**@ SoftEdgesSize Cell (Additional Effects Properties Section) */
    visSoftEdgeSize(7),    
    /**@ SpAfter Cell (Paragraph Section) */
    visSpaceAfter(5),    
    /**@ SpBefore Cell (Paragraph Section) */
    visSpaceBefore(4),    
    /**@ SpLine Cell (Paragraph Section) */
    visSpaceLine(3),    
    /**@ D Cell (Geometry Section) */
    visSplineDegree(5),    
    /**@ B Cell (Geometry Section) */
    visSplineKnot2(3),    
    /**@ C Cell (Geometry Section) */
    visSplineKnot3(4),    
    /**@ A Cell (Geometry Section) */
    visSplineKnot(2),    
    /**@ HideForApply Cell (Style Properties Section) */
    visStyleHidden(3),    
    /**@ EnableFillProps Cell (Style Properties Section) */
    visStyleIncludesFill(1),    
    /**@ EnableLineProps Cell (Style Properties Section) */
    visStyleIncludesLine(0),    
    /**@ EnableTextProps Cell (Style Properties Section) */
    visStyleIncludesText(2),    
    /**@ Alignment Cell (Tabs Section) */
    visTabAlign(2),    
    /**@ Position Cell (Tabs Section) */
    visTabPos(1),    
    /**@ X1 Cell (Tabs Section) */
    visTabStopCount(0),    
    /**@ TextPosAfterBullet Cell (Paragraph Section) */
    visTextPosAfterBullet(12),    
    /**@ ThemeIndex Cell (Theme Properties Section) */
    visThemeIndex(4),    
    /**@ TextBkgndTrans Cell (Text Block Format Section) */
    visTxtBlkBkgndTrans(11),    
    /**@ TextBkgnd Cell (Text Block Format Section) */
    visTxtBlkBkgnd(5),    
    /**@ BottomMargin Cell (Text Block Format Section) */
    visTxtBlkBottomMargin(3),    
    /**@ DefaultTabstop Cell (Text Block Format Section) */
    visTxtBlkDefaultTabStop(6),    
    /**@ TextDirection Cell (Text Block Format Section) */
    visTxtBlkDirection(10),    
    /**@ LeftMargin Cell (Text Block Format Section) */
    visTxtBlkLeftMargin(0),    
    /**@ RightMargin Cell (Text Block Format Section) */
    visTxtBlkRightMargin(1),    
    /**@ TopMargin Cell (Text Block Format Section) */
    visTxtBlkTopMargin(2),    
    /**@ VerticalAlign Cell (Text Block Format Section) */
    visTxtBlkVerticalAlign(4),    
    /**@ UpdateAlignBox Cell (Miscellaneous Section) */
    visUpdateAlignBox(4),    
    /**@ UseGroupGradient Cell (Gradient Properties Section) */
    visUseGroupGradient(7),    
    /**@ Prompt Cell (User-Defined Cells Section) */
    visUserPrompt(1),    
    /**@ Value Cell (User-Defined Cells Section) */
    visUserValue(0),    
    /**@ VariationColorIndex Cell (Theme Properties Section) */
    visVariationColorIndex(5),    
    /**@ VariationStyleIndex Cell (Theme Properties Section) */
    visVariationStyleIndex(6),    
    /**@ WalkPreference Cell (Glue Info Section) */
    visWalkPref(10),    
    /**@ Angle Cell (Shape Transform Section) */
    visXFormAngle(6),    
    /**@ FlipX Cell (Shape Transform Section) */
    visXFormFlipX(7),    
    /**@ FlipY Cell (Shape Transform Section) */
    visXFormFlipY(8),    
    /**@ Height Cell (Shape Transform Section) */
    visXFormHeight(3),    
    /**@ LocPinX Cell (Shape Transform Section) */
    visXFormLocPinX(4),    
    /**@ LocPinY Cell (Shape Transform Section) */
    visXFormLocPinY(5),    
    /**@ PinX Cell (Shape Transform Section) */
    visXFormPinX(0),    
    /**@ PinY Cell (Shape Transform Section) */
    visXFormPinY(1),    
    /**@ ResizeMode Cell (Shape Transform Section) */
    visXFormResizeMode(9),    
    /**@ Width Cell (Shape Transform Section) */
    visXFormWidth(2),    
    /**@ XGridDensity Cell (Ruler & Grid Section) */
    visXGridDensity(6),    
    /**@ XGridOrigin Cell (Ruler & Grid Section) */
    visXGridOrigin(10),    
    /**@ XGridSpacing Cell (Ruler & Grid Section) */
    visXGridSpacing(8),    
    /**@ XRulerDensity Cell (Ruler & Grid Section) */
    visXRulerDensity(0),    
    /**@ XRulerOrigin Cell (Ruler & Grid Section) */
    visXRulerOrigin(4),    
    /**@ X Cell (Geometry Section) */
    visX(0),    
    /**@ YGridDensity Cell (Ruler & Grid Section) */
    visYGridDensity(7),    
    /**@ YGridOrigin Cell (Ruler & Grid Section) */
    visYGridOrigin(11),    
    /**@ YGridSpacing Cell (Ruler & Grid Section) */
    visYGridSpacing(9),    
    /**@ YRulerDensity Cell (Ruler & Grid Section) */
    visYRulerDensity(1),    
    /**@ YRulerOrigin Cell (Ruler & Grid Section) */
    visYRulerOrigin(5),    
    /**@ Y Cell (Geometry Section) */
    visY(1);

    private final long value;

    VisCellIndices(long value) {
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
