package it.unipv.pois.ProgettoBanca.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.pois.ProgettoBanca.model.Banca;
import it.unipv.pois.ProgettoBanca.view.BankAccFrame;
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
		
		mf.getConfermaButtonBankOps().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String user_iban = mf.getBankAccUserIban();
				String user_cf = mf.getBankAccUserCF();
				BankAccFrame frame_conti = mf.createNewBankAcc();
				
				System.out.println(user_iban);
				
				//Per accedere al conto corretto c'è da trovare il conto dell'utente 
				//serve un metodo in banca che ti ritorna il conto dato i ban. 
				
				String tipo_conto = banca.getTipoContoDaIban(user_iban);
				if(tipo_conto.equals( "Conto Web")) {
					mf.setVisible(false);
					frame_conti.setContentPane(frame_conti.getWap());
					frame_conti.setVisible(true);
				}else if(tipo_conto.equals("Conto Deposito")) {
					mf.setVisible(false);
					frame_conti.setContentPane(frame_conti.getDbp());
					frame_conti.setVisible(true);

				}else if(tipo_conto.equals("Conto Corrente")) {
					mf.setVisible(false);
					frame_conti.setContentPane(frame_conti.getAp());
					frame_conti.setVisible(true);

				}else {
					System.out.println("Iban non associato a nessun conto: creare il conto prima di fare delle operazioni");
				}
				
				
			}
		});
		
//		mf.getBankaccList().addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//				mf.getUsersNome();
//				mf.getBankAccUserCF();
//				mf.getSurname();
//				
//				if(mf.getOptionSelectedAddBankAcc().equals("Conto Corrente")) {
//					
//					
//					
//				}else if(mf.getOptionSelectedAddBankAcc().equals("Conto Deposito")) {
//					
//					
//					
//				}else if(mf.getOptionSelectedAddBankAcc().equals("Conto Web")){
//					
//					
//				}
//				
//			}
//		});
		
	}
	
}
