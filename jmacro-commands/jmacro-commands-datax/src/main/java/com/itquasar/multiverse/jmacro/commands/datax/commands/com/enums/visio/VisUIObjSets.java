package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visuiobjsets">https://docs.microsoft.com/en-us/office/vba/api/visio.visuiobjsets</a>}
*/
public enum VisUIObjSets implements COMEnum {
    
    /**@ Visio is running as an ActiveX document. */
    visUIObjSetActiveXDoc(18),    
    /**@ Built-in commands available in the Customize dialog box */
    visUIObjSetCntx_AddComments(1000),    
    /**@ Shortcut menu: anchored windows. */
    visUIObjSetCntx_AnchorBar_Base(61),    
    /**@ Shortcut menu: Shape Data anchored window. */
    visUIObjSetCntx_AnchorBar_CustProp(62),    
    /**@ Shortcut menu: Shapes window. */
    visUIObjSetCntx_AnchorBar_Shapes(69),    
    /**@ Shortcut menu: Size & Position anchored window. */
    visUIObjSetCntx_AnchorBar_SizePos(63),    
    /**@ Built-in menus available in the Customize dialog box. */
    visUIObjSetCntx_BuiltInMenus(1010),    
    /**@ Shortcut menu: Comment Marker. */
    visUIObjSetCntx_CommentMarker(68),    
    /**@ Shortcut menu: Connection Point. */
    visUIObjSetCntx_ConnectPtType(44),    
    /**@ Shortcut menu: Drawing Explorer, root item. */
    visUIObjSetCntx_DEDocument(49),    
    /**@ Shortcut menu: Drawing Explorer, Layers folder. */
    visUIObjSetCntx_DELayers(54),    
    /**@ Shortcut menu: Drawing Explorer, Layer item. */
    visUIObjSetCntx_DELayer(55),    
    /**@ Shortcut menu: Drawing Explorer, Masters folder. */
    visUIObjSetCntx_DEMasters(58),    
    /**@ Shortcut menu: Drawing Explorer, item. */
    visUIObjSetCntx_DEMaster(59),    
    /**@ Shortcut menu: Drawing Explorer, Pages folder. */
    visUIObjSetCntx_DEPages(50),    
    /**@ Shortcut menu: Drawing Explorer, item. */
    visUIObjSetCntx_DEPage(51),    
    /**@ Shortcut menu: Drawing Explorer, Patterns folder. */
    visUIObjSetCntx_DEPatterns(60),    
    /**@ Shortcut menu: Drawing Explorer, Shapes folder. */
    visUIObjSetCntx_DEShapes(52),    
    /**@ Shortcut menu: Drawing Explorer, item. */
    visUIObjSetCntx_DEShape(53),    
    /**@ Shortcut menu: Drawing Explorer, Styles folder. */
    visUIObjSetCntx_DEStyles(56),    
    /**@ Shortcut menu: Drawing Explorer, Style item. */
    visUIObjSetCntx_DEStyle(57),    
    /**@ Shortcut menu: Visio drawing shape. */
    visUIObjSetCntx_DrawObjSel(9),    
    /**@ Shortcut menu: foreign drawing shape. */
    visUIObjSetCntx_DrawOleObjSel(10),    
    /**@ Shortcut menu: Full Screen mode. */
    visUIObjSetCntx_Fullscreen(17),    
    /**@ Issues window. */
    visUIObjSetCntx_Issues(76),    
    /**@ Shortcut menu: Master. */
    visUIObjSetCntx_Master(14),    
    /**@ Shortcut menu: Master Explorer, root item */
    visUIObjSetCntx_MEDocument(66),    
    /**@ Shortcut menu: Master Explorer, Masters folder */
    visUIObjSetCntx_MEMasters(67),    
    /**@ Page in drawing window, no shape selected. */
    visUIObjSetCntx_Page(75),    
    /**@ Page tab navigation. */
    visUIObjSetCntx_PageTabNavigation(74),    
    /**@ Shortcut menu: Page tab */
    visUIObjSetCntx_PageTabs(47),    
    /**@ Shortcut menu: Shape window. */
    visUIObjSetCntx_ShapeSheet(15),    
    /**@ Shortcut menu: Stencil window. */
    visUIObjSetCntx_Stencil(21),    
    /**@ Shortcut menu: editing shape text. */
    visUIObjSetCntx_TextEdit(13),    
    /**@ Drawing window is active or no documents are open. */
    visUIObjSetDrawing(2),    
    /**@ An object is active in Visio. */
    visUIObjSetHostingInPlace(22),    
    /**@ Icon editing window is active. */
    visUIObjSetIcon(5),    
    /**@ Use for accelerators only when Visio is running in place. */
    visUIObjSetInPlace(6),    
    /**@ Toolbar palette: Align Shapes */
    visUIObjSetPal_AlignShapes(30),    
    /**@ Toolbar palette: Connector, Connection Point, and Stamp drawing tools */
    visUIObjSetPal_ConnectorTool(40),    
    /**@ Toolbar palette: Corner Rounding */
    visUIObjSetPal_CornerRounding(34),    
    /**@ Toolbar palette: Distribute Shapes */
    visUIObjSetPal_DistributeShapes(31),    
    /**@ Toolbar palette: Fill Color */
    visUIObjSetPal_FillColors(27),    
    /**@ Toolbar palette: Fill Pattern */
    visUIObjSetPal_FillPatterns(28),    
    /**@ Toolbar palette: Line Color */
    visUIObjSetPal_LineColors(24),    
    /**@ Toolbar palette: Line Ends */
    visUIObjSetPal_LineEnds(33),    
    /**@ Toolbar palette: Line Pattern */
    visUIObjSetPal_LinePatterns(26),    
    /**@ Toolbar palette: Line, Arc, Pencil, and Freeform drawing tool */
    visUIObjSetPal_LineTool(42),    
    /**@ Toolbar palette: Line Weight */
    visUIObjSetPal_LineWeights(25),    
    /**@ Toolbar palette: Rectangle and Ellipse drawing tools */
    visUIObjSetPal_Rectangle_Tool(37),    
    /**@ Toolbar palette: Rotation and Crop tools */
    visUIObjSetPal_RotationTool(43),    
    /**@ Toolbar palette: Shadow Color */
    visUIObjSetPal_Shadow(32),    
    /**@ Toolbar palette: Text Color */
    visUIObjSetPal_TextColors(29),    
    /**@ Toolbar palette: Text and Text Block drawing tools */
    visUIObjSetPal_TextTool(41),    
    /**@ Toolbar palette: Add line jumps to */
    visUIObjSetPopup_LineJumpCode(38),    
    /**@ Toolbar palette: Line Jump Style */
    visUIObjSetPopup_LineJumpStyle(39),    
    /**@ Visio is in Print Preview mode. */
    visUIObjSetPrintPreview(7),    
    /**@ ShapeSheet window is active. */
    visUIObjSetShapeSheet(4),    
    /**@ Stencil window is active. */
    visUIObjSetStencil(3);

    private final long value;

    VisUIObjSets(long value) {
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
