package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dominio.Plano;

public class TestePlano {
	@Test
	public void TestarDistancia() {
		Plano plano = new Plano(6f, 1f, 10f, 4f);
		assertEquals(5, plano.calculaDistancia(), 0);
	}
}
