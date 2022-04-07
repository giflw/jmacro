package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visobjecttypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visobjecttypes</a>}
*/
public enum VisObjectTypes implements COMEnum {
    
    /**@ Addon object */
    visObjTypeAddon(31),    
    /**@ Addons collection */
    visObjTypeAddons(32),    
    /**@ ApplicationSettings object */
    visObjTypeApplicationSettings(51),    
    /**@ Application object */
    visObjTypeApp(3),    
    /**@ Cell object */
    visObjTypeCell(4),    
    /**@ Characters object */
    visObjTypeChars(5),    
    /**@ Color object */
    visObjTypeColor(29),    
    /**@ Colors collection */
    visObjTypeColors(30),    
    /**@ Comment object */
    visObjTypeComment(74),    
    /**@ Comments collection */
    visObjTypeComments(74),    
    /**@ Connect object */
    visObjTypeConnect(8),    
    /**@ Connects collection */
    visObjTypeConnects(9),    
    /**@ ContainerProperties collection */
    visObjTypeContainerProperties(60),    
    /**@ Curve object */
    visObjTypeCurve(42),    
    /**@ DataColumn object */
    visObjTypeDataColumn(56),    
    /**@ DataColumns collection */
    visObjTypeDataColumns(55),    
    /**@ DataConnection object */
    visObjTypeDataConnection(54),    
    /**@ DataRecordset object */
    visObjTypeDataRecordset(53),    
    /**@ DataRecordsetChangedEvent object */
    visObjTypeDataRecordsetChangedEvent(57),    
    /**@ DataRecordsets collection */
    visObjTypeDataRecordsets(52),    
    /**@ Document object */
    visObjTypeDoc(10),    
    /**@ Documents collection */
    visObjTypeDocs(11),    
    /**@ EventList collection */
    visObjTypeEventList(34),    
    /**@ Event object */
    visObjTypeEvent(33),    
    /**@ Font object */
    visObjTypeFont(27),    
    /**@ Fonts collection */
    visObjTypeFonts(28),    
    /**@ Global object */
    visObjTypeGlobal(36),    
    /**@ GraphicItem object */
    visObjTypeGraphicItem(59),    
    /**@ GraphicItems collection */
    visObjTypeGraphicItems(58),    
    /**@ Hyperlink object */
    visObjTypeHyperlink(37),    
    /**@ Hyperlinks collection */
    visObjTypeHyperlinks(43),    
    /**@ KeyboardEvent object */
    visObjTypeKeyboardEvent(50),    
    /**@ Layer object */
    visObjTypeLayer(25),    
    /**@ Layers collection */
    visObjTypeLayers(26),    
    /**@ MasterShortcut object */
    visObjTypeMasterShortcut(47),    
    /**@ MasterShortcuts collection */
    visObjTypeMasterShortcuts(46),    
    /**@ Master object */
    visObjTypeMaster(12),    
    /**@ Masters collection */
    visObjTypeMasters(13),    
    /**@ MouseEvent object */
    visObjTypeMouseEvent(49),    
    /**@ MovedSelectionEvent object */
    visObjTypeMovedSelectionEvent(62),    
    /**@ MSGWrap object */
    visObjTypeMSGWrap(48),    
    /**@ OLEObject object */
    visObjTypeOLEObject(39),    
    /**@ OLEObjects collection */
    visObjTypeOLEObjects(38),    
    /**@ Page object */
    visObjTypePage(14),    
    /**@ Pages collection */
    visObjTypePages(15),    
    /**@ Path object */
    visObjTypePath(41),    
    /**@ Paths collection */
    visObjTypePaths(40),    
    /**@ RelatedShapePairEvent object */
    visObjTypeRelatedShapePairEvent(61),    
    /**@ ReplaceShapesEvent object */
    visObjTypeReplaceShapesEvent(71),    
    /**@ Row object */
    visObjTypeRow(45),    
    /**@ Section object */
    visObjTypeSection(44),    
    /**@ Selection object */
    visObjTypeSelection(16),    
    /**@ ServerPublishOptions object */
    visObjTypeServerPublishOptions(63),    
    /**@ Shape object */
    visObjTypeShape(17),    
    /**@ Shapes collection */
    visObjTypeShapes(18),    
    /**@ Style object */
    visObjTypeStyle(19),    
    /**@ Styles object */
    visObjTypeStyles(20),    
    /**@ Unknown object */
    visObjTypeUnknown(1),    
    /**@ Validation object */
    visObjTypeValidation(64),    
    /**@ ValidationIssue object */
    visObjTypeValidationIssue(70),    
    /**@ ValidationIssues collection */
    visObjTypeValidationIssues(69),    
    /**@ ValidationRule object */
    visObjTypeValidationRule(68),    
    /**@ ValidationRules collection */
    visObjTypeValidationRules(67),    
    /**@ ValidationRuleSet object */
    visObjTypeValidationRuleSet(66),    
    /**@ ValidationRuleSets collection */
    visObjTypeValidationRuleSets(65),    
    /**@ Window object */
    visObjTypeWindow(21),    
    /**@ Windows collection */
    visObjTypeWindows(22);

    private final long value;

    VisObjectTypes(long value) {
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
