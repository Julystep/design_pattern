package abstract_factory_pattern;

import abstract_factory_pattern.color.Color;
import abstract_factory_pattern.shape.Shape;
import abstract_factory_pattern.shape.Circle;
import abstract_factory_pattern.shape.Rectangle;
import abstract_factory_pattern.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}
