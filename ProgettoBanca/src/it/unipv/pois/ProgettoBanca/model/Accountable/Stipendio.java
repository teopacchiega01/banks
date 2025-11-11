package it.unipv.pois.ProgettoBanca.model.Accountable;

public class Stipendio implements Accountable {
	private double importo;
	private int n_mensilita;

	public Stipendio(double importo, int n_mensilita) {
		super();
		this.importo = importo;
		this.n_mensilita = n_mensilita;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public int getN_mensilita() {
		return n_mensilita;
	}

	public void setN_mensilita(int n_mensilita) {
		this.n_mensilita = n_mensilita;
	}

	@Override
	public boolean eseguiOperazione() {
		// TODO Auto-generated method stub
		return false;
	}

}
