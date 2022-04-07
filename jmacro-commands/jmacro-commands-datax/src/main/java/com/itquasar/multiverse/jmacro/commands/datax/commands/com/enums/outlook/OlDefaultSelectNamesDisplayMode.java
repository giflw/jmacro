package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oldefaultselectnamesdisplaymode">https://docs.microsoft.com/en-us/office/vba/api/outlook.oldefaultselectnamesdisplaymode</a>}
*/
public enum OlDefaultSelectNamesDisplayMode implements COMEnum {
    
    /**@ Displays one edit box for To recipients, uses localized string representing "Add" for the To button, and localized string representing "Add Users" for the caption. CcLabel and BccLabel are set to an empty string. Sets SelectNamesDialog.AllowMultipleSelection to True and SelectNamesDialog.NumberOfRecipientSelectors to olTo. */
    olDefaultDelegates(6),    
    /**@ Displays three edit boxes for To, Cc, and Bcc recipients, uses localized strings representing "To", "Cc", and "Bcc" for To, Cc, and Bcc buttons, and localized string representing "Select Names" for the caption. Sets AllowMultipleSelection to True and NumberOfRecipientSelectors to olToCcBcc. */
    olDefaultMail(1),    
    /**@ Displays three edit boxes for Required, Optional, and Resource recipients, uses localized strings representing "Required", "Optional", and "Resources" for the To, Cc, and Bcc buttons, and localized string representing "Select Attendees and Resources" for the caption. Sets AllowMultipleSelection to True and NumberOfRecipientSelectors to olToCcBcc. */
    olDefaultMeeting(2),    
    /**@ Displays one edit box for To recipients, uses localized string representing "To" for the To button, and localized string representing "Select Members" for caption. CcLabel and BccLabel are set to an empty string. Sets AllowMultipleSelection to True and NumberOfRecipientSelectors to olTo. */
    olDefaultMembers(5),    
    /**@ Displays one edit box for Resource recipients, uses localized string representing "Rooms" for To button, and localized string representing "Select Rooms" for caption. CcLabel and BccLabel are set to an empty string. Sets AllowMultipleSelection to True and NumberOfRecipientSelectors to olShowTo. InitialDisplayList is set to the Global Address List. */
    olDefaultPickRooms(8),    
    /**@ Displays one edit box for To recipients, uses localized string representing "To" for To button, and localized string representing "Select Names" for caption. CcLabel and BccLabel are set to an empty string. Sets AllowMultipleSelection to True and NumberOfRecipientSelectors to olTo. */
    olDefaultSharingRequest(4),    
    /**@ Displays no edit boxes for recipients, uses localized string representing "Select Name" for caption. ToLabel, CcLabel, and Bcclabel are set to an empty string. Sets AllowMultipleSelection to False and NumberOfRecipientSelectors to olNone. */
    olDefaultSingleName(7),    
    /**@ Displays one edit box for To recipients, uses localized string representing "To" for To button, and localized string representing "Select Task Recipient" for caption. CcLabel and BccLabel are set to an empty string. Sets AllowMultipleSelection to True and NumberOfRecipientSelectors to olTo. */
    olDefaultTask(3);

    private final long value;

    OlDefaultSelectNamesDisplayMode(long value) {
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
