package ejercicio3;

public class ComboFamiliar implements Combo {
	private String descripcion;
	private double precio;

	public ComboFamiliar() {
		this.descripcion = "Combo familiar: 2 hamburguesas, papas fritas grandes, 2 bebidas";
		this.precio = 400.0;
	}

	@Override
	public String obtenerDescripcion() {
		return descripcion;
	}

	@Override
	public double obtenerPrecio() {
		return precio;
	}

}
