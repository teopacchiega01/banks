package it.unipv.pois.ProgettoBanca.model.operazioniconti;

import it.unipv.pois.ProgettoBanca.model.Conti.Conto;

public class DatiOperazioniConti {
	private Conto c;
	private String psw;
	private double cifra;
	private String scelta;
	
	//private IBankAccOperationsStrategy strategy;
	
	

	public DatiOperazioniConti(Conto c, double cifra, String scelta) {
		super();
		this.c = c;
		this.cifra = cifra;
		this.scelta = scelta;
		//OperationFactory o = new OperationFactory();
		//strategy = o.getBankAccOperationStrategy(scelta);
	}

	public DatiOperazioniConti(Conto c, double cifra) {
		super();
		this.c = c;
		this.cifra = cifra;
	}

	public DatiOperazioniConti(Conto c, String psw, double cifra, String scelta) {
		super();
		this.c = c;
		this.psw = psw;
		this.cifra = cifra;
		this.scelta = scelta;
//		OperationFactory o = new OperationFactory();
//		strategy = o.getBankAccOperationStrategy(scelta);
	}
	
//	public void eseguiOperazioneBancaria() {
//		
//		strategy.eseguiOperazioneSuConto(this);
//		
//	}
	
	
	

	public DatiOperazioniConti() {
		// TODO Auto-generated constructor stub
	}

	

	public Conto getC() {
		return c;
	}

	public void setC(Conto c) {
		this.c = c;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public double getCifra() {
		return cifra;
	}

	public void setCifra(double cifra) {
		this.cifra = cifra;
	}

	public String getScelta() {
		return scelta;
	}

	public void setScelta(String scelta) {
		this.scelta = scelta;
	}

//	public IBankAccOperationsStrategy getStrategy() {
//		return strategy;
//	}
//
//	public void setStrategy(IBankAccOperationsStrategy strategy) {
//		this.strategy = strategy;
//	}
//	
	
	
	
	
	
	

}
