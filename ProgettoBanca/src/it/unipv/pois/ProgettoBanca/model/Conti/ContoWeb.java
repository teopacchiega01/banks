package it.unipv.pois.ProgettoBanca.model.Conti;

import java.util.ArrayList;

import javax.sound.midi.SysexMessage;

import it.unipv.pois.ProgettoBanca.model.Accountable.Accountable;

public class ContoWeb extends ContoCorrente {
	String pw;
	boolean account_abilitato;

	public ContoWeb(Persona proprietario, ArrayList<Accountable> acc, String pw) {
		super(proprietario, acc);
		this.pw = pw;
		this.account_abilitato = true;
	}

	public ContoWeb(Persona proprietario, String pw) {
		super(proprietario);
		this.pw = pw;
		this.account_abilitato = true;
	}

	public ContoWeb(Persona proprietario) {
		super(proprietario);
		this.pw = "changeme";
		this.account_abilitato = false;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public boolean isAccount_abilitato() {
		return account_abilitato;
	}

	public void setAccount_abilitato(boolean account_abilitato) {
		this.account_abilitato = account_abilitato;
	}

	public boolean login(String pw_inserita) {
		try {
			if (account_abilitato && pw.equals(pw_inserita)) {
				System.out.println("Login effettuato");
				return true;
			} else if (account_abilitato) {
				System.out.println("Password errata");
				return false;
			} else {
				System.out.println("Account non abilitato");
				return false;
			}
		} catch (IllegalArgumentException e) {
			System.err.println("Impossibile effettuare l'operazione; dettagli: " + e.getMessage());
			return false;
		}
	}

	public boolean cambiaPassword(String vecchia_pw, String nuova_pv) {
		try {
			if (pw.equals(vecchia_pw)) {
				setPw(nuova_pv);
				System.out.println("Password cambiata");
				return true;
			} else {
				System.out.println("Password errata");
				return false;
			}
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.err.println("Impossibile effettuare l'operazione; dettagli: " + e.getMessage());
			return false;
		}
	}


	public boolean abilitaAccount(String nuova_pw) {
		try {
			if(!account_abilitato) {
				if(nuova_pw.equals("changeme")) {
					System.out.println("La password deve essere diversa da quella di default");
					return false;
				}else {
					System.out.println("Account abilitato");
					setPw(nuova_pw);
					account_abilitato = true;
					return true;
				}
			}else {
				System.out.println("L'account è già abilitato");
				return false;
			}
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.err.println("Impossibile abilitare l'account; dettagli: "+e.getMessage());
			return false;
		}
	}



}
