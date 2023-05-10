package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Spike implements Item {
	private List<Tarea> listaTareas;

	public Spike() {
		this.listaTareas = new ArrayList<>();
	}

	public void agregarTarea(Tarea tarea) {
		this.listaTareas.add(tarea);
	}

	@Override
	public int calcularTiempo() {
		int tiempoEstimado = 0;

		for (Tarea tarea : listaTareas) {
			tiempoEstimado += tarea.obtenerTiempoTarea();
		}

		return tiempoEstimado;
	}
}