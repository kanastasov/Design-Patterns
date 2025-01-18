package com.factory.shapes;

public class ShapeFactoryClient {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		
		Shape shape = shapeFactory.getShape("Circle");
		shape.draw();
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
		
		
		Shape shape4 = shapeFactory.getShape("Unknown");
		shape4.draw();
		
		Shape shapeNull = shapeFactory.getShape(null);
		shapeNull.draw();
	}

}
