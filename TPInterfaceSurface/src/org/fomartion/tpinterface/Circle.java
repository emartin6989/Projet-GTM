package org.fomartion.tpinterface;

import java.awt.Shape;

public class Circle implements Surface, IFXDrawable, IPrintable {

	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		double resultat;
		return resultat = (this.getRadius()*this.getRadius())*Math.PI;
	}
	
	public String[] getShape() {
		return getShape();
	}

	/* (non-Javadoc)
	 * @see org.fomartion.tpinterface.IPrintable#printMe(java.lang.String)
	 */
	@Override
	public void printMe(String text){

	}

	
}
