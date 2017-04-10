package service;

import metier.Complexe;

public class ComplexeService implements IComplexeService {
	
	/* (non-Javadoc)
	 * @see service.IComplexe#addition(metier.Complexe, metier.Complexe)
	 */
	@Override
	public Complexe addition(Complexe x, Complexe y){
		Complexe c = new Complexe (x.getRe()+y.getIm(), x.getIm()+y.getIm());
		 return c;
		
	}

	public Complexe soustraction(Complexe x, Complexe y){
		Complexe c = new Complexe (x.getRe()-y.getIm(), x.getIm()-y.getIm());
		 return  c;
}
	
	
}