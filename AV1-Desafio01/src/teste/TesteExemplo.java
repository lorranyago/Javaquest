package teste;

import org.junit.Assert;
import org.junit.Test;

import dominio.Produto;


public class TesteExemplo {
	@Test
	public void DescontoDeveriaSer10Porcento(){
		Produto prod = new Produto(1, 2, 20.0, 1);
		double valor = prod.calculaDesconto();
		double valorFinal = prod.valorFinal();
		Assert.assertEquals(valor, 4.0, 0);
		Assert.assertEquals(valorFinal, 36, 0);
	}
	
	@Test
	public void DescontoDeveriaSer2Porcento(){
		Produto prod = new Produto(1, 2, 20.0, 2);
		double valor = prod.calculaDesconto();
		double valorFinal = prod.valorFinal();
		Assert.assertEquals(valor, 0.8, 0);
		Assert.assertEquals(valorFinal, 39.2, 0);
	}
	@Test
	public void DescontoDeveriaSer5Porcento(){
		Produto prod = new Produto(1, 2, 20.0, 3);
		double valor = prod.calculaDesconto();
		double valorFinal = prod.valorFinal();
		Assert.assertEquals(valor, 2.0, 0);
		Assert.assertEquals(valorFinal, 38, 0);
	}
	@Test
	public void DescontoDeveriaSer5op2Porcento(){
		Produto prod = new Produto(1, 2, 20.0, 4);
		double valor = prod.calculaDesconto();
		double valorFinal = prod.valorFinal();
		Assert.assertEquals(valor, 2, 0);
		Assert.assertEquals(valorFinal, 38, 0);
	}
}
