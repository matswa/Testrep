package domenelag;

public abstract class Fraktskip extends Skip {
	private String status;

	public Fraktskip(String regNr, double lengde, double brTonn, Land land, String status) {
		super(regNr, lengde, brTonn, land);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
