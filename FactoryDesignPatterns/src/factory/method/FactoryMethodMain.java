package factory.method;

import factory.method.shapefactory.CircleFactory;
import factory.method.shapefactory.ShapeFactory;
import factory.method.shapefactory.SquareFactory;
import factory.method.shapefactory.TriangleFactory;
import factory.method.shapes.Shape;

public class FactoryMethodMain {

	public static void main(String[] args) {
		ShapeFactory factory = new SquareFactory();
		Shape shape1 = factory.createShape();
		shape1.draw();
		System.out.println(shape1);
		Shape shape2 = factory.createShape();
		shape2.draw();
		System.out.println(shape2);
		factory = new CircleFactory();
		Shape shape3 = factory.createShape();
		shape3.draw();
		
		factory = new TriangleFactory();
		Shape triangle = factory.createShape();
		triangle.draw();
	}

}
