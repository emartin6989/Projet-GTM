package presentation;

import java.util.ArrayList;
import java.util.Collection;

import metier.Client;
import service.ClientService;
import service.IClientService;
import service.IClientServiceVip;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// déclaration de l'interface
		IClientService s = new ClientService();
		IClientServiceVip sv = new ClientService();
		Client c = new Client();
		c.setNom("Noninu");
		c.setPrenom("Nanouno");
		c.setCouleuryeux("noirs");
		Collection<Client> col = new ArrayList<Client>();

		// declaration de la classe;
		ClientService cs = new ClientService();

		System.out.println("--------------CLIENT NORMAL-------------------------------");
		// utilisation de l'interface
		s.direAurevoir();
		s.direBonjour();
		// s.jesuisVip();

		System.out.println("--------------CLIENT VIP---------------------------------");
		sv.direBonjour();
		sv.direAurevoir();
		sv.jesuisVip();

		// utilisation de la classe
		/*
		 * cs.direAurevoir(); cs.direBonjour(); cs.jesuisVip();
		 */

		
		/*System.out.println("--------------AJOUTER UN CLIENT---------------------------------"); 
		 s.ajouterClient(c);*/
		

		System.out.println("--------------SUPPRIMER UN CLIENT---------------------------------");
		s.supprimerClient(2);
		

		System.out.println("--------------LISTER TOUS LES CLIENTS---------------------------------");
		col = s.listerClients();
		for (Client cli : col) {
			System.out.println(cli);
		}

		System.out.println("--------------MODIFIER LE CLIENT---------------------------------");
		s.modifierClient(14, "Tutatou", "Totitu","noisettes");

		System.out.println("--------------CHERCHER LE CLIENT PAR ID---------------------------------");
		Client cli = s.chercherClient(14);
		System.out.println("Le client recherche est " + cli);

		System.out.println("--------------CHERCHER LES CLIENTS PAR MC DE NOM---------------------------------");
		Collection<Client> col2 = s.chercherParMC("r");
		System.out.println("Les clients correspondants sont :");
		for (Client c2 : col2) {
			System.out.println(c2);
		}
	}

}
