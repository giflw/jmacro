package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbshapetype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbshapetype</a>}
*/
public enum PbShapeType implements COMEnum {
    
    /**@ AutoShape */
    pbAutoShape(1),    
    /**@ Callout */
    pbCallout(2),    
    /**@ Catalog Merge Area */
    pbCatalogMergeArea(111),    
    /**@ Chart */
    pbChart(3),    
    /**@ Comment */
    pbComment(4),    
    /**@ Embedded OLE Object */
    pbEmbeddedOLEObject(7),    
    /**@ Form Control */
    pbFormControl(8),    
    /**@ Freeform */
    pbFreeform(5),    
    /**@ Group */
    pbGroup(6),    
    /**@ Group Wizard */
    pbGroupWizard(108),    
    /**@ Line */
    pbLine(9),    
    /**@ Linked OLE Object */
    pbLinkedOLEObject(10),    
    /**@ Picture */
    pbLinkedPicture(11),    
    /**@ Media */
    pbMedia(16),    
    /**@ OLE Control Object */
    pbOLEControlObject(12),    
    /**@ Picture */
    pbPicture(13),    
    /**@ Placeholder */
    pbPlaceholder(14),    
    /**@ Shape Type Mixed */
    pbShapeTypeMixed(-2),    
    /**@ Table */
    pbTable(18),    
    /**@ Text effect */
    pbTextEffect(15),    
    /**@ Text frame */
    pbTextFrame(17),    
    /**@ Web check box */
    pbWebCheckBox(100),    
    /**@ Web command button */
    pbWebCommandButton(101),    
    /**@ Web hot spot */
    pbWebHotSpot(110),    
    /**@ Web HTML Fragment */
    pbWebHTMLFragment(107),    
    /**@ Web list box */
    pbWebListBox(102),    
    /**@ Web multiLine text box */
    pbWebMultiLineTextBox(103),    
    /**@ Web navigation bar */
    pbWebNavigationBar(112),    
    /**@ Web option button */
    pbWebOptionButton(104),    
    /**@ Web single-line textbox */
    pbWebSingleLineTextBox(105),    
    /**@ Web Web component */
    pbWebWebComponent(106);

    private final long value;

    PbShapeType(long value) {
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
