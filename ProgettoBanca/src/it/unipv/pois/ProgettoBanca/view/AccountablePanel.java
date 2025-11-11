package it.unipv.pois.ProgettoBanca.view;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AccountablePanel extends JPanel {

	private JLabel istr;
	private JComboBox<String> options;
	private final String[] DEFAULT_OPTIONS = { "Stipendio", "Abbonamento" };

	public AccountablePanel() {
		super();
		istr = new JLabel("Seleziona che tipo di abbonamento/accredito intendi aggiungere");
		options = new JComboBox<String>(DEFAULT_OPTIONS);

		setLayout(new BorderLayout());
		add(istr, BorderLayout.NORTH);
		add(options, BorderLayout.CENTER);

	}

	public JLabel getIstr() {
		return istr;
	}

	public void setIstr(JLabel istr) {
		this.istr = istr;
	}

	public JComboBox<String> getOptions() {
		return options;
	}

	public void setOptions(JComboBox<String> options) {
		this.options = options;
	}

	public String[] getDEFAULT_OPTIONS() {
		return DEFAULT_OPTIONS;
	}

}
