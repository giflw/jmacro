package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viswintypes">https://docs.microsoft.com/en-us/office/vba/api/visio.viswintypes</a>}
*/
public enum VisWinTypes implements COMEnum {
    
    /**@ Window created by an add-on that has tabs at the bottom when merged (floating, anchored, or docked window) */
    visAnchorBarAddon(10),    
    /**@ Visio built-in window that has tabs at the bottom when merged: presently, the Custom Properties, Size & Position, Drawing Explorer, Master Explorer, Pan & Zoom and Validation Issues windows (floating, anchored, or docked windows). */
    visAnchorBarBuiltIn(6),    
    /**@ Microsoft Visio application window. */
    visApplication(5),    
    /**@ An add-on window that has docked stencil behavior. */
    visDockedStencilAddon(11),    
    /**@ Stencil window docked in a drawing window. */
    visDockedStencilBuiltIn(7),    
    /**@ Drawing window (MDI frame window). */
    visDrawing(1),    
    /**@ Drawing window created by an add-on (MDI frame window). */
    visDrawingAddon(8),    
    /**@ Icon editing window (MDI frame window). */
    visIcon(4),    
    /**@ Window has no ID. */
    visInvalWinID(-1),    
    /**@ A group editing window of a group in a master. */
    visMasterGroupWin(96),    
    /**@ A master drawing page window. */
    visMasterWin(64),    
    /**@ A group editing window of a group on a page. */
    visPageGroupWin(160),    
    /**@ A drawing window showing a page. */
    visPageWin(128),    
    /**@ ShapeSheet window (MDI frame window). */
    visSheet(3),    
    /**@ Add-on window that has stencil window behavior. */
    visStencil(9),    
    /**@ When Window.Type is visAnchorBarBuiltIn, Custom Properties window. */
    visStencilAddon(1658),    
    /**@ When Window.Type is visAnchorBarBuiltIn, Drawing Explorer window. */
    visWinIDCustProp(1721),    
    /**@ When Window.Type is visAnchorBarBuiltIn, External Data window. */
    visWinIDDrawingExplorer(2044),    
    /**@ When Window.Type is visAnchorBarBuiltIn, ShapeSheet Formula Tracing window. */
    visWinIDExternalData(1781),    
    /**@ When Window.Type is visAnchorBarBuiltIn, Master Explorer window in master editing window. */
    visWinIDFormulaTracing(1916),    
    /**@ When Window.Type is visAnchorBarBuiltIn, Pan & Zoom window. */
    visWinIDMasterExplorer(1653),    
    /**@ When Window.Type is visAnchorBarBuiltIn, Shapes window. */
    visWinIDPanZoom(1669),    
    /**@ When Window.Type is visAnchorBarBuiltIn, Size & Position window. */
    visWinIDSizePos(1670),    
    /**@ When Window.Type is visAnchorBarBuiltIn, Drawing Explorer window in MDI stencil window. */
    visWinIDStencilExplorer(1796),    
    /**@ When Window.Type is visAnchorBarBuiltIn, Validation Issues window. */
    visWinIDValidationIssues(2263),    
    /**@ Unknown window type. */
    visWinOther(0);

    private final long value;

    VisWinTypes(long value) {
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
