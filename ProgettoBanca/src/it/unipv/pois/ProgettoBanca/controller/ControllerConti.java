package it.unipv.pois.ProgettoBanca.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.pois.ProgettoBanca.model.Banca;
import it.unipv.pois.ProgettoBanca.view.BankAccFrame;

public class ControllerConti {

	private Banca banca;
	private BankAccFrame af;
	private ControllerObserver c;
	
	

	public ControllerConti(BankAccFrame af) {
		super();
		this.af = af;
		addListeners();
		c = new ControllerObserver();
	}

	public ControllerConti(Banca banca, BankAccFrame af) {
		super();
		this.banca = banca;
		this.af = af;
		addListeners();
		c = new ControllerObserver();
	}
	
	public void addListeners() {
		
		af.getAccOptions().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				
				
				
				if(af.getAccComboBoxOption().equals("Deposito")) {
					
					
					
				}
				
				
			}
		});
		
		
		
		
		
		
	}
}
