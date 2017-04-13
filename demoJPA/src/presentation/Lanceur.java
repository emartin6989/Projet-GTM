package presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Contact;

public class Lanceur {

	public static void main(String[] args) {
		// 1 : ouverture de l'unit� de persistance
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// 2 : ouverture de la transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		// 3 : cr�ation d'un objet m�tier
		Contact c = new Contact();
		c.setNom("Christian");
		c.setPrenom("Eddy");
		c.setEmail("toto@example.com");
		
		// 4 : persistance de l'objet m�tier
		em.persist(c);
		
		// 5: fermeture de la transaction
		tx.commit();
		// 6 : fermeture de l'unit� de persistance
		em.close();
		emf.close();
	}

}
