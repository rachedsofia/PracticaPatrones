package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaUsuario implements Item {
	private List<Tarea> listaTareas;

	public HistoriaUsuario() {
		this.listaTareas = new ArrayList<>();
	}

	public void agregarTarea(Tarea tarea) {
		this.listaTareas.add(tarea);
	}

	@Override
	public int calcularTiempo() {
		int calcularTiempo = 0;
		for (Tarea tarea : listaTareas) {
			calcularTiempo = tarea.obtenerTiempoTarea();
		}
		return calcularTiempo;
	}
}