package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acwebbrowserstate">https://docs.microsoft.com/en-us/office/vba/api/access.acwebbrowserstate</a>}
*/
public enum AcWebBrowserState implements COMEnum {
    
    /**@ The web browser control has finished loading the new document and all its contents. */
    acComplete(3),    
    /**@ The web browser control has loaded enough of the document to allow limited user interaction, such as choosing hyperlinks that have been displayed. */
    acInteractive(3),    
    /**@ The web browser control has loaded and initialized the new document, but has not yet received all the document data. */
    acLoaded(2),    
    /**@ The web browser control is loading a new document. */
    acLoading(1),    
    /**@ No document is currently loaded. */
    acUninitialized(0);

    private final long value;

    AcWebBrowserState(long value) {
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
