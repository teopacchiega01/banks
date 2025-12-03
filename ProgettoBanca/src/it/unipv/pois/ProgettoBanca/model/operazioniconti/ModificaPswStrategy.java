package it.unipv.pois.ProgettoBanca.model.operazioniconti;

import it.unipv.pois.ProgettoBanca.model.Conti.ContoWeb;

public class ModificaPswStrategy implements IBankAccOperationsStrategy {

	@Override
	public void eseguiOperazioneSuConto(BankAccContext b) {
		// TODO Auto-generated method stub
		
		ContoWeb c =(ContoWeb) b.getC();
		String psw_vecchia = c.getPw();
		String psw_nuova = b.getPsw();
				
		c.cambiaPassword(psw_vecchia, psw_nuova);
		System.out.println("Nuova psw: "+psw_nuova);
		
		
	}
	
}
