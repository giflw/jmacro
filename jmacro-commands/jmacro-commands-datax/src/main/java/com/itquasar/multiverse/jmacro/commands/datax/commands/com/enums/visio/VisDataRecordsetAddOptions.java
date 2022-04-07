package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdatarecordsetaddoptions">https://docs.microsoft.com/en-us/office/vba/api/visio.visdatarecordsetaddoptions</a>}
*/
public enum VisDataRecordsetAddOptions implements COMEnum {
    
    /**@ Prevents data in the new data recordset from being displayed in the External Data window. */
    visDataRecordsetNoExternalDataUI(1),    
    /**@ Prevents the data recordset from being displayed in the Refresh Data dialog box. */
    visDataRecordsetNoRefreshUI(2),    
    /**@ Limits the control users have of how the data recordset is refreshed in the Configure Refresh dialog box for the data recordset. In particular, users cannot change the primary key or specify when shape data should be overwritten; however, users can set the refresh interval and can change the data source. */
    visDataRecordsetNoAdvConfig(4),    
    /**@ Adds a data recordset but does not execute the command-string query until the next time you call the Refresh method. */
    visDataRecordsetDelayQuery(8),    
    /**@ Adds a data recordset, but shape-data links are not copied to the Clipboard when shapes are copied or cut. */
    visDataRecordsetDontCopyLinks(16);

    private final long value;

    VisDataRecordsetAddOptions(long value) {
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
