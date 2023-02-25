package teste;

import org.junit.Assert;
import org.junit.Test;

import validate.ValidateCampo;

public class TestCampo {
	
	
	@Test
	public void testValidarCampoTxt() {
		ValidateCampo validar = new ValidateCampo();
		Assert.assertTrue(validar.validarCampoTxt(""));
	}
	
	@Test
	public void testValidarCampoNumb() {
		ValidateCampo validar = new ValidateCampo();
		Assert.assertTrue(validar.validarCampoNumb(1));
	}

}
