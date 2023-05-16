package ejercicio3;

public class Papas extends Adicional {
	private static final String DESCRIPCION = "Papas";

	public Papas(Combo comboBase) {
		super(comboBase);
	}

	@Override
	public String descripcion() {
		return DESCRIPCION;
	}

	@Override
	public double precio() {
		return super.obtenerPrecio() + 15.0;
	}

}
