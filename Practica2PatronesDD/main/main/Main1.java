package main;

import ejercicio1.AdaptadorMotorElectrico;
import ejercicio1.Motor;
import ejercicio1.MotorComun;
import ejercicio1.MotorEconomico;
import ejercicio1.MotorElectrico;

public class Main1 {
	public static void main(String[] args) {
		Motor motorComun = new MotorComun();
		Motor motorEconomico = new MotorEconomico();
		Motor motorElectrico = new AdaptadorMotorElectrico(new MotorElectrico());

		System.out.println(" Operaciones del motor com�n:");
		motorComun.arrancar();
		motorComun.acelerar();
		motorComun.apagar();

		System.out.println(" Operaciones del motor econ�mico:");
		motorEconomico.arrancar();
		motorEconomico.acelerar();
		motorEconomico.apagar();

		System.out.println(" Operaciones del motor el�ctrico:");
		motorElectrico.arrancar();
		motorElectrico.acelerar();
		motorElectrico.apagar();
	}

}
