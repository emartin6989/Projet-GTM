package presentation;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Adresse;
import metier.Contact;
import metier.Film;
import metier.LongMetrage;
import metier.TeleFilm;

public class Lanceur {

	public static void main(String[] args) {

		// 1 : ouverture de l'unit� de persistance
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();

		// 2 : ouverture de la transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3 : cr�ation d'un objet m�tier
		LongMetrage lm = new LongMetrage();
		lm.setCinema("Path�");
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

		// 4 : persistance de l'objet m�tier
		System.out.println(c);
		em.persist(c);
		// em.persist(lm);
		// em.persist(tf);

		// 5: fermeture de la transaction
		tx.commit();

		// recup�rer le film id = 1
		Film f = em.find(Film.class, 1);
		System.out.println(f);

		// 6 : fermeture de l'unit� de persistance
		em.close();
		emf.close();
	}

}
