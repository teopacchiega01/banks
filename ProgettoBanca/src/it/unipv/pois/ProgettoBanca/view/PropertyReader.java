package it.unipv.pois.ProgettoBanca.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	private Properties p;
	private String file_name;

	public PropertyReader(String file_name) {
		super();
		this.p = new Properties(System.getProperties());
		this.file_name = file_name;
	}
	
	
	public String cercaProperty(String property_name) {
		String property_value;
		
		try {
			p.load(new FileInputStream(file_name));
			property_name = replaceSpacesWithChar('-', property_name);
			property_value = p.getProperty(property_name);
			System.out.println(property_value);
	 
			return property_value;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	public String[] getPropertyValueAsStringVec(String separator,String property_name) {
		String property_value = cercaProperty(property_name);
		
		if(!property_value.isEmpty()) {
			String no_spaces = property_value.trim();
			String [] result = no_spaces.split(separator);
			for (int i=0; i<result.length;i++) {
				result[i] = result[i].trim();
				
			}
			
			return result;
			
		}else {
			System.out.println("La property non contiene alcun valore");
			return  null;
		}
	
			
		}
		
	public String replaceSpacesWithChar(char rimpiazzatore,String stringa) {
		stringa = stringa.replace(' ',rimpiazzatore);
		return stringa;
		
		
	}
	
	

}
