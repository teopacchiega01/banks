package it.unipv.pois.ProgettoBanca.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.pois.ProgettoBanca.model.Banca;
import it.unipv.pois.ProgettoBanca.model.Accountable.Abbonamento;
import it.unipv.pois.ProgettoBanca.model.Accountable.Accountable;
import it.unipv.pois.ProgettoBanca.model.Accountable.Stipendio;
import it.unipv.pois.ProgettoBanca.model.Conti.Conto;
import it.unipv.pois.ProgettoBanca.view.accountableframe.AccountableFrame;
import it.unipv.pois.ProgettoBanca.view.frameconti.BankAccFrame;

public class ControllerAccountable {
	
	private Conto c;
	private Banca banca; 
	private AccountableFrame acc;
	private String scelta;
	private BankAccFrame frame_conti;
	
	public ControllerAccountable(Conto c, Banca banca, AccountableFrame acc,BankAccFrame bf) {
		super();
		this.c = c;
		this.banca = banca;
		this.acc = acc;
		this.frame_conti = bf;
		addListeners();
	} 
	
	public void addListeners() {
		
		acc.getAccOptions().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				scelta = acc.getAccountablePanelOption();
				acc.changePanelByChoice(scelta);
				
				
			}
		});
		
		acc.getAddSalaryButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double importo = acc.getImportSalary();
				String nome_stipendio = acc.getSalaryName();
				Accountable a = c.creaAccountable(scelta, nome_stipendio);
				if(a!=null) {
					Stipendio s = (Stipendio) a;
					s.setImporto(importo);
					s.setNome(nome_stipendio);
					c.aggiungiAccountable(s);
					
					//prova
					banca.operazioniAccountable();
					
				}
				
				
				
				
			}
		});
		
		
		acc.getRemoveSalaryButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nome_stipendio = acc.getSalaryName();
				c.rimuoviAccDaNome(nome_stipendio);
				
				
				
				
			}
		});
		
		acc.getAddSubscitpionButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double importo= acc.getImportSubscription();
				String nome_abbonamento = acc.getSubsriptionName();
				Accountable a = c.creaAccountable(scelta, nome_abbonamento);
				if(a!=null) {
					Abbonamento abb = (Abbonamento) a;
					abb.setImporto(importo);
					abb.setPiattaforma(nome_abbonamento);
					c.aggiungiAccountable(abb);
					
					//prova
					banca.operazioniAccountable();
					
				}
				
				
				
				
			}
		});
		
		acc.getRemoveSubscitpionButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nome_abbonamento = acc.getSubsriptionName();
				c.rimuoviAccDaNome(nome_abbonamento);
				
				//prova
				banca.operazioniAccountable();
			}
		});
		
		
		
		acc.getBackButtonFromSalary().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				acc.setContentPane(acc.getAccountablePanel());
				
				
			}
		});
		
		acc.getBackButtonFromSub().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				acc.setContentPane(acc.getAccountablePanel());
			}
		});
		
		
		acc.getBackToBankAcc().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				acc.setVisible(false);
				frame_conti.setVisible(true);
				
				
				
			}
		});
		
		
	}
	
	
	

}
