package it.unipv.pois.ProgettoBanca.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

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
		addListeners();
	}
	
	//trovare un modo per la rimozione più efficiente dei pannelli
	
	private void addListeners() {
		
		mf.getWpOption_list().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String item =mf.getOptionSelectedWp();
				if(item.equals("Aggiungi Conto")) {
					System.out.println("adad");
					mf.getContentPane().removeAll();

					mf.setContentPane(mf.getAdd_bank_panel());
					mf.revalidate();
					mf.repaint();

				}else if(item.equals("Operazioni su un Conto")) {
					mf.getContentPane().removeAll();
					mf.setContentPane(mf.getBank_ops());
					mf.revalidate();
					mf.repaint();
				}else {
					mf.dispose();
				}
				
				System.out.println("Hai selezionato: "+mf.getOptionSelectedWp());
			}
		});
		
		mf.getBankAccOption_list().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String item_selected = mf.getOpionSelecterdBankOps();
				String user_iban = mf.getBankAccUserCF();
				String user_cf = mf.getBankAccUserCF();
				
				//Per accedere al conto corretto c'è da trovare il conto dell'utente 
				//serve un metodo in banca che ti ritorna il conto dato i ban. 
				
				if((item_selected.equals("Conto Corrente"))) {
					
					
				}
				
			}
		});
		
	}
	
}
