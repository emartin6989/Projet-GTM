package metier;

//Cr�ation de la classe g�n�rique avec trois types ind�finis A, B, et C
public class ObjetGenerique<A,B,C> {
	private A x;
	private B y;
	private C z;
	
	
	//G�n�ration du constructeur de la classe
	public ObjetGenerique(A x, B y, C z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	
	//G�n�ration des assesseurs
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
		return "Objet g�n�rique [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	
	

}
