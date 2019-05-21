package kontroll;

import domenelag.*;

import java.util.ArrayList;


public class Kontroll {
	private ArrayList<Kunde> kundeListe = new ArrayList<Kunde>();
	
	private ArrayList<Land> landListe = new ArrayList<Land>();
	private ArrayList<Skip> skipListe = new ArrayList<Skip>();
	private static Kontroll single_instance = null;
	
	
	
	public Land finnLand(String landskode) {
		for(Land land : landListe) {
			if(landskode.equals(land.getLandkode()))return land;
		}
		return null;
	}
	
	public static Kontroll getInstance() { 
        if (single_instance == null) 
            single_instance = new Kontroll(); 
  
        return single_instance; 
    } 
	
	// Lage objekt i Grensesnitt:
//	public void regSkip(Skip skip) {
//		skipListe.add(skip);
//	}
	
	// Lage objekt i Kontroll:
	public void regCruiseSkip(String regNr, double lengde, double brTonn, String landkode, int antallPassasjerer, int antallLugarer) {
		Land land = finnLand(landkode);
		skipListe.add(new Cruiseskip(regNr, lengde, brTonn, land, antallPassasjerer, antallLugarer));
	}
	
	public void regFerge(String regNr, double lengde, double brTonn, String landkode, int antallPassasjerer, int antallSittePlasser) {
		Land land = finnLand(landkode);
		skipListe.add(new Ferge(regNr, lengde, brTonn, land, antallPassasjerer, antallSittePlasser));
	}
		
	public void regContainerskip(String regNr, double lengde, double brTonn, String landkode, String status, int antallContainere) {
		Land land = finnLand(landkode);
		skipListe.add(new Containerskip(regNr, lengde, brTonn, land, status, antallContainere));
	}
	
	public void regTankskip(String regNr, double lengde, double brTonn, String landkode, String status, double lasteKapasitet) {
		Land land = finnLand(landkode);
		skipListe.add(new Tankskip(regNr, lengde, brTonn, land, status, lasteKapasitet));
	}
	
	
	// Skrive ut oppdrag:
	public String skrivUtOppdrag(String regNummer) {
		Skip skip = finnSkip(regNummer);
		ArrayList<Oppdrag> oppdragsListe = skip.getOppdragListe();
		String liste = listOppdrag(oppdragsListe);
		return liste;
	}
	
	public String listOppdrag(ArrayList<Oppdrag> oppdragsListe) {
		String liste = "";
		for(int i = 0; i < oppdragsListe.size(); i++) {
			Oppdrag oppdrag = (Oppdrag)oppdragsListe.get(i);
			liste = oppdrag.toString() + "\n";
		}
		return liste;
	}
	
	public Skip finnSkip(String regNummer) {
		for(Skip s : skipListe) {
			if(regNummer.equals(s.getRegNr())) return s;
		}
		return null;
	}
	
	// Registrere oppdrag
	public void regOppdrag(String regNummer, String fraDato, String tilDato, String fraHavn, String tilHavn, double antall, String kundeNavn) {
		Kunde kunde = finnKunde(kundeNavn);
		Skip skip = finnSkip(regNummer);
		skip.regOppdrag(fraDato, tilDato, fraHavn, tilHavn, antall, kunde);
		
	}
	
	public Kunde finnKunde(String kundeNavn) {
		for(Kunde kunde : kundeListe) {
			if(kundeNavn.equals(kunde.getKundenavn())) return kunde;
		}
		return null;
	}
	
	
	// Registrere kunde for å kunne kjøre program:
	public void regKunde(String navn, String adresse, String tlf) {
		kundeListe.add(new Kunde(navn, adresse, tlf));
	}
	
	// Registrere land for å kunne kjøre program
	public void regLand(String landkode, String navn, String hovedstad) {
		landListe.add(new Land(landkode, navn, hovedstad));
	}
}
