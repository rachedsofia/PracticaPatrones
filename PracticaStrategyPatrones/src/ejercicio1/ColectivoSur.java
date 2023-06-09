package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class ColectivoSur implements EnvioStrategy {

	private static final Integer COSTO_INTERIOR_PAIS = 3000;

	private Map<String, Integer> misDestinos;

	public ColectivoSur() {
		this.inicializarDestinos();
	}

	public double calcularCostoEnvio(double peso, String destino) {

		double costoEnvio = COSTO_INTERIOR_PAIS;

		if (misDestinos.containsKey(destino))
			costoEnvio = misDestinos.get(destino);

		if ((peso > 5) && (peso < 30)) {
			costoEnvio += 500;
		} else if (peso > 30) {
			costoEnvio += 2000;
		}

		return costoEnvio;
	}

	private void inicializarDestinos() {

		this.misDestinos = new HashMap<String, Integer>();

		misDestinos.put("Capital Federal", 1000);
		misDestinos.put("Gran Buenos Aires", 1500);
	}
}
