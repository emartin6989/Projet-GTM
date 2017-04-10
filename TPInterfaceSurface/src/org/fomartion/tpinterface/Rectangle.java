package org.fomartion.tpinterface;

public class Rectangle implements Surface {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	/* (non-Javadoc)
	 * @see org.fomartion.tpinterface.Surface#getArea()
	 */
	@Override
	public double getArea(){
		double result;
		return result = this.getWidth() * this.getHeight();
		}
	

}
