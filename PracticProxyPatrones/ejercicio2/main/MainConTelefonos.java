package main;

import ejercicio2.BaseException;
import ejercicio2.Persona;
import ejercicio2.PersonaDao;
import ejercicio2.Telefono;

public class MainConTelefonos {

	public static void main(String[] args) throws BaseException {
		PersonaDao dao = new PersonaDao("jdbc:mysql://localhost:3306/proxy2");

		Persona p = dao.personaPorId(1);

		System.out.println(p.nombre());

		for (Telefono telefono : p.telefonos()) {
			System.out.println(telefono);
		}

	}

}
