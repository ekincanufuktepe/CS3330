package factory.method.shapefactory;

import factory.method.shapes.Shape;
import factory.method.shapes.Triangle;

public class TriangleFactory extends ShapeFactory {

	@Override
	public Shape createShape() {
		return new Triangle();
	}

}
