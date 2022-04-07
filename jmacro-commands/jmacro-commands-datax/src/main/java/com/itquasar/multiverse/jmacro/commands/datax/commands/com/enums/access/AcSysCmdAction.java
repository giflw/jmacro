package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acsyscmdaction">https://docs.microsoft.com/en-us/office/vba/api/access.acsyscmdaction</a>}
*/
public enum AcSysCmdAction implements COMEnum {
    
    /**@ Returns the name of the directory where Msaccess.exe is located. */
    acSysCmdAccessDir(9),    
    /**@ Returns the version number of Microsoft Access. */
    acSysCmdAccessVer(7),    
    /**@ No description provided */
    acSysCmdClearHelpTopic(11),    
    /**@ Provides information on the state of a database object. */
    acSysCmdClearStatus(5),    
    /**@ Returns the state of the specified database object. You must specify argument1 and argument2 when you use this action value. */
    acSysCmdGetObjectState(10),    
    /**@ Returns the path to the workgroup file (System.mdw). */
    acSysCmdGetWorkgroupFile(13),    
    /**@ Returns the name of the .ini file associated with Microsoft Access. */
    acSysCmdIniFile(8),    
    /**@ Initializes the progress meter. You must specify the argument1 and argument2 arguments when you use this action. */
    acSysCmdInitMeter(1),    
    /**@ Returns the /profile setting specified by the user when starting Microsoft Access from the command line. */
    acSysCmdProfile(12),    
    /**@ Removes the progress meter. */
    acSysCmdRemoveMeter(3),    
    /**@ Returns True (1) if a run-time version of Microsoft Access is running. */
    acSysCmdRuntime(6),    
    /**@ Sets the status bar text to the text argument. */
    acSysCmdSetStatus(4),    
    /**@ Updates the progress meter with the specified value. You must specify the text argument when you use this action. */
    acSysCmdUpdateMeter(2);

    private final long value;

    AcSysCmdAction(long value) {
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
