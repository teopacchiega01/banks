package it.unipv.pois.ProgettoBanca.view.accountableframe;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import it.unipv.pois.ProgettoBanca.view.PropertyReader;

public class AccountablePanel extends JPanel {

	private JLabel istr;
	private JComboBox<String> options;
	//private final String[] DEFAULT_OPTIONS = { "Stipendio", "Abbonamento" };
	private PropertyReader p;
	private JButton back_to_bankacc;

	public AccountablePanel() {
		super();
		istr = new JLabel("Seleziona che tipo di abbonamento/accredito intendi aggiungere");
		
		p = new PropertyReader("properties/config");
		options = new JComboBox<String>(p.getPropertyValueAsStringVec(",","accountable_names"));
		back_to_bankacc = new JButton("Torna al tuo conto");
		

		setLayout(new BorderLayout());
		add(istr, BorderLayout.NORTH);
		add(options, BorderLayout.CENTER);
		add(back_to_bankacc,BorderLayout.SOUTH);

	}
	public JButton getBackBankAccButton() {
		return back_to_bankacc;
	}
	
	public String getComboBoxOption() {
		return (String) options.getSelectedItem();
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
