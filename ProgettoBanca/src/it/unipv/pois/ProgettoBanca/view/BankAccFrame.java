package it.unipv.pois.ProgettoBanca.view;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class BankAccFrame extends JFrame {

	private DepositAccountPanel dbp;
	private WebAccountPanel wap;
	private AccountPanel ap;

	public BankAccFrame() throws HeadlessException {
		super();
		setTitle("FrameConti");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize);
		dbp = new DepositAccountPanel();
		wap = new WebAccountPanel();
		ap = new AccountPanel();

		add(dbp);
		add(wap);
		add(ap);

	}
	
	

	public DepositAccountPanel getDbp() {
		return dbp;
	}



	public void setDbp(DepositAccountPanel dbp) {
		this.dbp = dbp;
	}



	public WebAccountPanel getWap() {
		return wap;
	}



	public void setWap(WebAccountPanel wap) {
		this.wap = wap;
	}



	public AccountPanel getAp() {
		return ap;
	}



	public void setAp(AccountPanel ap) {
		this.ap = ap;
	}



	public double getCifraDepositoAcc() {

		return dbp.getCifraAccreditoDeposito();
	}

	public void setLabelProprietarioDeposito(String s) {
		dbp.setLabelProprietario(s);
	}

	public void setLabelSaldoDeposito(String text) {
		dbp.setLabelSaldo(text);
	}

	public JComboBox<String> getDepositBankAccOptions() {
		return dbp.getOperations();
	}

	public void setResulDeposito(String s) {
		dbp.setResult(s);

	}

	public String getPassw() {
		return wap.getUserPassw();
	}

	public double getCifraWebAcc() {
		return wap.getCifraAccreditoDeposito();
	}

	public void setLabelProprietarioWeb(String s) {
		wap.setLabelProprietario(s);
	}

	public void setLabelSaldoWeb(String s) {
		wap.setLabelSaldo(s);
	}

	public void setResultWebAcc(String s) {
		wap.setResult(s);
	}

	public JComboBox<String> getWebAccOptions() {
		return wap.getOperations();
	}

	public double getCifraAcc() {
		return ap.getCifraAccreditoDeposito();
	}

	public void setLabelProprietarioAcc(String s) {
		ap.setLabelProprietario(s);
	}

	public void setLabelSaldoAcc(String s) {
		ap.setLabelSaldo(s);
	}

	public void setResultAcc(String s) {
		ap.setResult(s);
	}

	public JComboBox<String> getAccOptions() {
		return ap.getOperations();

	}

}
