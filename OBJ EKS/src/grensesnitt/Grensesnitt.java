package grensesnitt;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import kontroll.Kontroll;

public class Grensesnitt {
	private Kontroll kontroll = Kontroll.getInstance();
	

	
	public void regSkip() {
		String valg = JOptionPane.showInputDialog("Hvilken type båt?");
		String regNummer = JOptionPane.showInputDialog("Skriv inn regnr");
		double lengde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn lengde"));
		double brTonn = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn kapasitet i tonn"));
		String landkode = JOptionPane.showInputDialog("Skriv inn landskode");
		//Land land = kontroll.finnLand(landkode);
		if(valg.equals("Cruiseskip")) {
			cruiseverdier(regNummer, lengde, brTonn, landkode);
		}else if(valg.equals("Ferge")){
			fergeverdier(regNummer, lengde, brTonn, landkode);
		}else if(valg.equals("Containerskip")){
			containerverdier(regNummer, lengde, brTonn, landkode);
		}else if(valg.equals("Tankskip")){
			tankverdier(regNummer, lengde, brTonn, landkode);
		}
	}

	public void cruiseverdier(String regNummer, double lengde, double brTonn, String landkode) {
		int antallPassasjerer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall passasjerer"));
		int antallLugarer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall lugarer"));
		
		// Lage objekt i grensesnitt: 
		//Skip skip = new Cruiseskip(regNummer, lengde, brTonn, land, antallPassasjerer,antallLugarer);
		//kontroll.regSkip(skip);
		
		// Lage objekt i kontroll:
		kontroll.regCruiseSkip(regNummer, lengde, brTonn, landkode, antallPassasjerer, antallLugarer);
	}
	
	public void fergeverdier(String regNummer, double lengde, double brTonn, String landkode) {
		int antallPassasjerer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall passasjerer"));
		int antallSittePlasser = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall sitteplasser"));
		
		// Lage objekt i Grensesnitt
//		Skip skip = new Ferge(regNummer, lengde, brTonn, land, antallPassasjerer,antallSittePlasser);
//		kontroll.regSkip(skip);
		
		// Lage objekt i Kontroll
		kontroll.regFerge(regNummer, lengde, brTonn, landkode, antallPassasjerer, antallSittePlasser);
	}
	
	public void containerverdier(String regNummer, double lengde, double brTonn, String landkode) {
		String status = JOptionPane.showInputDialog("Skriv inn status");
		int antallContainere = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall kontainere"));
		
		// Lage objekt i Grensesnitt
//		Skip skip = new Containerskip(regNummer, lengde, brTonn, land, status, antallContainere);
//		kontroll.regSkip(skip);		
		
		// Lage objekt i Kontroll
		kontroll.regContainerskip(regNummer, lengde, brTonn, landkode, status, antallContainere);
	}
	
	public void tankverdier(String regNummer, double lengde, double brTonn, String landkode) {
		String status = JOptionPane.showInputDialog("Skriv inn status");
		double lasteKapasitet = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn lastekapasitet"));
		
		// Lage objekt i Grensesnitt
//		Skip skip = new Tankskip(regNummer, lengde, brTonn, land, status, lasteKapasitet);
//		kontroll.regSkip(skip);
		
		// Lage objekt i Kontroll
		kontroll.regTankskip(regNummer, lengde, brTonn, landkode, status, lasteKapasitet);
	}
	
	
	
	
	// Skrive ut oppdrag
	public void skrivUtOppdrag() {
		String regNummer = JOptionPane.showInputDialog("Skriv inn regnummer");
		String liste = kontroll.skrivUtOppdrag(regNummer);
		System.out.println(liste);
	}
	
	
	// Registrere oppdrag:
	
	public void lagOppdrag() {
		String regNummer = JOptionPane.showInputDialog("Skriv inn regnummer på skip");
		String fraDato = JOptionPane.showInputDialog("Skriv inn fra-dato");
		String tilDato = JOptionPane.showInputDialog("Skriv inn til-dato");
		String fraHavn = JOptionPane.showInputDialog("Skriv inn fra-havn");
		String tilHavn = JOptionPane.showInputDialog("Skriv inn til-havn");
		double antall = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn antall containere eller tonn"));
		String kundeNavn = JOptionPane.showInputDialog("Skriv inn kundenavn");
		kontroll.regOppdrag(regNummer, fraDato, tilDato, fraHavn, tilHavn, antall, kundeNavn);		
	}
	
	
	// Registrere kunde for å kunne kjøre program
	public void regKunde() {
		String navn = "Navn Navnesen";
		String adresse = "5578 Nedre Vats";
		String tlf = "98765432";
		kontroll.regKunde(navn, adresse, tlf);
	}
	
	// Registrere land for å kunne kjøre program
	public void regLand() {
		String landkode = "NO";
		String navn = "Norge";
		String hovedstad = "Oslo";
		kontroll.regKunde(landkode, navn, hovedstad);
	}
	
	
	
	
	
	
}
