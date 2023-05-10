package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SeguroTest {
	@Test
	public void calcularCostoPaquete() {
		Medico seguroMedico = new Medico(150);
		Vida seguroVida = new Vida(100);
		Automovil seguroAutomovil = new Automovil(120);
		Hogar seguroHogar = new Hogar(180);

		Paquete paqueteSeguros = new Paquete();

		paqueteSeguros.agregarSeguro(seguroMedico);
		paqueteSeguros.agregarSeguro(seguroVida);
		paqueteSeguros.agregarSeguro(seguroAutomovil);
		paqueteSeguros.agregarSeguro(seguroHogar);

		double resultadoEsperado = 440;

		assertEquals(resultadoEsperado, paqueteSeguros.calcularCosto());
	}

	@Test
	public void calcularCostoPaqueteAcumulado() {
		Medico seguroMedico = new Medico(150);
		Vida seguroVida = new Vida(100);
		Automovil seguroAutomovil = new Automovil(120);
		Hogar seguroHogar = new Hogar(180);
		Medico seguroMedicos = new Medico(110);
		Vida seguroVidas = new Vida(170);

		Paquete paquete1 = new Paquete();
		Paquete paquete2 = new Paquete();

		paquete1.agregarSeguro(seguroMedico);
		paquete1.agregarSeguro(seguroVida);
		paquete1.agregarSeguro(seguroAutomovil);
		paquete1.agregarSeguro(seguroHogar);

		paquete2.agregarSeguro(seguroMedicos);
		paquete2.agregarSeguro(seguroVidas);
		paquete2.agregarSeguro(paquete1);

		double resultadoEsperado = 612;

		assertEquals(resultadoEsperado, paquete2.calcularCosto());
	}
}
