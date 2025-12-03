package it.unipv.pois.ProgettoBanca.view.mainframe;

import java.awt.BorderLayout;
import java.util.Properties;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import it.unipv.pois.ProgettoBanca.view.PropertyReader;

public class WelcomePanel extends JPanel {
	
	private PropertyReader p;
	private JLabel welcome_label;
	private JComboBox<String> option_list;
	//private final String[] DEFAULT_OPTIONS = { "Seleziona opzione","Aggiungi Conto", "Operazioni su un Conto", "Esci" };

	public WelcomePanel() {
		welcome_label = new JLabel("Benvenuto, seleziona una scelta per effettuare una operazione");
		p = new PropertyReader("properties/config");
	
		option_list = new JComboBox<String>(p.getPropertyValueAsStringVec(",","wp_operations"));
		setLayout(new BorderLayout());

		JPanel welcome_panel = new JPanel();
		welcome_panel.add(option_list);
		
		add(welcome_panel, BorderLayout.CENTER);
		add(welcome_label, BorderLayout.NORTH);

	}
	public void setWp(String s ) {
		welcome_label.setText(s);
	}

	public String getOptionSelected() {
		return (String)option_list.getSelectedItem();
	}
	public JComboBox<String> getOption_list() {
		return option_list;
	}

	public void setOption_list(JComboBox<String> option_list) {
		this.option_list = option_list;
	}

//	public String[] getDEFAULT_OPTIONS() {
//		return DEFAULT_OPTIONS;
//	}

	public JLabel getWelcome_label() {
		return welcome_label;
	}

	public void setWelcome_label(JLabel welcome_label) {
		this.welcome_label = welcome_label;
	}

	public void addNewElementToOptions(String s) {
		option_list.addItem(s);
	}
	
	
	
	
}
