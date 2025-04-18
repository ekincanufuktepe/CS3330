package factory.simple;

import factory.simple.shapefactory.ShapeFactory;
import factory.simple.shapefactory.ShapeTypes;
import factory.simple.shapes.Shape;

public class FactorySimpleMain {

	public static void main(String[] args) {
		Shape firstCircle = ShapeFactory.getShape(ShapeTypes.CIRCLE);
		firstCircle.draw();
		Shape secondCircle = ShapeFactory.getShape(ShapeTypes.CIRCLE);
		secondCircle.draw();
		
		Shape firstSquare = ShapeFactory.getShape(ShapeTypes.SQUARE);
		firstSquare.draw();
	}

}
