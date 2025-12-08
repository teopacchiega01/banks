package it.unipv.pois.ProgettoBanca.model.Accountable;

public class Abbonamento implements Accountable {
	private double importo;
	private String piattaforma;

	
	
	
	
	public Abbonamento() {
		super();
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public String getPiattaforma() {
		return piattaforma;
	}

	public void setPiattaforma(String piattaforma) {
		this.piattaforma = piattaforma;
	}

	@Override
	public double eseguiAccountable() {
		return -Math.abs(importo);
	}

	@Override
	public String getNomeAccountable() {
		// TODO Auto-generated method stub
		return piattaforma;
	}

}
