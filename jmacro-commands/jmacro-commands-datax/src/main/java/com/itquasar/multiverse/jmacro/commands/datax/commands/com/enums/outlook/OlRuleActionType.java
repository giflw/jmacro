package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olruleactiontype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olruleactiontype</a>}
*/
public enum OlRuleActionType implements COMEnum {
    
    /**@ Rule action is to assign categories to the message. */
    olRuleActionAssignToCategory(2),    
    /**@ Rule action is to cc the message to specified recipients. */
    olRuleActionCcMessage(27),    
    /**@ Rule action is to clear all the categories assigned to the message. */
    olRuleActionClearCategories(30),    
    /**@ Rule action is to copy the message to a specified folder. */
    olRuleActionCopyToFolder(5),    
    /**@ Rule action is to perform a custom action. */
    olRuleActionCustomAction(22),    
    /**@ Rule action is to defer delivery of the message by the specified number of minutes. */
    olRuleActionDefer(28),    
    /**@ Rule action is to delete the message. */
    olRuleActionDelete(3),    
    /**@ Rule action is to permanently delete the message. */
    olRuleActionDeletePermanently(4),    
    /**@ Rule action is to display a desktop alert. */
    olRuleActionDesktopAlert(24),    
    /**@ Rule action is to clear the message flag. */
    olRuleActionFlagClear(13),    
    /**@ Rule action is to flag the message with a specified colored flag. */
    olRuleActionFlagColor(12),    
    /**@ Rule action is to flag the message for action in the specified number of days. */
    olRuleActionFlagForActionInDays(11),    
    /**@ Rule action is to forward the message to the specified recipients. */
    olRuleActionForward(6),    
    /**@ Rule action is to forward the message as an attachment to the specified recipients. */
    olRuleActionForwardAsAttachment(7),    
    /**@ Rule action is to mark the message with the specified level of importance. */
    olRuleActionImportance(14),    
    /**@ Rule action is to mark the message as a task. */
    olRuleActionMarkAsTask(41),    
    /**@ Rule action is to mark the message as read. */
    olRuleActionMarkRead(19),    
    /**@ Rule action is to move the message to the specified folder. */
    olRuleActionMoveToFolder(1),    
    /**@ Rule action is to display the specified text in the New Item Alert dialog box. */
    olRuleActionNewItemAlert(23),    
    /**@ Rule action is to request delivery notification for the message being sent. */
    olRuleActionNotifyDelivery(26),    
    /**@ Rule action is to request read notification for the message being sent. */
    olRuleActionNotifyRead(25),    
    /**@ Rule action is to play a sound file. */
    olRuleActionPlaySound(17),    
    /**@ Rule action is to print the message on the default printer. */
    olRuleActionPrint(16),    
    /**@ Rule action is to redirect the message to the specified recipients. */
    olRuleActionRedirect(8),    
    /**@ Rule action is to run a script. */
    olRuleActionRunScript(20),    
    /**@ Rule action is to mark the message with the specified level of sensitivity. */
    olRuleActionSensitivity(15),    
    /**@ Rule action is to request the server to reply with the specified mail item. */
    olRuleActionServerReply(9),    
    /**@ Rule action is to run an .exe file. */
    olRuleActionStartApplication(18),    
    /**@ Rule action is to stop processing more rules. */
    olRuleActionStop(21),    
    /**@ Rule action is to use the specified template (.oft) file as a form template. */
    olRuleActionTemplate(10),    
    /**@ Unrecognized rule action. */
    olRuleActionUnknown(0);

    private final long value;

    OlRuleActionType(long value) {
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
