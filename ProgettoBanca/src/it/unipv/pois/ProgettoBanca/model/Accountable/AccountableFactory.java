package it.unipv.pois.ProgettoBanca.model.Accountable;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import it.unipv.pois.ProgettoBanca.model.operazioniconti.IBankAccOperationsStrategy;
import it.unipv.pois.ProgettoBanca.view.PropertyReader;

public class AccountableFactory {
	private static BollettaAdapter b_adapter;
	private static final String B_PROPERTYNAME="bolletta.adapter.class.name";
	private PropertyReader p; 
	private Accountable acc;
	

	
	// DA CHIEDERE:
	// - quindi se vogliamo chiamare un tipo qualsiasi di bolletta, d'ora in poi
	// chiameremo AccountableFactory.*adapter dell'interfaccia della classe che ci interessa*?
	// - bisogna usare factory e adapter in qualunque caso oppure solo per "anticipare/prevedere"
	// possibili classi che verranno aggiunte? quindi va retroattivamente applicato anche a stipendio e abbonamento?
	// - se volessimo introdurre un accountable di tipo bolletta da interfaccia grafica dobbiamo anche modificare
	// la view e il controller; questo accoppiamento è voluto?
	
	
	
	
	public static BollettaAdapter getBollettaAdapter(IBolletta bol) {

		if(b_adapter==null) {
			String bollettaAdaptClassName;

			try {
				Properties p = new Properties(System.getProperties());
				p.load(new FileInputStream("properties/properties"));
				bollettaAdaptClassName=p.getProperty(B_PROPERTYNAME);

				Constructor c = Class.forName(bollettaAdaptClassName).getConstructor(IBolletta.class);
				b_adapter=(BollettaAdapter)c.newInstance(bol);


			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return b_adapter;
	}
	
	public Accountable getAccountable(String scelta) {
		p = new PropertyReader("properties/properties");
		String OperationClassName = p.cercaProperty(scelta);
		System.out.println(OperationClassName);
		
			try {
				Constructor c = Class.forName(OperationClassName).getConstructor();
				acc = (Accountable)c.newInstance();
				System.out.println(scelta+acc);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				acc = null; 
				e.printStackTrace();
			}
		
	//}
	
	return acc;
	
		
		
	}

	



}
