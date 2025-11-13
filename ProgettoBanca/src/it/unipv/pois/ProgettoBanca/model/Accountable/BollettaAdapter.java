package it.unipv.pois.ProgettoBanca.model.Accountable;

public class BollettaAdapter implements IBolletta {
	private IBolletta bolletta;
	
	public BollettaAdapter(IBolletta bolletta) {
		super();
		this.bolletta = bolletta;
	}

	@Override
	public String getFornitore() {
		return bolletta.getFornitore();
	}

	@Override
	public double getBimestrale() {
		return bolletta.getBimestrale();
	}

	@Override
	public String getServizioFornito() {
		return bolletta.getServizioFornito();
	}

}
