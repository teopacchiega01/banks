package it.unipv.pois.ProgettoBanca.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddBankAccountPanel extends JPanel {
	private JLabel user_istructions;
	private JComboBox<String> bankacc_list;
	private final String[] DEFAULT_OPTIONS = { "Conto Corrente", "Conto Deposito", "Conto Web" };
	private JTextField nome;
	private JTextField cognome;
	private JTextField cf;
	private JButton conferma_inserimento;
	private JButton to_conto;
	private JLabel result;

	public AddBankAccountPanel() {
		super();
		user_istructions = new JLabel("Seleziona il tipo di conto che vuoi aggiungere e inserisci i tuoi dati ");
		result = new JLabel();
		bankacc_list = new JComboBox<>(DEFAULT_OPTIONS);
		nome = new JTextField("nome");
		cognome = new JTextField("cognome");
		cf = new JTextField("codice fiscale");
		to_conto = new JButton("Vai ai cointi");
		conferma_inserimento = new JButton("conferma dati inseriti");

		JPanel user_insert = new JPanel();
		JPanel button_panel = new JPanel();
		JPanel inf = new JPanel();

		user_insert.add(nome);
		user_insert.add(cognome);
		user_insert.add(cf);
		user_insert.add(bankacc_list);
		button_panel.add(conferma_inserimento);
		button_panel.add(to_conto);
		inf.add(user_istructions);
		inf.add(result);

		setLayout(new BorderLayout());
		add(inf, BorderLayout.NORTH);
		add(user_insert, BorderLayout.CENTER);
		add(button_panel, BorderLayout.SOUTH);

	}

	public void setResult(String s) {
		result.setText(s);
	}

	public String getUsersName() {

		return nome.getText();
	}

	public String getSurname() {

		return cognome.getText();
	}

	public String getCodiceF() {

		return cf.getText();
	}

	public JLabel getUser_istructions() {
		return user_istructions;
	}

	public void setUser_istructions(JLabel user_istructions) {
		this.user_istructions = user_istructions;
	}

	public JComboBox<String> getBankacc_list() {
		return bankacc_list;
	}

	public void setBankacc_list(JComboBox<String> bankacc_list) {
		this.bankacc_list = bankacc_list;
	}

	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public JTextField getCognome() {
		return cognome;
	}

	public void setCognome(JTextField cognome) {
		this.cognome = cognome;
	}

	public JTextField getCf() {
		return cf;
	}

	public void setCf(JTextField cf) {
		this.cf = cf;
	}

	public JButton getConferma_inserimento() {
		return conferma_inserimento;
	}

	public void setConferma_inserimento(JButton conferma_inserimento) {
		this.conferma_inserimento = conferma_inserimento;
	}

	public JButton getTo_conto() {
		return to_conto;
	}

	public void setTo_conto(JButton to_conto) {
		this.to_conto = to_conto;
	}

//	public String[] getDEFAULT_OPTIONS() {
//		return DEFAULT_OPTIONS;
//	}

}
