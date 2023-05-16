package ejercicio3;

public class ComboEspecial implements Combo {
	private String descripcion;
	private double precio;

	public ComboEspecial() {
		this.descripcion = "Combo especial: Hamburguesa gigante, papas fritas y bebida";
		this.precio = 300.0;
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
