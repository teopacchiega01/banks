package it.unipv.pois.ProgettoBanca.model.Accountable;

public class BollettaAdapter implements Accountable {
	private IBolletta bolletta;

	public BollettaAdapter(IBolletta bolletta) {
		super();
		this.bolletta = bolletta;
	}

	@Override
	public double eseguiAccountable() {
		return -Math.abs(bolletta.getBimestrale()/2);
	}

}
