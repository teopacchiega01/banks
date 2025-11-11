package it.unipv.pois.ProgettoBanca.model.Conti;

import java.util.ArrayList;

import it.unipv.pois.ProgettoBanca.model.Accountable.Accountable;

public abstract class Conto {
	private Persona proprietario;
	private String iban;
	private double saldo;
	private ArrayList<Accountable> acc;

	public Conto(Persona proprietario, ArrayList<Accountable> acc) {
		super();
		this.proprietario = proprietario;
		this.iban = generaIban();
		this.saldo = 0;
		this.acc = acc;
	}

	public Conto(Persona proprietario) {
		super();
		this.proprietario = proprietario;
		this.iban = generaIban();
		this.saldo = 0;
		this.acc = new ArrayList<Accountable>();
	}

	public Persona getProprietario() {
		return proprietario;
	}

	public void setProprietario(Persona proprietario) {
		this.proprietario = proprietario;
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

	public abstract boolean deposito(double somma);

	public abstract boolean prelievo(double somma);

	public abstract void stampaDettagli();

	public abstract void aggiungiAccountable(Accountable nuovo_accountable);

	public abstract boolean bonifico(Conto destinatario, double importo);

	private String generaIban() {

		// generazione casuale dell'iban
		String iban = ((int) (Math.random() * 1001) + "POSFW" + (int) (Math.random() * 1001));

		return iban;
	}

}