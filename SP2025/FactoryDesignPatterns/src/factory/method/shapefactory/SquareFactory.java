package factory.method.shapefactory;

import factory.method.shapes.Shape;
import factory.method.shapes.Square;

public class SquareFactory extends ShapeFactory {

	@Override
	public Shape createShape() {
		return new Square();
	}

}
