package it.unipv.pois.ProgettoBanca.view;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class AccountableFrame extends JFrame {
	AccountablePanel acc_panel;
	SalaryPanel salary_panel;
	SubscriptionPanel sub_panel;

	public AccountableFrame() throws HeadlessException {
		super();
		setTitle("AccountableFrame");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize);

		acc_panel = new AccountablePanel();
		salary_panel = new SalaryPanel();
		sub_panel = new SubscriptionPanel();

		add(acc_panel);
		add(salary_panel);
		add(sub_panel);

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
