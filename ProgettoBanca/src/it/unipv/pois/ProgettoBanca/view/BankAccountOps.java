package it.unipv.pois.ProgettoBanca.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountOps extends JPanel {

	private JLabel istr;
	private JLabel result;
	private JTextField iban;
	private JTextField cf;
	private JButton conferma; 

	public BankAccountOps() {
		super();
		istr = new JLabel("Inserisci i tuoi dati e scegli a quale conto vuoi accedere");
		result = new JLabel("addaa");
		iban = new JTextField("IBAN");
		cf = new JTextField("Codice Fiscale");
		conferma = new JButton("Vai al tuo conto");

		JPanel usr_insert_options = new JPanel();
		usr_insert_options.add(iban);
		usr_insert_options.add(cf);

		JPanel inf = new JPanel();
		inf.add(istr);
		inf.add(result);

		setLayout(new BorderLayout());
		add(inf, BorderLayout.NORTH);
		add(usr_insert_options, BorderLayout.CENTER);
		add(conferma, BorderLayout.SOUTH);

	}
	
	
	public JLabel getResult() {
		return result;
	}


	public void setResult(JLabel result) {
		this.result = result;
	}


	public JButton getConferma() {
		return conferma;
	}


	public void setConferma(JButton conferma) {
		this.conferma = conferma;
	}


	public void setResult(String s) {
		result.setText(s);
	}

	public String getUserIban() {
		return iban.getText();
	}

	public String getUserCF() {
		return cf.getText();
	}

	public JLabel getIstr() {
		return istr;
	}

	public void setIstr(JLabel istr) {
		this.istr = istr;
	}

	public JTextField getIban() {
		return iban;
	}

	public void setIban(JTextField iban) {
		this.iban = iban;
	}

	public JTextField getCf() {
		return cf;
	}

	public void setCf(JTextField cf) {
		this.cf = cf;
	}



}
