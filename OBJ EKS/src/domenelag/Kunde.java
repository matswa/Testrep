package domenelag;

public class Kunde {
	private String kundenavn;
	private String adresse;
	private String telefon;
	
	
	
	public Kunde(String kundenavn, String adresse, String telefon) {
		super();
		this.kundenavn = kundenavn;
		this.adresse = adresse;
		this.telefon = telefon;
	}
	public String getKundenavn() {
		return kundenavn;
	}
	public void setKundenavn(String kundenavn) {
		this.kundenavn = kundenavn;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	@Override
	public String toString() {
		return "Kunde [kundenavn=" + kundenavn + ", adresse=" + adresse + ", telefon=" + telefon + "]";
	}
	
	public void test() {
		
	}
	
	
}
