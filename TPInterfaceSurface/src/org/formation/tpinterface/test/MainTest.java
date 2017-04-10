package org.formation.tpinterface.test;

import org.fomartion.tpinterface.AreaCalculator;
import org.fomartion.tpinterface.Circle;
import org.fomartion.tpinterface.Rectangle;
import org.fomartion.tpinterface.Square;
import org.fomartion.tpinterface.Surface;

public class MainTest {

	public static void main(String[] args) {
		
		Surface r = new Rectangle(10, 30);
		Surface s = new Square(10.5);
		Surface c = new Circle(5.5);
		AreaCalculator ac= new AreaCalculator();
		
 double surface[] = {s.getArea()+r.getArea()+c.getArea()};	
	


			ac.sumArea(surface);
			
			
			
			
			
			
			
			
			
	}  
}


