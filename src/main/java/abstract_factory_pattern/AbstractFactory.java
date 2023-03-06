package abstract_factory_pattern;

import abstract_factory_pattern.color.Color;
import abstract_factory_pattern.shape.Circle;
import abstract_factory_pattern.shape.Rectangle;
import abstract_factory_pattern.shape.Shape;
import abstract_factory_pattern.shape.Square;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
