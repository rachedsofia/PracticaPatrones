package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Scrum implements Item {
	private List<Item> listaItem;

	public Scrum() {
		this.listaItem = new ArrayList<>();
	}

	public void agregarItem(Item item) {
		this.listaItem.add(item);
	}

	@Override
	public int calcularTiempo() {
		int calcularTiempo = 0;
		for (Item item : listaItem) {
			calcularTiempo = item.calcularTiempo();
		}
		return calcularTiempo;
	}
}
