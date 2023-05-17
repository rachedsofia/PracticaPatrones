package ejercicio3;

public class Carne extends Adicional {
	private static final String DESCRIPCION = "Carne";

	public Carne(Combo comboBase) {
		super(comboBase);
	}

	@Override
	public String descripcion() {
		return DESCRIPCION;
	}

	@Override
	public double precio() {
		return super.obtenerPrecio() + 20.0;
	}
}
