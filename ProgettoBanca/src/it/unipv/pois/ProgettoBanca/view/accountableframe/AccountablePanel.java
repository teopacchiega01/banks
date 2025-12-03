package it.unipv.pois.ProgettoBanca.view.accountableframe;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import it.unipv.pois.ProgettoBanca.view.PropertyReader;

public class AccountablePanel extends JPanel {

	private JLabel istr;
	private JComboBox<String> options;
	//private final String[] DEFAULT_OPTIONS = { "Stipendio", "Abbonamento" };
	private PropertyReader p;

	public AccountablePanel() {
		super();
		istr = new JLabel("Seleziona che tipo di abbonamento/accredito intendi aggiungere");
		
		p = new PropertyReader("properties/config");
		options = new JComboBox<String>(p.getPropertyValueAsStringVec(",","accountable_names"));
		

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

//	public String[] getDEFAULT_OPTIONS() {
//		return DEFAULT_OPTIONS;
//	}

}
