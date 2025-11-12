package it.unipv.pois.ProgettoBanca.model;

import java.util.ArrayList;

import it.unipv.pois.ProgettoBanca.model.Conti.Conto;

public class Banca {
	private String nome;
	private ArrayList<Conto> conti;

	public Banca(String nome, ArrayList<Conto> conti) {
		super();
		this.nome = nome;
		this.conti = conti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Conto> getC() {
		return conti;
	}

	public void setC(ArrayList<Conto> conti) {
		this.conti = conti;
	}

	public double getTotaleSaldi() {
		double totale_saldi = 0;
		for(Conto c : conti) {
			totale_saldi += c.getSaldo();
		}
		return totale_saldi;
	}
	
	public Conto getContoFromIban(String iban) {
		Conto ret = null;
		try {
			for(Conto appoggio : conti) {
				if(appoggio.getIban().equals(iban)) {
					ret = appoggio;
				}
			}
			return ret;
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("ERRORE! Inserire una stringa come IBAN; dettagli: "+e.getMessage());
			return ret;
		}
	}
	
	public void stampaDettagliTutti() {
		for (Conto c : conti) {
			System.out.println("Titolare: " + c.getTitolare() + "\n" + "iban: " + c.getIban() + "\n" + "Saldo: "
					+ c.getSaldo() + "\n");
		}
	}
	
	public void stampaDettagliConto(Conto c) {
		c.stampaDettagli();
	}

	public void aggiungiConto(Conto c) {
		conti.add(c);
	}
		
//	public void aggiungiConto(String nome_titolare, String cognome_titolare) {
//		conti.add();
//	}

	public boolean operazioniAccountable() {
		// gestisce gli accountable
		boolean appoggio = true;
		for(Conto appoggio_c: conti) {
			appoggio = appoggio_c.aggiornaConto();
		}
		if(appoggio) {
			System.out.println("Tutte le operazioni sono andate a buon fine");
		}else {
			System.out.println("Alcune operazioni sono fallite");
		}
		return appoggio;
	}

}
