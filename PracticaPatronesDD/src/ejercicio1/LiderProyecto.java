package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class LiderProyecto extends Empleado {
	private List<EmpleadoRegular> listaDeEmpleadosRegularesACargo;

	public LiderProyecto(double salario) {
		super(salario);
		this.listaDeEmpleadosRegularesACargo = new ArrayList<>();
	}

	public LiderProyecto(double salario, List<EmpleadoRegular> listaEmpleadoRegular) {
		super(salario);
		this.listaDeEmpleadosRegularesACargo = listaEmpleadoRegular;
	}

	@Override
	public double calcularMonto() {
		double montoLider = 0;

		for (EmpleadoRegular empleadoRegular : listaDeEmpleadosRegularesACargo) {
			montoLider += empleadoRegular.calcularMonto();
		}

		return this.salario + montoLider;
	}
}
