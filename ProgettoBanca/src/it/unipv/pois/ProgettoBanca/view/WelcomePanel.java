package it.unipv.pois.ProgettoBanca.view;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel {

	private JLabel welcome_label;
	private JComboBox<String> option_list;
	private final String[] DEFAULT_OPTIONS = { "Aggiungi Conto", "Operazioni su un Conto", "Esci" };

	public WelcomePanel() {
		welcome_label = new JLabel("Benvenuto, seleziona una scelta per effettuare una operazione");
		option_list = new JComboBox<String>(DEFAULT_OPTIONS);
		setLayout(new BorderLayout());

		JPanel welcome_panel = new JPanel();
		welcome_panel.add(option_list);

		add(welcome_panel, BorderLayout.CENTER);
		add(welcome_label, BorderLayout.NORTH);

	}

	public JComboBox<String> getOption_list() {
		return option_list;
	}

	public void setOption_list(JComboBox<String> option_list) {
		this.option_list = option_list;
	}

	public String[] getDEFAULT_OPTIONS() {
		return DEFAULT_OPTIONS;
	}

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
