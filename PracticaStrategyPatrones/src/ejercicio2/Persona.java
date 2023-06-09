package ejercicio2;

import java.time.LocalDate;

public class Persona {

	private FechaNacimientoStrategy formatoDeFecha;
	private LocalDate fechaDeCumpleanios;

	public Persona(LocalDate fecha, FechaNacimientoStrategy formato) {
		this.fechaDeCumpleanios = fecha;
		this.formatoDeFecha = formato;
	}

	public String fechaNacimiento() {
		return formatoDeFecha.formatoFecha(fechaDeCumpleanios);
	}

}