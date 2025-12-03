package it.unipv.pois.ProgettoBanca.view.accountableframe;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SalaryPanel extends JPanel {

	private JLabel istr;
	private JLabel result;
	private JTextField nome;
	private JTextField importo;
	private JButton aggiungi;
	private JButton rimuovi;

	public SalaryPanel() {
		super();
		istr = new JLabel("Inserisci importo e nome stipendio");
		result = new JLabel();
		nome = new JTextField("Inserisci il nome che identifica il tuo stipendio");
		importo = new JTextField("Inserisci la cifra del tuo stipendio");
		aggiungi = new JButton("inserisci stipendio");
		rimuovi = new JButton("rimuovi stipendio");

		JPanel buttons = new JPanel();
		buttons.add(aggiungi);
		buttons.add(rimuovi);

		JPanel informations = new JPanel();
		informations.add(nome);
		informations.add(importo);

		setLayout(new BorderLayout());
		add(istr, BorderLayout.NORTH);
		add(buttons, BorderLayout.SOUTH);
		add(informations, BorderLayout.CENTER);

	}

	public String getSalaryName() {

		return nome.getText();

	}

	public double getImportoStipendio() {

		try {
			double imp;
			imp = Double.parseDouble(importo.getText());
			return imp;

		} catch (NumberFormatException n) {
			// TODO: handle exception
			n.getStackTrace();
			System.out.println("dato inserito errato");
			return 1;

		}

	}

	public void setResult(String s) {

		result.setText(s);

	}

	public JLabel getIstr() {
		return istr;
	}

	public void setIstr(JLabel istr) {
		this.istr = istr;
	}

	public JLabel getResult() {
		return result;
	}

	public void setResult(JLabel result) {
		this.result = result;
	}

	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public JTextField getImporto() {
		return importo;
	}

	public void setImporto(JTextField importo) {
		this.importo = importo;
	}

	public JButton getAggiungi() {
		return aggiungi;
	}

	public void setAggiungi(JButton aggiungi) {
		this.aggiungi = aggiungi;
	}

	public JButton getRimuovi() {
		return rimuovi;
	}

	public void setRimuovi(JButton rimuovi) {
		this.rimuovi = rimuovi;
	}

}
