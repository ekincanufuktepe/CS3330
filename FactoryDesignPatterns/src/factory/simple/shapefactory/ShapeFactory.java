package factory.simple.shapefactory;

import factory.simple.shapes.Circle;
import factory.simple.shapes.Shape;
import factory.simple.shapes.Square;

public class ShapeFactory {

		public static Shape getShape(ShapeTypes type) {
			if(type.equals(ShapeTypes.CIRCLE)) {
				return new Circle();
			}
			else if (type.equals(ShapeTypes.SQUARE)) {
				return new Square();
			}
			return null;
		}
}
