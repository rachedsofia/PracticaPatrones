package ejercicio3;

public class Queso extends Adicional {
	private static final String DESCRIPCION = "Queso";

	public Queso(Combo comboBase) {
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
