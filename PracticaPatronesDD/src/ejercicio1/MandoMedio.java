package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class MandoMedio extends Empleado {
	private List<LiderProyecto> listaDeLideresProyectoACargo;

	public MandoMedio(double salario) {
		super(salario);
		this.listaDeLideresProyectoACargo = new ArrayList<>();
	}

	public MandoMedio(double salario, List<LiderProyecto> listaLiderProyecto) {
		super(salario);
		this.listaDeLideresProyectoACargo = listaLiderProyecto;
	}

	@Override
	public double calcularMonto() {
		double montoMando = 0;

		for (LiderProyecto liderProyecto : listaDeLideresProyectoACargo) {
			montoMando += liderProyecto.calcularMonto();
		}

		return this.salario + montoMando;
	}
}
