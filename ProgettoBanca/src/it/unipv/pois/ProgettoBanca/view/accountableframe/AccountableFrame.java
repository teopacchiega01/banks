package it.unipv.pois.ProgettoBanca.view.accountableframe;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import it.unipv.pois.ProgettoBanca.view.frameconti.BankAccFrame;

public class AccountableFrame extends JFrame {
	AccountablePanel acc_panel;
	SalaryPanel salary_panel;
	SubscriptionPanel sub_panel;

	public AccountableFrame() throws HeadlessException {
		//super();
		setTitle("AccountableFrame");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize);

		acc_panel = new AccountablePanel();
		salary_panel = new SalaryPanel();
		sub_panel = new SubscriptionPanel();

	
		add(salary_panel);
		add(sub_panel);
		add(acc_panel);

	}
	
	public void changePanelByChoice(String scelta) {
		System.out.println("Hai scelto: "+scelta);
		switch(scelta) {
		case "Stipendio":
			rimuoviPannello(acc_panel);
			setContentPane(salary_panel);
			revalidate();
			repaint();
			
			break;
		case "Abbonamento":
			
			rimuoviPannello(acc_panel);
			setContentPane(sub_panel);
			revalidate();
			repaint();
			
			break; 
		
		
		
		
		}
		
	}
	
	
	 
	public JButton getBackButtonFromSalary() {
		return salary_panel.getBackToAccountPanel();
		
	}
	public JButton getBackButtonFromSub() {
		return sub_panel.getBackToAccountPanel();
		
	}
		
	public JButton getBackToBankAcc() {
		return acc_panel.getBackBankAccButton();
	}
		
	public SalaryPanel getSalaryPanel() {
		return salary_panel;
	}
	public SubscriptionPanel getSubscriptionPanel() {
		return sub_panel;
	}
	public AccountablePanel getAccountablePanel() {
		return acc_panel;
	}
		
	public void rimuoviPannello(JPanel p) {
		remove(p);
	}
	
	public String getAccountablePanelOption() {
		
		return acc_panel.getComboBoxOption();
	}
	

	public JComboBox<String> getAccOptions() {
		return acc_panel.getOptions();
	}

	public String getSalaryName() {
		return salary_panel.getSalaryName();
	}

	public double getImportSalary() {
		return salary_panel.getImportoStipendio();
	}

	public void setResulSalary(String s) {
		salary_panel.setResult(s);
	}

	public JButton getAddSalaryButton() {
		return salary_panel.getAggiungi();
	}

	public JButton getRemoveSalaryButton() {
		return salary_panel.getRimuovi();
	}

	public void setResultSubscription(String s) {
		sub_panel.setResultLabel(s);
	}

	public double getImportSubscription() {
		return sub_panel.getImportoVal();

	}

	public Integer getDurataSubsciption() {
		return sub_panel.getDurataVal();
	}

	public String getSubscriptionDate() {
		return sub_panel.getDataInizio();
	}

	public String getSubsriptionName() {
		return sub_panel.getNomeSub();
	}

	public JButton getAddSubscitpionButton() {
		return sub_panel.getAggiungi();
	}

	public JButton getRemoveSubscitpionButton() {
		return sub_panel.getRimuovi();
	}

}
