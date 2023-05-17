package main;

import ejercicio3.Combo;
import ejercicio3.ComboEspecial;
import ejercicio3.ComboFamiliar;
import ejercicio3.Papas;
import ejercicio3.Queso;
import ejercicio3.Tomate;

public class Main3 {
	public static void main(String[] args) {
		Combo combo1 = new ComboEspecial();
		combo1 = new Queso(combo1);
		combo1 = new Papas(combo1);
		System.out.println("Combo 1: " + combo1.obtenerDescripcion());
		System.out.println("Precio total: $" + combo1.obtenerPrecio());

		Combo combo2 = new ComboFamiliar();
		combo2 = new Tomate(combo2);
		combo2 = new Queso(combo2);
		System.out.println("Combo 2: " + combo2.obtenerDescripcion());
		System.out.println("Precio total: $" + combo2.obtenerPrecio());
	}
}
