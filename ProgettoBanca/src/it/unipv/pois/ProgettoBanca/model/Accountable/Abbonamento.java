package it.unipv.pois.ProgettoBanca.model.Accountable;

public class Abbonamento implements Accountable {
	private double importo;
	private String piattaforma;

	@Override
	public double eseguiAccountable() {
		return -Math.abs(importo);
	}

}
