package metier;

//Création de la classe générique avec trois types indéfinis A, B, et C
public class ObjetGenerique<A,B,C> {
	private A x;
	private B y;
	private C z;
	
	
	//Génération du constructeur de la classe
	public ObjetGenerique(A x, B y, C z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	
	//Génération des assesseurs
	public A getX() {
		return x;
	}

	public void setX(A x) {
		this.x = x;
	}

	public B getY() {
		return y;
	}

	public void setY(B y) {
		this.y = y;
	}

	public C getZ() {
		return z;
	}

	public void setZ(C z) {
		this.z = z;
	}

	
	//methode to String pour afficher l'instance objet dans le main
	@Override
	public String toString() {
		return "Objet générique [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	
	

}
