package metier; //package dans lequel se trouve la classe

//création de la classe
public class Employe { 
	
	//création des attributs
	private String nom;
	private String prenom;
	private long id;
	
	//générer le constructeur
	public Employe(String nom, String prenom, long id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	
	public Employe() {
		super();
	}



	//générer les getters et les setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	//générer toString pour l'affichage dans le lanceur
	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}
	

}
