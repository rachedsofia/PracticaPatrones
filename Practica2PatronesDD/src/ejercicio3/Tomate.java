package ejercicio3;

public class Tomate extends Adicional {
	private static final String DESCRIPCION = "Tomate";

	public Tomate(Combo comboBase) {
		super(comboBase);
	}

	@Override
	public String descripcion() {
		return DESCRIPCION;
	}

	@Override
	public double precio() {
		return super.obtenerPrecio() + 10.0;
	}

}
