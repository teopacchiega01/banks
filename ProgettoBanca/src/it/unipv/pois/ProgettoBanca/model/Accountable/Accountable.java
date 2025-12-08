package it.unipv.pois.ProgettoBanca.model.Accountable;

public interface Accountable {
	//Questo metodo deve ritornare il valore da aggiungere/rimuovere dal conto:
	// - accredito = ritornerà un valore positivo
	// - addebito = ritornerà un valore negativo
	public double eseguiAccountable();
	public String getNomeAccountable();
}
