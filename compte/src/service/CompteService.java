package service;

import metier.Compte;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

/**
 * Cr�ation de la classe CompteService
 * @author Stagiaire
 *@version 1.0 
 */
public class CompteService {

	/**
	 * M�thode pour ajouter de l'argent sur le compte
	 * @param c le Compte concern�
	 * @param montant le montant � ajouter
	 * @return nouveau solde
	 */
	public String ajouter(Compte c, long montant)
	{
		//si montant est n�gatif, l'op�ration est invalide
		if (montant <0) {
			return "Op�ration invalide";
		} 
		
		//sinon, le montant est ajout� � l'ancien solde
		else {
			c.setSolde(c.getSolde() + montant);
			
			return "le nouveau solde est de " + c.getSolde() + " �";
		}
	}
	
	/**
	 * M�thode pour retirer de l'argent sur le compte
	 * @param c le compte concern�
	 * @param montant le montant � retirer
	 * @return le nouveau solde
	 */
	public String retirer(Compte c, long montant) throws MontantNegatifException, SoldeInsuffisantException
	{
		
		if (montant< 0) {
		
		throw new MontantNegatifException("Montant n�gatif");
		}
	
		else {
			//si le montant retir� est sup�rieur au solde du compte. L'op�ration est refus�e.
			if (montant > c.getSolde()) {
			
			throw new SoldeInsuffisantException("Le solde est insuffisant");
			} 
		
			//si le montant � retirer est bien inf�rieur au solde. L'op�ration est accept�e
			else {
			c.setSolde(c.getSolde() - montant);
			
			return "le nouveau solde est de " + c.getSolde() + " �";
			}
			}
	
		
	}
	}
