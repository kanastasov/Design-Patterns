package com.factory.shapes;

public class ShapeFactory {
	
	public Shape getShape(String shapeType){
		
		try {
			if(shapeType == null) {
				throw new IllegalArgumentException("Shape not set: " + shapeType);
			}
			if(shapeType.equalsIgnoreCase("Circle")) {
				return new Circle();
			}
			else if(shapeType.equalsIgnoreCase("Square")) {
				return new Square();
			}
			else if(shapeType.equalsIgnoreCase("Rectangle")) {
				return new Rectangle();
			} 
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
		
		return null;
//		if(shapeType == null) {
//			throw new IllegalArgumentException("Shape not set: " + shapeType);
//		}
//		if(shapeType.equalsIgnoreCase("Circle")) {
//			return new Circle();
//		}
//		else if(shapeType.equalsIgnoreCase("Square")) {
//			return new Square();
//		}
//		else if(shapeType.equalsIgnoreCase("Rectangle")) {
//			return new Rectangle();
//		} else {
//				throw new IllegalArgumentException("Shape does not exist: " + shapeType);
//		}
	}
}
