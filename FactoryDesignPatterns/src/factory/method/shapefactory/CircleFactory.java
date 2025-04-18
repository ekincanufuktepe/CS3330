package factory.method.shapefactory;

import factory.method.shapes.Circle;
import factory.method.shapes.Shape;

public class CircleFactory extends ShapeFactory {

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
