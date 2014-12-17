package test;

import org.junit.Assert;
import org.junit.Test;
import main.CalculadoraFizzBuzz;

public class FizzBuzzTest {

	@Test
	public void deveRetornarNumeroUm() {
		CalculadoraFizzBuzz calculadora = new CalculadoraFizzBuzz();
		String resultado = calculadora.calculeFizzBuzz(1);
		
		Assert.assertEquals("1", resultado);
	}
	
	@Test
	public void deveRetornarNumeroSete() {
		CalculadoraFizzBuzz calculadora = new CalculadoraFizzBuzz();
		String resultado = calculadora.calculeFizzBuzz(7);
		
		Assert.assertEquals("7", resultado);
	}
	
	@Test
	public void deveRetornarFizz() {
		CalculadoraFizzBuzz calculadora = new CalculadoraFizzBuzz();
		String resultado = calculadora.calculeFizzBuzz(3);
		
		Assert.assertEquals("fizz", resultado);
	}
	
	@Test
	public void deveRetornarBuzz() {
		CalculadoraFizzBuzz calculadora = new CalculadoraFizzBuzz();
		String resultado = calculadora.calculeFizzBuzz(5);
		
		Assert.assertEquals("buzz", resultado);
	}
	
	@Test
	public void deveRetornarFizzBuzz() {
		CalculadoraFizzBuzz calculadora = new CalculadoraFizzBuzz();
		String resultado = calculadora.calculeFizzBuzz(15);
		
		Assert.assertEquals("fizzbuzz", resultado);
	}
}
