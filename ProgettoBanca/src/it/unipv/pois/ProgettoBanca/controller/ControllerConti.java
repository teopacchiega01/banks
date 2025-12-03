package it.unipv.pois.ProgettoBanca.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.pois.ProgettoBanca.model.Banca;
import it.unipv.pois.ProgettoBanca.model.Conti.Conto;
import it.unipv.pois.ProgettoBanca.model.operazioniconti.BankAccContext;
import it.unipv.pois.ProgettoBanca.view.frameconti.BankAccFrame;

public class ControllerConti {

	private Banca banca;
	private BankAccFrame af;
	private Conto c;
	//private ControllerObserver c;
	
	

	public ControllerConti(BankAccFrame af) {
		super();
		this.af = af;
		addListeners();
//		c = new ControllerObserver();
	}
	
	

	public ControllerConti(Banca banca, BankAccFrame af,Conto c) {
		super();
		this.banca = banca;
		this.af = af;
		this.c = c;
		
		addListeners();
		//c = new ControllerObserver();
	}
	
	public void addListeners() {
		
		af.getAccOptions().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				
				String scelta = af.getAccComboBoxOption();
				double cifra = af.getCifraAcc();
				
				BankAccContext b = new BankAccContext(c, cifra, scelta);
				b.eseguiOperazioneBancaria();
				
				
				
//				switch(scelta) {
//				case"Deposito":
//					double cifra = af.getCifraAcc();
//					c.deposito(cifra);
//					af.setResultAcc("Cifra depositata:" +cifra+ "Nuovo Saldo: "+c.getSaldo());
//					
//					break;
//				
//				}
//					
					
					
			}
				
				
			
		});
		
		
		
		
		
		
	}
}
