package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Director extends Empleado {
	private List<Gerente> listaDeGerentesACargo;

	public Director(double salario) {
		super(salario);
		this.listaDeGerentesACargo = new ArrayList<>();
	}

	public Director(double salario, List<Gerente> listaDeGerentes) {
		super(salario);
		this.listaDeGerentesACargo = listaDeGerentes;
	}

	@Override
	public double calcularMonto() {
		double montoDirector = 0;

		for (Gerente gerente : listaDeGerentesACargo) {
			montoDirector += gerente.calcularMonto();
		}

		return this.salario + montoDirector;
	}
}
