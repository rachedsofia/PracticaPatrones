package ejercicio3;

public class ComboBasico implements Combo {
	private String descripcion;
	private double precio;

	public ComboBasico() {
		this.descripcion = "Combo Básico: Hamburguesa + Papas + Gaseosa";
		this.precio = 200.0;
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
