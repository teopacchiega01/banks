package it.unipv.pois.ProgettoBanca.view.mainframe;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import it.unipv.pois.ProgettoBanca.view.accountableframe.AccountableFrame;
import it.unipv.pois.ProgettoBanca.view.frameconti.BankAccFrame;

public class MainFrame extends JFrame {

	private WelcomePanel wp;
	private AddBankAccountPanel add_bank_panel;
	private BankAccountOps bank_ops;
	
	private PropertyChangeSupport support;
//	public static final String PROPERTY = "CambioFinestra";
	

	public MainFrame() throws HeadlessException {
		super();
		setTitle("MainFrame");
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//setSize(screenSize);
		setSize(new Dimension(600, 600));
		
		wp = new WelcomePanel();
		add_bank_panel = new AddBankAccountPanel();
		bank_ops = new BankAccountOps();
		
		add(add_bank_panel);
		add(bank_ops);
		add(wp);
		
		support = new PropertyChangeSupport(this);
	
	}
	
	
	public JButton getConfermaButtonBankOps() {
		return bank_ops.getConferma();
	}
	
	
	public BankAccountOps getBank_ops() {
		return bank_ops;
	}


	public void setBank_ops(BankAccountOps bank_ops) {
		this.bank_ops = bank_ops;
	}


	public void setLabelWP(String s) {
		wp.setWp(s);
	}
	public String getOptionSelectedWp() {
		return wp.getOptionSelected();
	}
	
	public BankAccFrame createNewBankAcc() {

		return new BankAccFrame();
	}

	public AccountableFrame createNewAccountableFrame() {
		return new AccountableFrame();
	}
	

	public String getBankAccUserIban() {
		return bank_ops.getUserIban();
	}

	public String getBankAccUserCF() {
		return bank_ops.getUserCF();
	}



	public JComboBox<String> getWpOption_list() {
		return wp.getOption_list();
	}

	public void addNewElementToOptions(String s) {
		wp.addNewElementToOptions(s);
	}

	public JComboBox<String> getBankaccList() {
		return add_bank_panel.getBankacc_list();

	}

	public String getUsersNome() {
		return add_bank_panel.getUsersName();

	}

	public String getSurname() {
		return add_bank_panel.getSurname();

	}
   
	public String getCodiceF() {
		return add_bank_panel.getCodiceF();

	}

	public WelcomePanel getWp() {
		return wp;
	}

	public void setWp(WelcomePanel wp) {
		this.wp = wp;
	}

	public AddBankAccountPanel getAdd_bank_panel() {
		return add_bank_panel;
	}

	public void setAdd_bank_panel(AddBankAccountPanel add_bank_panel) {
		this.add_bank_panel = add_bank_panel;
	}
	
	public String getOptionSelectedAddBankAcc() {
		return add_bank_panel.getOptionSelected();
	}

	public JButton getConfermaAddBankAccount() {
		return add_bank_panel.getConferma_inserimento();
	}
	
	public void setLabelConfermaAggiuntaConto(String contenuto_label) {
		add_bank_panel.setResult(contenuto_label);
	}
	
	public void rimuoviPannello(JPanel p) {
		remove(p);
	}
	
	public void rimuoviTutti() {
		removeAll();
	}
	
	public void changeMainFramePanelByChoice(String option) {
		switch(option) {
		case "Aggiungi Conto":
			rimuoviPannello(wp);
			setContentPane(add_bank_panel);
			revalidate();
			repaint();
			break;
		case "Operazioni su un Conto":
			
			rimuoviPannello(wp);
			setContentPane(bank_ops);
			revalidate();
			repaint();
			break;
		default:
			System.out.println("Nessuna opzione valida");
			dispose();
		
		}
		

	}
	
	
//	Metodi support
//	
//	public void addObserver(PropertyChangeListener p) {
//		
//		support.addPropertyChangeListener(PROPERTY, p);
//		
//	}
//	
//	
//	public void setProperty(JFrame f1, JFrame f2) {
//		
//		support.firePropertyChange(PROPERTY, f1, f2);
//		
//	}
//	
//	
	


}
