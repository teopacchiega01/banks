package it.unipv.pois.ProgettoBanca.view.frameconti;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.LayerUI;

import it.unipv.pois.ProgettoBanca.view.PropertyReader;

public class WebAccountPanel extends JPanel {
	
	private PropertyReader p;
	private JLabel proprietrario;
	private JLabel istr;
	private JLabel saldo;
	private JLabel result;

	private JTextField psw;
	private JTextField cifra;
	private JComboBox<String> operations;
	//private static final String[] ACC_OPERATIONS = { "Prelievo", "Deposito", "Stampa Detattagli","Aggiungi un accredito/addebito mensile", "Rimuovi un accredito/addebito mensile", "Modifica Password" };

	public WebAccountPanel() {
		super();
		istr = new JLabel("Inserisci la password e seleziona una delle opzioni");
		saldo = new JLabel();
		result = new JLabel();

		proprietrario = new JLabel();
		psw = new JTextField("inserisci la passw");
		cifra = new JTextField("inserisci una cifra da accreditare/depositare");
		
		p = new PropertyReader("properties/config");
		operations = new JComboBox<String>(p.getPropertyValueAsStringVec(",","bank_operations_web"));


		setLayout(new BorderLayout());
		JPanel data_insert = new JPanel();
		JPanel informations = new JPanel();

		data_insert.add(psw);
		data_insert.add(cifra);
		informations.add(proprietrario);
		informations.add(saldo);
		informations.add(istr);
		informations.add(result);

		add(informations, BorderLayout.NORTH);
		add(data_insert, BorderLayout.CENTER);
		add(operations, BorderLayout.SOUTH);

	}

	public void setResult(String s) {
		result.setText(s);
	}

	public String getUserPassw() {
		return psw.getText();
	}

	public double getCifraAccreditoDeposito() {

		try {
			double cifra_acc_dep;
			cifra_acc_dep = Double.parseDouble(cifra.getText());
			return cifra_acc_dep;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.getStackTrace();
			return 1;
		}

	}

	public void setLabelProprietario(String text) {
		proprietrario.setText(text);
	}

	public void setLabelSaldo(String text) {
		saldo.setText(text);
	}

	public JLabel getProprietrario() {
		return proprietrario;
	}

	public void setProprietrario(JLabel proprietrario) {
		this.proprietrario = proprietrario;
	}

	public JLabel getIstr() {
		return istr;
	}

	public void setIstr(JLabel istr) {
		this.istr = istr;
	}

	public JLabel getSaldo() {
		return saldo;
	}

	public void setSaldo(JLabel saldo) {
		this.saldo = saldo;
	}

	public JTextField getPsw() {
		return psw;
	}

	public void setPsw(JTextField psw) {
		this.psw = psw;
	}

	public JTextField getCifra() {
		return cifra;
	}

	public void setCifra(JTextField cifra) {
		this.cifra = cifra;
	}

	public JComboBox<String> getOperations() {
		return operations;
	}

	public void setOperations(JComboBox<String> operations) {
		this.operations = operations;
	}

//	public static String[] getAccOperations() {
//		return ACC_OPERATIONS;
//	}

}
