package it.unipv.pois.ProgettoBanca.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import it.unipv.pois.ProgettoBanca.model.Banca;
import it.unipv.pois.ProgettoBanca.view.MainFrame;

public class Controller {
	private Banca banca;
	private MainFrame mf;
	
	public Controller(Banca banca, MainFrame mf) {
		super();
		this.banca = banca;
		this.mf = mf;
	}
	
//	private void addListeners() {
//		
//		mf.getWpOption_list().addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String item_selezionato = (String)( (JComboBox<?>)e.getSource() ).getSelectedItem();
//				System.out.println("Hai selezionato: "+item_selezionato);
//			}
//		});
//		
//	}
	
}
