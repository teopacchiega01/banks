package it.unipv.pois.ProgettoBanca.view.accountableframe;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SubscriptionPanel extends JPanel {

	private JTextField data_inizio;
	private JTextField durata;
	private JTextField importo;
	private JTextField nome_sub;
	private JLabel result;
	private JLabel istr;
	private JButton aggiungi;
	private JButton rimuovi;

	public SubscriptionPanel() {
		super();
		istr = new JLabel("Inserisci importo e nome dell'abbonamento");
		result = new JLabel();
		nome_sub = new JTextField("Inserisci il nome che identifica il tuo abbonamento");
		importo = new JTextField("Inserisci la cifra del tuo abbonamento");
		data_inizio = new JTextField("Inserisci la data di inzio");
		durata = new JTextField("Inserisci la durata del tuo abbonamento");

		aggiungi = new JButton("inserisci stipendio");
		rimuovi = new JButton("rimuovi stipendio");

		JPanel insert = new JPanel();
		insert.add(nome_sub);
		insert.add(importo);
		insert.add(data_inizio);
		insert.add(durata);

		JPanel informations = new JPanel();
		informations.add(istr);
		informations.add(result);

		JPanel buttons = new JPanel();
		buttons.add(aggiungi);
		buttons.add(rimuovi);

		setLayout(new BorderLayout());

		add(insert, BorderLayout.CENTER);
		add(informations, BorderLayout.NORTH);
		add(buttons, BorderLayout.SOUTH);

	}

	public void setResultLabel(String s) {
		result.setText(s);
	}

	public double getImportoVal() {
		try {
			double importo_sub = Double.parseDouble(importo.getText());
			return importo_sub;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.getStackTrace();
			return 1;
		}
	}

	public Integer getDurataVal() {
		try {
			int durata_sub = Integer.parseInt(durata.getText());
			return durata_sub;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.getStackTrace();
			return 1;
		}
	}

	public String getDataInizio() {
		return data_inizio.getText();
	}

	public String getNomeSub() {
		return nome_sub.getText();
	}

	public JTextField getData_inizio() {
		return data_inizio;
	}

	public void setData_inizio(JTextField data_inizio) {
		this.data_inizio = data_inizio;
	}

	public JTextField getDurata() {
		return durata;
	}

	public void setDurata(JTextField durata) {
		this.durata = durata;
	}

	public JTextField getImporto() {
		return importo;
	}

	public void setImporto(JTextField importo) {
		this.importo = importo;
	}

	public JTextField getNome_sub() {
		return nome_sub;
	}

	public void setNome_sub(JTextField nome_sub) {
		this.nome_sub = nome_sub;
	}

	public JLabel getResult() {
		return result;
	}

	public void setResult(JLabel result) {
		this.result = result;
	}

	public JLabel getIstr() {
		return istr;
	}

	public void setIstr(JLabel istr) {
		this.istr = istr;
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
