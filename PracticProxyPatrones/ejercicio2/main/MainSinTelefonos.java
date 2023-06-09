package main;

import ejercicio2.BaseException;
import ejercicio2.Persona;
import ejercicio2.PersonaDao;

public class MainSinTelefonos {

	public static void main(String[] args) throws BaseException {
		PersonaDao dao = new PersonaDao("jdbc:mysql://localhost:3306/proxy2");

		Persona p = dao.personaPorId(3);

		System.out.println(p.nombre());

	}

}
