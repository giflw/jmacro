package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visopensaveargs">https://docs.microsoft.com/en-us/office/vba/api/visio.visopensaveargs</a>}
*/
public enum VisOpenSaveArgs implements COMEnum {
    
    /**@ Adds a document without displaying the Configure Refresh dialog box. */
    visAddDeclineAutoRefresh(1024),    
    /**@ Adds a document in a docked window. */
    visAddDocked(4),    
    /**@ Adds a document in a hidden window. */
    visAddHidden(64),    
    /**@ Adds a document with macros disabled. */
    visAddMacrosDisabled(128),    
    /**@ Adds a document in a minimized window */
    visAddMinimized(16),    
    /**@ Adds a document with no workspace information. */
    visAddNoWorkspace(256),    
    /**@ Adds a new stencil file. */
    visAddStencil(512),    
    /**@ Opens a copy of the document. */
    visOpenCopy(1),    
    /**@ Opens a copy of the document, using a copy of the naming. */
    visOpenCopyOfNaming(2048),    
    /**@ Opens a document without displaying the Configure Refresh dialog box. */
    visOpenDeclineAutoRefresh(1024),    
    /**@ Opens a stencil in a docked window. */
    visOpenDocked(4),    
    /**@ Opens the document without adding it to the Most Recently Used (MRU) list. */
    visOpenDontList(8),    
    /**@ Opens the document in a hidden window. */
    visOpenHidden(64),    
    /**@ Opens the document with macros disabled. */
    visOpenMacrosDisabled(128),    
    /**@ Opens the document in a minimized window. */
    visOpenMinimized(16),    
    /**@ Opens the document with no workspace information. */
    visOpenNoWorkspace(256),    
    /**@ Opens the document as read-only. */
    visOpenRO(2),    
    /**@ Opens the document for both reading and writing. */
    visOpenRW(32),    
    /**@ Displays the Compatibility Checker dialog box on save. */
    visSaveAsCheckCompatibility(8),    
    /**@ Saves the document and puts it in the MRU list. */
    visSaveAsListInMRU(4),    
    /**@ Saves the document as read-only. */
    visSaveAsRO(1),    
    /**@ Saves the workspace and the file. */
    visSaveAsWS(2);

    private final long value;

    VisOpenSaveArgs(long value) {
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
