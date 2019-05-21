package domenelag;

import java.util.ArrayList;

public abstract class Skip {
	private String regNr;
	private double lengde;
	private double brTonn;
	private Land land;
	private ArrayList<Oppdrag> oppdragListe = new ArrayList<Oppdrag>();
	
	
	public Skip(String regNr, double lengde, double brTonn, Land land) {
		this.regNr = regNr;
		this.lengde = lengde;
		this.brTonn = brTonn;
		this.land = land;
	}

	public String getRegNr() {
		return regNr;
	}

	public void setRegNr(String regNr) {
		this.regNr = regNr;
	}

	public double getLengde() {
		return lengde;
	}

	public void setLengde(double lengde) {
		this.lengde = lengde;
	}

	public double getBrTonn() {
		return brTonn;
	}

	public void setBrTonn(double brTonn) {
		this.brTonn = brTonn;
	}

	public Land getLand() {
		return land;
	}

	public void setLand(Land land) {
		this.land = land;
	}
	
	public ArrayList<Oppdrag> getOppdragListe() {
		return oppdragListe;
	}

	public void setOppdragListe(ArrayList<Oppdrag> oppdragListe) {
		this.oppdragListe = oppdragListe;
	}
	
	// Registrere oppdrag:
	public void regOppdrag(String fraDato, String tilDato, String fraHavn, String tilHavn, double antall, Kunde kunde) {
		oppdragListe.add(new Oppdrag(fraDato, tilDato, fraHavn, tilHavn, antall, kunde));
	}

	
}
