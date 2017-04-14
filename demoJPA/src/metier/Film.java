package metier;

import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_FILM")
@NamedQueries({@NamedQuery(name="Film.findAll", query="SELECT f from Film f"), 
@NamedQuery(name="Film.findName", query="select f from Film f where f.nomFilm = :fnom"),
@NamedQuery(name="Film.findWord", query="select f from Film f where f.nomFilm like :fnom")
})
public abstract class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @GeneratedValue(strategy = GenerationType.TABLE)
	private int idFilm;
	private String nomFilm;
	@ManyToMany(mappedBy = "films")
	private Collection<Contact> contacts;

	public int getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}

	public String getNomFilm() {
		return nomFilm;
	}

	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}

	public Collection<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Collection<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", contacts=" + contacts + "]";
	}

}
