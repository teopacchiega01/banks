package it.unipv.pois.ProgettoBanca.model.Conti;

import java.util.ArrayList;

import it.unipv.pois.ProgettoBanca.model.Accountable.Accountable;

public class ContoCorrente extends Conto {

	public ContoCorrente(Persona titolare, ArrayList<Accountable> acc) {
		super(titolare, acc);
		// TODO Auto-generated constructor stub
	}

	public ContoCorrente(Persona titolare) {
		super(titolare);
		// TODO Auto-generated constructor stub
	}
	
	public ContoCorrente() {
		super();
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
	public String getTipoConto() {
		// TODO Auto-generated method stub
		return "Conto Corrente";
	}

}
