package metier;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
@NamedQueries({ @NamedQuery(name = "Adress.findAll", query = "SELECT a from Adresse a"),
		@NamedQuery(name = "Adress.findLetter", query = "SELECT a FROM Adresse a WHERE a.numRue like :numRue")
		})
public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAdresse;
	private String numRue;
	private String ville;
	private String codePostal;
	@Transient
	private String commentaires;
	// adresse est esclave de client
	@OneToMany(mappedBy = "adresse", fetch = FetchType.LAZY)
	private Collection<Contact> contacts;

	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public String getNumRue() {
		return numRue;
	}

	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

	public Collection<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Collection<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", numRue=" + numRue + ", ville=" + ville + ", codePostal="
				+ codePostal + ", commentaires=" + commentaires + ", contacts=" + contacts + "]";
	}

}
