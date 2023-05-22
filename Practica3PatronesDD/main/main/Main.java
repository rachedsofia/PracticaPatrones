package main;

import java.util.List;

import ejercicio1y2.Medidor;
import ejercicio1y2.ObserverTemperaturaConsola;
import ejercicio1y2.ObserverTemperaturaFile;
import ejercicio1y2.WeatherChannelService;

public class Main {

	public static void main(String[] args) {
		WeatherChannelService Weather = new WeatherChannelService("fad636e8abb86c32bebb29ff722c4771");
		Medidor medidor = new Medidor(Weather,
				List.of(new ObserverTemperaturaFile("Clima"), new ObserverTemperaturaConsola()));

		System.out.println(medidor.leerTemperatura());

	}

}
