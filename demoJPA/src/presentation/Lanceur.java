package presentation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import metier.Adresse;
import metier.Contact;
import metier.Film;
import metier.LongMetrage;
import metier.TeleFilm;

public class Lanceur {

	public static void main(String[] args) {

		// 1 : ouverture de l'unité de persistance
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();

		// 2 : ouverture de la transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3 : création d'un objet métier
		LongMetrage lm = new LongMetrage();
		lm.setCinema("Pathé");
		lm.setNomFilm("tutu va tater");

		TeleFilm tf = new TeleFilm();
		tf.setChaine("FR2");
		tf.setNomFilm("TUTU");

		Adresse a = new Adresse();
		a.setNumRue("12 rue de la Pompe");
		a.setVille("Lille");
		a.setCodePostal("59000");

		Contact c = new Contact();
		c.setNom("Christian");
		c.setPrenom("Eddy");
		c.setEmail("toto@example.com");
		c.setAdresse(a);

		// ajout dans ManyToMany
		Set<Film> films = new HashSet<Film>();
		films.add(tf);
		films.add(lm);
		c.setFilms(films);

		TeleFilm tf2 = new TeleFilm();
		tf2.setChaine("TF1");
		tf2.setNomFilm("The Voice");

		// 4 : persistance de l'objet métier
		// System.out.println(c);
		em.persist(tf2);
		em.persist(c);
		// em.persist(lm);
		// em.persist(tf);
		em.persist(tf2);
		// System.out.println(tf2);

		// 5: validation de la transaction
		tx.commit();

		// recupérer le film id = 1
		Film f = em.find(Film.class, 1);
		// System.out.println(f);

		// modifier le film récupéré
		f.setNomFilm("Laliluloulo");
		// ouvrir une nouvelle transaction
		tx.begin();
		// mise a jour de l'objet dans la bdd
		em.merge(f);
		// validation de la transaction
		tx.commit();
		// afficher le film modifié
		// System.out.println(f);

		// supprimer le film
		// ouvrir une nouvelle transaction
		tx.begin();
		// suppression de l'objet f
		em.remove(f);
		// validation de la transaction
		tx.commit();

		// récupérer tous les films
		// on crée une liste de film. La valeur de la liste sera la recherche
		List<Film> listeFilm = em.createQuery("SELECT f FROM Film f").getResultList();
		// afficher chaque objet recupéré dans la liste
		for (Film fl : listeFilm) {
			System.out.println(fl);
		}

		// rechercher les films par le nom de film
		Query q = em.createQuery("select f from Film f where f.nomFilm = :fnom");
		q.setParameter("fnom", "tutu va tater");
		List<Film> listeFilm2 = q.getResultList();
		for (Film fl2 : listeFilm2) {
			System.out.println(fl2);
		}

		// rechercher les films dont le titre contient la lettre t
		Query q2 = em.createQuery("select f from Film f where f.nomFilm like :fnom");
		q2.setParameter("fnom", "%t%");
		List<Film> listeFilm3 = q2.getResultList();
		System.out.println("Les films ayant la lettre 't' dans leur leur titre sont : ");
		for (Film fl2 : listeFilm3) {
			System.out.println(fl2);
		}

		// exemple pour un resultat unique avec getSingleResult (alternative au
		// find)
		Film f5 = (Film) em.createQuery("Select f from Film f where f.idFilm = 2").getSingleResult();
		System.out.println("Le film recherché est " + f5);

		// exemple de jointure externe : on veut afficher tous les contacts +
		// leurs adresses si ils en ont une associée
		Query q3 = em.createQuery("SELECT c from Contact c left join c.adresse");
		List<Contact> listeContact = q3.getResultList();
		System.out.println("Liste de tous les contacts avec leur adresse associée si elle existe");
		for (Contact c2 : listeContact) {
			System.out.println(c2);
		}
		// Appel d'une requête nommée
		Query q4 = em.createNamedQuery("Contact.findAll");
		List<Contact> listeC = q4.getResultList();
		System.out.println("Appel de la requête nommée");
		for (Contact c2 : listeC) {
			System.out.println(c2);
		}
		//appel requete nommée 1 pour l'adresse
		Query q5 = em.createNamedQuery("Adress.findAll");
		List<Adresse> listeA = q5.getResultList();
		System.out.println("Requete nommée pour toutes les adresses");
		for (Adresse a2 : listeA) {
			System.out.println(a2);
		}
		//appel requete nommée 2 de l'adresse
		Query q6 = em.createNamedQuery("Adress.findLetter");
		q6.setParameter("numRue", "%p%");
		List<Adresse> listeA2 = q6.getResultList();
		System.out.println("Requete nommée pour les adresses avec la lettre p");
		for (Adresse a2 : listeA2) {
			System.out.println(a2);
		}
		// 6 : fermeture de l'unité de persistance
		em.close();
		emf.close();
	}

}
