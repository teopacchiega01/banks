package it.unipv.pois.ProgettoBanca.model.Conti;

import java.util.ArrayList;

import it.unipv.pois.ProgettoBanca.model.Accountable.Accountable;

public class ContoCorrente extends Conto {

	public ContoCorrente(Persona proprietario, ArrayList<Accountable> acc) {
		super(proprietario, acc);
		// TODO Auto-generated constructor stub
	}

	public ContoCorrente(Persona proprietario) {
		super(proprietario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deposito(double somma) {
		// TODO Auto-generated method stub
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

	@Override
	public boolean prelievo(double somma) {
		// TODO Auto-generated method stub
		try {
			if (somma > 0 && getSaldo() >= somma) {
				setSaldo(getSaldo() - somma);
				System.out.println("Prelievo riuscito: +" + somma + "€; nuovo saldo: " + getSaldo());
				return true;
			} else if (somma > 0) {
				System.err.println("Impossibile prelevare " + somma + "€; saldo insufficiente - saldo disponibile: "
						+ getSaldo() + "€");
				return false;
			} else {
				System.err.println("Impossibile prelevare una somma nulla o negativa");
				return false;
			}
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.err.println("Impossibile completare l'operazione\n Dettagli: " + e.getMessage());
			return false;
		}
	}

	@Override
	public void stampaDettagli() {
		// TODO Auto-generated method stub
		System.out.println("Proprietario: " + getProprietario().getNome() + " " + getProprietario().getCognome()
				+ ";\nIBAN:" + getIban() + "\nSaldo: " + getSaldo() + "€");
	}

	@Override
	public void aggiungiAccountable(Accountable nuovo_accountable) {
		// TODO Auto-generated method stub
		getAcc().add(nuovo_accountable);
	}

	@Override
	public boolean bonifico(Conto destinatario, double importo) {
		// TODO Auto-generated method stub
		return false;
	}
}
