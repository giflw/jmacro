package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdinlineshapetype">https://docs.microsoft.com/en-us/office/vba/api/word.wdinlineshapetype</a>}
*/
public enum WdInlineShapeType implements COMEnum {
    
    /**@ 3D Model. */
    wdInlineShape3DModel(19),    
    /**@ Inline chart. */
    wdInlineShapeChart(12),    
    /**@ Inline diagram. */
    wdInlineShapeDiagram(13),    
    /**@ Embedded OLE object. */
    wdInlineShapeEmbeddedOLEObject(1),    
    /**@ Horizontal line. */
    wdInlineShapeHorizontalLine(6),    
    /**@ Linked 3D Model. */
    wdInlineShapeLinked3DModel(20),    
    /**@ Linked OLE object. */
    wdInlineShapeLinkedOLEObject(2),    
    /**@ Linked picture. */
    wdInlineShapeLinkedPicture(4),    
    /**@ Linked picture with horizontal line. */
    wdInlineShapeLinkedPictureHorizontalLine(8),    
    /**@ Locked inline shape canvas. */
    wdInlineShapeLockedCanvas(14),    
    /**@ OLE control object. */
    wdInlineShapeOLEControlObject(5),    
    /**@ OWS anchor. */
    wdInlineShapeOWSAnchor(11),    
    /**@ Picture. */
    wdInlineShapePicture(3),    
    /**@ Picture used as a bullet. */
    wdInlineShapePictureBullet(9),    
    /**@ Picture with horizontal line. */
    wdInlineShapePictureHorizontalLine(7),    
    /**@ Script anchor. Refers to anchor location for block of script stored with a document. */
    wdInlineShapeScriptAnchor(10),    
    /**@ A SmartArt graphic. */
    wdInlineShapeSmartArt(15),    
    /**@ A picture acting as a poster frame for a web video. */
    wdInlineShapeWebVideo(16);

    private final long value;

    WdInlineShapeType(long value) {
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
