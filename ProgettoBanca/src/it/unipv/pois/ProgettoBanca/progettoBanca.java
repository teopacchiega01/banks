package it.unipv.pois.ProgettoBanca;

import java.util.ArrayList;

import javax.swing.JFrame;

import it.unipv.pois.ProgettoBanca.controller.Controller;
import it.unipv.pois.ProgettoBanca.controller.ControllerObserver;
import it.unipv.pois.ProgettoBanca.model.Banca;
import it.unipv.pois.ProgettoBanca.model.Conti.Conto;
import it.unipv.pois.ProgettoBanca.model.Conti.ContoCorrente;
import it.unipv.pois.ProgettoBanca.model.Conti.ContoDeposito;
import it.unipv.pois.ProgettoBanca.model.Conti.ContoWeb;
import it.unipv.pois.ProgettoBanca.model.Conti.Persona;
import it.unipv.pois.ProgettoBanca.view.MainFrame;

public class progettoBanca {

	public static void main(String[] args) {

		MainFrame mf = new MainFrame();
		ArrayList<Conto> conti = new ArrayList<Conto>();
		ArrayList<Persona> clienti = new ArrayList<Persona>();
		clienti.add(new Persona("Silvio", "Berlusconi", "SLVBRL69420"));
		clienti.add(new Persona("PierSilvio", "Berlusconi", "PRSBRL69421"));
		clienti.add(new Persona("Silvia", "Berlusconi", "SLVBRL69422F"));
		clienti.add(new Persona("Alice", "Budini", "DBDPFSVAL580KGF"));
		clienti.add(new Persona("Elisa", "Finotti", "TPSLSPDBCLFDPF04F"));
		conti.add(new ContoCorrente(clienti.get(0)));
		conti.add(new ContoWeb(clienti.get(1)));
		conti.add(new ContoDeposito(clienti.get(2)));
		
		Banca banca = new Banca("Banca di Sondrio",conti, clienti);
		for(Conto app : conti) {
			System.out.println(app.getIban());
		}
		
		Controller controller = new Controller(banca, mf);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
		
//		ControllerObserver c = new ControllerObserver();
		
		
	}
}

