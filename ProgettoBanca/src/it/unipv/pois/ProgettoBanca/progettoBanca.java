package it.unipv.pois.ProgettoBanca;

import javax.swing.JFrame;

import it.unipv.pois.ProgettoBanca.controller.Controller;
import it.unipv.pois.ProgettoBanca.model.Banca;
import it.unipv.pois.ProgettoBanca.view.MainFrame;

public class progettoBanca {

	public static void main(String[] args) {
		Banca banca = new Banca("Intesa SanPaolo", null);
		MainFrame mf = new MainFrame();
		
		Controller controller = new Controller(banca, mf);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
