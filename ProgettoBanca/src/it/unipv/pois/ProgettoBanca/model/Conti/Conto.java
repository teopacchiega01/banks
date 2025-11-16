package it.unipv.pois.ProgettoBanca.model.Conti;

import java.util.ArrayList;

import it.unipv.pois.ProgettoBanca.model.Accountable.Accountable;

public abstract class Conto {
	private Persona titolare;
	private String iban;
	private double saldo;
	private ArrayList<Accountable> acc;

	public Conto(Persona titolare, ArrayList<Accountable> acc) {
		super();
		this.titolare = titolare;
		this.iban = generaIban();
		this.saldo = 0;
		this.acc = acc;
	}

	public Conto(Persona titolare) {
		super();
		this.titolare = titolare;
		this.iban = generaIban();
		this.saldo = 0;
		this.acc = new ArrayList<Accountable>();
	}
	
	public Conto() {
		super();
		this.titolare = null;
		this.iban = generaIban();
		this.saldo = 0;
		this.acc = new ArrayList<Accountable>();
	}
	

	public Persona getTitolare() {
		return titolare;
	}

	public void setTitolare(Persona titolare) {
		this.titolare = titolare;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Accountable> getAcc() {
		return acc;
	}

	public void setAcc(ArrayList<Accountable> acc) {
		this.acc = acc;
	}

	public boolean deposito(double somma) {
		try {
			if (somma > 0) {
				setSaldo(getSaldo() + somma);
				System.out.println("Deposito riuscito: +" + somma + "€; nuovo saldo: " + getSaldo());
				return true;
			} else {
				System.err.println("Impossibile depositare una somma nulla o negativa");
				return false;
			}
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.err.println("Impossibile completare l'operazione\n Dettagli: " + e.getMessage());
			return false;
		}
	}

	public abstract boolean prelievo(double somma);

	public void stampaDettagli() {
		// TODO Auto-generated method stub
		System.out.println("Titolare: " + getTitolare().getNome() + " " + getTitolare().getCognome()
				+ ";\nIBAN:" + getIban() + "\nSaldo: " + getSaldo() + "€");
	}
	
	public boolean aggiungiAccountable(Accountable nuovo_accountable) {
		try {
			acc.add(nuovo_accountable);
			return true;
		} catch (IllegalArgumentException e) {
			System.err.println("Impossibile aggiungere accountable; dettagli: "+e.getMessage());
			return false;
		}
	}
	
	public boolean rimuoviAccountable(Accountable accountable_da_rimuovere) {
		try {
			if(acc.remove(accountable_da_rimuovere)) {
				System.out.println("Accountable rimosso");
				return true;
			}else {
				System.out.println("Impossibile trovare l'accountable selezionato");
				return false;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Impossibile rimuovere accountable; dettagli: "+e.getMessage());
			return false;
		}
	}

	private String generaIban() {
		// generazione casuale dell'iban
		String iban = ((int) (Math.random() * 1001) + "POSFW" + (int) (Math.random() * 1001));
		return iban;
	}
	
	
	
	public boolean aggiornaConto() {
		//Esegue gli accountable del conto
		double totale_appoggio = 0;
		for(Accountable acc_appoggio : acc) {
			totale_appoggio += acc_appoggio.eseguiAccountable();
		}
		setSaldo(getSaldo()+totale_appoggio);
		System.out.println(getIban()+" operazioni mensili compiute; saldo: "+getSaldo());
		if(getSaldo()>=0) {
			return true;
		}else {
			System.out.println("Attenzione! Saldo in negativo");
			return false;
		}
	}
	
	
	public abstract String getTipoConto();
	
	
	

}