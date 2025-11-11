package it.unipv.pois.ProgettoBanca.view;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountOps extends JPanel {

	private JLabel istr;
	private JLabel result;
	private JTextField iban;
	private JTextField cf;
	private JComboBox<String> bankacc_list;
	private final String[] DEFAULT_OPTIONS = { "Conto Corrente", "Conto Deposito", "Conto Web",
			"Mostra totale dei saldi" };

	public BankAccountOps() {
		super();
		istr = new JLabel("Inserisci i tuoi dati e scegli a quale conto vuoi accedere");
		result = new JLabel();
		iban = new JTextField("IBAN");
		cf = new JTextField("Codice Fiscale");
		bankacc_list = new JComboBox<>(DEFAULT_OPTIONS);

		JPanel usr_insert_options = new JPanel();
		usr_insert_options.add(iban);
		usr_insert_options.add(cf);

		JPanel inf = new JPanel();
		inf.add(istr);
		inf.add(result);

		setLayout(new BorderLayout());
		add(inf, BorderLayout.NORTH);
		add(usr_insert_options, BorderLayout.CENTER);
		add(bankacc_list, BorderLayout.SOUTH);

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

	public JComboBox<String> getBankacc_list() {
		return bankacc_list;
	}

	public void setBankacc_list(JComboBox<String> bankacc_list) {
		this.bankacc_list = bankacc_list;
	}

}
