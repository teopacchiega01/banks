package it.unipv.pois.ProgettoBanca.model.Conti;

import java.util.ArrayList;

import it.unipv.pois.ProgettoBanca.model.Accountable.Accountable;

public class ContoDeposito extends Conto {

	public ContoDeposito(Persona proprietario, ArrayList<Accountable> acc) {
		super(proprietario, acc);
	}

	public ContoDeposito(Persona titolare) {
		super(titolare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean prelievo(double somma) {
		throw new UnsupportedOperationException("Impossibile effettuare un prelievo in un conto deposito");
	}

	@Override
	public String getTipoConto() {
		// TODO Auto-generated method stub
		return "Conto Deposito";
	}
	
}
