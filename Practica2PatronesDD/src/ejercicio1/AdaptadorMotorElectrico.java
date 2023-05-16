package ejercicio1;

public class AdaptadorMotorElectrico implements Motor {
	private MotorElectrico motorElectrico;

	public AdaptadorMotorElectrico(MotorElectrico motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	public void arrancar() {
		System.out.println(
				"Adaptador: convirtiendo la operación arrancar del motor eléctrico a la operación de Motor común.");
		motorElectrico.conectar();
		motorElectrico.activar();
		motorElectrico.moverMasRapido();
	}

	public void acelerar() {
		System.out.println(
				"Adaptador: convirtiendo la operación acelerar del motor eléctrico a la operación   de Motor común.");
		motorElectrico.moverMasRapido();
	}

	public void apagar() {
		System.out.println(
				"Adaptador: convirtiendo la operación apagar del motor eléctrico a la operación  de Motor común.");
		motorElectrico.detener();
		motorElectrico.desconectar();
	}

}
