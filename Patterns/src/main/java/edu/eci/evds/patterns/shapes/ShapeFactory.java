package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
	public static Shape create(RegularShapeType typeShape){
		Shape shapeSelect = null;
		switch (typeShape){
			case Hexagon:
				shapeSelect = new Hexagon();
				break;
			case Pentagon:
				shapeSelect = new Pentagon();
				break;
			case Quadrilateral:
				shapeSelect = new Quadrilateral();
				break;
			case Triangle:
				shapeSelect = new Triangle();
				break;
		}
		return shapeSelect;
	} 
}