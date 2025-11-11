package it.unipv.pois.ProgettoBanca.model;

import java.util.ArrayList;

import it.unipv.pois.ProgettoBanca.model.Conti.Conto;

public class Banca {
	private String nome;
	private String paese;
	private ArrayList<Conto> conti;

	public Banca(String nome, String paese, ArrayList<Conto> conti) {
		super();
		this.nome = nome;
		this.paese = paese;
		this.conti = conti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPaese() {
		return paese;
	}

	public void setPaese(String paese) {
		this.paese = paese;
	}

	public ArrayList<Conto> getC() {
		return conti;
	}

	public void setC(ArrayList<Conto> conti) {
		this.conti = conti;
	}

	public double getTotaleSaldi() {
		return 0;
	}

	public void stampaDettagli(Conto c) {

		for (int i = 0; i < conti.size(); i++) { // METTI IL FOR EACH RICCHIONE
			System.out.println("Titolare: " + c.getProprietario() + "\n" + "iban: " + c.getIban() + "\n" + "Saldo: "
					+ c.getSaldo() + "\n");
		}

	}

	void aggiungiConto(Conto c) {

		conti.add(c);

	}

	public void operazioneMensile() {
		// gestisce gli accountable
	}

}
