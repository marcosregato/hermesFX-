package validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidateCampo {
	
	
	public boolean validarCampoTxt(String valor) {
		boolean expression = true;
		if(valor.isEmpty()) {
			expression =  false;
		}
		return expression;
	}
	
	public boolean validarCampoNumb(int valor) {
		boolean expression = false;
		if(valor > 0) {
			expression =  true;
		}
		return expression;	
	}
	
	
	public boolean validarCampoData(String valor) {
		 try {
	         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	         LocalDate d = LocalDate.parse(valor, formatter);    
	         return true;
	      } catch (DateTimeParseException e) {
	        return false;
	      }   
	}
	
	
	public boolean validarCampoEmail(String valor) {
		boolean expression = false;
		if(valor.contains("@")) {
			expression =  true;
		}
		return expression;	
	}
	
	public boolean validarCampoVazio(String valor) {
		try {
			boolean expression = false;
			if(valor.length() > 5) {
				expression =  true;
			}
			return expression;	
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		return false;
		
	}

}
