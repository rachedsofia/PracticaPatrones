package main;

import java.util.List;

import ejercicio1.CarritoCompras;
import ejercicio1.PaginaWebCalculoDistancia;
import ejercicio1.Producto;

public class MainEje1 {

	public static void main(String[] args) {

		CarritoCompras nuevoComercio = new CarritoCompras(new PaginaWebCalculoDistancia());

		Producto producto1 = new Producto(1, 51456);
		Producto producto2 = new Producto(0.5, 3184);
		Producto producto3 = new Producto(2, 23168);
		Producto producto4 = new Producto(20, 4631);

		System.out.println(nuevoComercio.calcularCostoTotal(List.of(producto1, producto2, producto3, producto4), 1,
				"Gran Buenos Aires"));

	}

}
