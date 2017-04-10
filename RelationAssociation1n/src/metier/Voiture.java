package metier;

public class Voiture {
	
	private int idVoiture;
	private String marque;
	private String couleur;
	private Personne proprietaire;
	
	public int getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Personne getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	//j'enlève du toString l'affichage de la personne sinon mon programme tourne en boucle lors de la compilation.
	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", marque=" + marque + ", couleur=" + couleur + "]";
	}
	
	
	

}
