package it.unipv.pois.ProgettoBanca.model.Conti;

import java.util.ArrayList;

import it.unipv.pois.ProgettoBanca.model.Accountable.Accountable;

public class ContoDeposito extends Conto {
	public ContoDeposito(Persona proprietario, double saldo, ArrayList<Accountable> acc) {
		super(proprietario, saldo, acc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deposito(double somma) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean prelievo(double somma) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void stampaDettagli() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aggiungiAccountable() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean bonifico() {
		// TODO Auto-generated method stub
		return false;
	}
}
