package domenelag;


public class Tankskip extends Fraktskip {
	private double lasteKapasitet;

	public Tankskip(String regNr, double lengde, double brTonn, Land land, String status, double lasteKapasitet) {
		super(regNr, lengde, brTonn, land, status);
		this.lasteKapasitet = lasteKapasitet;
	}

	public double getLasteKapasitet() {
		return lasteKapasitet;
	}

	public void setLasteKapasitet(double lasteKapasitet) {
		this.lasteKapasitet = lasteKapasitet;
	}
	
	
}
