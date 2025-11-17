package it.unipv.pois.ProgettoBanca.controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import it.unipv.pois.ProgettoBanca.view.BankAccFrame;

public class ControllerObserver implements PropertyChangeListener{

	public ControllerObserver() {
		super();
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
		if(evt.getPropertyName().equals("CambioFinestra")) {
			
			JFrame f1 = (JFrame) evt.getOldValue();			
			BankAccFrame f2 = (BankAccFrame) evt.getNewValue();
			
			f1.setVisible(false);
			f2.setVisible(true);
			
			ControllerConti c = new ControllerConti(f2);
		
		}
		
	}
	
	/*
	 * Implementare una controller factory che dato un nome di una property restituisce il tipo di frame
	 * da restituire
	 * 
	 * */

}

