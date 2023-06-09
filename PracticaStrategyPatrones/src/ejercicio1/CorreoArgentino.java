package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class CorreoArgentino implements EnvioStrategy {

	private static final Integer MONTO_FIJO = 800;

	private Map<String, Integer> misDestinos;
	private CalculoDistancia medioDeCalculo;

	public CorreoArgentino(CalculoDistancia medioDeCalculo) {
		this.medioDeCalculo = medioDeCalculo;
		this.inicializarDestinos();
	}

	public double calcularCostoEnvio(double peso, String destino) {

		double costoEnvio = MONTO_FIJO;
		if (misDestinos.containsKey(destino)) {
			costoEnvio = misDestinos.get(destino);
		} else {
			costoEnvio += (5 * this.medioDeCalculo.obtenerDistanciaEnKm(destino));
		}

		return costoEnvio;
	}

	private void inicializarDestinos() {

		this.misDestinos = new HashMap<String, Integer>();

		misDestinos.put("Capital Federal", 500);
	}

}
