package it.unipv.pois.ProgettoBanca.model.operazioniconti;

import java.lang.reflect.Constructor;

import it.unipv.pois.ProgettoBanca.view.PropertyReader;

public class OperationFactory {
	private PropertyReader p;
	private IBankAccOperationsStrategy operation;
	
	public IBankAccOperationsStrategy getBankAccOperationStrategy(String scelta) {
		
		
		//if(operation == null){
			p = new PropertyReader("properties/operazioni");
			String OperationClassName = p.cercaProperty(scelta);
			
				try {
					Constructor c = Class.forName(OperationClassName).getConstructor();
					operation = (IBankAccOperationsStrategy)c.newInstance();
					System.out.println(scelta+operation);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					operation = null; 
					e.printStackTrace();
				}
			
		//}
		
		return operation;
		
		
	}
	

}
