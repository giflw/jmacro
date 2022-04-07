package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olobjectclass">https://docs.microsoft.com/en-us/office/vba/api/outlook.olobjectclass</a>}
*/
public enum OlObjectClass implements COMEnum {
    
    /**@ An Account object. */
    olAccount(105),    
    /**@ An AccountRuleCondition object. */
    olAccountRuleCondition(135),    
    /**@ An Accounts object. */
    olAccounts(106),    
    /**@ An Action object. */
    olAction(32),    
    /**@ An Actions object. */
    olActions(33),    
    /**@ An AddressEntries object. */
    olAddressEntries(21),    
    /**@ An AddressEntry object. */
    olAddressEntry(8),    
    /**@ An AddressList object. */
    olAddressList(7),    
    /**@ An AddressLists object. */
    olAddressLists(20),    
    /**@ An AddressRuleCondition object. */
    olAddressRuleCondition(170),    
    /**@ An Application object. */
    olApplication(0),    
    /**@ An AppointmentItem object. */
    olAppointment(26),    
    /**@ An AssignToCategoryRuleAction object. */
    olAssignToCategoryRuleAction(122),    
    /**@ An Attachment object. */
    olAttachment(5),    
    /**@ An Attachments object. */
    olAttachments(18),    
    /**@ An AttachmentSelection object. */
    olAttachmentSelection(169),    
    /**@ An AutoFormatRule object. */
    olAutoFormatRule(147),    
    /**@ An AutoFormatRules object. */
    olAutoFormatRules(148),    
    /**@ A CalendarModule object. */
    olCalendarModule(159),    
    /**@ A CalendarSharing object. */
    olCalendarSharing(151),    
    /**@ A Categories object. */
    olCategories(153),    
    /**@ A Category object. */
    olCategory(152),    
    /**@ A CategoryRuleCondition object. */
    olCategoryRuleCondition(130),    
    /**@ A BusinessCardView object. */
    olClassBusinessCardView(168),    
    /**@ A CalendarView object. */
    olClassCalendarView(139),    
    /**@ A CardView object. */
    olClassCardView(138),    
    /**@ An IconView object. */
    olClassIconView(137),    
    /**@ A NavigationPane object. */
    olClassNavigationPane(155),    
    /**@ A PeopleView object. */
    olClassPeopleView(183),    
    /**@ A TableView object. */
    olClassTableView(136),    
    /**@ A TimelineView object. */
    olClassTimeLineView(140),    
    /**@ A TimeZone object. */
    olClassTimeZone(174),    
    /**@ A TimeZones object. */
    olClassTimeZones(175),    
    /**@ A Column object. */
    olColumn(154),    
    /**@ A ColumnFormat object. */
    olColumnFormat(149),    
    /**@ A Columns object. */
    olColumns(150),    
    /**@ A Conflict object. */
    olConflict(102),    
    /**@ A Conflicts object. */
    olConflicts(103),    
    /**@ A ContactItem object. */
    olContact(40),    
    /**@ A ContactsModule object. */
    olContactsModule(160),    
    /**@ A Conversation object. */
    olConversation(178),    
    /**@ A ConversationHeader object. */
    olConversationHeader(182),    
    /**@ An ExchangeDistributionList object. */
    olDistributionList(69),    
    /**@ A DocumentItem object. */
    olDocument(41),    
    /**@ An Exception object. */
    olException(30),    
    /**@ An Exceptions object. */
    olExceptions(29),    
    /**@ An ExchangeDistributionList object. */
    olExchangeDistributionList(111),    
    /**@ An ExchangeUser object. */
    olExchangeUser(110),    
    /**@ An Explorer object. */
    olExplorer(34),    
    /**@ An Explorers object. */
    olExplorers(60),    
    /**@ A Folder object. */
    olFolder(2),    
    /**@ A Folders object. */
    olFolders(15),    
    /**@ A UserDefinedProperties object. */
    olFolderUserProperties(172),    
    /**@ A UserDefinedProperty object. */
    olFolderUserProperty(171),    
    /**@ A FormDescription object. */
    olFormDescription(37),    
    /**@ A FormNameRuleCondition object. */
    olFormNameRuleCondition(131),    
    /**@ A FormRegion object. */
    olFormRegion(129),    
    /**@ A FromRssFeedRuleCondition object. */
    olFromRssFeedRuleCondition(173),    
    /**@ A ToOrFromRuleCondition object. */
    olFromRuleCondition(132),    
    /**@ An ImportanceRuleCondition object. */
    olImportanceRuleCondition(128),    
    /**@ An Inspector object. */
    olInspector(35),    
    /**@ An Inspectors object. */
    olInspectors(61),    
    /**@ An ItemProperties object. */
    olItemProperties(98),    
    /**@ An ItemProperty object. */
    olItemProperty(99),    
    /**@ An Items object. */
    olItems(16),    
    /**@ A JournalItem object. */
    olJournal(42),    
    /**@ A JournalModule object. */
    olJournalModule(162),    
    /**@ A MailItem object. */
    olMail(43),    
    /**@ A MailModule object. */
    olMailModule(158),    
    /**@ A MarkAsTaskRuleAction object. */
    olMarkAsTaskRuleAction(124),    
    /**@ A MeetingItem object that is a meeting cancellation notice. */
    olMeetingCancellation(54),    
    /**@ A MeetingItem object that is a notice about forwarding the meeting request. */
    olMeetingForwardNotification(181),    
    /**@ A MeetingItem object that is a meeting request. */
    olMeetingRequest(53),    
    /**@ A MeetingItem object that is a refusal of a meeting request. */
    olMeetingResponseNegative(55),    
    /**@ A MeetingItem object that is an acceptance of a meeting request. */
    olMeetingResponsePositive(56),    
    /**@ A MeetingItem object that is a tentative acceptance of a meeting request. */
    olMeetingResponseTentative(57),    
    /**@ A MoveOrCopyRuleAction object. */
    olMoveOrCopyRuleAction(118),    
    /**@ A NameSpace object. */
    olNamespace(1),    
    /**@ A NavigationFolder object. */
    olNavigationFolder(167),    
    /**@ A NavigationFolders object. */
    olNavigationFolders(166),    
    /**@ A NavigationGroup object. */
    olNavigationGroup(165),    
    /**@ A NavigationGroups object. */
    olNavigationGroups(164),    
    /**@ A NavigationModule object. */
    olNavigationModule(157),    
    /**@ A NavigationModules object. */
    olNavigationModules(156),    
    /**@ A NewItemAlertRuleAction object. */
    olNewItemAlertRuleAction(125),    
    /**@ A NoteItem object. */
    olNote(44),    
    /**@ A NotesModule object. */
    olNotesModule(163),    
    /**@ An OrderField object. */
    olOrderField(144),    
    /**@ An OrderFields object. */
    olOrderFields(145),    
    /**@ An OutlookBarGroup object. */
    olOutlookBarGroup(66),    
    /**@ An OutlookBarGroups object. */
    olOutlookBarGroups(65),    
    /**@ An OutlookBarPane object. */
    olOutlookBarPane(63),    
    /**@ An OutlookBarShortcut object. */
    olOutlookBarShortcut(68),    
    /**@ An OutlookBarShortcuts object. */
    olOutlookBarShortcuts(67),    
    /**@ An OutlookBarStorage object. */
    olOutlookBarStorage(64),    
    /**@ An AccountSelector object. */
    olOutspace(180),    
    /**@ A Pages object. */
    olPages(36),    
    /**@ A Panes object. */
    olPanes(62),    
    /**@ A PlaySoundRuleAction object. */
    olPlaySoundRuleAction(123),    
    /**@ A PostItem object. */
    olPost(45),    
    /**@ A PropertyAccessor object. */
    olPropertyAccessor(112),    
    /**@ A PropertyPages object. */
    olPropertyPages(71),    
    /**@ A PropertyPageSite object. */
    olPropertyPageSite(70),    
    /**@ A Recipient object. */
    olRecipient(4),    
    /**@ A Recipients object. */
    olRecipients(17),    
    /**@ A RecurrencePattern object. */
    olRecurrencePattern(28),    
    /**@ A Reminder object. */
    olReminder(101),    
    /**@ A Reminders object. */
    olReminders(100),    
    /**@ A RemoteItem object. */
    olRemote(47),    
    /**@ A ReportItem object. */
    olReport(46),    
    /**@ A Results object. */
    olResults(78),    
    /**@ A Row object. */
    olRow(121),    
    /**@ A Rule object. */
    olRule(115),    
    /**@ A RuleAction object. */
    olRuleAction(117),    
    /**@ A RuleActions object. */
    olRuleActions(116),    
    /**@ A RuleCondition object. */
    olRuleCondition(127),    
    /**@ A RuleConditions object. */
    olRuleConditions(126),    
    /**@ A Rules object. */
    olRules(114),    
    /**@ A Search object. */
    olSearch(77),    
    /**@ A Selection object. */
    olSelection(74),    
    /**@ A SelectNamesDialog object. */
    olSelectNamesDialog(109),    
    /**@ A SenderInAddressListRuleCondition object. */
    olSenderInAddressListRuleCondition(133),    
    /**@ A SendRuleAction object. */
    olSendRuleAction(119),    
    /**@ A SharingItem object. */
    olSharing(104),    
    /**@ A SimpleItems object. */
    olSimpleItems(179),    
    /**@ A SolutionsModule object. */
    olSolutionsModule(177),    
    /**@ A StorageItem object. */
    olStorageItem(113),    
    /**@ A Store object. */
    olStore(107),    
    /**@ A Stores object. */
    olStores(108),    
    /**@ A SyncObject object. */
    olSyncObject(72),    
    /**@ A SyncObjects object. */
    olSyncObjects(73),    
    /**@ A Table object. */
    olTable(120),    
    /**@ A TaskItem object. */
    olTask(48),    
    /**@ A TaskRequestItem object. */
    olTaskRequest(49),    
    /**@ A TaskRequestAcceptItem object. */
    olTaskRequestAccept(51),    
    /**@ A TaskRequestDeclineItem object. */
    olTaskRequestDecline(52),    
    /**@ A TaskRequestUpdateItem object. */
    olTaskRequestUpdate(50),    
    /**@ A TasksModule object. */
    olTasksModule(161),    
    /**@ A TextRuleCondition object. */
    olTextRuleCondition(134),    
    /**@ A UserDefinedProperties object. */
    olUserDefinedProperties(172),    
    /**@ A UserDefinedProperty object. */
    olUserDefinedProperty(171),    
    /**@ A UserProperties object. */
    olUserProperties(38),    
    /**@ A UserProperty object. */
    olUserProperty(39),    
    /**@ A View object. */
    olView(80),    
    /**@ A ViewField object. */
    olViewField(142),    
    /**@ A ViewFields object. */
    olViewFields(141),    
    /**@ A ViewFont object. */
    olViewFont(146),    
    /**@ A Views object. */
    olViews(79);

    private final long value;

    OlObjectClass(long value) {
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
