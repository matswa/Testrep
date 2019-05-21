package domenelag;

import java.sql.Date;

public class Oppdrag {
	private String fradato;
	private String tildato;
	private String fraHavn;
	private String tilHavn;
	private double antall;
	private Kunde kunde;
	
	public Oppdrag(String fradato, String tildato, String fraHavn, String tilHavn, double antall, Kunde kunde) {
		super();
		this.fradato = fradato;
		this.tildato = tildato;
		this.fraHavn = fraHavn;
		this.tilHavn = tilHavn;
		this.antall = antall;
		this.kunde = kunde;
	}

	public String getFradato() {
		return fradato;
	}

	public void setFradato(String fradato) {
		this.fradato = fradato;
	}

	public String getTildato() {
		return tildato;
	}

	public void setTildato(String tildato) {
		this.tildato = tildato;
	}

	public String getFraHavn() {
		return fraHavn;
	}

	public void setFraHavn(String fraHavn) {
		this.fraHavn = fraHavn;
	}

	public String getTilHavn() {
		return tilHavn;
	}

	public void setTilHavn(String tilHavn) {
		this.tilHavn = tilHavn;
	}

	public double getAntall() {
		return antall;
	}

	public void setAntall(double antall) {
		this.antall = antall;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	@Override
	public String toString() {
		return "Oppdrag [fradato=" + fradato + ", tildato=" + tildato + ", fraHavn=" + fraHavn + ", tilHavn=" + tilHavn
				+ ", antall=" + antall + ", kunde=" + kunde.toString() + "]";
	}
	
	
	
	
	
}
