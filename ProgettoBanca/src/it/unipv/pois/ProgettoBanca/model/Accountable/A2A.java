package it.unipv.pois.ProgettoBanca.model.Accountable;

public class A2A implements IBolletta {
	private String indirizzo_edificio;
	private String servizio_fornito;
	private double importo_bimestrale;
	
	public A2A(String indirizzo_edificio, String servizio_fornito, double importo_bimestrale) {
		super();
		this.indirizzo_edificio = indirizzo_edificio;
		this.servizio_fornito = servizio_fornito;
		this.importo_bimestrale = importo_bimestrale;
	}

	@Override
	public String getFornitore() {
		return "A2A";
	}

	@Override
	public double getBimestrale() {
		return importo_bimestrale/2;
	}

	@Override
	public String getServizioFornito() {
		return servizio_fornito;
	}

	public String getIndirizzo_edificio() {
		return indirizzo_edificio;
	}

	public void setIndirizzo_edificio(String indirizzo_edificio) {
		this.indirizzo_edificio = indirizzo_edificio;
	}

	public String getServizio_fornito() {
		return servizio_fornito;
	}

	public void setServizio_fornito(String servizio_fornito) {
		this.servizio_fornito = servizio_fornito;
	}

	public double getImporto_bimestrale() {
		return importo_bimestrale;
	}

	public void setImporto_bimestrale(double importo_bimestrale) {
		this.importo_bimestrale = importo_bimestrale;
	}

	
}
