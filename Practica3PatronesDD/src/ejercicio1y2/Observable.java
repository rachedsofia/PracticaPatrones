package ejercicio1y2;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	private List<Observer> observadores;

	public Observable() {
		this.observadores = new ArrayList<>();
	}

	public void agregarObservador(Observer obs) {
		this.observadores.add(obs);
	}

	protected void notificar(String valor) {
		for (Observer observer : observadores) {
			observer.actualizar(valor);
		}
	}
}
