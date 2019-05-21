package domenelag;

public class Ferge extends Passasjerskip {
	private int antallSittePlasser;

	public Ferge(String regNr, double lengde, double brTonn, Land land, int antallPassasjerer, int antallSittePlasser) {
		super(regNr, lengde, brTonn, land, antallPassasjerer);
		this.antallSittePlasser = antallSittePlasser;
	}

	public int getAntallSittePlasser() {
		return antallSittePlasser;
	}

	public void setAntallSittePlasser(int antallSittePlasser) {
		this.antallSittePlasser = antallSittePlasser;
	}
	
	
}
