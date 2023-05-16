package ejercicio1;

public class AdaptadorMotorElectrico implements Motor {
	private MotorElectrico motorElectrico;

	public AdaptadorMotorElectrico(MotorElectrico motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	public void arrancar() {
		System.out.println(
				"Adaptador: convirtiendo la operaci�n arrancar del motor el�ctrico a la operaci�n de Motor com�n.");
		motorElectrico.conectar();
		motorElectrico.activar();
		motorElectrico.moverMasRapido();
	}

	public void acelerar() {
		System.out.println(
				"Adaptador: convirtiendo la operaci�n acelerar del motor el�ctrico a la operaci�n   de Motor com�n.");
		motorElectrico.moverMasRapido();
	}

	public void apagar() {
		System.out.println(
				"Adaptador: convirtiendo la operaci�n apagar del motor el�ctrico a la operaci�n  de Motor com�n.");
		motorElectrico.detener();
		motorElectrico.desconectar();
	}

}
