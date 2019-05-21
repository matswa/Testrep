package domenelag;

public class Cruiseskip extends Passasjerskip {
	private int antallLugarer;
	

	public Cruiseskip(String regNr, double lengde, double brTonn, Land land, int antallPassasjerer, int antallLugarer) {
		super(regNr, lengde, brTonn, land, antallPassasjerer);
		this.antallLugarer = antallLugarer;
	}

	public int getAntallLugarer() {
		return antallLugarer;
	}

	public void setAntallLugarer(int antallLugarer) {
		this.antallLugarer = antallLugarer;
	}
	
	
}
