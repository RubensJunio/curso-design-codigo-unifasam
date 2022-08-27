package testeunitario;

import org.junit.Test;
import org.junit.Assert;



public class CalculadoraTeste {
	
	
	
	@Test
	public void somar() {
		//cenario
		int a = 5;
		int b = 5;
		//ação
		Calculadora calc = new Calculadora();
		int resultadosoma = calc.somar(a,b);
		//verificação
	Assert.assertEquals(10, resultadosoma);
	}
	
	@Test
	public void subtrair() {
		//cenario
		int a = 5;
		int b = 5;
		//ação
		Calculadora calc = new Calculadora();
		int resultadosubtracao = calc.subtrair(a,b);
		//verificação
	Assert.assertEquals(0, resultadosubtracao);
	}
	
	@Test
	public void multiplicar() {
		//cenario
		int a = 5;
		int b = 5;
		//ação
		Calculadora calc = new Calculadora();
		int resultadomultiplicacao = calc.multiplicar(a,b);
		//verificação
		Assert.assertEquals(25, resultadomultiplicacao);
	}
	
	@Test
	public void dividir() {
		//cenario
		int a = 5;
		int b = 5;
		//ação
		Calculadora calc = new Calculadora();
		int resultadodivisao = calc.dividir(a,b);
		//verificação
	Assert.assertEquals(1, resultadodivisao);
	}
	
	
	


	
	
}
