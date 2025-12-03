package it.unipv.pois.ProgettoBanca.model.operazioniconti;

import it.unipv.pois.ProgettoBanca.model.Conti.Conto;

public class StampaDettagliStrategy implements IBankAccOperationsStrategy {

	@Override
	public void eseguiOperazioneSuConto(BankAccContext b) {
		// TODO Auto-generated method stub
		Conto c = b.getC();
		c.stampaDettagli();
		
	}

}
