package presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Contact;

public class Lanceur {

	public static void main(String[] args) {
		// 1 : ouverture de l'unité de persistance
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// 2 : ouverture de la transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		// 3 : création d'un objet métier
		Contact c = new Contact();
		c.setNom("Christian");
		c.setPrenom("Eddy");
		c.setEmail("toto@example.com");
		
		// 4 : persistance de l'objet métier
		em.persist(c);
		
		// 5: fermeture de la transaction
		tx.commit();
		// 6 : fermeture de l'unité de persistance
		em.close();
		emf.close();
	}

}
