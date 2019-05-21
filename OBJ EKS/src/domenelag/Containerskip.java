package domenelag;

public class Containerskip extends Fraktskip {
	private int antallContainere;

	public Containerskip(String regNr, double lengde, double brTonn, Land land, String status, int antallContainere) {
		super(regNr, lengde, brTonn, land, status);
		this.antallContainere = antallContainere;
	}

	public int getAntallContainere() {
		return antallContainere;
	}

	public void setAntallContainere(int antallContainere) {
		this.antallContainere = antallContainere;
	}

	
	
}
