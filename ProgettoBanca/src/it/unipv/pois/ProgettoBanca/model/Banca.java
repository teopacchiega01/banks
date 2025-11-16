package it.unipv.pois.ProgettoBanca.model;

import java.util.ArrayList;

import it.unipv.pois.ProgettoBanca.model.Conti.ContiFactory;
import it.unipv.pois.ProgettoBanca.model.Conti.Conto;
import it.unipv.pois.ProgettoBanca.model.Conti.EnumConti;
import it.unipv.pois.ProgettoBanca.model.Conti.Persona;

public class Banca {
	private String nome;
	private ArrayList<Conto> conti;
	private ArrayList<Persona> clienti;
	private ContiFactory conti_factory;

	public Banca(String nome, ArrayList<Conto> conti, ArrayList<Persona> clienti) {
		super();
		this.nome = nome;
		this.conti = conti;
		this.clienti = clienti;
		this.conti_factory = new ContiFactory();
	}
	
	public Banca(String nome) {
		super();
		this.nome = nome;
		this.conti = new ArrayList<Conto>();
		this.clienti = new ArrayList<Persona>();
		this.conti_factory = new ContiFactory();
	}

	public ArrayList<Persona> getClienti() {
		return clienti;
	}

	public void setClienti(ArrayList<Persona> clienti) {
		this.clienti = clienti;
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

	public void creaConto(String tipo_conto, String cf, String nome, String cognome) {
		String cf_cliente;
		Conto appoggio;
		boolean cliente_trovato = false;
		for(Persona cliente : clienti) {
			cf_cliente = cliente.getCf();
			if(cf_cliente.equals(cf)) {
				appoggio = conti_factory.getConto(contoEnumToString(tipo_conto));
				appoggio.setTitolare(cliente);
				conti.add(appoggio);
				cliente_trovato = true;
			}
		}
		if(!cliente_trovato) {
			Persona cliente = new Persona(nome, cognome, cf) ;
			clienti.add(cliente);
			appoggio = conti_factory.getConto(contoEnumToString(tipo_conto));
			appoggio.setTitolare(cliente);
			conti.add(appoggio);
		}
	}

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


	public String getTipoContoDaIban(String iban){
		Conto app;
		app = getContoFromIban(iban);
		return app.getTipoConto();		
	}

	public void aggiungiCliente(String nome, String cognome, String cf) {
		clienti.add(new Persona(nome, cognome, cf));
	}

	public void aggiungiCliente(String nome, String cognome) {
		clienti.add(new Persona(nome, cognome));
	}

	private EnumConti contoEnumToString(String tipo_conto) {
		switch(tipo_conto) {
		case "Conto Corrente":
			return EnumConti.CONTO_CORRENTE;
		case "Conto web":
			return EnumConti.CONTO_WEB;
		case "Conto Deposito":
			return EnumConti.CONTO_DEPOSITO;
		default:
			System.err.println("Impossibile trovare un conto del tipo selezionato");
			return null;
		}
	}

}
