package domenelag;

public abstract class Passasjerskip extends Skip {
	private int antallPassasjerer;

	public Passasjerskip(String regNr, double lengde, double brTonn, Land land, int antallPassasjerer) {
		super(regNr, lengde, brTonn, land);
		this.antallPassasjerer = antallPassasjerer;
	}

	public int getAntallPassasjerer() {
		return antallPassasjerer;
	}

	public void setAntallPassasjerer(int antallPassasjerer) {
		this.antallPassasjerer = antallPassasjerer;
	}
	
	
}
