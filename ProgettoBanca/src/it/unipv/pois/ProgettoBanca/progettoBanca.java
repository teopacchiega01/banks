package it.unipv.pois.ProgettoBanca;

import java.util.ArrayList;

import javax.swing.JFrame;

import it.unipv.pois.ProgettoBanca.controller.Controller;
import it.unipv.pois.ProgettoBanca.model.Banca;
import it.unipv.pois.ProgettoBanca.model.Conti.Conto;
import it.unipv.pois.ProgettoBanca.model.Conti.ContoDeposito;
import it.unipv.pois.ProgettoBanca.model.Conti.ContoWeb;
import it.unipv.pois.ProgettoBanca.model.Conti.Persona;
import it.unipv.pois.ProgettoBanca.view.MainFrame;

public class progettoBanca {

	public static void main(String[] args) {

		MainFrame mf = new MainFrame();
		
		Persona p = new Persona("Silvio","Berlusconi");
		ContoWeb c = new ContoWeb(p);
		ContoDeposito cd = new ContoDeposito(p);
		ArrayList<Conto> conti = new ArrayList<>();
		conti.add(c);
		conti.add(cd);
		Banca banca = new Banca("Banca di Sondrio",conti);
		for(Conto ca : conti) {
			System.out.println(ca.getIban());
		}
		
		Controller controller = new Controller(banca, mf);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}
}
