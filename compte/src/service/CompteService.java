package service;

import metier.Compte;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

/**
 * Création de la classe CompteService
 * @author Stagiaire
 *@version 1.0 
 */
public class CompteService {

	/**
	 * Méthode pour ajouter de l'argent sur le compte
	 * @param c le Compte concerné
	 * @param montant le montant à ajouter
	 * @return nouveau solde
	 */
	public String ajouter(Compte c, long montant)
	{
		//si montant est négatif, l'opération est invalide
		if (montant <0) {
			return "Opération invalide";
		} 
		
		//sinon, le montant est ajouté à l'ancien solde
		else {
			c.setSolde(c.getSolde() + montant);
			
			return "le nouveau solde est de " + c.getSolde() + " €";
		}
	}
	
	/**
	 * Méthode pour retirer de l'argent sur le compte
	 * @param c le compte concerné
	 * @param montant le montant à retirer
	 * @return le nouveau solde
	 */
	public String retirer(Compte c, long montant) throws MontantNegatifException, SoldeInsuffisantException
	{
		
		if (montant< 0) {
		
		throw new MontantNegatifException("Montant négatif");
		}
	
		else {
			//si le montant retiré est supérieur au solde du compte. L'opération est refusée.
			if (montant > c.getSolde()) {
			
			throw new SoldeInsuffisantException("Le solde est insuffisant");
			} 
		
			//si le montant à retirer est bien inférieur au solde. L'opération est acceptée
			else {
			c.setSolde(c.getSolde() - montant);
			
			return "le nouveau solde est de " + c.getSolde() + " €";
			}
			}
	
		
	}
	}
