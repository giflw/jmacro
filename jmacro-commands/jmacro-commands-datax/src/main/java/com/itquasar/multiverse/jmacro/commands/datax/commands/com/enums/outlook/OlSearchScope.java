package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olsearchscope">https://docs.microsoft.com/en-us/office/vba/api/outlook.olsearchscope</a>}
*/
public enum OlSearchScope implements COMEnum {
    
    /**@ The search scope is across all folders that have the same folder type as the current folder (Folder.DefaultItemType), and all stores that have been selected for search. */
    olSearchScopeAllFolders(1),    
    /**@ The search scope is all Outlook items in all folders in stores that have been selected for search. */
    olSearchScopeAllOutlookItems(2),    
    /**@ The search scope is the folder represented by Explorer.CurrentFolder, and only that folder. */
    olSearchScopeCurrentFolder(0),    
    /**@ The search scope is the store for the current folder, which contains the item displayed in the active explorer. */
    olSearchScopeCurrentStore(4),    
    /**@ The search scope is the folder represented by Explorer.CurrentFolder and its subfolders. */
    olSearchScopeSubfolders(3);

    private final long value;

    OlSearchScope(long value) {
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
