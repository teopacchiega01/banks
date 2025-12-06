package it.unipv.pois.ProgettoBanca.model.GestoreAccountable;

import java.util.ArrayList;

import it.unipv.pois.ProgettoBanca.model.Conti.Conto;

public class GestoreAccountable implements Runnable {
	private ArrayList<Conto> conti;
	
	
	public GestoreAccountable(ArrayList<Conto> conti) {
		super();
		this.conti = conti;
	}



	@Override
	public void run() {
		try {
			boolean appoggio = true;
			for(Conto appoggio_c: conti) {
				appoggio = appoggio_c.aggiornaConto();
			}
			if(appoggio) {
				System.out.println("Tutte le operazioni sono andate a buon fine");
			}else {
				System.out.println("Alcune operazioni sono fallite");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
