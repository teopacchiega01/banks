package it.unipv.pois.ProgettoBanca.view.frameconti;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import it.unipv.pois.ProgettoBanca.view.accountableframe.AccountableFrame;

public class BankAccFrame extends JFrame {

	private DepositAccountPanel dbp;
	private WebAccountPanel wap;
	private AccountPanel ap;

	public BankAccFrame() throws HeadlessException {
		//super();
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
	
	
	public AccountableFrame createFrameByChoice(String scelta) {
		AccountableFrame f = null;
		
		
		switch(scelta) {
			
		case "Aggiungi un accredito/addebito mensile":
		case "Rimuovi un accredito/addebito mensile":
			
			f = new AccountableFrame();
			return f;
		
		}
		
		return f; 
	}
	
	public void changeBankAccPanelByType(String tipo_conto,String nome_titolare,String cognome_titolare) {
		switch(tipo_conto) {
		case "Conto Corrente":
			
			
			setContentPane(ap);
			setLabelProprietarioAcc("Nome del proprietario: "+nome_titolare+" Cognome: "+cognome_titolare);
			break;
			
		case "Conto Web":
			setContentPane(wap);
			setLabelProprietarioWeb("Nome del proprietario: "+nome_titolare+" Cognome: "+cognome_titolare);

		
			break;
		case "Conto Deposito":
			setContentPane(dbp);
			setLabelProprietarioDeposito("Nome del proprietario: "+nome_titolare+" Cognome: "+cognome_titolare);

			
			break;
			
		
		
		}
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
	
	public String getDepositoComboBoxOption() {
		return dbp.getOptionSelected();
	}
	

	public void setResulDeposito(String s) {
		dbp.setResult(s);

	}

	public String getNewPassw() {
		return wap.getUserNewPassw();
	}
	public String getOldPassw() {
		return wap.getUserOldPassw();
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
	public String getWebComboBoxOption() {
		
		return wap.getOptionSelected();
		
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
	
	public String getAccComboBoxOption() {
		
		return ap.getOptionSelected();
		
	}

}
