package it.unipv.pois.ProgettoBanca.model.Conti;

public class Persona {
	private String cf;
	private String nome;
	private String cognome;

	public Persona(String nome, String cognome) {
		super();
		this.cf = generaCF();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Persona(String nome, String cognome, String cf) {
		super();
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	private String generaCF() {
		return nome+cognome+((int)Math.random()*100);
	}
}
