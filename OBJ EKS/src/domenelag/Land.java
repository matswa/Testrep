package domenelag;

public class Land {
	private String navn;
	private String landkode;
	private String hovedstad;
	
	
	
	public Land(String navn, String landkode, String hovedstad) {
		super();
		this.navn = navn;
		this.landkode = landkode;
		this.hovedstad = hovedstad;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getLandkode() {
		return landkode;
	}
	public void setLandkode(String landkodeString) {
		this.landkode = landkodeString;
	}
	public String getHovedstad() {
		return hovedstad;
	}
	public void setHovedstad(String hovedstad) {
		this.hovedstad = hovedstad;
	}
}
