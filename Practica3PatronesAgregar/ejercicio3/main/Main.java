package main;

import dominio.Almacenar;
import dominio.DominioException;
import dominio.Imprimir;
import dominio.LecturaClima;
import dominio.Medidor;
import dominio.WeatherChannelService;

public class Main {

	public static void main(String[] args) {

		LecturaClima miClass = new Almacenar(
				new Imprimir(new Medidor(new WeatherChannelService("95f7cb047ed70ee6362df4b0d3f6aa51", "metric"))),
				"Datos_Clima_P3");

		try {
			System.out.println("Desde main: " + miClass.leerTemperatura());
		} catch (DominioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
