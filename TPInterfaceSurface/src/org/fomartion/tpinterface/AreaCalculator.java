package org.fomartion.tpinterface;


public class AreaCalculator {

	
	private double resultat;
	
	public double sumArea(double[] surface){
		
		for (int i=0; i<surface.length; i++){
			resultat += surface[i];
		}
		return resultat;
	}
		
	

}
