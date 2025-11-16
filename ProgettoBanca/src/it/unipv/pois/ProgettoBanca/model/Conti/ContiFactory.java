package it.unipv.pois.ProgettoBanca.model.Conti;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class ContiFactory {

	public Conto getConto(EnumConti conto_scelto) {
		Conto conto = null;
		Properties p = new Properties(System.getProperties());
		String ContoClassName;			
		try {
			p.load(new FileInputStream("properties/properties"));
			ContoClassName = p.getProperty(conto_scelto.name());
			Constructor c = Class.forName(ContoClassName).getConstructor();
			conto=(Conto)c.newInstance();				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			conto = null;
		}
		return conto;
	}

}
