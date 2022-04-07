package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olruleconditiontype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olruleconditiontype</a>}
*/
public enum OlRuleConditionType implements COMEnum {
    
    /**@ Account is the account specified in AccountRuleCondition.Account. */
    olConditionAccount(3),    
    /**@ Message is assigned to any category. */
    olConditionAnyCategory(29),    
    /**@ Body contains words specified in TextRuleCondition.Text. */
    olConditionBody(13),    
    /**@ Body or subject contains words specified by TextRuleCondition.Text. */
    olConditionBodyOrSubject(14),    
    /**@ Category is the category specified in CategoryRuleCondition.Categories. */
    olConditionCategory(18),    
    /**@ Message has my name in the Cc box. */
    olConditionCc(9),    
    /**@ Message was received between x and y, where x and y are Date values. */
    olConditionDateRange(22),    
    /**@ Message is flagged for the specified action. */
    olConditionFlaggedForAction(8),    
    /**@ Message uses the form specified in FormNameRuleCondition.FormName. */
    olConditionFormName(23),    
    /**@ Sender is in the recipient list specified in ToOrFromRuleCondition.Recipients. */
    olConditionFrom(1),    
    /**@ Message is generated from any RSS subscription. */
    olConditionFromAnyRssFeed(31),    
    /**@ Message is generated from a specific RSS subscription. */
    olConditionFromRssFeed(30),    
    /**@ Message has one or more attachments. */
    olConditionHasAttachment(20),    
    /**@ Message is marked with the specified level of importance. */
    olConditionImportance(6),    
    /**@ Rule can run only on the local machine. */
    olConditionLocalMachineOnly(27),    
    /**@ Message is a meeting invitation or update. */
    olConditionMeetingInviteOrUpdate(26),    
    /**@ Message header contains words specified in TextRuleCondition.Text. */
    olConditionMessageHeader(15),    
    /**@ Message does not have my name in the To box. */
    olConditionNotTo(11),    
    /**@ Message is sent only to me. */
    olConditionOnlyToMe(4),    
    /**@ Message is an out-of-office message. */
    olConditionOOF(19),    
    /**@ Rule can run only on a specific machine that is not the current machine. */
    olConditionOtherMachine(28),    
    /**@ Document property is exactly, contains, or does not contain specified properties. */
    olConditionProperty(24),    
    /**@ Recipient address contains words specified in TextRuleCondition.Text. */
    olConditionRecipientAddress(16),    
    /**@ Sender address contains words specified in TextRuleCondition.Text. */
    olConditionSenderAddress(17),    
    /**@ Sender is in the address list specified in AddressRuleCondition.Address. */
    olConditionSenderInAddressBook(25),    
    /**@ Message is marked with the specified level of sensitivity. */
    olConditionSensitivity(7),    
    /**@ Sent to recipients (To, Cc) are in the recipient list specified in ToOrFromRuleCondition.Recipients. */
    olConditionSentTo(12),    
    /**@ Message size is between x and y in units of KB, where x and y are Integer values. */
    olConditionSizeRange(21),    
    /**@ Subject contains words specified in TextRuleCondition.Text. */
    olConditionSubject(2),    
    /**@ My name is in the To box. */
    olConditionTo(5),    
    /**@ Message has my name in the To or Cc box. */
    olConditionToOrCc(10),    
    /**@ Unrecognized condition. */
    olConditionUnknown(0);

    private final long value;

    OlRuleConditionType(long value) {
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
