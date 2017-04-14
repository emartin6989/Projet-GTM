package metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("COURT")
public class CourtMetrage extends Film {

	private int duree;

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "CourtMetrage [duree=" + duree + ", toString()=" + super.toString() + "]";
	}

}
