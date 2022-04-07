package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viswindowstates">https://docs.microsoft.com/en-us/office/vba/api/visio.viswindowstates</a>}
*/
public enum VisWindowStates implements COMEnum {
    
    /**@ Active window. */
    visWSActive(67108864),    
    /**@ Anchor window with AutoHide on. */
    visWSAnchorAutoHide(512),    
    /**@ Window is anchored at the bottom. */
    visWSAnchorBottom(256),    
    /**@ Window is anchored at the left. */
    visWSAnchorLeft(32),    
    /**@ Window is merged. */
    visWSAnchorMerged(1024),    
    /**@ Window is anchored at the right. */
    visWSAnchorRight(128),    
    /**@ Window is anchored at the top. */
    visWSAnchorTop(64),    
    /**@ Window is docked at the bottom. Not used for the Shapes window in Visio */
    visWSDockedBottom(8),    
    /**@ Window is docked at the left. */
    visWSDockedLeft(1),    
    /**@ Window is docked at the right. */
    visWSDockedRight(4),    
    /**@ Window is docked at the top. Not used for the Shapes window in Visio. */
    visWSDockedTop(2),    
    /**@ Window is floating. */
    visWSFloating(16),    
    /**@ Window is maximized. */
    visWSMaximized(1073741824),    
    /**@ Window is minimized. */
    visWSMinimized(536870912),    
    /**@ No window state. */
    visWSNone(0),    
    /**@ Window is restored. */
    visWSRestored(268435456),    
    /**@ Window is visible. */
    visWSVisible(134217728);

    private final long value;

    VisWindowStates(long value) {
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
