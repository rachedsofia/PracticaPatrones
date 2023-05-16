package ejercicio3;

public abstract class Adicional implements Combo {
	private Combo comboBase;

	public Adicional(Combo comboBase) {
		this.comboBase = comboBase;
	}

	@Override
	public String obtenerDescripcion() {
		return comboBase.obtenerDescripcion() + descripcion();
	}

	@Override
	public double obtenerPrecio() {
		return comboBase.obtenerPrecio() + precio();
	}

	public abstract String descripcion();

	public abstract double precio();
}
