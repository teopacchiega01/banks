package it.unipv.pois.ProgettoBanca.model.operazioniconti;

import it.unipv.pois.ProgettoBanca.model.Conti.Conto;

public class DepositoStrategy implements IBankAccOperationsStrategy {

	@Override
	public void eseguiOperazioneSuConto(DatiOperazioniConti b) {
		// TODO Auto-generated method stub
		Conto c = b.getC();
		c.deposito(b.getCifra());
		
		System.out.println("Depositato: "+b.getCifra()+"Nuovo saldo: "+c.getSaldo());
		
	}

}
