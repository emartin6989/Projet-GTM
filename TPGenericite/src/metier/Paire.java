package metier;

public class Paire {
	private Object premier;
	private Object second;

	public Paire(Object premier, Object second) {
		super();
		this.premier = premier;
		this.second = second;
	}

	public Object getPremier() {
		return premier;
	}

	public void setPremier(Object premier) {
		this.premier = premier;
	}

	public Object getSecond() {
		return second;
	}

	public void setSecond(Object second) {
		this.second = second;
	}
}


